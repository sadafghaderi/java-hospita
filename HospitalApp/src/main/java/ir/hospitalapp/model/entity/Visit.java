package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "visitEntity")
@Table(name = "visit_table")

public class Visit {
    @Id
    @SequenceGenerator(name = "visitSeq", sequenceName = "visit_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visitSeq")
    private long id;

    private long patientId;

    private long timingId;

    private LocalDateTime dateTime;

    private int turn;

    private double payment;

    private long userId;

    private boolean active;




    public long getId() {
        return id;
    }

    public Visit setId(long id) {
        this.id = id;
        return this;
    }

    public long getPatientId() {
        return patientId;
    }

    public Visit setPatientId(long patientId) {
        this.patientId = patientId;
        return this;
    }

    public long getTimingId() {
        return timingId;
    }

    public Visit setTimingId(long timingId) {
        this.timingId = timingId;
        return this;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Visit setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public int getTurn() {
        return turn;
    }

    public Visit setTurn(int turn) {
        this.turn = turn;
        return this;
    }

    public double getPayment() {
        return payment;
    }

    public Visit setPayment(double payment) {
        this.payment = payment;
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public Visit setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public Visit() {
    }

    public Visit(long patientId, long timingId, LocalDateTime dateTime, int turn, double payment, long userId) {
        this.patientId = patientId;
        this.timingId = timingId;
        this.dateTime = dateTime;
        this.turn = turn;
        this.payment = payment;
        this.userId = userId;
    }

    public Visit(long id, long patientId, long timingId, LocalDateTime dateTime, int turn, double payment, long userId) {
        this.id = id;
        this.patientId = patientId;
        this.timingId = timingId;
        this.dateTime = dateTime;
        this.turn = turn;
        this.payment = payment;
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public Visit setActive(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
