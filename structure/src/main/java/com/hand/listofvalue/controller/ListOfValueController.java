package com.hand.listofvalue.controller;

import com.hand.listofvalue.access.vo.ListOfValueVO;
import com.hand.listofvalue.service.ListOfValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api("值列表相关api")
public class ListOfValueController {
    @Autowired
    ListOfValueService listOfValueService;

    @ApiOperation(value="值列表查询")
    @GetMapping("/lstOfValues")
    public Map<String,Object> getLstOfValues(@RequestBody() ListOfValueVO listOfValueVO){
        Map result = new HashMap();
        List<ListOfValueVO> listOfValueVOList = listOfValueService.getLstOfVaL(listOfValueVO);
        if (listOfValueVOList.size()>0){
            result.put("code","0");
            result.put("errMsg","success");
            result.put("lstOfVal",listOfValueVOList);
        }
        else {
            result.put("code","1");
            result.put("errMsg","fail");
        }
        return result;
    }
}
