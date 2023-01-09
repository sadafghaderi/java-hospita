package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.MedicalRecords;

import java.util.List;

public class MedicalRecordsBL {
    public static MedicalRecords add(MedicalRecords medicalRecords) throws Exception {
        try(CRUD<MedicalRecords> medicalRecordsDA = new CRUD<>()){
            return medicalRecordsDA.add(medicalRecords);
        }
    }

    public static MedicalRecords edit(MedicalRecords medicalRecords) throws Exception {
        try(CRUD<MedicalRecords> medicalRecordsDA = new CRUD<>()){
            return medicalRecordsDA.edit(medicalRecords);
        }
    }

    public static MedicalRecords remove(Class<MedicalRecords> medicalRecordsClass, long id) throws Exception {
        try(CRUD<MedicalRecords> medicalRecordsDA = new CRUD<>()){
            return medicalRecordsDA.remove(medicalRecordsClass, id);
        }
    }

    public static MedicalRecords findById(Class<MedicalRecords> medicalRecordsClass, long id) throws Exception {
        try(CRUD<MedicalRecords> medicalRecordsDA = new CRUD<>()){
            return medicalRecordsDA.findById(medicalRecordsClass, id);
        }
    }

    public static List<MedicalRecords> findAll() throws Exception {
        try(CRUD<MedicalRecords> medicalRecordsDA = new CRUD<>()){
            return medicalRecordsDA.findAll("medicalRecordsEntity");
        }
    }
}
