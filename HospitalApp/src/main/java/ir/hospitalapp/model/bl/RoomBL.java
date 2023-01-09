package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Room;

import java.util.List;

public class RoomBL {
    public static Room add(Room room) throws Exception {
        try(CRUD<Room> roomDA = new CRUD<>()){
            return roomDA.add(room);
        }
    }

    public static Room edit(Room room) throws Exception {
        try(CRUD<Room> roomDA = new CRUD<>()){
            return roomDA.edit(room);
        }
    }

    public static Room remove(Class<Room> roomClass, long id) throws Exception {
        try(CRUD<Room> roomDA = new CRUD<>()){
            return roomDA.remove(roomClass, id);
        }
    }

    public static Room findById(Class<Room> roomClass, long id) throws Exception {
        try(CRUD<Room> roomDA = new CRUD<>()){
            return roomDA.findById(roomClass, id);
        }
    }

    public static List<Room> findAll() throws Exception {
        try(CRUD<Room> roomDA = new CRUD<>()){
            return roomDA.findAll("roomEntity");
        }
    }
}
