package com.card.mapper;

import com.card.model.Feellevel;
import com.card.model.FeellevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeellevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int countByExample(FeellevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int deleteByExample(FeellevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int deleteByPrimaryKey(Integer feelLevel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int insert(Feellevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int insertSelective(Feellevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    List<Feellevel> selectByExample(FeellevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    Feellevel selectByPrimaryKey(Integer feelLevel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Feellevel record, @Param("example") FeellevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByExample(@Param("record") Feellevel record, @Param("example") FeellevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByPrimaryKeySelective(Feellevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feellevel
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    int updateByPrimaryKey(Feellevel record);
}