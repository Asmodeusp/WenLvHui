package com.sugang.wenlvhui.model.bean.home.hstj;

import java.util.List;


public  class BookBean {
    /**
     * bookAuther : 大哥
     * bookDetail : adssa
     * bookName : 简爱
     * bookPrice : 111.0
     * bookTag : 1
     * commentList : []
     * createDate : 1556979719000
     * dataList : []
     * id : 1
     * indexShow : 0
     * publishDate : 2019-05-22
     * recommendUser : 111
     * recommend_class : 5
     * recommendedNumber : 111
     * sex : 1
     */

    private String bookAuther;
    private String bookDetail;
    private String bookName;
    private double bookPrice;
    private int bookTag;
    private long createDate;
    private int id;
    private int indexShow;
    private String publishDate;
    private int recommendUser;
    private int recommend_class;
    private int recommendedNumber;
    private int sex;
    private List<?> commentList;
    private List<?> dataList;

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookTag() {
        return bookTag;
    }

    public void setBookTag(int bookTag) {
        this.bookTag = bookTag;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndexShow() {
        return indexShow;
    }

    public void setIndexShow(int indexShow) {
        this.indexShow = indexShow;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(int recommendUser) {
        this.recommendUser = recommendUser;
    }

    public int getRecommend_class() {
        return recommend_class;
    }

    public void setRecommend_class(int recommend_class) {
        this.recommend_class = recommend_class;
    }

    public int getRecommendedNumber() {
        return recommendedNumber;
    }

    public void setRecommendedNumber(int recommendedNumber) {
        this.recommendedNumber = recommendedNumber;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<?> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<?> commentList) {
        this.commentList = commentList;
    }

    public List<?> getDataList() {
        return dataList;
    }

    public void setDataList(List<?> dataList) {
        this.dataList = dataList;
    }
}