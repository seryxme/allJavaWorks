package chapter8.Diary;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private int id;
    private String name;
    private String dateCreated;
    private ArrayList<Entry> entries = new ArrayList<>();
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

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date date) {
        dateCreated = String.valueOf(date);
    }

    public void addEntry(int index, Entry entry) {
        entries.add(index, entry);
    }

    public Entry getEntry(int index) {
        return entries.get(index);
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
        return String.format("%nDiary Number: %d%nDiary Name: %s%nDate created: %s%nNumber of entries: %d",
                getId(), getName(), getDateCreated(), entries.size());
    }
}
