package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Patient;

import java.util.List;

public class PatientBL {
    public static Patient add(Patient patient) throws Exception {
        try(CRUD<Patient> patientDA = new CRUD<>()){
            return patientDA.add(patient);
        }
    }

    public static Patient edit(Patient patient) throws Exception {
        try(CRUD<Patient> patientDA = new CRUD<>()){
            return patientDA.edit(patient);
        }
    }

    public static Patient remove(Class<Patient> patientClass, long id) throws Exception {
        try(CRUD<Patient> patientDA = new CRUD<>()){
            return patientDA.remove(patientClass, id);
        }
    }

    public static Patient findById(Class<Patient> patientClass, long id) throws Exception {
        try(CRUD<Patient> patientDA = new CRUD<>()){
            return patientDA.findById(patientClass, id);
        }
    }

    public static List<Patient> findAll() throws Exception {
        try(CRUD<Patient> patientDA = new CRUD<>()){
            return patientDA.findAll("patientEntity");
        }
    }
}
