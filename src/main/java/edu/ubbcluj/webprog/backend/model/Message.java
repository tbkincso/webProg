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
    @JoinColumn(name = "fromCustomer")
    private User fromCustomer;

    @OneToOne
    @JoinColumn(name = "toCustomer")
    private User toCustomer;

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

    public User getFromCustomer() {
        return fromCustomer;
    }

    public void setFromCustomer(User fromCustomer) {
        this.fromCustomer = fromCustomer;
    }

    public User getToCustomer() {
        return toCustomer;
    }

    public void setToCustomer(User toCustomer) {
        this.toCustomer = toCustomer;
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
