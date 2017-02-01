package com.mobi.goldstar.toosapp.Modals;

public class PostModel {
    String usr_id;
    String usr_post_time;
    String usr_post_content;
    int usr_img_url;
    int usr_post_img_url;
    String usr_post_video_url;
    int usr_post_type;

    public PostModel(String id, String time, String content, int img_url, String video_url, int post_img_url, int post_type) {
        this.usr_id = id;
        this.usr_post_time = time;
        this.usr_post_content = content;
        this.usr_img_url = img_url;
        this.usr_post_video_url = video_url;
        this.usr_post_img_url = post_img_url;
        this.usr_post_type = post_type;
    }

    public String getUsr_id() {
        return usr_id;
    }

    public int getUsr_img_url() {
        return usr_img_url;
    }

    public String getUsr_post_content() {
        return usr_post_content;
    }

    public int getUsr_post_img_url() {
        return usr_post_img_url;
    }

    public String getUsr_post_time() {
        return usr_post_time;
    }

    public int getUsr_post_type() {
        return usr_post_type;
    }

    public String getUsr_post_video_url() {
        return usr_post_video_url;
    }
}
