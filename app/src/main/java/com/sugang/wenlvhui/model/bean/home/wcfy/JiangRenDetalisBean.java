package com.sugang.wenlvhui.model.bean.home.wcfy;

import com.sugang.wenlvhui.model.bean.VideosBean;

import java.util.List;

public class JiangRenDetalisBean {


    /**
     * msg : 成功
     * code : 0
     * data : {"shop":{"addrDetail":"县城","area":"金凤区","browse":123,"city":"银川","createDate":1559192828000,"createUser":6,"experienceList":[],"id":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","is_up":0,"latitude":"66","longitude":"33","productList":[{"browse":200,"categoryId":1,"commentList":[],"createDate":1556985600000,"createUser":1,"id":1,"price":52,"priceDq":12,"productDatile":"戴在手上","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"手心里手签","productPoint":"好看，好用","shopsId":1,"skuId":"BQ20190505203156","status":1},{"browse":1200,"categoryId":2,"commentList":[],"id":2,"price":388,"priceDq":388,"productDatile":"采用紫檀木雕刻而成，送人大气","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"定情信物古风圆章纯银紫檀创...","productPoint":"送女朋友","shopsId":2,"skuId":"BQ20190505203312","status":1},{"browse":256,"categoryId":1,"commentList":[],"id":3,"price":129,"priceDq":129,"productDatile":"啊啊啊啊啊啊啊啊啊","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"空间方式/手心里金鱼金属书签","productPoint":"送礼好评","shopsId":3,"skuId":"BQ20190505203416","status":1},{"browse":652,"categoryId":3,"commentList":[],"id":4,"price":69,"priceDq":69,"productDatile":"哇哇哇哇哇哇哇哇哇哇哇哇哇哇哇","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"中国风文创产品创意设计书签定制版","productPoint":"好东西","shopsId":1,"skuId":"BQ20190505203602","status":1}],"product_num":2,"province":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","shopsDetail":"","shopsName":"张宝嘉皮影播放工作室","shopsSlogan":"吃喝玩乐","upList":[],"up_num":0,"videoList":[{"detalis":"匠人视频1","id":278,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频2","id":279,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频3","id":280,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频4","id":281,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频5","id":282,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]}}
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
         * shop : {"addrDetail":"县城","area":"金凤区","browse":123,"city":"银川","createDate":1559192828000,"createUser":6,"experienceList":[],"id":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","is_up":0,"latitude":"66","longitude":"33","productList":[{"browse":200,"categoryId":1,"commentList":[],"createDate":1556985600000,"createUser":1,"id":1,"price":52,"priceDq":12,"productDatile":"戴在手上","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"手心里手签","productPoint":"好看，好用","shopsId":1,"skuId":"BQ20190505203156","status":1},{"browse":1200,"categoryId":2,"commentList":[],"id":2,"price":388,"priceDq":388,"productDatile":"采用紫檀木雕刻而成，送人大气","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"定情信物古风圆章纯银紫檀创...","productPoint":"送女朋友","shopsId":2,"skuId":"BQ20190505203312","status":1},{"browse":256,"categoryId":1,"commentList":[],"id":3,"price":129,"priceDq":129,"productDatile":"啊啊啊啊啊啊啊啊啊","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"空间方式/手心里金鱼金属书签","productPoint":"送礼好评","shopsId":3,"skuId":"BQ20190505203416","status":1},{"browse":652,"categoryId":3,"commentList":[],"id":4,"price":69,"priceDq":69,"productDatile":"哇哇哇哇哇哇哇哇哇哇哇哇哇哇哇","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"中国风文创产品创意设计书签定制版","productPoint":"好东西","shopsId":1,"skuId":"BQ20190505203602","status":1}],"product_num":2,"province":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","shopsDetail":"","shopsName":"张宝嘉皮影播放工作室","shopsSlogan":"吃喝玩乐","upList":[],"up_num":0,"videoList":[{"detalis":"匠人视频1","id":278,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频2","id":279,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频3","id":280,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频4","id":281,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频5","id":282,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]}
         */

        private ShopBean shop;

        public ShopBean getShop() {
            return shop;
        }

        public void setShop(ShopBean shop) {
            this.shop = shop;
        }

        public static class ShopBean {
            /**
             * addrDetail : 县城
             * area : 金凤区
             * browse : 123
             * city : 银川
             * createDate : 1559192828000
             * createUser : 6
             * experienceList : []
             * id : 1
             * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * is_up : 0
             * latitude : 66
             * longitude : 33
             * productList : [{"browse":200,"categoryId":1,"commentList":[],"createDate":1556985600000,"createUser":1,"id":1,"price":52,"priceDq":12,"productDatile":"戴在手上","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"手心里手签","productPoint":"好看，好用","shopsId":1,"skuId":"BQ20190505203156","status":1},{"browse":1200,"categoryId":2,"commentList":[],"id":2,"price":388,"priceDq":388,"productDatile":"采用紫檀木雕刻而成，送人大气","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"定情信物古风圆章纯银紫檀创...","productPoint":"送女朋友","shopsId":2,"skuId":"BQ20190505203312","status":1},{"browse":256,"categoryId":1,"commentList":[],"id":3,"price":129,"priceDq":129,"productDatile":"啊啊啊啊啊啊啊啊啊","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"空间方式/手心里金鱼金属书签","productPoint":"送礼好评","shopsId":3,"skuId":"BQ20190505203416","status":1},{"browse":652,"categoryId":3,"commentList":[],"id":4,"price":69,"priceDq":69,"productDatile":"哇哇哇哇哇哇哇哇哇哇哇哇哇哇哇","productImage":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","productName":"中国风文创产品创意设计书签定制版","productPoint":"好东西","shopsId":1,"skuId":"BQ20190505203602","status":1}]
             * product_num : 2
             * province : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * shopsDetail :
             * shopsName : 张宝嘉皮影播放工作室
             * shopsSlogan : 吃喝玩乐
             * upList : []
             * up_num : 0
             * videoList : [{"detalis":"匠人视频1","id":278,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频2","id":279,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频3","id":280,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频4","id":281,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"匠人视频5","id":282,"imageType":2,"imgName":"匠人1","imgType":5,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":3,"pid":1,"upDate":1556520815000,"videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]
             */

            private String addrDetail;
            private String area;
            private int browse;
            private String city;
            private long createDate;
            private int createUser;
            private int id;
            private String imgUrl;
            private int is_up;
            private String latitude;
            private String longitude;
            private int product_num;
            private String province;
            private String shopsDetail;
            private String shopsName;
            private String shopsSlogan;
            private int up_num;
            private List<?> experienceList;
            private List<ProductListBean> productList;
            private List<?> upList;
            private List<VideosBean> videoList;

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

            public List<ProductListBean> getProductList() {
                return productList;
            }

            public void setProductList(List<ProductListBean> productList) {
                this.productList = productList;
            }

            public List<?> getUpList() {
                return upList;
            }

            public void setUpList(List<?> upList) {
                this.upList = upList;
            }

            public List<VideosBean> getVideoList() {
                return videoList;
            }

            public void setVideoList(List<VideosBean> videoList) {
                this.videoList = videoList;
            }

            public static class ProductListBean {
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
                 * productImage : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
                 * productName : 手心里手签
                 * productPoint : 好看，好用
                 * shopsId : 1
                 * skuId : BQ20190505203156
                 * status : 1
                 */

                private int browse;
                private int categoryId;
                private long createDate;
                private int createUser;
                private int id;
                private int price;
                private int priceDq;
                private String productDatile;
                private String productImage;
                private String productName;
                private String productPoint;
                private int shopsId;
                private String skuId;
                private int status;
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

                public String getProductImage() {
                    return productImage;
                }

                public void setProductImage(String productImage) {
                    this.productImage = productImage;
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
