package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Timing;

import java.util.List;

public class TimingBL {
    public static Timing add(Timing timing) throws Exception {
        try(CRUD<Timing> timingDA = new CRUD<>()){
            return timingDA.add(timing);
        }
    }

    public static Timing edit(Timing timing) throws Exception {
        try(CRUD<Timing> timingDA = new CRUD<>()){
            return timingDA.edit(timing);
        }
    }

    public static Timing remove(Class<Timing> timingClass, long id) throws Exception {
        try(CRUD<Timing> timingDA = new CRUD<>()){
            return timingDA.remove(timingClass, id);
        }
    }

    public static Timing findById(Class<Timing> timingClass, long id) throws Exception {
        try(CRUD<Timing> timingDA = new CRUD<>()){
            return timingDA.findById(timingClass, id);
        }
    }

    public static List<Timing> findAll() throws Exception {
        try(CRUD<Timing> timingDA = new CRUD<>()){
            return timingDA.findAll("timingEntity");
        }
    }
}
