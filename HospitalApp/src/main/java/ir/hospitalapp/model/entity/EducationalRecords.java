package ir.hospitalapp.model.entity;

import com.google.gson.Gson;

import javax.persistence.*;

@Entity(name = "educationalRecordsEntity")
@Table(name = "edu_Records_table")

public class EducationalRecords {
    @Id
    @SequenceGenerator(name = "eduRecordsSeq", sequenceName = "edu_Records_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eduRecordsSeq")
    private long id;

    private long doctorId;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String title;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String university;

    private float GPA;


    public long getId() {
        return id;
    }

    public EducationalRecords setId(long id) {
        this.id = id;
        return this;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public EducationalRecords setDoctorId(long doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public EducationalRecords setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUniversity() {
        return university;
    }

    public EducationalRecords setUniversity(String university) {
        this.university = university;
        return this;
    }

    public float getGPA() {
        return GPA;
    }

    public EducationalRecords setGPA(float GPA) {
        this.GPA = GPA;
        return this;
    }

    public EducationalRecords() {
    }

    public EducationalRecords(long doctorId, String title, String university, float GPA) {
        this.doctorId = doctorId;
        this.title = title;
        this.university = university;
        this.GPA = GPA;
    }

    public EducationalRecords(long id, long doctorId, String title, String university, float GPA) {
        this.id = id;
        this.doctorId = doctorId;
        this.title = title;
        this.university = university;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
