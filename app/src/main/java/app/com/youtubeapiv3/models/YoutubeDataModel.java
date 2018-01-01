package app.com.youtubeapiv3.models;

/**
 * Created by mdmunirhossain on 12/18/17.
 */

public class YoutubeDataModel {
    private String title = "";
    private String description = "";
    private String publishedAt = "";
    private String thumbnail = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
