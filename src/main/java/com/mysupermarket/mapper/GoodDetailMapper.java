package com.mysupermarket.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mysupermarket.pojo.GoodDetail;
import com.mysupermarket.pojo.GoodDetailExample;
import com.mysupermarket.pojo.GoodDetailLoadEntity;

public interface GoodDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int countByExample(GoodDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int deleteByExample(GoodDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int deleteByPrimaryKey(Integer gdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int insert(GoodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int insertSelective(GoodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    List<GoodDetail> selectByExample(GoodDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    GoodDetail selectByPrimaryKey(Integer gdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") GoodDetail record, @Param("example") GoodDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int updateByExample(@Param("record") GoodDetail record, @Param("example") GoodDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int updateByPrimaryKeySelective(GoodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    int updateByPrimaryKey(GoodDetail record);
    
    /*
     * 作用 :
     * 		根据goodid查询商品的详细信息
     *param : 
     *		goodid
     *return :
     *		List<Map<String, Object>>
     * 
     * */
    List<GoodDetailLoadEntity> SelectByGoodId(int goodid);
    
}