package chapter8.Diary;

import java.util.Date;

public class Entry {
    private int id;
    private String title;
    private String body;
    private String dateCreated;

//    public Entry(int id, String title) {
//        this.id = id;
//        this.title = title;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date date) {
        dateCreated = String.valueOf(date);
    }
    @Override
    public String toString() {
        return String.format("%nEntry Number: %d%nTitle: %s%nDate recorded: %s%nDetails: %s",
                getId(), getTitle(), getDateCreated(), getBody());
    }
}
