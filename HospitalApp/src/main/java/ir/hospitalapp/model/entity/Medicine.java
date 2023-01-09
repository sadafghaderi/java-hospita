package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "medicineEntity")
@Table(name="medicine_table")

public class Medicine {
    @Id
    @SequenceGenerator(name = "medicineSeq", sequenceName = "medicine_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicineSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String drug;

    private int dose;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String doctor;

    private LocalDate startDate;

    private LocalDate endDate;



    public long getId() {
        return id;
    }

    public Medicine setId(long id) {
        this.id = id;
        return this;
    }

    public String getDrug() {
        return drug;
    }

    public Medicine setDrug(String drug) {
        this.drug = drug;
        return this;
    }

    public int getDose() {
        return dose;
    }

    public Medicine setDose(int dose) {
        this.dose = dose;
        return this;
    }

    public String getDoctor() {
        return doctor;
    }

    public Medicine setDoctor(String doctor) {
        this.doctor = doctor;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Medicine setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Medicine setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public Medicine() {
    }

    public Medicine(String drug, int dose, String doctor, LocalDate startDate, LocalDate endDate) {
        this.drug = drug;
        this.dose = dose;
        this.doctor = doctor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Medicine(long id, String drug, int dose, String doctor, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.drug = drug;
        this.dose = dose;
        this.doctor = doctor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
