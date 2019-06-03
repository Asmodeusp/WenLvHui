package com.sugang.wenlvhui.model.bean.space;

import java.util.List;

public class SpacePageBean {


    /**
     * msg : 查询成功
     * code : 1
     * data : {"space_list":[{"addr":"银川市金凤区任命广场","backupField1":"http://pic11.nipic.com/20101208/6332275#_140730007350#_2.jpg","browse":126,"createDate":1559446817000,"dateil":"ing科技馆","id":1,"latitude":"134.11","longitude":"134.11","openDate":"朝九晚五","spaceImage":[{"detalis":"阿萨德推哦怕","id":2,"imageType":1,"imgName":"空间1","imgType":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":1,"pid":1,"upDate":1556509310000,"videoUrl":"1"},{"detalis":"岁的法国v回家看了","id":1,"imageType":1,"imgName":"空间1","imgType":1,"imgUrl":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","paixu":1,"pid":1,"upDate":1556508540000,"videoUrl":"2"}],"spaceMeasure":1123,"spaceName":"宁夏科技馆","tel":"15011148387"},{"addr":"222121大苏打","backupField1":"http://pic11.nipic.com/20101208/6332275#_140730007350#_2.jpg","browse":222,"createDate":1559446817000,"dateil":"嗯嘛阿瑟东","id":2,"latitude":"134.11","longitude":"134.11","openDate":"朝九晚五","spaceImage":[],"spaceMeasure":1234,"spaceName":"人民广场","tel":"15011148387"},{"addr":"v地方v从撒打算","backupField1":"http://pic11.nipic.com/20101208/6332275#_140730007350#_2.jpg","browse":222,"createDate":1559446817000,"dateil":"方式大苏打大苏打","id":3,"latitude":"134.11","longitude":"134.11","openDate":"朝九晚五","spaceImage":[],"spaceMeasure":1234,"spaceName":"金凤万达","tel":"15011148387"}]}
     */

    private String msg;
    private int code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

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

    public static class DataBean {
        private List<SpaceBean> space_list;

        public List<SpaceBean> getSpace_list() {
            return space_list;
        }

        public void setSpace_list(List<SpaceBean> space_list) {
            this.space_list = space_list;
        }



    }
}
