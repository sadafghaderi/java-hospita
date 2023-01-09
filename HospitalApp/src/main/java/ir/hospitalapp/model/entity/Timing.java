package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity(name = "timingEntity")
@Table(name = "timing_table")

public class Timing {
    @Id
    @SequenceGenerator(name = "timingSeq", sequenceName = "timing_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timingSeq")
    private long id;

    private long doctorId;

    private long roomId;

    private Time startTime;

    private Time endTime;

    private LocalDate date;

    private WeekDay day;

    private boolean active;




    public long getId() {
        return id;
    }

    public Timing setId(long id) {
        this.id = id;
        return this;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public Timing setDoctorId(long doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    public long getRoomId() {
        return roomId;
    }

    public Timing setRoomId(long roomId) {
        this.roomId = roomId;
        return this;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Timing setStartTime(Time startTime) {
        this.startTime = startTime;
        return this;
    }

    public Time getEndTime() {
        return endTime;
    }

    public Timing setEndTime(Time endTime) {
        this.endTime = endTime;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Timing setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public WeekDay getDay() {
        return day;
    }

    public Timing setDay(WeekDay day) {
        this.day = day;
        return this;
    }

    public Timing() {
    }

    public Timing(long doctorId, long roomId, Time startTime, Time endTime, LocalDate date, WeekDay day) {
        this.doctorId = doctorId;
        this.roomId = roomId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.day = day;
    }

    public Timing(long id, long doctorId, long roomId, Time startTime, Time endTime, LocalDate date, WeekDay day) {
        this.id = id;
        this.doctorId = doctorId;
        this.roomId = roomId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.day = day;
    }

    public boolean isActive() {
        return active;
    }

    public Timing setActive(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
