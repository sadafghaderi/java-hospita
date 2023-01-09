package ir.hospitalapp;

import ir.hospitalapp.model.bl.DoctorBL;
import ir.hospitalapp.model.bl.RoomBL;
import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Doctor;
import ir.hospitalapp.model.entity.Medicine;
import ir.hospitalapp.model.entity.Person;
import ir.hospitalapp.model.entity.Room;
import ir.hospitalapp.model.utils.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

       Room room= new Room(1,1,1);
        RoomBL.add(room);
//        CRUD<Medicine> medCRUD = new CRUD<>();
//        medCRUD.add());
    }
}
