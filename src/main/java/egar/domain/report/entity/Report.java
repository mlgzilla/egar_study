package egar.domain.report.entity;

import egar.enums.Status;

public class Report {
    private int id;
    private String task;
    private Status status;
    private String description;
    private int duration;

    public Report(int id, String task, Status status, String description, int duration) {
        this.id = id;
        this.task = task;
        this.status = status;
        this.description = description;
        this.duration = duration;
    }
}
