package com.sugang.wenlvhui.model.bean.home.wcfy;

import java.util.List;

public class ShouYiPageBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"allday":[{"browse":200,"categoryId":1,"commentList":[],"createDate":1556985600000,"createUser":1,"id":1,"price":52,"priceDq":12,"productDatile":"戴在手上","productName":"手心里手签","productPoint":"好看，好用","shopsId":1,"skuId":"BQ20190505203156","status":1},{"browse":1200,"categoryId":2,"commentList":[],"id":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","price":388,"priceDq":388,"productDatile":"采用紫檀木雕刻而成，送人大气","productName":"定情信物古风圆章纯银紫檀创...","productPoint":"送女朋友","shopsId":2,"skuId":"BQ20190505203312","status":1},{"browse":256,"categoryId":1,"commentList":[],"id":3,"price":129,"priceDq":129,"productDatile":"啊啊啊啊啊啊啊啊啊","productName":"空间方式/手心里金鱼金属书签","productPoint":"送礼好评","shopsId":3,"skuId":"BQ20190505203416","status":1}],"select_product":[{"addrDetail":"新华街4号","area":"兴庆区","browse":652,"categoryId":3,"city":"银川","commentList":[],"dataName":"地方美食","id":4,"isUp":0,"price":69,"priceDq":69,"productDatile":"哇哇哇哇哇哇哇哇哇哇哇哇哇哇哇","productName":"中国风文创产品创意设计书签定制版","productPoint":"好东西","province":"宁夏","shopsId":1,"skuId":"BQ20190505203602","status":1},{"addrDetail":"新华街4号","area":"兴庆区","browse":200,"categoryId":1,"city":"银川","commentList":[],"createDate":1556985600000,"createUser":1,"dataName":"文艺培训","id":1,"isUp":0,"price":52,"priceDq":12,"productDatile":"戴在手上","productName":"手心里手签","productPoint":"好看，好用","province":"宁夏","shopsId":1,"skuId":"BQ20190505203156","status":1},{"addrDetail":"怀远路1号","area":"西夏区","browse":1200,"categoryId":2,"city":"银川","commentList":[],"dataName":"文创非遗","id":2,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","isUp":0,"price":388,"priceDq":388,"productDatile":"采用紫檀木雕刻而成，送人大气","productName":"定情信物古风圆章纯银紫檀创...","productPoint":"送女朋友","province":"宁夏","shopsId":2,"skuId":"BQ20190505203312","status":1},{"addrDetail":"正源街24号","area":"金凤区","browse":256,"categoryId":1,"city":"银川","commentList":[],"dataName":"文艺培训","id":3,"isUp":0,"price":129,"priceDq":129,"productDatile":"啊啊啊啊啊啊啊啊啊","productName":"空间方式/手心里金鱼金属书签","productPoint":"送礼好评","province":"宁夏","shopsId":3,"skuId":"BQ20190505203416","status":1}]}
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
        private List<AlldayBean> allday;
        private List<SelectProductBean> select_product;

        public List<AlldayBean> getAllday() {
            return allday;
        }

        public void setAllday(List<AlldayBean> allday) {
            this.allday = allday;
        }

        public List<SelectProductBean> getSelect_product() {
            return select_product;
        }

        public void setSelect_product(List<SelectProductBean> select_product) {
            this.select_product = select_product;
        }

        public static class AlldayBean {
            /**
             * browse : 200
             * categoryId : 1
             * commentList : []
             * createDate : 1556985600000
             * createUser : 1
             * id : 1
             * price : 52
             * priceDq : 12
             * productDatile : 戴在手上
             * productName : 手心里手签
             * productPoint : 好看，好用
             * shopsId : 1
             * skuId : BQ20190505203156
             * status : 1
             * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             */

            private int browse;
            private int categoryId;
            private long createDate;
            private int createUser;
            private int id;
            private int price;
            private int priceDq;
            private String productDatile;
            private String productName;
            private String productPoint;
            private int shopsId;
            private String skuId;
            private int status;
            private String imgUrl;
            private List<?> commentList;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
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

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getPriceDq() {
                return priceDq;
            }

            public void setPriceDq(int priceDq) {
                this.priceDq = priceDq;
            }

            public String getProductDatile() {
                return productDatile;
            }

            public void setProductDatile(String productDatile) {
                this.productDatile = productDatile;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getProductPoint() {
                return productPoint;
            }

            public void setProductPoint(String productPoint) {
                this.productPoint = productPoint;
            }

            public int getShopsId() {
                return shopsId;
            }

            public void setShopsId(int shopsId) {
                this.shopsId = shopsId;
            }

            public String getSkuId() {
                return skuId;
            }

            public void setSkuId(String skuId) {
                this.skuId = skuId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }
        }

        public static class SelectProductBean {
            /**
             * addrDetail : 新华街4号
             * area : 兴庆区
             * browse : 652
             * categoryId : 3
             * city : 银川
             * commentList : []
             * dataName : 地方美食
             * id : 4
             * isUp : 0
             * price : 69
             * priceDq : 69
             * productDatile : 哇哇哇哇哇哇哇哇哇哇哇哇哇哇哇
             * productName : 中国风文创产品创意设计书签定制版
             * productPoint : 好东西
             * province : 宁夏
             * shopsId : 1
             * skuId : BQ20190505203602
             * status : 1
             * createDate : 1556985600000
             * createUser : 1
             * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             */

            private String addrDetail;
            private String area;
            private int browse;
            private int categoryId;
            private String city;
            private String dataName;
            private int id;
            private int isUp;
            private int price;
            private int priceDq;
            private String productDatile;
            private String productName;
            private String productPoint;
            private String province;
            private int shopsId;
            private String skuId;
            private int status;
            private long createDate;
            private int createUser;
            private String imgUrl;
            private List<?> commentList;

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

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDataName() {
                return dataName;
            }

            public void setDataName(String dataName) {
                this.dataName = dataName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsUp() {
                return isUp;
            }

            public void setIsUp(int isUp) {
                this.isUp = isUp;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getPriceDq() {
                return priceDq;
            }

            public void setPriceDq(int priceDq) {
                this.priceDq = priceDq;
            }

            public String getProductDatile() {
                return productDatile;
            }

            public void setProductDatile(String productDatile) {
                this.productDatile = productDatile;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getProductPoint() {
                return productPoint;
            }

            public void setProductPoint(String productPoint) {
                this.productPoint = productPoint;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public int getShopsId() {
                return shopsId;
            }

            public void setShopsId(int shopsId) {
                this.shopsId = shopsId;
            }

            public String getSkuId() {
                return skuId;
            }

            public void setSkuId(String skuId) {
                this.skuId = skuId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
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

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
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
