package com.sugang.wenlvhui.model.bean.home.wlze;

import java.util.List;

public class NewSerchBean {

    /**
     * code : 0
     * data : {"lists":[{"image":"","cotent":"<p><\/p><p><br><\/p>","text_type":1,"islike":0,"id":145,"source":"我自己写的","commens":0,"title":"xdfghj","create_date":"2019-06-01T07:34:34.000+0000","title_type":"水利","status":1,"backup_field1":0},{"image":"","cotent":"<p><\/p><p><br><\/p>","text_type":1,"islike":0,"id":146,"source":"我自己写的","commens":0,"title":"asdfghjk","create_date":"2019-06-01T07:35:16.000+0000","title_type":"水利","status":2,"backup_field1":0},{"image":"","cotent":"<p><\/p><p><br><\/p>","text_type":1,"islike":0,"id":147,"source":"我自己写的","commens":0,"title":"我爱你我的国","create_date":"2019-06-01T07:37:20.000+0000","title_type":"水利","status":1,"backup_field1":0}]}
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
        private List<NewsTBean> lists;

        public List<NewsTBean> getLists() {
            return lists;
        }

        public void setLists(List<NewsTBean> lists) {
            this.lists = lists;
        }

    }
}
