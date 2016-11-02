package ua.pp.lazin.phraseholder.entity;

import java.time.LocalDateTime;

/**
 * @author Ruslan Lazin
 */

public class Phrase {
    private String body;
    private LocalDateTime creationTime;

    public Phrase(String body) {
        this.body = body;
        this.creationTime = LocalDateTime.now();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
