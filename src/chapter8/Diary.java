package chapter8;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private int id;
    private String name;
    private Date dateCreated;
    private ArrayList<Entry> entries = new ArrayList<>();
    private Entry entry = new Entry();

//    public Diary(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void addEntry(int index, Entry entry) {
        entries.add(index, entry);
    }

    public Entry getEntry(int index) {
        entry = entries.get(index);
        return entry;
    }

    public void getAllEntries() {
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }

    public void editEntryTitle(int index, String title) {
        entries.get(index).setTitle(title);
    }

    public void editEntryBody(int index, String body) {
        entries.get(index).setTitle(body);
    }

    public void deleteEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return "\nDiary Number: " + getId() + "\nDiary Name: " + getName() + "\nDate created: " + getDateCreated() +
                "\nNumber of entries: " + entries.size();
    }
}
