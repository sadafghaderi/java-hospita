package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;

@Entity(name = "patientEntity")
@Table(name = "patient_table")

public class Patient extends Person{
    @Id
    @SequenceGenerator(name = "patientSeq", sequenceName = "patient_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patientSeq")
    private long personId;

    @Enumerated(EnumType.STRING)
    private Blood bloodType;

    private float height;

    private float weight;

    private long medicalRecordsId;






    public long getPersonId() {
        return personId;
    }

    public Patient setPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public Blood getBloodType() {
        return bloodType;
    }

    public Patient setBloodType(Blood bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Patient setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Patient setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public long getMedicalRecordsId() {
        return medicalRecordsId;
    }

    public Patient setMedicalRecordsId(long medicalRecordsId) {
        this.medicalRecordsId = medicalRecordsId;
        return this;
    }

    public Patient() {
    }

    public Patient(long personId, Blood bloodType, float height, float weight, long medicalRecordsId) {
        this.personId = personId;
        this.bloodType = bloodType;
        this.height = height;
        this.weight = weight;
        this.medicalRecordsId = medicalRecordsId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
