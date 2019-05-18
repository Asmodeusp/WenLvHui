package com.sugang.wenlvhui.model.bean.login;

import java.util.Date;

public class UserBean {
    private int id;                   // id` bigint(20) NOT NULL AUTO_INCREMENT,
    private String username;          // `username` varchar(50) NOT NULL COMMENT '用户名',
    private String password;          // `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
    private String phone;             // `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
    private String headPic;           // `head_pic` varchar(150) DEFAULT NULL COMMENT '头像地址',
    private String status;            // `status` varchar(1) DEFAULT NULL COMMENT '使用状态（Y正常 N非正常）',
    private String isMobileCheck;     // `is_mobile_check` varchar(1) DEFAULT '0' COMMENT '手机是否验证 （0否  1是）',
    private long created;             // `created` datetime NOT NULL COMMENT '创建时间',
    private long updated;             // `updated` datetime NOT NULL,
    private String sourceType;        // `source_type` varchar(1) DEFAULT NULL COMMENT '会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat',
    private String nickName;          // `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
    private String name;              // `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
    private String sex;               // `sex` varchar(1) DEFAULT '0' COMMENT '性别，1男，2女',
    private String userLevel;         // `user_level` int(11) DEFAULT NULL COMMENT '会员等级',
    private long birthday;            // `birthday` datetime DEFAULT NULL COMMENT '生日',
    private long lastLoginTime;       // `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
    private int usertype;             //用户类型   1:普通用户    2：艺人    3：商家   4：餐厅     9：管理员',
    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIsMobileCheck(String isMobileCheck) {
        this.isMobileCheck = isMobileCheck;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getHeadPic() {
        return headPic;
    }

    public String getStatus() {
        return status;
    }

    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    public long getCreated() {
        return created;
    }

    public long getUpdated() {
        return updated;
    }

    public String getSourceType() {
        return sourceType;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public long getBirthday() {
        return birthday;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }


}
