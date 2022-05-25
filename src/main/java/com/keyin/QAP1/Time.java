package com.keyin.QAP1;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public short setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        return 0;
    }

    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
