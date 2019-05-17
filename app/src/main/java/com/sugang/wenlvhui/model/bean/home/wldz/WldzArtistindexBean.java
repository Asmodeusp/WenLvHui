package com.sugang.wenlvhui.model.bean.home.wldz;

import java.util.List;

public class WldzArtistindexBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"page":"1","backage_img":{"id":9,"imageType":1,"imgName":"艺人3","imgType":7,"imgUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4","paixu":3,"pid":2,"upDate":1556520815000},"artistList":[{"artistDetails":"个性","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"范元成","artistPhone":"13629564452","artistStatus":1,"artistType":30,"commentList":[],"experienceList":[],"id":1,"imgList":[],"typeName":"口技","videoList":[]},{"artistDetails":"帅气","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"张辉","artistPhone":"18795632626","artistStatus":1,"artistType":28,"commentList":[],"experienceList":[],"id":2,"imgList":[],"typeName":"广场舞","videoList":[]},{"artistDetails":"漂亮","artistLogourl":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=496585807,3177318753&fm=26&gp=0.jpg","artistName":"Any","artistPhone":"18922635645","artistStatus":1,"artistType":29,"commentList":[],"experienceList":[],"id":3,"imgList":[],"typeName":"街舞","videoList":[]},{"artistDetails":"个性","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"范远程","artistPhone":"19796326563","artistStatus":1,"artistType":30,"commentList":[],"experienceList":[],"id":4,"imgList":[],"typeName":"口技","videoList":[]}]}
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
        /**
         * page : 1
         * backage_img : {"id":9,"imageType":1,"imgName":"艺人3","imgType":7,"imgUrl":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4","paixu":3,"pid":2,"upDate":1556520815000}
         * artistList : [{"artistDetails":"个性","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"范元成","artistPhone":"13629564452","artistStatus":1,"artistType":30,"commentList":[],"experienceList":[],"id":1,"imgList":[],"typeName":"口技","videoList":[]},{"artistDetails":"帅气","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"张辉","artistPhone":"18795632626","artistStatus":1,"artistType":28,"commentList":[],"experienceList":[],"id":2,"imgList":[],"typeName":"广场舞","videoList":[]},{"artistDetails":"漂亮","artistLogourl":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=496585807,3177318753&fm=26&gp=0.jpg","artistName":"Any","artistPhone":"18922635645","artistStatus":1,"artistType":29,"commentList":[],"experienceList":[],"id":3,"imgList":[],"typeName":"街舞","videoList":[]},{"artistDetails":"个性","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistName":"范远程","artistPhone":"19796326563","artistStatus":1,"artistType":30,"commentList":[],"experienceList":[],"id":4,"imgList":[],"typeName":"口技","videoList":[]}]
         */

        private String page;
        private BackageImgBean backage_img;
        private List<ArtistListBean> artistList;

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public BackageImgBean getBackage_img() {
            return backage_img;
        }

        public void setBackage_img(BackageImgBean backage_img) {
            this.backage_img = backage_img;
        }

        public List<ArtistListBean> getArtistList() {
            return artistList;
        }

        public void setArtistList(List<ArtistListBean> artistList) {
            this.artistList = artistList;
        }

        public static class BackageImgBean {
            /**
             * id : 9
             * imageType : 1
             * imgName : 艺人3
             * imgType : 7
             * imgUrl : http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4
             * paixu : 3
             * pid : 2
             * upDate : 1556520815000
             */

            private int id;
            private int imageType;
            private String imgName;
            private int imgType;
            private String imgUrl;
            private int paixu;
            private int pid;
            private long upDate;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getImageType() {
                return imageType;
            }

            public void setImageType(int imageType) {
                this.imageType = imageType;
            }

            public String getImgName() {
                return imgName;
            }

            public void setImgName(String imgName) {
                this.imgName = imgName;
            }

            public int getImgType() {
                return imgType;
            }

            public void setImgType(int imgType) {
                this.imgType = imgType;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getPaixu() {
                return paixu;
            }

            public void setPaixu(int paixu) {
                this.paixu = paixu;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public long getUpDate() {
                return upDate;
            }

            public void setUpDate(long upDate) {
                this.upDate = upDate;
            }
        }

        public static class ArtistListBean {
            /**
             * artistDetails : 个性
             * artistLogourl : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg
             * artistName : 范元成
             * artistPhone : 13629564452
             * artistStatus : 1
             * artistType : 30
             * commentList : []
             * experienceList : []
             * id : 1
             * imgList : []
             * typeName : 口技
             * videoList : []
             */

            private String artistDetails;
            private String artistLogourl;
            private String artistName;
            private String artistPhone;
            private int artistStatus;
            private int artistType;
            private int id;
            private String typeName;
            private List<?> commentList;
            private List<?> experienceList;
            private List<?> imgList;
            private List<?> videoList;

            public String getArtistDetails() {
                return artistDetails;
            }

            public void setArtistDetails(String artistDetails) {
                this.artistDetails = artistDetails;
            }

            public String getArtistLogourl() {
                return artistLogourl;
            }

            public void setArtistLogourl(String artistLogourl) {
                this.artistLogourl = artistLogourl;
            }

            public String getArtistName() {
                return artistName;
            }

            public void setArtistName(String artistName) {
                this.artistName = artistName;
            }

            public String getArtistPhone() {
                return artistPhone;
            }

            public void setArtistPhone(String artistPhone) {
                this.artistPhone = artistPhone;
            }

            public int getArtistStatus() {
                return artistStatus;
            }

            public void setArtistStatus(int artistStatus) {
                this.artistStatus = artistStatus;
            }

            public int getArtistType() {
                return artistType;
            }

            public void setArtistType(int artistType) {
                this.artistType = artistType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }

            public List<?> getExperienceList() {
                return experienceList;
            }

            public void setExperienceList(List<?> experienceList) {
                this.experienceList = experienceList;
            }

            public List<?> getImgList() {
                return imgList;
            }

            public void setImgList(List<?> imgList) {
                this.imgList = imgList;
            }

            public List<?> getVideoList() {
                return videoList;
            }

            public void setVideoList(List<?> videoList) {
                this.videoList = videoList;
            }
        }
    }
}
