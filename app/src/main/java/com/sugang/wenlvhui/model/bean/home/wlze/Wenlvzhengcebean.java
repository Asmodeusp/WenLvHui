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
        private List<ZhengceBean> zhengce;
        private List<PeojectBean> peoject;
        private List<ZixunBean> zixun;

        public List<ZhengceBean> getZhengce() {
            return zhengce;
        }

        public void setZhengce(List<ZhengceBean> zhengce) {
            this.zhengce = zhengce;
        }

        public List<PeojectBean> getPeoject() {
            return peoject;
        }

        public void setPeoject(List<PeojectBean> peoject) {
            this.peoject = peoject;
        }

        public List<ZixunBean> getZixun() {
            return zixun;
        }

        public void setZixun(List<ZixunBean> zixun) {
            this.zixun = zixun;
        }

        public static class ZhengceBean {
            /**
             * browse : 6365
             * comment_num : 0
             * cotent : 11
             * id : 65
             * image : http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg
             * is_up : 0
             * relay : 22
             * source : 来自本地政府文件
             * status : 2
             * substance : “五项措施”力促我区2019年政策跟踪审计再上台阶
             * title : “五项措施”力促我区2019年政策跟踪审计再上台阶
             * title_type : 48
             * title_type_name : 水利
             * up_num : 0
             */

            private int browse;
            private int comment_num;
            private String cotent;
            private int id;
            private String image;
            private int is_up;
            private int relay;
            private String source;
            private String status;
            private String substance;
            private String title;
            private int title_type;
            private String title_type_name;
            private int up_num;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getComment_num() {
                return comment_num;
            }

            public void setComment_num(int comment_num) {
                this.comment_num = comment_num;
            }

            public String getCotent() {
                return cotent;
            }

            public void setCotent(String cotent) {
                this.cotent = cotent;
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

            public int getIs_up() {
                return is_up;
            }

            public void setIs_up(int is_up) {
                this.is_up = is_up;
            }

            public int getRelay() {
                return relay;
            }

            @Override
            public String toString() {
                return "ZhengceBean{" +
                        "browse=" + browse +
                        ", comment_num=" + comment_num +
                        ", cotent='" + cotent + '\'' +
                        ", id=" + id +
                        ", image='" + image + '\'' +
                        ", is_up=" + is_up +
                        ", relay=" + relay +
                        ", source='" + source + '\'' +
                        ", status='" + status + '\'' +
                        ", substance='" + substance + '\'' +
                        ", title='" + title + '\'' +
                        ", title_type=" + title_type +
                        ", title_type_name='" + title_type_name + '\'' +
                        ", up_num=" + up_num +
                        '}';
            }

            public void setRelay(int relay) {
                this.relay = relay;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSubstance() {
                return substance;
            }

            public void setSubstance(String substance) {
                this.substance = substance;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTitle_type() {
                return title_type;
            }

            public void setTitle_type(int title_type) {
                this.title_type = title_type;
            }

            public String getTitle_type_name() {
                return title_type_name;
            }

            public void setTitle_type_name(String title_type_name) {
                this.title_type_name = title_type_name;
            }

            public int getUp_num() {
                return up_num;
            }

            public void setUp_num(int up_num) {
                this.up_num = up_num;
            }
        }

        public static class PeojectBean {
            /**
             * browse : 6765
             * comment_num : 0
             * cotent : 7666
             * id : 67
             * image : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265457&di=710d86fe5303e13fc4a169c3ca50ed18&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01afc75541ec81000001714a28c572.jpg
             * is_up : 0
             * relay : 2
             * source : 22
             * status : 1
             * substance : 效益增工资
             * title : 效益增工资
             * title_type : 48
             * title_type_name : 水利
             * up_num : 0
             */

            private int browse;
            private int comment_num;
            private String cotent;
            private int id;
            private String image;
            private int is_up;
            private int relay;
            private String source;
            private String status;
            private String substance;
            private String title;
            private int title_type;
            private String title_type_name;
            private int up_num;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getComment_num() {
                return comment_num;
            }

            public void setComment_num(int comment_num) {
                this.comment_num = comment_num;
            }

            public String getCotent() {
                return cotent;
            }

            public void setCotent(String cotent) {
                this.cotent = cotent;
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

            public int getIs_up() {
                return is_up;
            }

            public void setIs_up(int is_up) {
                this.is_up = is_up;
            }

            public int getRelay() {
                return relay;
            }

            public void setRelay(int relay) {
                this.relay = relay;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSubstance() {
                return substance;
            }

            public void setSubstance(String substance) {
                this.substance = substance;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTitle_type() {
                return title_type;
            }

            public void setTitle_type(int title_type) {
                this.title_type = title_type;
            }

            public String getTitle_type_name() {
                return title_type_name;
            }

            public void setTitle_type_name(String title_type_name) {
                this.title_type_name = title_type_name;
            }

            public int getUp_num() {
                return up_num;
            }

            public void setUp_num(int up_num) {
                this.up_num = up_num;
            }
        }

        public static class ZixunBean {
            /**
             * browse : 22222
             * comment_num : 0
             * cotent : 5666
             * id : 66
             * image : http://img01.3dmgame.com/uploads/allimg/131101/154_131101033811_1.jpg
             * is_up : 0
             * relay : 33
             * source : 来自本地政府文件
             * status : 2
             * substance : 效益增工资
             * title : 效益增工资
             * title_type : 49
             * title_type_name : 科技
             * up_num : 0
             */

            private int browse;
            private int comment_num;
            private String cotent;
            private int id;
            private String image;
            private int is_up;
            private int relay;
            private String source;
            private String status;
            private String substance;
            private String title;
            private int title_type;
            private String title_type_name;
            private int up_num;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getComment_num() {
                return comment_num;
            }

            public void setComment_num(int comment_num) {
                this.comment_num = comment_num;
            }

            public String getCotent() {
                return cotent;
            }

            public void setCotent(String cotent) {
                this.cotent = cotent;
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

            public int getIs_up() {
                return is_up;
            }

            public void setIs_up(int is_up) {
                this.is_up = is_up;
            }

            public int getRelay() {
                return relay;
            }

            public void setRelay(int relay) {
                this.relay = relay;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSubstance() {
                return substance;
            }

            public void setSubstance(String substance) {
                this.substance = substance;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTitle_type() {
                return title_type;
            }

            public void setTitle_type(int title_type) {
                this.title_type = title_type;
            }

            public String getTitle_type_name() {
                return title_type_name;
            }

            public void setTitle_type_name(String title_type_name) {
                this.title_type_name = title_type_name;
            }

            public int getUp_num() {
                return up_num;
            }

            public void setUp_num(int up_num) {
                this.up_num = up_num;
            }
        }
    }
}
