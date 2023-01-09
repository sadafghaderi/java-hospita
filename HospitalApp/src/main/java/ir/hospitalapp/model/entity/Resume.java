package ir.hospitalapp.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "resumeEntity")
@Table(name = "resume_table")

public class Resume {
    @Id
    @SequenceGenerator(name = "resumeSeq", sequenceName = "resume_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resumeSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String jobTitle;

    private long doctorId;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String workPlace;

    private LocalDate startDate;

    private LocalDate endDate;





    public long getId() {
        return id;
    }

    public Resume setId(long id) {
        this.id = id;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Resume setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public Resume setDoctorId(long doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public Resume setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Resume setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Resume setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public Resume() {
    }

    public Resume(String jobTitle, long doctorId, String workPlace, LocalDate startDate, LocalDate endDate) {
        this.jobTitle = jobTitle;
        this.doctorId = doctorId;
        this.workPlace = workPlace;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Resume(long id, String jobTitle, long doctorId, String workPlace, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.doctorId = doctorId;
        this.workPlace = workPlace;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
