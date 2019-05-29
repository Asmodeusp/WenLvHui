package com.sugang.wenlvhui.model.bean.home.wlze;

import java.util.List;

public class NewsDetalisBean {

    /**
     * code : 0
     * data : [{"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","cotent":"1","text_type":2,"substance":"1","relay":1,"source":"1","title":"1","title_type":"水利","backup_field2":"3","backup_field1":2,"islike":1,"id":1,"create_user":33,"commens":1,"create_date":"2019-04-29T03:24:09.000+0000","status":"1","browse":100,"likes":0}]
     * mes : 成功
     */

    private int code;
    private String mes;
    private List<NewsTBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public List<NewsTBean> getData() {
        return data;
    }

    public void setData(List<NewsTBean> data) {
        this.data = data;
    }


}
