package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Resume;

import java.util.List;

public class ResumeBL {
    public static Resume add(Resume resume) throws Exception {
        try(CRUD<Resume> resumeDA = new CRUD<>()){
            return resumeDA.add(resume);
        }
    }

    public static Resume edit(Resume resume) throws Exception {
        try(CRUD<Resume> resumeDA = new CRUD<>()){
            return resumeDA.edit(resume);
        }
    }

    public static Resume remove(Class<Resume> resumeClass, long id) throws Exception {
        try(CRUD<Resume> resumeDA = new CRUD<>()){
            return resumeDA.remove(resumeClass, id);
        }
    }

    public static Resume findById(Class<Resume> resumeClass, long id) throws Exception {
        try(CRUD<Resume> resumeDA = new CRUD<>()){
            return resumeDA.findById(resumeClass, id);
        }
    }

    public static List<Resume> findAll() throws Exception {
        try(CRUD<Resume> resumeDA = new CRUD<>()){
            return resumeDA.findAll("resumeEntity");
        }
    }
}
