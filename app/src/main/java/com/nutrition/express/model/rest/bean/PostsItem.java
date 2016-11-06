package com.nutrition.express.model.rest.bean;

import java.util.List;

/**
 * Created by huang on 2/18/16.
 */
public class PostsItem {
    private String blog_name;
    private long id;
    private String post_url;
    private String slug;
    private String type;
    private String date;
    private long timestamp;
    private String state;
    private String format;
    private String reblog_key;
    private List<String> tags;
    private String short_url;
    private String summary;
    private String recommended_source;
    private String recommended_color;
    private List<String> highlighted;
    private long note_count;
    private String caption;
    private ReblogItem reblog;
    private List<TrailItem> trail;
    //-----------------------------------------------------------
    //             video
    //-----------------------------------------------------------
    private String video_url;
    private boolean html5_capable;
    private String thumbnail_url;
    private int thumbnail_width;
    private int thumbnail_height;
    private String duration;
    private List<PlayerItem> player;
    private String viedo_type;

    //-----------------------------------------------------------
    //            photo
    //-----------------------------------------------------------
    private String photoset_layout;
    private List<PhotoItem> photos;

    //-----------------------------------------------------------
    //            common
    //-----------------------------------------------------------
    private boolean can_like;
    private boolean can_reblog;
    private boolean can_send_in_message;
    private boolean can_reply;
    private boolean display_avatar;

    public String getBlog_name() {
        return blog_name;
    }

    public long getId() {
        return id;
    }

    public String getPost_url() {
        return post_url;
    }

    public String getSlug() {
        return slug;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getState() {
        return state;
    }

    public String getFormat() {
        return format;
    }

    public String getReblog_key() {
        return reblog_key;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getShort_url() {
        return short_url;
    }

    public String getSummary() {
        return summary;
    }

    public String getRecommended_source() {
        return recommended_source;
    }

    public String getRecommended_color() {
        return recommended_color;
    }

    public List<String> getHighlighted() {
        return highlighted;
    }

    public long getNote_count() {
        return note_count;
    }

    public String getCaption() {
        return caption;
    }

    public ReblogItem getReblog() {
        return reblog;
    }

    public List<TrailItem> getTrail() {
        return trail;
    }

    public String getVideo_url() {
        return video_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public boolean isHtml5_capable() {
        return html5_capable;
    }

    public int getThumbnail_width() {
        return thumbnail_width;
    }

    public int getThumbnail_height() {
        return thumbnail_height;
    }

    public String getDuration() {
        return duration;
    }

    public List<PlayerItem> getPlayer() {
        return player;
    }

    public String getViedo_type() {
        return viedo_type;
    }

    public String getPhotoset_layout() {
        return photoset_layout;
    }

    public List<PhotoItem> getPhotos() {
        return photos;
    }

    public boolean isCan_like() {
        return can_like;
    }

    public boolean isCan_reblog() {
        return can_reblog;
    }

    public boolean isCan_send_in_message() {
        return can_send_in_message;
    }

    public boolean isCan_reply() {
        return can_reply;
    }

    public boolean isDisplay_avatar() {
        return display_avatar;
    }
}