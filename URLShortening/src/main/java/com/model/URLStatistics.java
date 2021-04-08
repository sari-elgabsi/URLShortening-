package com.model;


import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Data
@Entity
@Table(name = "shortened_url_statistics")
public class URLStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "shortenedURL")
    private String shortenedURL;

    @Column(name = "viewCounter")
    private int viewCounter;

    @Column(name = "date")
    private LocalDate date;

}
