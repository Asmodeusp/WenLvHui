package com.sugang.wenlvhui.model.bean.home.wypx;

import com.sugang.wenlvhui.model.bean.VideosBean;

import java.util.List;

public class WypxDetalisBean {


    /**
     * code : 0
     * data : {"area":"金凤区","backImg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","imgs":[{"detalis":"jfksdgkwjdgi","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"jfksdjgjwe","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"fsdjfgikjg","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"}],"address":" 某某路","province":"宁夏","phone":"13000000000","city":"银川","name":"星河艺","details":"反射光栅更高的","videos":[{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}],"id":3,"logourl":"http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg"}
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
         * area : 金凤区
         * backImg : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
         * imgs : [{"detalis":"jfksdgkwjdgi","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"jfksdjgjwe","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"fsdjfgikjg","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"}]
         * address :  某某路
         * province : 宁夏
         * phone : 13000000000
         * city : 银川
         * name : 星河艺
         * details : 反射光栅更高的
         * videos : [{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":"图片描述","img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]
         * id : 3
         * logourl : http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1352363289716.jpg
         */

        private String area;
        private String backImg;
        private String address;
        private String province;
        private String phone;
        private String city;
        private String name;
        private String details;
        private int id;
        private String logourl;
        private List<ImgsBean> imgs;
        private List<VideosBean> videos;

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getBackImg() {
            return backImg;
        }

        public void setBackImg(String backImg) {
            this.backImg = backImg;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogourl() {
            return logourl;
        }

        public void setLogourl(String logourl) {
            this.logourl = logourl;
        }

        public List<ImgsBean> getImgs() {
            return imgs;
        }

        public void setImgs(List<ImgsBean> imgs) {
            this.imgs = imgs;
        }

        public List<VideosBean> getVideos() {
            return videos;
        }

        public void setVideos(List<VideosBean> videos) {
            this.videos = videos;
        }

        public static class ImgsBean {
            /**
             * detalis : jfksdgkwjdgi
             * img : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             */

            private String detalis;
            private String img;

            public String getDetalis() {
                return detalis;
            }

            public void setDetalis(String detalis) {
                this.detalis = detalis;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
