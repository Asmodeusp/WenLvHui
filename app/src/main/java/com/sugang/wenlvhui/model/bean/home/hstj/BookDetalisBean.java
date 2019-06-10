package com.sugang.wenlvhui.model.bean.home.hstj;

import java.util.List;

//
/* Created by $USER_NAME on 2019/6/10.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class BookDetalisBean {

    /**
     * code : 0
     * data : {"comments":[],"book":{"book_auther":"陈伯吹","index_show":1,"recommended_number":1603,"book_tag":1,"sex":2,"recommend_class":1,"book_name":"世界童话名著连环画","headpic":"http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg","book_detail":"<p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p>课程v机械厂聚集形成v徐<\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p>","book_price":35,"img_url":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a069fc7a-b494-4dcd-99dd-8abb711a1e11.jpg","library_address":"宁夏图书馆，吴忠图书馆","nickname":"15011148387","recommend_user":58,"id":36,"publish_date":"2019-06-06","username":"15011148387"},"tags":["儿童","生活","科学","儿童","传记","历史","周刊","科学","小说","教材","儿童","生活"],"commentnum":0}
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
        /**
         * comments : []
         * book : {"book_auther":"陈伯吹","index_show":1,"recommended_number":1603,"book_tag":1,"sex":2,"recommend_class":1,"book_name":"世界童话名著连环画","headpic":"http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg","book_detail":"<p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p><\/p><p>课程v机械厂聚集形成v徐<\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p><p><\/p><p><br><\/p>","book_price":35,"img_url":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a069fc7a-b494-4dcd-99dd-8abb711a1e11.jpg","library_address":"宁夏图书馆，吴忠图书馆","nickname":"15011148387","recommend_user":58,"id":36,"publish_date":"2019-06-06","username":"15011148387"}
         * tags : ["儿童","生活","科学","儿童","传记","历史","周刊","科学","小说","教材","儿童","生活"]
         * commentnum : 0
         */

        private BookBean book;
        private int commentnum;
        private List<?> comments;
        private List<String> tags;

        public BookBean getBook() {
            return book;
        }

        public void setBook(BookBean book) {
            this.book = book;
        }

        public int getCommentnum() {
            return commentnum;
        }

        public void setCommentnum(int commentnum) {
            this.commentnum = commentnum;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public static class BookBean {
            /**
             * book_auther : 陈伯吹
             * index_show : 1
             * recommended_number : 1603
             * book_tag : 1
             * sex : 2
             * recommend_class : 1
             * book_name : 世界童话名著连环画
             * headpic : http://pic.51yuansu.com/pic3/cover/01/69/80/595f67bf2026f_610.jpg
             * book_detail : <p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p>课程v机械厂聚集形成v徐</p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p>
             * book_price : 35
             * img_url : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a069fc7a-b494-4dcd-99dd-8abb711a1e11.jpg
             * library_address : 宁夏图书馆，吴忠图书馆
             * nickname : 15011148387
             * recommend_user : 58
             * id : 36
             * publish_date : 2019-06-06
             * username : 15011148387
             */

            private String book_auther;
            private int index_show;
            private int recommended_number;
            private int book_tag;
            private int sex;
            private int recommend_class;
            private String book_name;
            private String headpic;
            private String book_detail;
            private int book_price;
            private String img_url;
            private String library_address;
            private String nickname;
            private int recommend_user;
            private int id;
            private String publish_date;
            private String username;

            public String getBook_auther() {
                return book_auther;
            }

            public void setBook_auther(String book_auther) {
                this.book_auther = book_auther;
            }

            public int getIndex_show() {
                return index_show;
            }

            public void setIndex_show(int index_show) {
                this.index_show = index_show;
            }

            public int getRecommended_number() {
                return recommended_number;
            }

            public void setRecommended_number(int recommended_number) {
                this.recommended_number = recommended_number;
            }

            public int getBook_tag() {
                return book_tag;
            }

            public void setBook_tag(int book_tag) {
                this.book_tag = book_tag;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getRecommend_class() {
                return recommend_class;
            }

            public void setRecommend_class(int recommend_class) {
                this.recommend_class = recommend_class;
            }

            public String getBook_name() {
                return book_name;
            }

            public void setBook_name(String book_name) {
                this.book_name = book_name;
            }

            public String getHeadpic() {
                return headpic;
            }

            public void setHeadpic(String headpic) {
                this.headpic = headpic;
            }

            public String getBook_detail() {
                return book_detail;
            }

            public void setBook_detail(String book_detail) {
                this.book_detail = book_detail;
            }

            public int getBook_price() {
                return book_price;
            }

            public void setBook_price(int book_price) {
                this.book_price = book_price;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getLibrary_address() {
                return library_address;
            }

            public void setLibrary_address(String library_address) {
                this.library_address = library_address;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getRecommend_user() {
                return recommend_user;
            }

            public void setRecommend_user(int recommend_user) {
                this.recommend_user = recommend_user;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPublish_date() {
                return publish_date;
            }

            public void setPublish_date(String publish_date) {
                this.publish_date = publish_date;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
