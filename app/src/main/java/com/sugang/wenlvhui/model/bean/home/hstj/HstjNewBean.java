package com.sugang.wenlvhui.model.bean.home.hstj;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HstjNewBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"new":[{"bookAuther":"玛丽.比尔德","bookDetail":"一部长篇小说","bookName":"罗马元老院与人民","bookPrice":87,"bookTag":2,"commentList":[],"createDate":1557214211000,"id":4,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-30","recommendClass":3,"recommendUser":1,"recommendedNumber":232,"sex":2,"tagList":[],"user":{}},{"bookAuther":"霍达","bookDetail":"一部长篇小说","bookName":"穆斯林的葬礼","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"id":1,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-01","recommendClass":5,"recommendUser":1,"recommendedNumber":111,"sex":1,"tagList":[],"user":{}},{"bookAuther":"F.S菲茨杰拉德","bookDetail":"一部长篇小说","bookName":"了不起的盖茨比","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"id":2,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-09","recommendClass":5,"recommendUser":1,"recommendedNumber":111,"sex":1,"tagList":[],"user":{}}],"page":"1"}
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
         * new : [{"bookAuther":"玛丽.比尔德","bookDetail":"一部长篇小说","bookName":"罗马元老院与人民","bookPrice":87,"bookTag":2,"commentList":[],"createDate":1557214211000,"id":4,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-30","recommendClass":3,"recommendUser":1,"recommendedNumber":232,"sex":2,"tagList":[],"user":{}},{"bookAuther":"霍达","bookDetail":"一部长篇小说","bookName":"穆斯林的葬礼","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"id":1,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-01","recommendClass":5,"recommendUser":1,"recommendedNumber":111,"sex":1,"tagList":[],"user":{}},{"bookAuther":"F.S菲茨杰拉德","bookDetail":"一部长篇小说","bookName":"了不起的盖茨比","bookPrice":111,"bookTag":1,"commentList":[],"createDate":1556979719000,"id":2,"imgUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-09","recommendClass":5,"recommendUser":1,"recommendedNumber":111,"sex":1,"tagList":[],"user":{}}]
         * page : 1
         */

        private String page;
        @SerializedName("new")
        private ArrayList<NewBean> newX;
        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public ArrayList<NewBean> getNewX() {
            return newX;
        }

        public void setNewX(ArrayList<NewBean> newX) {
            this.newX = newX;
        }

        public static class NewBean {
            /**
             * bookAuther : 玛丽.比尔德
             * bookDetail : 一部长篇小说
             * bookName : 罗马元老院与人民
             * bookPrice : 87.0
             * bookTag : 2
             * commentList : []
             * createDate : 1557214211000
             * id : 4
             * imgUrl : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2554524366,1155592941&fm=26&gp=0.jpg
             * indexShow : 1
             * publishDate : 2019-04-30
             * recommendClass : 3
             * recommendUser : 1
             * recommendedNumber : 232
             * sex : 2
             * tagList : []
             * user : {}
             */

            private String bookAuther;
            private String bookDetail;
            private String bookName;
            private double bookPrice;
            private int bookTag;
            private long createDate;
            private int id;
            private String imgUrl;
            private int indexShow;
            private String publishDate;
            private int recommendClass;
            private int recommendUser;
            private int recommendedNumber;
            private int sex;
            private UserBean user;
            private List<?> commentList;
            private List<?> tagList;

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

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
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

            public int getRecommendClass() {
                return recommendClass;
            }

            public void setRecommendClass(int recommendClass) {
                this.recommendClass = recommendClass;
            }

            public int getRecommendUser() {
                return recommendUser;
            }

            public void setRecommendUser(int recommendUser) {
                this.recommendUser = recommendUser;
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

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }

            public List<?> getTagList() {
                return tagList;
            }

            public void setTagList(List<?> tagList) {
                this.tagList = tagList;
            }

            public static class UserBean {
            }
        }
    }
}
