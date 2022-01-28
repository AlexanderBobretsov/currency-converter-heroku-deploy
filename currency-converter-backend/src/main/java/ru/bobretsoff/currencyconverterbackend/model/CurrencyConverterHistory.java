package ru.bobretsoff.currencyconverterbackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CurrencyConverterHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String currency1_charcode;

    @Column
    private String currency2_charcode;

    @Column
    private String course;

    @Column
    private String currency1_sum;

    @Column
    private String currency2_sum;

    @Column
    private String status_exchange;

    @Column
    private String date_exchange;

    public CurrencyConverterHistory() {
        this.id = id;
        this.currency1_charcode = currency1_charcode;
        this.currency2_charcode = currency2_charcode;
        this.course = course;
        this.currency1_sum = currency1_sum;
        this.currency2_sum = currency2_sum;
        this.status_exchange = status_exchange;
        this.date_exchange = date_exchange;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency1_charcode() {
        return currency1_charcode;
    }

    public void setCurrency1_charcode(String currency1_charcode) {
        this.currency1_charcode = currency1_charcode;
    }

    public String getCurrency2_charcode() {
        return currency2_charcode;
    }

    public void setCurrency2_charcode(String currency2_charcode) {
        this.currency2_charcode = currency2_charcode;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCurrency1_sum() {
        return currency1_sum;
    }

    public void setCurrency1_sum(String currency1_sum) {
        this.currency1_sum = currency1_sum;
    }

    public String getCurrency2_sum() {
        return currency2_sum;
    }

    public void setCurrency2_sum(String currency2_sum) {
        this.currency2_sum = currency2_sum;
    }

    public String getStatus_exchange() {
        return status_exchange;
    }

    public void setStatus_exchange(String status_exchange) {
        this.status_exchange = status_exchange;
    }

    public String getDate_exchange() {
        return date_exchange;
    }

    public void setDate_exchange(String date_exchange) {
        this.date_exchange = date_exchange;
    }
}
