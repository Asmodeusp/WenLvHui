package com.sugang.wenlvhui.model.bean.home.wllx;

public class WllxDetalisBean {

    /**
     * code : 0
     * data : {"id":1,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields2":"","createTime":"2019-05-25T10:07:45.000+0000","recommend":1,"browse":20,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","reservedFields1":"名字"}
     * mes : 成功
     */

    private int code;
    private DataBean data;
    private String mes;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public static class DataBean {
        /**
         * id : 1
         * type : 1
         * adult : 100
         * children : 50
         * setMeal : 150
         * adultDescribe : 成人票
         * childrenDescribe : 儿童票
         * mealDescribe : 套餐票
         * tripArrange : 行程
         * feeNotice : 费用须知
         * securityTip : 安全通知
         * reservedFields2 :
         * createTime : 2019-05-25T10:07:45.000+0000
         * recommend : 1
         * browse : 20
         * img : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
         * reservedFields1 : 名字
         */

        private int id;
        private int type;
        private int adult;
        private int children;
        private int setMeal;
        private String adultDescribe;
        private String childrenDescribe;
        private String mealDescribe;
        private String tripArrange;
        private String feeNotice;
        private String securityTip;
        private String reservedFields2;
        private String createTime;
        private int recommend;
        private int browse;
        private String img;
        private String reservedFields1;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getAdult() {
            return adult;
        }

        public void setAdult(int adult) {
            this.adult = adult;
        }

        public int getChildren() {
            return children;
        }

        public void setChildren(int children) {
            this.children = children;
        }

        public int getSetMeal() {
            return setMeal;
        }

        public void setSetMeal(int setMeal) {
            this.setMeal = setMeal;
        }

        public String getAdultDescribe() {
            return adultDescribe;
        }

        public void setAdultDescribe(String adultDescribe) {
            this.adultDescribe = adultDescribe;
        }

        public String getChildrenDescribe() {
            return childrenDescribe;
        }

        public void setChildrenDescribe(String childrenDescribe) {
            this.childrenDescribe = childrenDescribe;
        }

        public String getMealDescribe() {
            return mealDescribe;
        }

        public void setMealDescribe(String mealDescribe) {
            this.mealDescribe = mealDescribe;
        }

        public String getTripArrange() {
            return tripArrange;
        }

        public void setTripArrange(String tripArrange) {
            this.tripArrange = tripArrange;
        }

        public String getFeeNotice() {
            return feeNotice;
        }

        public void setFeeNotice(String feeNotice) {
            this.feeNotice = feeNotice;
        }

        public String getSecurityTip() {
            return securityTip;
        }

        public void setSecurityTip(String securityTip) {
            this.securityTip = securityTip;
        }

        public String getReservedFields2() {
            return reservedFields2;
        }

        public void setReservedFields2(String reservedFields2) {
            this.reservedFields2 = reservedFields2;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }

        public int getBrowse() {
            return browse;
        }

        public void setBrowse(int browse) {
            this.browse = browse;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getReservedFields1() {
            return reservedFields1;
        }

        public void setReservedFields1(String reservedFields1) {
            this.reservedFields1 = reservedFields1;
        }
    }
}
