package com.ruanun.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sun.deploy.security.BlockedException;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruan
 */
@Log
@RestController
public class FlowLimitController {

    @GetMapping("/testa")
    public String testA() {
        return "A";
    }

    @GetMapping("/testb")
    public String testB() {
        return "B";
    }

    @GetMapping("/testc")
    public String testc() {
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("ccccccccccccccccccc, 测试RT");*/

        log.info("测试 异常比例");
        int x = 1 / 0;

        return "c";
    }

    @GetMapping("/testd")
    public String testd() {

        log.info("测试 异常数");
        int x = 1 / 0;

        return "d";
    }


    @GetMapping("/testhotkey")
    @SentinelResource(value = "testhotkey", blockHandler = "exh")
    public String testhotkey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {

        log.info("测试 testhotkey");

        return "testhotkey";
    }

    public String exh(String p1, String p2, BlockedException exception) {
        return "error";
    }
}
