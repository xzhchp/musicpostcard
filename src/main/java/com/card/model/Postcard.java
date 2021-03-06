package com.card.model;

import java.util.Date;

public class Postcard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.postcard_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private Integer postcardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.song_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private Integer songId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.postdate
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private Date postdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.user_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.feel_level
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private Integer feelLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column postcard.text
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    private String text;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.postcard_id
     *
     * @return the value of postcard.postcard_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public Integer getPostcardId() {
        return postcardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.postcard_id
     *
     * @param postcardId the value for postcard.postcard_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setPostcardId(Integer postcardId) {
        this.postcardId = postcardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.song_id
     *
     * @return the value of postcard.song_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public Integer getSongId() {
        return songId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.song_id
     *
     * @param songId the value for postcard.song_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.postdate
     *
     * @return the value of postcard.postdate
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public Date getPostdate() {
        return postdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.postdate
     *
     * @param postdate the value for postcard.postdate
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.user_id
     *
     * @return the value of postcard.user_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.user_id
     *
     * @param userId the value for postcard.user_id
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.feel_level
     *
     * @return the value of postcard.feel_level
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public Integer getFeelLevel() {
        return feelLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.feel_level
     *
     * @param feelLevel the value for postcard.feel_level
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setFeelLevel(Integer feelLevel) {
        this.feelLevel = feelLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column postcard.text
     *
     * @return the value of postcard.text
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column postcard.text
     *
     * @param text the value for postcard.text
     *
     * @mbggenerated Mon Jun 24 21:18:50 CST 2019
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}