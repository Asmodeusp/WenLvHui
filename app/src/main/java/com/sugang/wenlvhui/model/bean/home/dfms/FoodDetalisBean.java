package com.sugang.wenlvhui.model.bean.home.dfms;

import java.util.List;

public class FoodDetalisBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"food":{"commentList":[],"foodDetail":"小菜也是美得很","foodName":"小菜","foodPrice":10,"foodType":2,"id":11,"imgOrVideo":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":3,"upNum":111,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"}}
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
         * food : {"commentList":[],"foodDetail":"小菜也是美得很","foodName":"小菜","foodPrice":10,"foodType":2,"id":11,"imgOrVideo":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":3,"upNum":111,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"}
         */

        private FoodBean food;

        public FoodBean getFood() {
            return food;
        }

        public void setFood(FoodBean food) {
            this.food = food;
        }

        public static class FoodBean {
            /**
             * commentList : []
             * foodDetail : 小菜也是美得很
             * foodName : 小菜
             * foodPrice : 10
             * foodType : 2
             * id : 11
             * imgOrVideo : 1
             * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * restaurantId : 3
             * upNum : 111
             * videoUrl : http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4
             */

            private String foodDetail;
            private String foodName;
            private int foodPrice;
            private int foodType;
            private int id;
            private int imgOrVideo;
            private String imgUrl;
            private int restaurantId;
            private int upNum;
            private String videoUrl;
            private List<?> commentList;

            public String getFoodDetail() {
                return foodDetail;
            }

            public void setFoodDetail(String foodDetail) {
                this.foodDetail = foodDetail;
            }

            public String getFoodName() {
                return foodName;
            }

            public void setFoodName(String foodName) {
                this.foodName = foodName;
            }

            public int getFoodPrice() {
                return foodPrice;
            }

            public void setFoodPrice(int foodPrice) {
                this.foodPrice = foodPrice;
            }

            public int getFoodType() {
                return foodType;
            }

            public void setFoodType(int foodType) {
                this.foodType = foodType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getImgOrVideo() {
                return imgOrVideo;
            }

            public void setImgOrVideo(int imgOrVideo) {
                this.imgOrVideo = imgOrVideo;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getRestaurantId() {
                return restaurantId;
            }

            public void setRestaurantId(int restaurantId) {
                this.restaurantId = restaurantId;
            }

            public int getUpNum() {
                return upNum;
            }

            public void setUpNum(int upNum) {
                this.upNum = upNum;
            }

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }
        }
    }
}
