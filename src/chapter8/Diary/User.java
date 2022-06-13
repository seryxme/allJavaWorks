package chapter8.Diary;

import java.util.ArrayList;

public class User {
    ArrayList<Diary> diaries = new ArrayList<>();

    public void createDiary(int index, Diary diary) {
        diaries.add(index, diary);
    }

    public Diary viewDiary(int index) {
        return diaries.get(index);
    }

    public void viewAllDiaries() {
        for (Diary diary : diaries) {
            System.out.println(diary);
        }
    }

    public void editDiary(int index, String name) {
        diaries.get(index).setName(name);
    }

    public void deleteDiary(int index) {
        diaries.remove(index);
    }
}
