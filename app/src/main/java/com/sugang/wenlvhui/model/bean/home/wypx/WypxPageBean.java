package com.sugang.wenlvhui.model.bean.home.wypx;

import java.util.List;

public class WypxPageBean {

    /**
     * code : 0
     * data : {"schools":[{"area":"西夏区","city":"银川","islike":0,"provice":"宁夏","name":"飞翔星光艺术教育","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":1,"type":"唱歌","likenum":111},{"area":"西夏区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":" http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":2,"type":"唱歌","likenum":100},{"area":"金凤区","city":"银川","islike":1,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":3,"type":"唱歌","likenum":100},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":5,"type":"唱歌","likenum":100},{"area":"西夏区","city":"银川","islike":0,"provice":"宁夏","name":"学校1","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":4,"type":"唱歌","likenum":55},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":11,"type":"唱歌","likenum":10},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":12,"type":"唱歌","likenum":10},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":13,"type":"唱歌","likenum":10},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":14,"type":"唱歌","likenum":10},{"area":"金凤区","city":"银川","islike":0,"provice":"宁夏","name":"星河艺术培训","logo":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg","id":15,"type":"唱歌","likenum":10}]}
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
        private List<SchoolsBean> schools;

        public List<SchoolsBean> getSchools() {
            return schools;
        }

        public void setSchools(List<SchoolsBean> schools) {
            this.schools = schools;
        }

        public static class SchoolsBean {
            /**
             * area : 西夏区
             * city : 银川
             * islike : 0
             * provice : 宁夏
             * name : 飞翔星光艺术教育
             * logo : http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg
             * id : 1
             * type : 唱歌
             * likenum : 111
             */

            private String area;
            private String city;
            private int islike;
            private String provice;
            private String name;
            private String logo;
            private int id;
            private String type;
            private int likenum;

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

            public int getIslike() {
                return islike;
            }

            public void setIslike(int islike) {
                this.islike = islike;
            }

            public String getProvice() {
                return provice;
            }

            public void setProvice(String provice) {
                this.provice = provice;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getLikenum() {
                return likenum;
            }

            public void setLikenum(int likenum) {
                this.likenum = likenum;
            }
        }
    }
}
