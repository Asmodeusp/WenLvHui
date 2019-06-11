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
     * data : {"lists":[{"create_time":"2019-06-09T03:32:16.000+0000","like":0,"head_pic":"http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg","reserved_fields1":"","userid":58,"content":"gksdjgsjdhgjshg","reserved_fields2":"","user_type":1,"phone":"15011148387","islike":0,"nick_name":"15011148387","name":"15011148387","id":3,"browse":0,"username":"15011148387"},{"create_time":"2019-06-09T03:54:31.000+0000","like":0,"sex":"0","head_pic":" ","reserved_fields1":"","userid":57,"content":"12345678887","reserved_fields2":"","user_type":9,"phone":" ","islike":0,"nick_name":" ","id":4,"browse":0,"username":"zhangfei"},{"create_time":"2019-06-09T04:59:31.000+0000","like":0,"sex":"0","head_pic":" ","reserved_fields1":"","userid":57,"content":"12345678887","reserved_fields2":"","user_type":9,"phone":" ","islike":0,"nick_name":" ","id":5,"browse":0,"username":"zhangfei"},{"create_time":"2019-06-09T06:53:22.000+0000","like":0,"sex":"0","head_pic":" ","reserved_fields1":"","userid":57,"content":"12345678887","reserved_fields2":"","user_type":9,"phone":" ","islike":0,"nick_name":" ","id":6,"browse":0,"username":"zhangfei"},{"create_time":"2019-06-09T06:55:22.000+0000","like":0,"head_pic":"http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg","reserved_fields1":"","userid":58,"content":"哈哈哈呵呵呵<img src=\"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/09/fb3b9f86-edf2-43c8-aeb3-a3b0bb06793d.jpg\" width=\"360px\" height=\"200px\" alt=\"\">你是个回来了来找我玩","reserved_fields2":"","user_type":1,"phone":"15011148387","islike":0,"nick_name":"15011148387","name":"15011148387","id":7,"browse":0,"username":"15011148387"},{"create_time":"2019-06-09T06:59:54.000+0000","like":0,"head_pic":"http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg","reserved_fields1":"","userid":58,"content":"哈哈哈哈<img src=\"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/09/8341485f-36c3-4462-b95f-bc3d146ef02e.jpg\" width=\"360px\" height=\"200px\" alt=\"\">","reserved_fields2":"","user_type":1,"phone":"15011148387","islike":0,"nick_name":"15011148387","name":"15011148387","id":8,"browse":0,"username":"15011148387"},{"create_time":"2019-06-09T07:00:18.000+0000","like":0,"sex":"0","head_pic":" ","reserved_fields1":"","userid":57,"content":"12345678887","reserved_fields2":"","user_type":9,"phone":" ","islike":0,"nick_name":" ","id":9,"browse":0,"username":"zhangfei"}]}
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
             * head_pic : http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg
             * reserved_fields1 :
             * userid : 58
             * content : gksdjgsjdhgjshg
             * reserved_fields2 :
             * user_type : 1
             * phone : 15011148387
             * islike : 0
             * nick_name : 15011148387
             * name : 15011148387
             * id : 3
             * browse : 0
             * username : 15011148387
             * sex : 0
             */

            private String create_time;
            private int like;
            private String head_pic;
            private String reserved_fields1;
            private int userid;
            private String content;
            private String reserved_fields2;
            private int user_type;
            private String phone;
            private int islike;
            private String nick_name;
            private String name;
            private int id;
            private int browse;
            private String username;
            private String sex;

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

            public String getHead_pic() {
                return head_pic;
            }

            public void setHead_pic(String head_pic) {
                this.head_pic = head_pic;
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

            public String getReserved_fields2() {
                return reserved_fields2;
            }

            public void setReserved_fields2(String reserved_fields2) {
                this.reserved_fields2 = reserved_fields2;
            }

            public int getUser_type() {
                return user_type;
            }

            public void setUser_type(int user_type) {
                this.user_type = user_type;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getIslike() {
                return islike;
            }

            public void setIslike(int islike) {
                this.islike = islike;
            }

            public String getNick_name() {
                return nick_name;
            }

            public void setNick_name(String nick_name) {
                this.nick_name = nick_name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }
        }
    }
}
