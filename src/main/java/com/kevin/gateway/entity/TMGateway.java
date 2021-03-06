package com.kevin.gateway.entity;

import java.io.Serializable;

public class TMGateway implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String path;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
