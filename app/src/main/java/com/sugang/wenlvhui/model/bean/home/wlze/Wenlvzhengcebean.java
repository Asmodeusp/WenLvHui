package com.sugang.wenlvhui.model.bean.home.wlze;

import java.util.List;

public class Wenlvzhengcebean {

    /**
     * msg : 成功
     * code : 0
     * data : {"zhengce":[{"browse":6365,"comment_num":0,"cotent":"11","id":65,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":22,"source":"来自本地政府文件","status":"2","substance":"\u201c五项措施\u201d力促我区2019年政策跟踪审计再上台阶","title":"\u201c五项措施\u201d力促我区2019年政策跟踪审计再上台阶","title_type":48,"title_type_name":"水利","up_num":0},{"browse":1,"comment_num":0,"cotent":"1","id":1,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":1,"source":"1","status":"1","substance":"1","title":"1","up_num":0}],"peoject":[{"browse":6765,"comment_num":0,"cotent":"7666","id":67,"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265457&di=710d86fe5303e13fc4a169c3ca50ed18&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01afc75541ec81000001714a28c572.jpg","is_up":0,"relay":2,"source":"22","status":"1","substance":"效益增工资","title":"效益增工资","title_type":48,"title_type_name":"水利","up_num":0},{"browse":5555,"comment_num":0,"cotent":"3345","id":68,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":5,"source":"来自本地政府文件","status":"2","substance":"\u201c五项措施\u201c力促我区2019年政策跟踪审计再上台阶","title":"审计","title_type":49,"title_type_name":"科技","up_num":0}],"zixun":[{"browse":22222,"comment_num":0,"cotent":"5666","id":66,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":33,"source":"来自本地政府文件","status":"2","substance":"效益增工资","title":"效益增工资","title_type":49,"title_type_name":"科技","up_num":0},{"browse":5655,"comment_num":0,"cotent":"4565","id":70,"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265457&di=3971367f5420d8a6e1bf809bd4fd8fe1&imgtype=0&src=http%3A%2F%2Fnj.focus.cn%2Fupload%2Fphotos%2F100363%2FyZtlffsa.jpg","is_up":0,"relay":7,"source":"来自本地政府文件","status":"2","substance":"效益增工资","title":"金融","title_type":49,"title_type_name":"科技","up_num":0}]}
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
        private List<NewsBean> zhengce;
        private List<NewsBean> peoject;
        private List<NewsBean> zixun;

        public List<NewsBean> getZhengce() {
            return zhengce;
        }

        public void setZhengce(List<NewsBean> zhengce) {
            this.zhengce = zhengce;
        }

        public List<NewsBean> getPeoject() {
            return peoject;
        }

        public void setPeoject(List<NewsBean> peoject) {
            this.peoject = peoject;
        }

        public List<NewsBean> getZixun() {
            return zixun;
        }

        public void setZixun(List<NewsBean> zixun) {
            this.zixun = zixun;
        }


    }
}
