package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

public class SellExctption extends RuntimeException {

    private Integer code;

    public SellExctption(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellExctption(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
