package com.sugang.wenlvhui.model.bean.space;

import java.util.List;

public class SpaceGuanCangBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"guancang":{"addr":"银川市金凤区任命广场","backupField1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","browse":126,"createDate":1559461711000,"dateil":"ing科技馆","id":1,"latitude":"134.11","longitude":"134.11","openDate":"朝九晚五","spaceDetail":[{"detail":"我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右","facilities":"配备电视，冰箱，洗衣机，海尔吹风机","id":1,"image":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","name":"文化馆A厅","population":123,"spaceId":1,"spaceMeasure":132,"tel":"18715349501"}],"spaceMeasure":1123,"spaceName":"宁夏科技馆","tel":"15011148387"},"policy":[{"browse":13,"id":2,"spaceId":1,"spacePolicyDetail":"阿斯顿法国红酒","videoBackimg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"browse":12,"id":1,"spaceId":1,"spacePolicyDetail":"第三方为双丰收的方式上单V型成V型成verfwefcsdvjhndfggfdf法国法国后能否吧","videoBackimg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]}
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
         * guancang : {"addr":"银川市金凤区任命广场","backupField1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","browse":126,"createDate":1559461711000,"dateil":"ing科技馆","id":1,"latitude":"134.11","longitude":"134.11","openDate":"朝九晚五","spaceDetail":[{"detail":"我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右","facilities":"配备电视，冰箱，洗衣机，海尔吹风机","id":1,"image":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","name":"文化馆A厅","population":123,"spaceId":1,"spaceMeasure":132,"tel":"18715349501"}],"spaceMeasure":1123,"spaceName":"宁夏科技馆","tel":"15011148387"}
         * policy : [{"browse":13,"id":2,"spaceId":1,"spacePolicyDetail":"阿斯顿法国红酒","videoBackimg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"browse":12,"id":1,"spaceId":1,"spacePolicyDetail":"第三方为双丰收的方式上单V型成V型成verfwefcsdvjhndfggfdf法国法国后能否吧","videoBackimg":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]
         */

        private GuancangBean guancang;
        private List<PolicyBean> policy;

        public GuancangBean getGuancang() {
            return guancang;
        }

        public void setGuancang(GuancangBean guancang) {
            this.guancang = guancang;
        }

        public List<PolicyBean> getPolicy() {
            return policy;
        }

        public void setPolicy(List<PolicyBean> policy) {
            this.policy = policy;
        }

        public static class GuancangBean {
            /**
             * addr : 银川市金凤区任命广场
             * backupField1 : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg
             * browse : 126
             * createDate : 1559461711000
             * dateil : ing科技馆
             * id : 1
             * latitude : 134.11
             * longitude : 134.11
             * openDate : 朝九晚五
             * spaceDetail : [{"detail":"我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右","facilities":"配备电视，冰箱，洗衣机，海尔吹风机","id":1,"image":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","name":"文化馆A厅","population":123,"spaceId":1,"spaceMeasure":132,"tel":"18715349501"}]
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
            private List<SpaceDetailBean> spaceDetail;

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

            public List<SpaceDetailBean> getSpaceDetail() {
                return spaceDetail;
            }

            public void setSpaceDetail(List<SpaceDetailBean> spaceDetail) {
                this.spaceDetail = spaceDetail;
            }

            public static class SpaceDetailBean {
                /**
                 * detail : 我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右
                 * facilities : 配备电视，冰箱，洗衣机，海尔吹风机
                 * id : 1
                 * image : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
                 * name : 文化馆A厅
                 * population : 123
                 * spaceId : 1
                 * spaceMeasure : 132
                 * tel : 18715349501
                 */

                private String detail;
                private String facilities;
                private int id;
                private String image;
                private String name;
                private int population;
                private int spaceId;
                private int spaceMeasure;
                private String tel;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getFacilities() {
                    return facilities;
                }

                public void setFacilities(String facilities) {
                    this.facilities = facilities;
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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPopulation() {
                    return population;
                }

                public void setPopulation(int population) {
                    this.population = population;
                }

                public int getSpaceId() {
                    return spaceId;
                }

                public void setSpaceId(int spaceId) {
                    this.spaceId = spaceId;
                }

                public int getSpaceMeasure() {
                    return spaceMeasure;
                }

                public void setSpaceMeasure(int spaceMeasure) {
                    this.spaceMeasure = spaceMeasure;
                }

                public String getTel() {
                    return tel;
                }

                public void setTel(String tel) {
                    this.tel = tel;
                }
            }
        }

        public static class PolicyBean {
            /**
             * browse : 13
             * id : 2
             * spaceId : 1
             * spacePolicyDetail : 阿斯顿法国红酒
             * videoBackimg : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
             * videoUrl : http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4
             */

            private int browse;
            private int id;
            private int spaceId;
            private String spacePolicyDetail;
            private String videoBackimg;
            private String videoUrl;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSpaceId() {
                return spaceId;
            }

            public void setSpaceId(int spaceId) {
                this.spaceId = spaceId;
            }

            public String getSpacePolicyDetail() {
                return spacePolicyDetail;
            }

            public void setSpacePolicyDetail(String spacePolicyDetail) {
                this.spacePolicyDetail = spacePolicyDetail;
            }

            public String getVideoBackimg() {
                return videoBackimg;
            }

            public void setVideoBackimg(String videoBackimg) {
                this.videoBackimg = videoBackimg;
            }

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }
        }
    }
}
