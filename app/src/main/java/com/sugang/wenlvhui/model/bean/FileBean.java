package com.sugang.wenlvhui.model.bean;

//
/* Created by $USER_NAME on 2019/6/8.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class FileBean {

    /**
     * msg : 上传成功
     * code : 1
     * data : {"path":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/3ca4126d-b33a-4571-9355-dbd4c94a3737.jpg","size":"121.53KB","titleAlter":"3ca4126d-b33a-4571-9355-dbd4c94a3737","titleOrig":"微信图片_20190530102509","type":".jpg","uploadTime":1559991196824}
     */

    private String msg;
    private int code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

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

    public static class DataBean {
        /**
         * path : http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/3ca4126d-b33a-4571-9355-dbd4c94a3737.jpg
         * size : 121.53KB
         * titleAlter : 3ca4126d-b33a-4571-9355-dbd4c94a3737
         * titleOrig : 微信图片_20190530102509
         * type : .jpg
         * uploadTime : 1559991196824
         */

        private String path;
        private String size;
        private String titleAlter;
        private String titleOrig;
        private String type;
        private long uploadTime;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getTitleAlter() {
            return titleAlter;
        }

        public void setTitleAlter(String titleAlter) {
            this.titleAlter = titleAlter;
        }

        public String getTitleOrig() {
            return titleOrig;
        }

        public void setTitleOrig(String titleOrig) {
            this.titleOrig = titleOrig;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public long getUploadTime() {
            return uploadTime;
        }

        public void setUploadTime(long uploadTime) {
            this.uploadTime = uploadTime;
        }
    }
}
