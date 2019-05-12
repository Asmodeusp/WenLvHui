package com.sugang.wenlvhui.model.bean.home.hstj;

import java.util.List;

public class BookTuijianBean {


    /**
     * msg : 成功
     * code : 0
     * data : {"tuijian":{"bookAuther":"eee","bookDetail":"散文","bookName":"活着","bookPrice":121,"bookTag":2,"commentList":[],"createDate":1557214231000,"id":8,"imgUrl":"https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=400491349,1098477433&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-25","recommendClass":4,"recommendUser":1,"recommendedNumber":567,"sex":1,"tagList":[],"user":{"birthday":1557123913000,"created":1557123867000,"headPic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","id":1,"isMobileCheck":"0","lastLoginTime":1557123915000,"name":"zhangsan","nickName":"橙子","password":"123","phone":"13629562255","sex":"1","sourceType":"3","status":"Y","updated":1557123870000,"userLevel":"1","username":"admin"}}}
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
         * tuijian : {"bookAuther":"eee","bookDetail":"散文","bookName":"活着","bookPrice":121,"bookTag":2,"commentList":[],"createDate":1557214231000,"id":8,"imgUrl":"https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=400491349,1098477433&fm=26&gp=0.jpg","indexShow":1,"publishDate":"2019-04-25","recommendClass":4,"recommendUser":1,"recommendedNumber":567,"sex":1,"tagList":[],"user":{"birthday":1557123913000,"created":1557123867000,"headPic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","id":1,"isMobileCheck":"0","lastLoginTime":1557123915000,"name":"zhangsan","nickName":"橙子","password":"123","phone":"13629562255","sex":"1","sourceType":"3","status":"Y","updated":1557123870000,"userLevel":"1","username":"admin"}}
         */

        private TuijianBean tuijian;

        public TuijianBean getTuijian() {
            return tuijian;
        }

        public void setTuijian(TuijianBean tuijian) {
            this.tuijian = tuijian;
        }

        public static class TuijianBean {
            /**
             * bookAuther : eee
             * bookDetail : 散文
             * bookName : 活着
             * bookPrice : 121.0
             * bookTag : 2
             * commentList : []
             * createDate : 1557214231000
             * id : 8
             * imgUrl : https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=400491349,1098477433&fm=26&gp=0.jpg
             * indexShow : 1
             * publishDate : 2019-04-25
             * recommendClass : 4
             * recommendUser : 1
             * recommendedNumber : 567
             * sex : 1
             * tagList : []
             * user : {"birthday":1557123913000,"created":1557123867000,"headPic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","id":1,"isMobileCheck":"0","lastLoginTime":1557123915000,"name":"zhangsan","nickName":"橙子","password":"123","phone":"13629562255","sex":"1","sourceType":"3","status":"Y","updated":1557123870000,"userLevel":"1","username":"admin"}
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
                /**
                 * birthday : 1557123913000
                 * created : 1557123867000
                 * headPic : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg
                 * id : 1
                 * isMobileCheck : 0
                 * lastLoginTime : 1557123915000
                 * name : zhangsan
                 * nickName : 橙子
                 * password : 123
                 * phone : 13629562255
                 * sex : 1
                 * sourceType : 3
                 * status : Y
                 * updated : 1557123870000
                 * userLevel : 1
                 * username : admin
                 */

                private long birthday;
                private long created;
                private String headPic;
                private int id;
                private String isMobileCheck;
                private long lastLoginTime;
                private String name;
                private String nickName;
                private String password;
                private String phone;
                private String sex;
                private String sourceType;
                private String status;
                private long updated;
                private String userLevel;
                private String username;

                public long getBirthday() {
                    return birthday;
                }

                public void setBirthday(long birthday) {
                    this.birthday = birthday;
                }

                public long getCreated() {
                    return created;
                }

                public void setCreated(long created) {
                    this.created = created;
                }

                public String getHeadPic() {
                    return headPic;
                }

                public void setHeadPic(String headPic) {
                    this.headPic = headPic;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIsMobileCheck() {
                    return isMobileCheck;
                }

                public void setIsMobileCheck(String isMobileCheck) {
                    this.isMobileCheck = isMobileCheck;
                }

                public long getLastLoginTime() {
                    return lastLoginTime;
                }

                public void setLastLoginTime(long lastLoginTime) {
                    this.lastLoginTime = lastLoginTime;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getSourceType() {
                    return sourceType;
                }

                public void setSourceType(String sourceType) {
                    this.sourceType = sourceType;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public long getUpdated() {
                    return updated;
                }

                public void setUpdated(long updated) {
                    this.updated = updated;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }
            }
        }
    }
}

