package com.lp.springcloud.alibaba.controller;

import com.lp.springcloud.alibaba.domain.CommonResult;
import com.lp.springcloud.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author lp
 * @date 2020/3/17 20:21
 */
@RestController
public class AccountControlle {

    @Autowired
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        try { TimeUnit.SECONDS.sleep(4); }catch (Exception e) {e.printStackTrace();}
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
