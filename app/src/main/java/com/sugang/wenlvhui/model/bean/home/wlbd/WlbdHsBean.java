package com.sugang.wenlvhui.model.bean.home.wlbd;

//
/* Created by $USER_NAME on 2019/6/11.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/

import java.util.List;

public class WlbdHsBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"bangdan":[{"id":90,"type":2,"browse":200,"NAME":"沙湖游"},{"id":91,"type":2,"browse":200,"NAME":"沙坡之旅"},{"id":92,"type":2,"browse":200,"NAME":"镇北堡西部影城"},{"id":93,"type":2,"browse":200,"NAME":"西夏陵"},{"id":94,"type":2,"browse":200,"NAME":"贺兰山岩画"},{"id":95,"type":2,"browse":200,"NAME":"水洞沟旅游区"},{"id":96,"type":2,"browse":200,"NAME":"玉皇阁"},{"id":97,"type":2,"browse":200,"NAME":"青铜峡108塔"},{"id":98,"type":2,"browse":200,"NAME":"黄河坛"},{"id":99,"type":2,"browse":200,"NAME":"六盘山滑雪场"}]}
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
        private List<BangdanBean> bangdan;

        public List<BangdanBean> getBangdan() {
            return bangdan;
        }

        public void setBangdan(List<BangdanBean> bangdan) {
            this.bangdan = bangdan;
        }

        public static class BangdanBean {
            /**
             * id : 90
             * type : 2
             * browse : 200
             * NAME : 沙湖游
             */

            private int id;
            private int type;
            private int browse;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getBrowse() {
                return browse;
            }

            public void setBrowse(int browse) {
                this.browse = browse;
            }

            public String getNAME() {
                return name;
            }

            public void setNAME(String NAME) {
                this.name = NAME;
            }
        }
    }
}


