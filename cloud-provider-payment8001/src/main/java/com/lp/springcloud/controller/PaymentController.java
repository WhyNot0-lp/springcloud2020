package com.lp.springcloud.controller;

import com.lp.springcloud.entities.CommonResult;
import com.lp.springcloud.entities.Payment;
import com.lp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author lp
 * @date 2020/3/9 19:23
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("--------插入结果"+result);

        if (result>0){
            return new CommonResult(200,"插入数据成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult<>(444, "插入数据失败");
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("--------插入结果"+payment);
        if (!StringUtils.isEmpty(payment)) {
            return new CommonResult<Payment>(200,"查询成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult<>(444, "没有记录，查询id"+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        //eureka注册的所有服务
        List<String> services = discoveryClient.getServices();
        services.forEach((e)->{
            log.info("----------element:"+e);
        });

        //CLOUD-PAYMENT-SERVICE服务下的所有信息
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach((instance)->{
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort());
                }
        );
        return discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return serverPort;
    }

}
