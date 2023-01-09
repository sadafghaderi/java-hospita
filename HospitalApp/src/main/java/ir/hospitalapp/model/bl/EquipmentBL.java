package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Equipment;

import java.util.List;

public class EquipmentBL {
    public static Equipment add(Equipment equipment) throws Exception {
        try(CRUD<Equipment> equipmentDA = new CRUD<>()){
            return equipmentDA.add(equipment);
        }
    }

    public static Equipment edit(Equipment equipment) throws Exception {
        try(CRUD<Equipment> equipmentDA = new CRUD<>()){
            return equipmentDA.edit(equipment);
        }
    }

    public static Equipment remove(Class<Equipment> equipmentClass, long id) throws Exception {
        try(CRUD<Equipment> equipmentDA = new CRUD<>()){
            return equipmentDA.remove(equipmentClass, id);
        }
    }

    public static Equipment findById(Class<Equipment> equipmentClass, long id) throws Exception {
        try(CRUD<Equipment> equipmentDA = new CRUD<>()){
            return equipmentDA.findById(equipmentClass, id);
        }
    }

    public static List<Equipment> findAll() throws Exception {
        try(CRUD<Equipment> equipmentDA = new CRUD<>()){
            return equipmentDA.findAll("equipmentEntity");
        }
    }
}
