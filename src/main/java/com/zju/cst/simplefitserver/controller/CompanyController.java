package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.model.InfoDetailSeller;
import com.zju.cst.simplefitserver.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

  @Autowired
  CompanyService companyService;


  @RequestMapping("/{username}/info")
  public ResponseInfo getCompany() {

    ResponseInfo res = new ResponseInfo();
    res.setResCode("200");
    return res;

  }

  // 获取 seller_id
  @RequestMapping(value = "/getSeller", method = RequestMethod.POST)
  public ResponseInfo getSeller(@RequestParam("userId") Integer userId) {
    ResponseInfo responseInfo = new ResponseInfo();
    InfoDetailSeller infoDetailSeller = companyService.getSeller(userId);
    if (infoDetailSeller != null) {
      responseInfo.setResObject(infoDetailSeller);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 商家查看三天课程
  @RequestMapping(value = "/viewSchedule", method = RequestMethod.POST)
  public ResponseInfo viewSchedule(@RequestParam("sellerId") Integer sellerId, @RequestParam(value = "startTime") String startTime) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = companyService.viewSchedule(sellerId, startTime);
    responseInfo.setResCode("200");
    responseInfo.setResInfo("Success");
    responseInfo.setResDataSet(list.toArray());
    return responseInfo;
  }

}
