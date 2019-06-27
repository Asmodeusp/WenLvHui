package com.sugang.wenlvhui.model.bean.home;

import java.util.List;

//
/* Created by $USER_NAME on 2019/6/10.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class HomePageBean {


    /**
     * msg : 成功
     * code : 0
     * data : {"product":[{"browse":56789,"commentList":[],"createDate":1561046400000,"id":66,"price":678,"priceDq":567,"productDatile":"<p><\/p><p>台风天会与关于ii'o'o'i<\/p>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/13ae31e2-9c50-42da-98a3-7e218c186ab0.jpg","productName":"AAA尼塞科都是","productPoint":"好看","shopsId":48,"status":1},{"browse":56789,"commentList":[],"createDate":1561046400000,"id":65,"price":678,"priceDq":567,"productDatile":"<p><\/p><p>发射点发射点<\/p>","productImage":"","productName":"牛奶巧克力","productPoint":"好看","shopsId":48,"status":1},{"browse":56789,"commentList":[],"createDate":1561046400000,"id":64,"price":678,"priceDq":567,"productDatile":"<p><\/p><p><\/p><p>法撒旦发<\/p><p><\/p><p><br><\/p>","productImage":"","productName":"AAA牛奶巧克力","productPoint":"好看","shopsId":45,"status":1}],"wnelv":{"backupField1":0,"browse":17,"cotent":"<p><\/p><p><\/p><p><strong>央视网消息<\/strong>（新闻联播）：6月8日出版的《人民日报》将重刊习近平总书记17年前所作的《&lt;福州古厝&gt;序》。2002年，时任福建省省长的习近平同志，为《福州古厝》一书撰写了序言，以深邃的思考，生动的笔触，深刻揭示了戚公祠、马尾昭忠祠、林文忠祠、开元寺等古建筑的丰富文化内涵，作出了保护好古建筑、保护好文物就是保存历史、保存城市文脉的重要论断，阐明了经济发展和生态、人文环境保护同等重要的关系。对于我们更好传承文明、增强文明自信，具有重要而深远的意义。\r\n\r\n<\/p><p><\/p><p><br><\/p>","createDate":1560170361000,"id":162,"image":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/10/32cf8ad9-b731-4996-8f16-63fb5248473a.jpg","source":"我手写的","status":"2","textType":1,"title":"《人民日报》将重刊习近平总书记《<福州古厝>序》","titleType":"金融"},"circleList":[{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"亡暮森南","circleRegulations":"本群群规:\\n\r\n        1.所有人进群请加小区和房号。\\n\r\n        2.请互相尊重，杜绝人身攻击，如有脏话出口，恶意怼人的立即踢。\\n\r\n        3.我们是南站雨花整体 ，学区讨论也是南站雨花整体，不区分小区，恶意拉帮结派，不利于团结的立即踢。\\n\r\n        4.如对个人有异议，请理性讨论，不要上升到针对小区的争论和攻击，大家就事论事，不要牵连无辜。\\n\r\n        5.对学区不利的意见可以先跟管理员或群主私聊，不要大群讨论，以防被人利用。","createDate":1560217777000,"createUser":58,"dictionaryId":17,"id":15,"imgUrl":"http://pic1.win4000.com/wallpaper/9/583e3db973764.jpg","regulationsDate":1560217777000}],"policy":{"browse":90,"commentList":[],"cotent":"<p><\/p><p>法撒旦发<\/p>","createDate":1561108240000,"giveDefault":"2","id":132,"image":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/b71ff954-6970-4aed-aa8b-0c678f9e2413.jpg","source":"自己创建","status":"1","textType":2,"title":"拉花花"}}
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
         * product : [{"browse":56789,"commentList":[],"createDate":1561046400000,"id":66,"price":678,"priceDq":567,"productDatile":"<p><\/p><p>台风天会与关于ii'o'o'i<\/p>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/13ae31e2-9c50-42da-98a3-7e218c186ab0.jpg","productName":"AAA尼塞科都是","productPoint":"好看","shopsId":48,"status":1},{"browse":56789,"commentList":[],"createDate":1561046400000,"id":65,"price":678,"priceDq":567,"productDatile":"<p><\/p><p>发射点发射点<\/p>","productImage":"","productName":"牛奶巧克力","productPoint":"好看","shopsId":48,"status":1},{"browse":56789,"commentList":[],"createDate":1561046400000,"id":64,"price":678,"priceDq":567,"productDatile":"<p><\/p><p><\/p><p>法撒旦发<\/p><p><\/p><p><br><\/p>","productImage":"","productName":"AAA牛奶巧克力","productPoint":"好看","shopsId":45,"status":1}]
         * wnelv : {"backupField1":0,"browse":17,"cotent":"<p><\/p><p><\/p><p><strong>央视网消息<\/strong>（新闻联播）：6月8日出版的《人民日报》将重刊习近平总书记17年前所作的《&lt;福州古厝&gt;序》。2002年，时任福建省省长的习近平同志，为《福州古厝》一书撰写了序言，以深邃的思考，生动的笔触，深刻揭示了戚公祠、马尾昭忠祠、林文忠祠、开元寺等古建筑的丰富文化内涵，作出了保护好古建筑、保护好文物就是保存历史、保存城市文脉的重要论断，阐明了经济发展和生态、人文环境保护同等重要的关系。对于我们更好传承文明、增强文明自信，具有重要而深远的意义。\r\n\r\n<\/p><p><\/p><p><br><\/p>","createDate":1560170361000,"id":162,"image":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/10/32cf8ad9-b731-4996-8f16-63fb5248473a.jpg","source":"我手写的","status":"2","textType":1,"title":"《人民日报》将重刊习近平总书记《<福州古厝>序》","titleType":"金融"}
         * circleList : [{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"亡暮森南","circleRegulations":"本群群规:\\n\r\n        1.所有人进群请加小区和房号。\\n\r\n        2.请互相尊重，杜绝人身攻击，如有脏话出口，恶意怼人的立即踢。\\n\r\n        3.我们是南站雨花整体 ，学区讨论也是南站雨花整体，不区分小区，恶意拉帮结派，不利于团结的立即踢。\\n\r\n        4.如对个人有异议，请理性讨论，不要上升到针对小区的争论和攻击，大家就事论事，不要牵连无辜。\\n\r\n        5.对学区不利的意见可以先跟管理员或群主私聊，不要大群讨论，以防被人利用。","createDate":1560217777000,"createUser":58,"dictionaryId":17,"id":15,"imgUrl":"http://pic1.win4000.com/wallpaper/9/583e3db973764.jpg","regulationsDate":1560217777000}]
         * policy : {"browse":90,"commentList":[],"cotent":"<p><\/p><p>法撒旦发<\/p>","createDate":1561108240000,"giveDefault":"2","id":132,"image":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/b71ff954-6970-4aed-aa8b-0c678f9e2413.jpg","source":"自己创建","status":"1","textType":2,"title":"拉花花"}
         */

        private WnelvBean wnelv;
        private PolicyBean policy;
        private List<ProductBean> product;
        private List<CircleListBean> circleList;

        public WnelvBean getWnelv() {
            return wnelv;
        }

        public void setWnelv(WnelvBean wnelv) {
            this.wnelv = wnelv;
        }

        public PolicyBean getPolicy() {
            return policy;
        }

        public void setPolicy(PolicyBean policy) {
            this.policy = policy;
        }

        public List<ProductBean> getProduct() {
            return product;
        }

        public void setProduct(List<ProductBean> product) {
            this.product = product;
        }

        public List<CircleListBean> getCircleList() {
            return circleList;
        }

        public void setCircleList(List<CircleListBean> circleList) {
            this.circleList = circleList;
        }

        public static class WnelvBean {
            /**
             * backupField1 : 0
             * browse : 17
             * cotent : <p></p><p></p><p><strong>央视网消息</strong>（新闻联播）：6月8日出版的《人民日报》将重刊习近平总书记17年前所作的《&lt;福州古厝&gt;序》。2002年，时任福建省省长的习近平同志，为《福州古厝》一书撰写了序言，以深邃的思考，生动的笔触，深刻揭示了戚公祠、马尾昭忠祠、林文忠祠、开元寺等古建筑的丰富文化内涵，作出了保护好古建筑、保护好文物就是保存历史、保存城市文脉的重要论断，阐明了经济发展和生态、人文环境保护同等重要的关系。对于我们更好传承文明、增强文明自信，具有重要而深远的意义。

             </p><p></p><p><br></p>
             * createDate : 1560170361000
             * id : 162
             * image : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/10/32cf8ad9-b731-4996-8f16-63fb5248473a.jpg
             * source : 我手写的
             * status : 2
             * textType : 1
             * title : 《人民日报》将重刊习近平总书记《<福州古厝>序》
             * titleType : 金融
             */

            private int backupField1;
            private int browse;
            private String cotent;
            private long createDate;
            private int id;
            private String image;
            private String source;
            private String status;
            private int textType;
            private String title;
            private String titleType;

            public int getBackupField1() {
                return backupField1;
            }

            public void setBackupField1(int backupField1) {
                this.backupField1 = backupField1;
            }

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public String getCotent() {
                return cotent;
            }

            public void setCotent(String cotent) {
                this.cotent = cotent;
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

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getTextType() {
                return textType;
            }

            public void setTextType(int textType) {
                this.textType = textType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitleType() {
                return titleType;
            }

            public void setTitleType(String titleType) {
                this.titleType = titleType;
            }
        }

        public static class PolicyBean {
            /**
             * browse : 90
             * commentList : []
             * cotent : <p></p><p>法撒旦发</p>
             * createDate : 1561108240000
             * giveDefault : 2
             * id : 132
             * image : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/b71ff954-6970-4aed-aa8b-0c678f9e2413.jpg
             * source : 自己创建
             * status : 1
             * textType : 2
             * title : 拉花花
             */

            private int browse;
            private String cotent;
            private long createDate;
            private String giveDefault;
            private int id;
            private String image;
            private String source;
            private String status;
            private int textType;
            private String title;
            private List<?> commentList;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public String getCotent() {
                return cotent;
            }

            public void setCotent(String cotent) {
                this.cotent = cotent;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getGiveDefault() {
                return giveDefault;
            }

            public void setGiveDefault(String giveDefault) {
                this.giveDefault = giveDefault;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getTextType() {
                return textType;
            }

            public void setTextType(int textType) {
                this.textType = textType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }
        }

        public static class ProductBean {
            /**
             * browse : 56789
             * commentList : []
             * createDate : 1561046400000
             * id : 66
             * price : 678
             * priceDq : 567
             * productDatile : <p></p><p>台风天会与关于ii'o'o'i</p>
             * productImage : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/21/13ae31e2-9c50-42da-98a3-7e218c186ab0.jpg
             * productName : AAA尼塞科都是
             * productPoint : 好看
             * shopsId : 48
             * status : 1
             */

            private int browse;
            private long createDate;
            private int id;
            private int price;
            private int priceDq;
            private String productDatile;
            private String productImage;
            private String productName;
            private String productPoint;
            private int shopsId;
            private int status;
            private List<?> commentList;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
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

        public static class CircleListBean {
            /**
             * browse : 1234
             * circleAdmin : 57
             * circleDetail : 本圈子是书法圈
             * circleName : 亡暮森南
             * circleRegulations : 本群群规:\n
             1.所有人进群请加小区和房号。\n
             2.请互相尊重，杜绝人身攻击，如有脏话出口，恶意怼人的立即踢。\n
             3.我们是南站雨花整体 ，学区讨论也是南站雨花整体，不区分小区，恶意拉帮结派，不利于团结的立即踢。\n
             4.如对个人有异议，请理性讨论，不要上升到针对小区的争论和攻击，大家就事论事，不要牵连无辜。\n
             5.对学区不利的意见可以先跟管理员或群主私聊，不要大群讨论，以防被人利用。
             * createDate : 1560217777000
             * createUser : 58
             * dictionaryId : 17
             * id : 15
             * imgUrl : http://pic1.win4000.com/wallpaper/9/583e3db973764.jpg
             * regulationsDate : 1560217777000
             */

            private int browse;
            private int circleAdmin;
            private String circleDetail;
            private String circleName;
            private String circleRegulations;
            private long createDate;
            private int createUser;
            private int dictionaryId;
            private int id;
            private String imgUrl;
            private long regulationsDate;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getCircleAdmin() {
                return circleAdmin;
            }

            public void setCircleAdmin(int circleAdmin) {
                this.circleAdmin = circleAdmin;
            }

            public String getCircleDetail() {
                return circleDetail;
            }

            public void setCircleDetail(String circleDetail) {
                this.circleDetail = circleDetail;
            }

            public String getCircleName() {
                return circleName;
            }

            public void setCircleName(String circleName) {
                this.circleName = circleName;
            }

            public String getCircleRegulations() {
                return circleRegulations;
            }

            public void setCircleRegulations(String circleRegulations) {
                this.circleRegulations = circleRegulations;
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

            public int getDictionaryId() {
                return dictionaryId;
            }

            public void setDictionaryId(int dictionaryId) {
                this.dictionaryId = dictionaryId;
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

            public long getRegulationsDate() {
                return regulationsDate;
            }

            public void setRegulationsDate(long regulationsDate) {
                this.regulationsDate = regulationsDate;
            }
        }
    }
}
