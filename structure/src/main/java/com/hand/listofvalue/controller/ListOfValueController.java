package com.hand.listofvalue.controller;

import com.hand.listofvalue.service.ListOfValueService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("值列表相关api")
public class ListOfValueController {
    @Autowired
    ListOfValueService listOfValueService;
}
