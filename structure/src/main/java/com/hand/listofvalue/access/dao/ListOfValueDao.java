package com.hand.listofvalue.access.dao;

import com.hand.listofvalue.access.vo.ListOfValueVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListOfValueDao {
    List<ListOfValueVO> queryLstOfVaL(ListOfValueVO listOfValueVO);
    /**
     * 唯一性验证（独立语言代码+语言+Type 和 显示值+语言+type唯一）
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return ListOfValueVO
     */
    public int toUniqueVerify(ListOfValueVO listOfValueVO);

    /**
     * 新建值列表
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return code
     */
    public int insertLstOfVal(ListOfValueVO listOfValueVO);
}
