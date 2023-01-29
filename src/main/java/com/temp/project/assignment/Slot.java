package com.temp.project.assignment;

public class Slot {
    private int startTime;
    private int endTime;

    public Slot() {
    }

    public Slot(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
