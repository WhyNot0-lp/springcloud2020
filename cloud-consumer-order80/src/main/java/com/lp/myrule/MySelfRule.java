package com.lp.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lp
 * @date 2020/3/11 16:34
 *
 * 由于自定义的负载均衡算法不能被SpringbootAplication注解下的componentScan扫描到，所以要重新建一个包
 *
 * 轮询算法的原理：rest接口第几次请求 % 服务器集群总数量 = 实际调用服务下标，每次重启服务后rest接口计数从1开始
 *
 * List<ServiceInstance> instances=discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE")
 * eg: List[0] = instance=127.0.0.1:8001
 *     List[1] = instance=127.0.0.1:8002
 */
@Configuration
public class MySelfRule{

    @Bean
    public IRule myRule(){
        //定义负载均衡算法为随机
        return new RandomRule();
    }

}
