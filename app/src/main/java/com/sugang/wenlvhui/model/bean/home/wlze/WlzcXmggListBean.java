package com.sugang.wenlvhui.model.bean.home.wlze;

import java.util.List;

public class WlzcXmggListBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"all_text":[{"browse":22222,"comment_num":0,"cotent":"5666","id":66,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":33,"source":"来自本地政府文件","status":"2","substance":"效益增工资","title":"效益增工资","title_type":49,"title_type_name":"科技","up_num":0},{"browse":5655,"comment_num":0,"cotent":"4565","id":70,"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265457&di=3971367f5420d8a6e1bf809bd4fd8fe1&imgtype=0&src=http%3A%2F%2Fnj.focus.cn%2Fupload%2Fphotos%2F100363%2FyZtlffsa.jpg","is_up":0,"relay":7,"source":"来自本地政府文件","status":"2","substance":"效益增工资","title":"金融","title_type":49,"title_type_name":"科技","up_num":0},{"browse":54455,"comment_num":0,"cotent":"544","id":71,"image":"http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg","is_up":0,"relay":4,"source":"来自本地政府文件呢","status":"2","substance":"效益增工资","title":"效益增工资","title_type":49,"title_type_name":"科技","up_num":0}]}
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
        private List<NewsBean> all_text;

        public List<NewsBean> getAll_text() {
            return all_text;
        }

        public void setAll_text(List<NewsBean> all_text) {
            this.all_text = all_text;
        }
    }
}
