package com.sugang.wenlvhui.model.bean.space;

public class SpaceChangGuanBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"space_detail":{"detail":"我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右","facilities":"配备电视，冰箱，洗衣机，海尔吹风机","id":1,"image":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","name":"文化馆A厅","population":123,"spaceId":1,"spaceMeasure":132,"tel":"18715349501"}}
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
         * space_detail : {"detail":"我们场馆是由宁夏区政府建立，以广大市民的身心健康为总之建造的一家文化产业基地，已经成立30年左右","facilities":"配备电视，冰箱，洗衣机，海尔吹风机","id":1,"image":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","name":"文化馆A厅","population":123,"spaceId":1,"spaceMeasure":132,"tel":"18715349501"}
         */

        private SpaceDetailBean space_detail;

        public SpaceDetailBean getSpace_detail() {
            return space_detail;
        }

        public void setSpace_detail(SpaceDetailBean space_detail) {
            this.space_detail = space_detail;
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
}
