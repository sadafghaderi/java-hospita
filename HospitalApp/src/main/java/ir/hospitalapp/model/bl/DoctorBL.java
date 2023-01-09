package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Doctor;

import java.util.List;

public class DoctorBL {
    public static Doctor add(Doctor doctor) throws Exception {
        try(CRUD<Doctor> doctorDA = new CRUD<>()){
            return doctorDA.add(doctor);
        }
    }

    public  static Doctor edit(Doctor doctor) throws Exception {
        try(CRUD<Doctor> doctorDA = new CRUD<>()){
            return doctorDA.edit(doctor);
        }
    }

    public static Doctor remove(Class<Doctor> doctorClass, long id) throws Exception {
        try(CRUD<Doctor> doctorDA = new CRUD<>()){
            return doctorDA.remove(doctorClass, id);
        }
    }

    public static Doctor findById(Class<Doctor> doctorClass, long id) throws Exception {
        try(CRUD<Doctor> doctorDA = new CRUD<>()){
            return doctorDA.findById(doctorClass, id);
        }
    }

    public static List<Doctor> findAll() throws Exception {
        try(CRUD<Doctor> doctorDA = new CRUD<>()){
            return doctorDA.findAll("doctorEntity");
        }
    }
}
