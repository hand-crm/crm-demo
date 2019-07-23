package com.hand.listofvalue.service;

import com.hand.listofvalue.access.dao.ListOfValueDao;
import com.hand.listofvalue.access.vo.ListOfValueVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListOfValueServiceImpl implements ListOfValueService{
    @Autowired
    ListOfValueDao listOfValueDao;

    @Override
    public List<ListOfValueVO> getLstOfVaL(ListOfValueVO listOfValueVO) {
        return listOfValueDao.queryLstOfVaL(listOfValueVO);
    }
}
