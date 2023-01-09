package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;

@Entity(name = "roomEntity")
@Table(name = "room_table")

public class Room {
    @Id
    @SequenceGenerator(name = "roomSeq", sequenceName = "room_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roomSeq")
    private long id;

    private int floor;

    private int roomCode;

    private long equipmentId;

    private boolean active;





    public long getId() {
        return id;
    }

    public Room setId(long id) {
        this.id = id;
        return this;
    }

    public int getFloor() {
        return floor;
    }

    public Room setFloor(int floor) {
        this.floor = floor;
        return this;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public Room setRoomCode(int roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    public long getEquipmentId() {
        return equipmentId;
    }

    public Room setEquipmentId(long equipmentId) {
        this.equipmentId = equipmentId;
        return this;
    }

    public Room() {
    }

    public Room(int floor, int roomCode, long equipmentId) {
        this.floor = floor;
        this.roomCode = roomCode;
        this.equipmentId = equipmentId;
    }

    public Room(long id, int floor, int roomCode, long equipmentId) {
        this.id = id;
        this.floor = floor;
        this.roomCode = roomCode;
        this.equipmentId = equipmentId;
    }

    public boolean isActive() {
        return active;
    }

    public Room setActive(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
