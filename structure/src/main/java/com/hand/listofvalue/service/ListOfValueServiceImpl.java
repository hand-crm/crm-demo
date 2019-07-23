package com.hand.listofvalue.service;

import com.hand.frame.util.StringUtil;
import com.hand.listofvalue.access.dao.ListOfValueDao;
import com.hand.listofvalue.access.vo.ListOfValueVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListOfValueServiceImpl implements ListOfValueService{
    @Autowired
    ListOfValueDao listOfValueDao;

    /**
     * 唯一性验证（独立语言代码+语言+Type 和 显示值+语言+type唯一）
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return boolean
     */
    @Override
    public boolean toUniqueVerify(ListOfValueVO listOfValueVO) {
        if(listOfValueVO.getName()!=null&&listOfValueVO.getLangId()!=null&&listOfValueVO.getType()!=null&&listOfValueVO.getVal()!=null){
            int count = listOfValueDao.toUniqueVerify(listOfValueVO);
            if(count>0){
                //验证失败，不唯一
                return false;
            }
            else {
                //验证成功，唯一
                return true;
            }
        }
        else {
            return false;
        }
    }
    /**
     * 新建值列表
     * @UpdateBy lln
     * @param listOfValueVO
     * @Return code
     */
    @Override
    public String insertLstOfVal(ListOfValueVO listOfValueVO) {
        if(StringUtil.isEmpty(listOfValueVO.getCode())&&StringUtil.isEmpty(listOfValueVO.getType())
                &&StringUtil.isEmpty(listOfValueVO.getLangId())&&StringUtil.isEmpty(listOfValueVO.getName())
                &&StringUtil.isEmpty(listOfValueVO.getVal())&&StringUtil.isEmpty(listOfValueVO.getLevel().toString()))
        {
            int count = listOfValueDao.insertLstOfVal(listOfValueVO);
            if(count>0){
                return "success";
            }
            else{
                return "failed";
            }
        }
        else {
            return "failed";
        }

    }
}
