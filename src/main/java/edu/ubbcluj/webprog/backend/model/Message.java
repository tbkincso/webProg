package edu.ubbcluj.webprog.backend.model;

import javax.persistence.*;

/**
 * Created by kincso on 13.06.2017.
 */
@Entity
@Table(name="message")
public class Message {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "from")
    @Column(name="from")
    private User from;

    @OneToOne
    @JoinColumn(name = "to")
    @Column(name="to")
    private User to;

    @Column(name="subject")
    private String subject;

    @Column(name="description")
    private String description;

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
