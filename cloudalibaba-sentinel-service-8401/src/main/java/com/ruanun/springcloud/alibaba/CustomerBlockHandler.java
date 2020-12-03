package com.ruanun.springcloud.alibaba;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ruanun.springcloud.entities.CommonResult;

/**
 * @author ruan
 */

public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1", null);
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2", null);
    }
}
