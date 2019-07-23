package com.hand.listofvalue.access.dao;

import com.hand.listofvalue.access.vo.ListOfValueVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListOfValueDao {
    List<ListOfValueVO> queryLstOfVaL(ListOfValueVO listOfValueVO);
}
