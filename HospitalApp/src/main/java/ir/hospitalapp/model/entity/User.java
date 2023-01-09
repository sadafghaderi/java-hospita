package ir.hospitalapp.model.entity;

import com.google.gson.Gson;
import javax.persistence.*;

@Entity(name = "userEntity")
@Table(name = "user_table")

public class User {
    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
    private long id;

    private long personId;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String userName;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String password;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String accessKey;





    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public long getPersonId() {
        return personId;
    }

    public User setPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public User setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public User() {
    }

    public User(long personId, String userName, String password, String accessKey) {
        this.personId = personId;
        this.userName = userName;
        this.password = password;
        this.accessKey = accessKey;
    }

    public User(long id, long personId, String userName, String password, String accessKey) {
        this.id = id;
        this.personId = personId;
        this.userName = userName;
        this.password = password;
        this.accessKey = accessKey;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
