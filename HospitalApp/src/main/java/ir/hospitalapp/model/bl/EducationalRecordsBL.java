package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.EducationalRecords;

import java.util.List;

public class EducationalRecordsBL {
    public EducationalRecords add(EducationalRecords educationalRecords) throws Exception {
        try(CRUD<EducationalRecords> educationalRecordsDA = new CRUD<>()){
            return educationalRecordsDA.add(educationalRecords);
        }
    }

    public static EducationalRecords edit(EducationalRecords educationalRecords) throws Exception {
        try(CRUD<EducationalRecords> educationalRecordsDA = new CRUD<>()){
            return educationalRecordsDA.edit(educationalRecords);
        }
    }

    public static EducationalRecords remove(Class<EducationalRecords> educationalRecordsClass, long id) throws Exception {
        try(CRUD<EducationalRecords> educationalRecordsDA = new CRUD<>()){
            return educationalRecordsDA.remove(educationalRecordsClass, id);
        }
    }

    public static EducationalRecords findById(Class<EducationalRecords> educationalRecordsClass, long id) throws Exception {
        try(CRUD<EducationalRecords> educationalRecordsDA = new CRUD<>()){
            return educationalRecordsDA.findById(educationalRecordsClass, id);
        }
    }

    public static List<EducationalRecords> findAll() throws Exception {
        try(CRUD<EducationalRecords> educationalRecordsDA = new CRUD<>()){
            return educationalRecordsDA.findAll("educationalRecordsEntity");
        }
    }
}
