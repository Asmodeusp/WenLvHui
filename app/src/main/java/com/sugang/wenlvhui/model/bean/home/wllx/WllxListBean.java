package com.sugang.wenlvhui.model.bean.home.wllx;

import java.util.List;

public class WllxListBean {

    /**
     * code : 0
     * data : {"brigades":[{"id":6,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:49.000+0000","recommend":1,"browse":55,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":4,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:47.000+0000","recommend":1,"browse":45,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":5,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:48.000+0000","recommend":1,"browse":36,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":7,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:49.000+0000","recommend":1,"browse":25,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":3,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:45.000+0000","recommend":1,"browse":21,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":1,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:07:45.000+0000","recommend":1,"browse":20,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":2,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:19:17.000+0000","recommend":1,"browse":15,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":8,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:50.000+0000","recommend":1,"browse":1,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":9,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:51.000+0000","recommend":1,"browse":1,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"id":10,"type":1,"adult":100,"children":50,"setMeal":150,"adultDescribe":"成人票","childrenDescribe":"儿童票","mealDescribe":"套餐票","tripArrange":"行程","feeNotice":"费用须知","securityTip":"安全通知","reservedFields1":null,"reservedFields2":"","createTime":"2019-05-25T10:16:53.000+0000","recommend":1,"browse":1,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"}]}
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
        private List<BrigadesBean> brigades;

        public List<BrigadesBean> getBrigades() {
            return brigades;
        }

        public void setBrigades(List<BrigadesBean> brigades) {
            this.brigades = brigades;
        }


    }
}
