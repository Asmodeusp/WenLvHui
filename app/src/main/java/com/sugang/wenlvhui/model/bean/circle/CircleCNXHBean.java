package com.sugang.wenlvhui.model.bean.circle;

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
public class CircleCNXHBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"policy_list":[{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"书法大家45","circleRegulations":"注意语言","createDate":1560069964000,"createUser":58,"dataName":"摄影","dictionaryId":14,"id":9,"imgUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg","regulationsDate":1560069964000,"userType":1},{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"书法大家2","circleRegulations":"注意语言","createDate":1560069959000,"createUser":58,"dataName":"烹饪","dictionaryId":12,"id":8,"imgUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg","regulationsDate":1560069959000,"userType":1},{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"书法大家3","circleRegulations":"注意语言","createDate":1560069962000,"createUser":58,"dataName":"健身","dictionaryId":19,"id":7,"imgUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg","regulationsDate":1560069962000,"userType":1},{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"书法大家2","circleRegulations":"注意语言","createDate":1560069960000,"createUser":58,"dataName":"刺绣","dictionaryId":18,"id":6,"imgUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg","regulationsDate":1560069960000,"userType":1},{"browse":1234,"circleAdmin":57,"circleDetail":"本圈子是书法圈","circleName":"书法大家1","circleRegulations":"注意语言","createDate":1560069961000,"createUser":58,"dataName":"书法","dictionaryId":17,"id":5,"imgUrl":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg","regulationsDate":1560069961000,"userType":2}]}
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
        private List<PolicyListBean> policy_list;

        public List<PolicyListBean> getPolicy_list() {
            return policy_list;
        }

        public void setPolicy_list(List<PolicyListBean> policy_list) {
            this.policy_list = policy_list;
        }

        public static class PolicyListBean {
            /**
             * browse : 1234
             * circleAdmin : 57
             * circleDetail : 本圈子是书法圈
             * circleName : 书法大家45
             * circleRegulations : 注意语言
             * createDate : 1560069964000
             * createUser : 58
             * dataName : 摄影
             * dictionaryId : 14
             * id : 9
             * imgUrl : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/07/a5dd543e-d0a7-4298-9998-534650786256.jpg
             * regulationsDate : 1560069964000
             * userType : 1
             */

            private int browse;
            private int circleAdmin;
            private String circleDetail;
            private String circleName;
            private String circleRegulations;
            private long createDate;
            private int createUser;
            private String dataName;
            private int dictionaryId;
            private int id;
            private String imgUrl;
            private long regulationsDate;
            private int userType;

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public int getCircleAdmin() {
                return circleAdmin;
            }

            public void setCircleAdmin(int circleAdmin) {
                this.circleAdmin = circleAdmin;
            }

            public String getCircleDetail() {
                return circleDetail;
            }

            public void setCircleDetail(String circleDetail) {
                this.circleDetail = circleDetail;
            }

            public String getCircleName() {
                return circleName;
            }

            public void setCircleName(String circleName) {
                this.circleName = circleName;
            }

            public String getCircleRegulations() {
                return circleRegulations;
            }

            public void setCircleRegulations(String circleRegulations) {
                this.circleRegulations = circleRegulations;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public int getCreateUser() {
                return createUser;
            }

            public void setCreateUser(int createUser) {
                this.createUser = createUser;
            }

            public String getDataName() {
                return dataName;
            }

            public void setDataName(String dataName) {
                this.dataName = dataName;
            }

            public int getDictionaryId() {
                return dictionaryId;
            }

            public void setDictionaryId(int dictionaryId) {
                this.dictionaryId = dictionaryId;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public long getRegulationsDate() {
                return regulationsDate;
            }

            public void setRegulationsDate(long regulationsDate) {
                this.regulationsDate = regulationsDate;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }
        }
    }
}
