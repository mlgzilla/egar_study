package egar.domain.report.entity;

import egar.enums.TaskStatus;

public class Report {
    private int id;
    private String task;
    private TaskStatus taskStatus;
    private String description;
    private int duration;

    public Report(int id, String task, TaskStatus taskStatus, String description, int duration) {
        this.id = id;
        this.task = task;
        this.taskStatus = taskStatus;
        this.description = description;
        this.duration = duration;
    }
}
