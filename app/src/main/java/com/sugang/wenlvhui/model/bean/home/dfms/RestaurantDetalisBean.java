package com.sugang.wenlvhui.model.bean.home.dfms;

import java.util.List;

public class RestaurantDetalisBean {
    /**
     * msg : 成功
     * code : 0
     * data : {"restaurant":{"addrDetail":"怀远西路5号","area":"西夏区","averageConsumption":77,"city":"银川市","createDate":1559182233000,"createUser":1,"foodList":[{"commentList":[],"foodDetail":"爆炒羊羔肉","foodName":"羊羔肉","foodPrice":58,"foodType":2,"id":4,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"辣爆羊头","foodName":"辣爆羊头","foodPrice":58,"foodType":2,"id":23,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"麻辣小龙虾","foodName":"麻辣小龙虾","foodPrice":58,"foodType":2,"id":24,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"}],"id":1,"latitude":"32.26478","longitude":"32.26478","restaurantBackimage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantImg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantName":"我的最爱","restaurantType":"湖南大碗菜","starClass":5,"up_num":3},"page":"1"}
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
         * restaurant : {"addrDetail":"怀远西路5号","area":"西夏区","averageConsumption":77,"city":"银川市","createDate":1559182233000,"createUser":1,"foodList":[{"commentList":[],"foodDetail":"爆炒羊羔肉","foodName":"羊羔肉","foodPrice":58,"foodType":2,"id":4,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"辣爆羊头","foodName":"辣爆羊头","foodPrice":58,"foodType":2,"id":23,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"麻辣小龙虾","foodName":"麻辣小龙虾","foodPrice":58,"foodType":2,"id":24,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"}],"id":1,"latitude":"32.26478","longitude":"32.26478","restaurantBackimage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantImg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantName":"我的最爱","restaurantType":"湖南大碗菜","starClass":5,"up_num":3}
         * page : 1
         */

        private RestaurantBean restaurant;
        private String page;

        public RestaurantBean getRestaurant() {
            return restaurant;
        }

        public void setRestaurant(RestaurantBean restaurant) {
            this.restaurant = restaurant;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public static class RestaurantBean {
            /**
             * addrDetail : 怀远西路5号
             * area : 西夏区
             * averageConsumption : 77
             * city : 银川市
             * createDate : 1559182233000
             * createUser : 1
             * foodList : [{"commentList":[],"foodDetail":"爆炒羊羔肉","foodName":"羊羔肉","foodPrice":58,"foodType":2,"id":4,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"辣爆羊头","foodName":"辣爆羊头","foodPrice":58,"foodType":2,"id":23,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"},{"commentList":[],"foodDetail":"麻辣小龙虾","foodName":"麻辣小龙虾","foodPrice":58,"foodType":2,"id":24,"imgOrVideo":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","restaurantId":1,"upNum":1220,"videoUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/2019/05/06/20190430-005104.mp4"}]
             * id : 1
             * latitude : 32.26478
             * longitude : 32.26478
             * restaurantBackimage : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * restaurantImg : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * restaurantName : 我的最爱
             * restaurantType : 湖南大碗菜
             * starClass : 5
             * up_num : 3
             */

            private String addrDetail;
            private String area;
            private int averageConsumption;
            private String city;
            private long createDate;
            private int createUser;
            private int id;
            private String latitude;
            private String longitude;
            private String restaurantBackimage;
            private String restaurantImg;
            private String restaurantName;
            private String restaurantType;
            private int starClass;
            private int up_num;
            private List<FoodListBean> foodList;

            public String getAddrDetail() {
                return addrDetail;
            }

            public void setAddrDetail(String addrDetail) {
                this.addrDetail = addrDetail;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public int getAverageConsumption() {
                return averageConsumption;
            }

            public void setAverageConsumption(int averageConsumption) {
                this.averageConsumption = averageConsumption;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public int getCreateUser() {
                return createUser;
            }

            public void setCreateUser(int createUser) {
                this.createUser = createUser;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getRestaurantBackimage() {
                return restaurantBackimage;
            }

            public void setRestaurantBackimage(String restaurantBackimage) {
                this.restaurantBackimage = restaurantBackimage;
            }

            public String getRestaurantImg() {
                return restaurantImg;
            }

            public void setRestaurantImg(String restaurantImg) {
                this.restaurantImg = restaurantImg;
            }

            public String getRestaurantName() {
                return restaurantName;
            }

            public void setRestaurantName(String restaurantName) {
                this.restaurantName = restaurantName;
            }

            public String getRestaurantType() {
                return restaurantType;
            }

            public void setRestaurantType(String restaurantType) {
                this.restaurantType = restaurantType;
            }

            public int getStarClass() {
                return starClass;
            }

            public void setStarClass(int starClass) {
                this.starClass = starClass;
            }

            public int getUp_num() {
                return up_num;
            }

            public void setUp_num(int up_num) {
                this.up_num = up_num;
            }

            public List<FoodListBean> getFoodList() {
                return foodList;
            }

            public void setFoodList(List<FoodListBean> foodList) {
                this.foodList = foodList;
            }

            public static class FoodListBean {
                /**
                 * commentList : []
                 * foodDetail : 爆炒羊羔肉
                 * foodName : 羊羔肉
                 * foodPrice : 58
                 * foodType : 2
                 * id : 4
                 * imgOrVideo : 2
                 * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
                 * restaurantId : 1
                 * upNum : 1220
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
}
