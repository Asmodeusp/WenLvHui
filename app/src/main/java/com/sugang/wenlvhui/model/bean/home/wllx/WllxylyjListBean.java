package com.sugang.wenlvhui.model.bean.home.wllx;

import java.util.List;

//
/* Created by $USER_NAME on 2019/6/9.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class WllxylyjListBean {

    /**
     * code : 0
     * data : {"lists":[{"create_time":"2019-06-09T03:32:16.000+0000","like":0,"islike":0,"id":3,"reserved_fields1":"","userid":58,"content":"gksdjgsjdhgjshg","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T03:54:31.000+0000","like":0,"islike":0,"id":4,"reserved_fields1":"","userid":57,"content":"12345678887","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T04:59:31.000+0000","like":0,"islike":0,"id":5,"reserved_fields1":"","userid":57,"content":"12345678887","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T06:53:22.000+0000","like":0,"islike":0,"id":6,"reserved_fields1":"","userid":57,"content":"12345678887","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T06:55:22.000+0000","like":0,"islike":0,"id":7,"reserved_fields1":"","userid":58,"content":"哈哈哈呵呵呵<img src=\"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/09/fb3b9f86-edf2-43c8-aeb3-a3b0bb06793d.jpg\" width=\"360px\" height=\"200px\" alt=\"\">你是个回来了来找我玩","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T06:59:54.000+0000","like":0,"islike":0,"id":8,"reserved_fields1":"","userid":58,"content":"哈哈哈哈<img src=\"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/09/8341485f-36c3-4462-b95f-bc3d146ef02e.jpg\" width=\"360px\" height=\"200px\" alt=\"\">","browse":0,"reserved_fields2":""},{"create_time":"2019-06-09T07:00:18.000+0000","like":0,"islike":0,"id":9,"reserved_fields1":"","userid":57,"content":"12345678887","browse":0,"reserved_fields2":""}]}
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
        private List<ListsBean> lists;

        public List<ListsBean> getLists() {
            return lists;
        }

        public void setLists(List<ListsBean> lists) {
            this.lists = lists;
        }

        public static class ListsBean {
            /**
             * create_time : 2019-06-09T03:32:16.000+0000
             * like : 0
             * islike : 0
             * id : 3
             * reserved_fields1 :
             * userid : 58
             * content : gksdjgsjdhgjshg
             * browse : 0
             * reserved_fields2 :
             */

            private String create_time;
            private int like;
            private int islike;
            private int id;
            private String reserved_fields1;
            private int userid;
            private String content;
            private int browse;
            private String reserved_fields2;

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public int getIslike() {
                return islike;
            }

            public void setIslike(int islike) {
                this.islike = islike;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getReserved_fields1() {
                return reserved_fields1;
            }

            public void setReserved_fields1(String reserved_fields1) {
                this.reserved_fields1 = reserved_fields1;
            }

            public int getUserid() {
                return userid;
            }

            public void setUserid(int userid) {
                this.userid = userid;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public String getReserved_fields2() {
                return reserved_fields2;
            }

            public void setReserved_fields2(String reserved_fields2) {
                this.reserved_fields2 = reserved_fields2;
            }
        }
    }
}
