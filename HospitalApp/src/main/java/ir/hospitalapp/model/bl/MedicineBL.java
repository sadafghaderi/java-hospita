package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Medicine;


import java.util.List;

public class MedicineBL {
    public static Medicine add(Medicine medicine) throws Exception {
        try(CRUD<Medicine> medicineDA = new CRUD<>()){
            return medicineDA.add(medicine);
        }
    }

    public static Medicine edit(Medicine medicine) throws Exception {
        try(CRUD<Medicine> medicineDA = new CRUD<>()){
            return medicineDA.edit(medicine);
        }
    }

    public static Medicine remove(Class<Medicine> medicineClass, long id) throws Exception {
        try(CRUD<Medicine> medicineDA = new CRUD<>()){
            return medicineDA.remove(medicineClass, id);
        }
    }

    public static Medicine findById(Class<Medicine> medicineClass, long id) throws Exception {
        try(CRUD<Medicine> medicineDA = new CRUD<>()){
            return medicineDA.findById(medicineClass, id);
        }
    }

    public static List<Medicine> findAll() throws Exception {
        try(CRUD<Medicine> medicineDA = new CRUD<>()){
            return medicineDA.findAll("medicineEntity");
        }
    }
}
