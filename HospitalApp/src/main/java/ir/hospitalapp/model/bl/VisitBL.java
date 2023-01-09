package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Visit;

import java.util.List;

public class VisitBL {
    public static Visit add(Visit visit) throws Exception {
        try(CRUD<Visit> visitDA = new CRUD<>()){
            return visitDA.add(visit);
        }
    }

    public static Visit edit(Visit visit) throws Exception {
        try(CRUD<Visit> visitDA = new CRUD<>()){
            return visitDA.edit(visit);
        }
    }

    public static Visit remove(Class<Visit> visitClass, long id) throws Exception {
        try(CRUD<Visit> visitDA = new CRUD<>()){
            return visitDA.remove(visitClass, id);
        }
    }

    public static Visit findById(Class<Visit> visitClass, long id) throws Exception {
        try(CRUD<Visit> visitDA = new CRUD<>()){
            return visitDA.findById(visitClass, id);
        }
    }

    public static List<Visit> findAll() throws Exception {
        try(CRUD<Visit> visitDA = new CRUD<>()){
            return visitDA.findAll("visitEntity");
        }
    }
}
