package com.hand.listofvalue.access.dao;

import com.hand.listofvalue.access.vo.ListOfValueVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListOfValueDao {
    /**
     * 根据查询条件查询值列表
     * @UpdateBy yne
     * @param listOfValueVO
     * @Return List<ListOfValueVO>
     */
    List<ListOfValueVO> queryLstOfVaL(ListOfValueVO listOfValueVO);
    /**
     * 新建唯一性验证（独立语言代码+语言+Type+父code 和 显示值+语言+type+父code唯一）
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return ListOfValueVO,String
     */
    public int toUniqueVerify(@Param("listOfValueVO") ListOfValueVO listOfValueVO,@Param("str") String str);

    /**
     * 新建值列表
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return code
     */
    public int insertLstOfVal(ListOfValueVO listOfValueVO);
    /**
     * 修改值列表
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return code
     */
    public int updateLstOfVal(ListOfValueVO listOfValueVO);
}
