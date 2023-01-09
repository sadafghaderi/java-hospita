package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;


@Entity(name = "medicalRecordsEntity")
@Table(name = "medicalRecords_table")

public class MedicalRecords {
    @Id
    @SequenceGenerator(name = "medicalRecordsSeq", sequenceName = "medicalRecords_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicalRecordsSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String typeDisease;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String durationTreatment;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String doctorsName;

    private long medicineId;



    public long getId() {
        return id;
    }

    public MedicalRecords setId(long id) {
        this.id = id;
        return this;
    }

    public String getTypeDisease() {
        return typeDisease;
    }

    public MedicalRecords setTypeDisease(String typeDisease) {
        this.typeDisease = typeDisease;
        return this;
    }

    public String getDurationTreatment() {
        return durationTreatment;
    }

    public MedicalRecords setDurationTreatment(String durationTreatment) {
        this.durationTreatment = durationTreatment;
        return this;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public MedicalRecords setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
        return this;
    }

    public long getMedicineId() {
        return medicineId;
    }

    public MedicalRecords setMedicineId(long medicineId) {
        this.medicineId = medicineId;
        return this;
    }

    public MedicalRecords() {
    }

    public MedicalRecords(String typeDisease, String durationTreatment, String doctorsName, long medicineId) {
        this.typeDisease = typeDisease;
        this.durationTreatment = durationTreatment;
        this.doctorsName = doctorsName;
        this.medicineId = medicineId;
    }

    public MedicalRecords(long id, String typeDisease, String durationTreatment, String doctorsName, long medicineId) {
        this.id = id;
        this.typeDisease = typeDisease;
        this.durationTreatment = durationTreatment;
        this.doctorsName = doctorsName;
        this.medicineId = medicineId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
