package com.example.osfams.mongoms.models;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ngan
 */
@Document(collection = "logentries")
public class LogEntry {
    @Id
    private String id;
    @CreatedDate
    private LocalDateTime eventTime;
    private String service;
    private String data;
    private int time2Live;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTime2Live() {
        return time2Live;
    }

    public void setTime2Live(int time2Live) {
        this.time2Live = time2Live;
    }
    
}
