package com.eko;

import java.io.Serializable;

public class RNBGDTaskConfig implements Serializable {
    public String id;
    public String url;
    public String destination;
    public String metadata = "{}";
    public boolean reportedBegin;
    public boolean saveInDownloads;

    public RNBGDTaskConfig(String id, String url, String destination, String metadata, boolean saveInDownloads) {
        this.id = id;
        this.url = url;
        this.destination = destination;
        this.metadata = metadata;
        this.reportedBegin = false;
        this.saveInDownloads = saveInDownloads;
    }
}
