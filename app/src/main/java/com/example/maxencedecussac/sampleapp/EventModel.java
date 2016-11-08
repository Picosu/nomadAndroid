package com.example.maxencedecussac.sampleapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxencedecussac on 08/11/2016.
 */

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Event {

    @SerializedName("dateStart")
    @Expose
    private String dateStart;
    @SerializedName("dateEnd")
    @Expose
    private String dateEnd;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("medias")
    @Expose
    private List<Object> medias = new ArrayList<Object>();
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;

    /**
     * @return The dateStart
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart The dateStart
     */
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return The dateEnd
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd The dateEnd
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The medias
     */
    public List<Object> getMedias() {
        return medias;
    }

    /**
     * @param medias The medias
     */
    public void setMedias(List<Object> medias) {
        this.medias = medias;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The excerpt
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     * @param excerpt The excerpt
     */
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

}

