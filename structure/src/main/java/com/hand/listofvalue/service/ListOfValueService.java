package com.hand.listofvalue.service;

import com.hand.listofvalue.access.vo.ListOfValueVO;

import java.util.List;


public interface ListOfValueService {

    /**
     * 根据查询条件查询值列表
     * @UpdateBy yn
     * @param listOfValueVO
     * @Return List<ListOfValueVO>
     */
    List<ListOfValueVO> getLstOfVaL(ListOfValueVO listOfValueVO);
    /**
     * 唯一性验证（独立语言代码+语言+Type 和 显示值+语言+type唯一）
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return boolean
     */
    public boolean toUniqueVerify(ListOfValueVO listOfValueVO);
    /**
     * 新建值列表
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return code
     */
    public String insertLstOfVal(ListOfValueVO listOfValueVO);
}
