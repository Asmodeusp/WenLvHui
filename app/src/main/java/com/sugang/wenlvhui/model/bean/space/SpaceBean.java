package com.sugang.wenlvhui.model.bean.space;

import java.util.List;

public class SpaceBean {
    /**
     * addr : 银川市金凤区任命广场
     * backupField1 : http://pic11.nipic.com/20101208/6332275#_140730007350#_2.jpg
     * browse : 126
     * createDate : 1559446817000
     * dateil : ing科技馆
     * id : 1
     * latitude : 134.11
     * longitude : 134.11
     * openDate : 朝九晚五
     * spaceImage : [{"detalis":"阿萨德推哦怕","id":2,"imageType":1,"imgName":"空间1","imgType":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":1,"pid":1,"upDate":1556509310000,"videoUrl":"1"},{"detalis":"岁的法国v回家看了","id":1,"imageType":1,"imgName":"空间1","imgType":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":1,"pid":1,"upDate":1556508540000,"videoUrl":"2"}]
     * spaceMeasure : 1123
     * spaceName : 宁夏科技馆
     * tel : 15011148387
     */

    private String addr;
    private String backupField1;
    private int browse;
    private long createDate;
    private String dateil;
    private int id;
    private String latitude;
    private String longitude;
    private String openDate;
    private int spaceMeasure;
    private String spaceName;
    private String tel;
    private List<SpaceImageBean> spaceImage;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getBackupField1() {
        return backupField1;
    }

    public void setBackupField1(String backupField1) {
        this.backupField1 = backupField1;
    }

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

    public String getDateil() {
        return dateil;
    }

    public void setDateil(String dateil) {
        this.dateil = dateil;
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

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public int getSpaceMeasure() {
        return spaceMeasure;
    }

    public void setSpaceMeasure(int spaceMeasure) {
        this.spaceMeasure = spaceMeasure;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<SpaceImageBean> getSpaceImage() {
        return spaceImage;
    }

    public void setSpaceImage(List<SpaceImageBean> spaceImage) {
        this.spaceImage = spaceImage;
    }

    public static class SpaceImageBean {
        /**
         * detalis : 阿萨德推哦怕
         * id : 2
         * imageType : 1
         * imgName : 空间1
         * imgType : 1
         * imgUrl : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
         * paixu : 1
         * pid : 1
         * upDate : 1556509310000
         * videoUrl : 1
         */

        private String detalis;
        private int id;
        private int imageType;
        private String imgName;
        private int imgType;
        private String imgUrl;
        private int paixu;
        private int pid;
        private long upDate;
        private String videoUrl;

        public String getDetalis() {
            return detalis;
        }

        public void setDetalis(String detalis) {
            this.detalis = detalis;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getImageType() {
            return imageType;
        }

        public void setImageType(int imageType) {
            this.imageType = imageType;
        }

        public String getImgName() {
            return imgName;
        }

        public void setImgName(String imgName) {
            this.imgName = imgName;
        }

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public int getPaixu() {
            return paixu;
        }

        public void setPaixu(int paixu) {
            this.paixu = paixu;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public long getUpDate() {
            return upDate;
        }

        public void setUpDate(long upDate) {
            this.upDate = upDate;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
    }
}

