package com.sugang.wenlvhui.model.bean.home.wlze;

import java.util.List;

public class WlzcXmggListBean {


    /**
     * code : 0
     * data : {"lists":[{"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","cotent":"544","text_type":1,"substance":"沙和尚在流沙河","relay":4,"source":"来自本地政府文件呢","title":"效益增工资","title_type":"金融","backup_field2":"2","backup_field1":1,"islike":1,"id":71,"create_user":11,"commens":0,"create_date":"2019-05-07T07:35:08.000+0000","status":"2","browse":235,"likes":0},{"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","cotent":"343","text_type":1,"substance":"鲤鱼跳龙门","relay":2,"source":"来自本地政府文件","title":"\u201c五项措施\u201d力促我区2019年政策跟踪审计再上台阶","title_type":"金融","backup_field2":"2","backup_field1":1,"islike":1,"id":72,"create_user":11,"commens":0,"create_date":"2019-05-09T06:41:31.000+0000","status":"2","browse":234,"likes":0},{"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265457&di=3971367f5420d8a6e1bf809bd4fd8fe1&imgtype=0&src=http%3A%2F%2Fnj.focus.cn%2Fupload%2Fphotos%2F100363%2FyZtlffsa.jpg","cotent":"456","text_type":1,"substance":"效益增工资","relay":7,"source":"来自本地政府文件","title":"金融","title_type":"水利","backup_field2":"52","backup_field1":5,"islike":1,"id":70,"create_user":12,"commens":0,"create_date":"2019-04-29T06:57:22.000+0000","status":"2","browse":214,"likes":0},{"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","cotent":"566","text_type":1,"substance":"效益增工资","relay":33,"source":"来自本地政府文件","title":"效益增工资","title_type":"水利","backup_field2":"7","backup_field1":6,"islike":1,"id":66,"create_user":5,"commens":0,"create_date":"2019-04-10T03:25:09.000+0000","status":"2","browse":122,"likes":0}]}
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
        private List<NewsBean> lists;

        public List<NewsBean> getLists() {
            return lists;
        }

        public void setLists(List<NewsBean> lists) {
            this.lists = lists;
        }


    }
}
