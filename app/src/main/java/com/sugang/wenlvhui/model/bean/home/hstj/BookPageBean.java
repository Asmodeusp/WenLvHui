package com.sugang.wenlvhui.model.bean.home.hstj;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookPageBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"new":[{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简爱","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":1,"indexShow":0,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}],"like":[{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简爱","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":1,"indexShow":0,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1},{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简aaa","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":2,"indexShow":1,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}],"tuijian":{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简aaa","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":2,"indexShow":1,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}}
     */

    private String msg;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * new : [{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简爱","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":1,"indexShow":0,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}]
         * like : [{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简爱","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":1,"indexShow":0,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1},{"bookAuther":"大哥","bookDetail":"adssa","bookName":"简aaa","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":2,"indexShow":1,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}]
         * tuijian : {"bookAuther":"大哥","bookDetail":"adssa","bookName":"简aaa","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"dataList":[],"id":2,"indexShow":1,"publishDate":"2019-05-22","recommendUser":111,"recommend_class":5,"recommendedNumber":111,"sex":1}
         */

        private BookBean tuijian;
        @SerializedName("new")
        private List<BookBean> newX;
        private List<BookBean> like;

        public BookBean getTuijian() {
            return tuijian;
        }

        public void setTuijian(BookBean tuijian) {
            this.tuijian = tuijian;
        }

        public List<BookBean> getNewX() {
            return newX;
        }

        public void setNewX(List<BookBean> newX) {
            this.newX = newX;
        }

        public List<BookBean> getLike() {
            return like;
        }

        public void setLike(List<BookBean> like) {
            this.like = like;
        }
    }
}
