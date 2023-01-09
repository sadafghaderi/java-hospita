package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;

@Entity(name = "equipmentEntity")
@Table(name = "equipment_table")

public class Equipment {
    @Id
    @SequenceGenerator(name = "equipmentSeq", sequenceName = "equipment_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipmentSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String equipment;

    @Column(columnDefinition = "NVARCHAR2(100)")
    private String description;





    public long getId() {
        return id;
    }

    public Equipment setId(long id) {
        this.id = id;
        return this;
    }

    public String getEquipment() {
        return equipment;
    }

    public Equipment setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Equipment setDescription(String description) {
        this.description = description;
        return this;
    }

    public Equipment() {
    }

    public Equipment(String equipment, String description) {
        this.equipment = equipment;
        this.description = description;
    }

    public Equipment(long id, String equipment, String description) {
        this.id = id;
        this.equipment = equipment;
        this.description = description;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
