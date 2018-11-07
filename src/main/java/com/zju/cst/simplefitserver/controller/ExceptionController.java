package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.exception.UnAuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnAuthenticationException.class)
    public ResponseInfo getUnAuthenticationRes(){

        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setResCode("000003");
        responseInfo.setResInfo(" Permission Denied, Please Login First ");
        return responseInfo;
    }
}
