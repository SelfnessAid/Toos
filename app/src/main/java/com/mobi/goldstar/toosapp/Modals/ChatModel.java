package com.mobi.goldstar.toosapp.Modals;

public class ChatModel {
    String usr_id;
    String usr_post_time;
    String usr_post_content;
    int usr_img_url;

    public ChatModel(String id, String time, String content, int img_url) {
        this.usr_id = id;
        this.usr_post_time = time;
        this.usr_post_content = content;
        this.usr_img_url = img_url;
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

    public String getUsr_post_time() {
        return usr_post_time;
    }
}
