package com.pl1111w.exceptionhandling.vo;

import com.pl1111w.exceptionhandling.enums.ResultCode;
import lombok.Getter;

@Getter
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
