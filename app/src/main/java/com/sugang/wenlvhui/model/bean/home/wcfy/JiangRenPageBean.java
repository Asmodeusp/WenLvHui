package com.sugang.wenlvhui.model.bean.home.wcfy;

import java.util.List;

public class JiangRenPageBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"shops":[{"addrDetail":"新华街4号","area":"兴庆区","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":1,"imgUrl":"111","is_up":0,"productList":[],"product_num":2,"province":"宁夏","shopsDetail":"创建于2019年4月，过来就随便了","shopsName":"村田陶艺工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]},{"addrDetail":"怀远路1号","area":"西夏区","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":2,"imgUrl":"11","is_up":0,"productList":[],"product_num":1,"province":"宁夏","shopsDetail":"创建于2019年4月，过来就随便了","shopsName":"闲云阁艺术工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]},{"addrDetail":"正源街24号","area":"金凤区","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":3,"imgUrl":"11","is_up":0,"productList":[],"product_num":1,"province":"宁夏","shopsDetail":"创建于2019年4月","shopsName":"createur文艺工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]},{"addrDetail":"丰庆路22号","area":"贺兰县","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":4,"is_up":0,"productList":[],"product_num":0,"province":"宁夏","shopsDetail":"创建于2019年4月，过来就随便了","shopsName":"锦匠手工皮具工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]},{"addrDetail":"县城","area":"永宁","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":5,"imgUrl":"11","is_up":0,"productList":[],"product_num":0,"province":"宁夏","shopsDetail":"创建于2019年4月，皮影戏","shopsName":"皮影匠手工工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]},{"addrDetail":"文昌西路","area":"西夏区","city":"银川","createDate":1557059444000,"createUser":1,"experienceList":[],"id":6,"is_up":0,"productList":[],"product_num":0,"province":"宁夏","shopsDetail":"创建于2019年4月","shopsName":"德馆堂古艺工作室","shopsSlogan":"玩物本无价，人心有高低","upList":[],"up_num":0,"videoList":[]}]}
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
        private List<ShopsBean> shops;

        public List<ShopsBean> getShops() {
            return shops;
        }

        public void setShops(List<ShopsBean> shops) {
            this.shops = shops;
        }

        public static class ShopsBean {
            /**
             * addrDetail : 新华街4号
             * area : 兴庆区
             * city : 银川
             * createDate : 1557059444000
             * createUser : 1
             * experienceList : []
             * id : 1
             * imgUrl : 111
             * is_up : 0
             * productList : []
             * product_num : 2
             * province : 宁夏
             * shopsDetail : 创建于2019年4月，过来就随便了
             * shopsName : 村田陶艺工作室
             * shopsSlogan : 玩物本无价，人心有高低
             * upList : []
             * up_num : 0
             * videoList : []
             */

            private String addrDetail;
            private String area;
            private String city;
            private long createDate;
            private int createUser;
            private int id;
            private String imgUrl;
            private int is_up;
            private int product_num;
            private String province;
            private String shopsDetail;
            private String shopsName;
            private String shopsSlogan;
            private int up_num;
            private List<?> experienceList;
            private List<?> productList;
            private List<?> upList;
            private List<?> videoList;

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

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getIs_up() {
                return is_up;
            }

            public void setIs_up(int is_up) {
                this.is_up = is_up;
            }

            public int getProduct_num() {
                return product_num;
            }

            public void setProduct_num(int product_num) {
                this.product_num = product_num;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getShopsDetail() {
                return shopsDetail;
            }

            public void setShopsDetail(String shopsDetail) {
                this.shopsDetail = shopsDetail;
            }

            public String getShopsName() {
                return shopsName;
            }

            public void setShopsName(String shopsName) {
                this.shopsName = shopsName;
            }

            public String getShopsSlogan() {
                return shopsSlogan;
            }

            public void setShopsSlogan(String shopsSlogan) {
                this.shopsSlogan = shopsSlogan;
            }

            public int getUp_num() {
                return up_num;
            }

            public void setUp_num(int up_num) {
                this.up_num = up_num;
            }

            public List<?> getExperienceList() {
                return experienceList;
            }

            public void setExperienceList(List<?> experienceList) {
                this.experienceList = experienceList;
            }

            public List<?> getProductList() {
                return productList;
            }

            public void setProductList(List<?> productList) {
                this.productList = productList;
            }

            public List<?> getUpList() {
                return upList;
            }

            public void setUpList(List<?> upList) {
                this.upList = upList;
            }

            public List<?> getVideoList() {
                return videoList;
            }

            public void setVideoList(List<?> videoList) {
                this.videoList = videoList;
            }
        }
    }
}
