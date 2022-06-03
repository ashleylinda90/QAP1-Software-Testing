package com.keyin.QAP1;

public class WordComparison {

    private String name;
    private String job;
    private String country;

    public WordComparison(String n, String j, String c) {
        this.name = n;
        this.job = j;
        this.country = c;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String setName(String n) {
        this.name = n;
        return n;
    }
}
