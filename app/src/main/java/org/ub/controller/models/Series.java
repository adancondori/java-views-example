package org.ub.controller.models;

public class Series {
    private String title;
    private int seasons;
    private String imageUrl;

    public Series(String title, int seasons, String imageUrl) {
        this.title = title;
        this.seasons = seasons;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getSeasons() {
        return seasons;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
