package com.example.firstapp.Model;

public class Course {

    public String name;
    public Integer chapterCount;

    public Course(String name, Integer chapterCount) {
        this.name = name;
        this.chapterCount = chapterCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(Integer chapterCount) {
        this.chapterCount = chapterCount;
    }
}
