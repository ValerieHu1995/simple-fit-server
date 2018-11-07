package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {


    /*
        resCode: 000000 正常返回
                 000001 用户不存在

                 ...     可自行补充
     */



    @RequestMapping("/{username}/info")
    public ResponseInfo getCompany(){

        ResponseInfo res = new ResponseInfo();
        res.setResCode("111");
        return res;

    }


    @RequestMapping("test")
    public ResponseInfo getTest(){

        ResponseInfo res = new ResponseInfo();
        res.setResCode("000000");
        res.setResInfo("It's a test method");
        return res;
    }



}
