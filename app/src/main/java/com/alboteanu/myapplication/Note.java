package com.alboteanu.myapplication;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.firebase.client.ServerValue;

import java.util.HashMap;

/**
 * Created by Dan on 18/06/2016.
 */
public class Note {
    public String id;
    public String title;
    public String details;
//    @JsonProperty
    public Object created;

    public Note(String id, String title, String details) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.created = ServerValue.TIMESTAMP;
    }

    public Note() {
    }

    @Override
    public String toString() {
        return title;
    }

//    @JsonIgnore
    public Long getCreatedTimestamp() {
        if (created instanceof Long) {
            return (Long) created;
        }
        else {
            return null;
        }
    }

}

