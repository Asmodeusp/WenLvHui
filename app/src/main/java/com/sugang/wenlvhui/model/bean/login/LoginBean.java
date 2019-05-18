package com.sugang.wenlvhui.model.bean.login;

public class LoginBean {


    /**
     * msg : 登陆成功
     * date : {"user":{"created":1558158791000,"headPic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","id":48,"isMobileCheck":"1","name":"15011148387","password":"z123456","phone":"15011148387","status":"Y","username":"15011148387"}}
     * code : 0
     */

    private String msg;
    private DateBean date;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DateBean getDate() {
        return date;
    }

    public void setDate(DateBean date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class DateBean {
        /**
         * user : {"created":1558158791000,"headPic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556515265461&di=8efe3b690f7934f692a9124c8f3b5fd7&imgtype=0&src=http%3A%2F%2Fcache.house.sina.com.cn%2Fhousebaidu%2F92%2Fed%2Fdb513fd62466c8f12b59264e7ca5ba32_ori.jpg","id":48,"isMobileCheck":"1","name":"15011148387","password":"z123456","phone":"15011148387","status":"Y","username":"15011148387"}
         */

        private UserBean user;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }


    }
}
