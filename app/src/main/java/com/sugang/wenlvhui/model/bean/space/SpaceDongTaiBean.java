package com.sugang.wenlvhui.model.bean.space;

import java.util.List;

public class SpaceDongTaiBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"space_detail":[{"browse":12,"id":1,"spaceId":1,"spacePolicyDetail":"第三方为双丰收的方式上单V型成V型成verfwefcsdvjhndfggfdf法国法国后能否吧","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"browse":13,"id":2,"spaceId":1,"spacePolicyDetail":"阿斯顿法国红酒","videoUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]}
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
        private List<SpaceDetailBean> space_detail;

        public List<SpaceDetailBean> getSpace_detail() {
            return space_detail;
        }

        public void setSpace_detail(List<SpaceDetailBean> space_detail) {
            this.space_detail = space_detail;
        }

    }


}
