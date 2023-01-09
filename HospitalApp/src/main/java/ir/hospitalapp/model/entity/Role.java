package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;

@Entity(name = "roleEntity")
@Table(name = "role_table")

public class Role {
    @Id
    @SequenceGenerator(name = "roleSeq", sequenceName = "role_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roleSeq")
    private long id;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String name;

    @Column(columnDefinition = "NVARCHAR2(100)")
    private String description;





    public long getId() {
        return id;
    }

    public Role setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }

    public Role() {
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
