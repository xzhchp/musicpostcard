package com.card.mapper;

import com.card.model.Postcard;
import com.card.model.PostcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostcardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int countByExample(PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int deleteByExample(PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int deleteByPrimaryKey(Integer postcardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int insert(Postcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int insertSelective(Postcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    List<Postcard> selectByExampleWithBLOBs(PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    List<Postcard> selectByExample(PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    Postcard selectByPrimaryKey(Integer postcardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Postcard record, @Param("example") PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Postcard record, @Param("example") PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByExample(@Param("record") Postcard record, @Param("example") PostcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByPrimaryKeySelective(Postcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Postcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table postcard
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByPrimaryKey(Postcard record);
    
    
    
    
    public Integer getpostcradnum();
}