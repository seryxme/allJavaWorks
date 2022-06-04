package chapter8;

import java.util.Date;

public class Entry {
    private int id;
    private String title;
    private String body;
    private Date dateCreated;

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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date date) {
        dateCreated = date;
    }
    @Override
    public String toString() {
        return "\nEntry Number: " + getId() + "\nTitle: " + getTitle() + "\nDate recorded: " + getDateCreated() +
                "\nDetails: " + getBody();
    }
}