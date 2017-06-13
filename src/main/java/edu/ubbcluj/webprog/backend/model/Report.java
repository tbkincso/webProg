package edu.ubbcluj.webprog.backend.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kincso on 13.06.2017.
 */
@Entity
@Table(name="report")
public class Report {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="text")
    private String text;

    @Column(name="date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "taskid")
    @Column(name="taskid")
    private Task task;

    public Report() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
