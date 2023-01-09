package ir.hospitalapp.model.entity;

import com.google.gson.Gson;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "doctorEntity")
@Table(name = "doctor_table")
public class Doctor extends Person {
    @Id
    @SequenceGenerator(name = "doctorSeq", sequenceName = "doctor_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctorSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String medicalSystemCode;

    public Doctor(){

    }

    public Doctor(Gender gender, String name, String family, String nationalCode, String fatherName, LocalDate birthDate, String birthPlace, String tel, String address, long roleId, String photo, String description, Boolean active, long id, String medicalSystemCode) {
        super(gender, name, family, nationalCode, fatherName, birthDate, birthPlace, tel, address, roleId, photo, description, active);
        this.id = id;
        this.medicalSystemCode = medicalSystemCode;
    }

    public String getMedicalSystemCode() {
        return medicalSystemCode;
    }

    public Doctor setMedicalSystemCode(String medicalSystemCode) {
        this.medicalSystemCode = medicalSystemCode;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
