package com.hand.listofvalue.controller;

import com.hand.listofvalue.access.vo.ListOfValueVO;
import com.hand.listofvalue.service.ListOfValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("值列表相关api")
public class ListOfValueController {
    @Autowired
    private ListOfValueService listOfValueService;

    @ApiOperation(value="新建值列表")
    @PostMapping("/addLstOfVal")
    public String addListOfValue(@RequestBody ListOfValueVO listOfValueVO){
        boolean flag = listOfValueService.toUniqueVerify(listOfValueVO);
        String msg = "";
        if(flag){
            msg = listOfValueService.insertLstOfVal(listOfValueVO);
        }
        else{
            msg="唯一性验证失败";
        }
        return msg;
    }
}
