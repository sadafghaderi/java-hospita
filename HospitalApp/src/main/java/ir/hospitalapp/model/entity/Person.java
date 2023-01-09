    package ir.hospitalapp.model.entity;

    import com.google.gson.Gson;

    import javax.persistence.Column;
    import javax.persistence.EnumType;
    import javax.persistence.Enumerated;
    import javax.persistence.MappedSuperclass;
    import java.time.LocalDate;

@MappedSuperclass
public class Person {
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String name;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String family;

    @Column(columnDefinition = "NVARCHAR2(10)")
    private String nationalCode;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String fatherName;

    private LocalDate birthDate;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String birthPlace;

    @Column(columnDefinition = "NVARCHAR2(11)")
    private String tel;

    @Column(columnDefinition = "NVARCHAR2(100)")
    private String address;

    private long roleId;

    @Column(columnDefinition = "NVARCHAR2(50)")
    private String photo;

    @Column(columnDefinition = "NVARCHAR2(100)")
    private String description;

    private Boolean active;

    public Person() {
    }

    public Person(Gender gender, String name, String family, String nationalCode, String fatherName, LocalDate birthDate, String birthPlace, String tel, String address, long roleId, String photo, String description, Boolean active) {
        this.gender = gender;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.tel = tel;
        this.address = address;
        this.roleId = roleId;
        this.photo = photo;
        this.description = description;
        this.active = active;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Person setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Person setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Person setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public Person setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getRoleId() {
        return roleId;
    }

    public Person setRoleId(long roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Person setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Person setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public Person setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
