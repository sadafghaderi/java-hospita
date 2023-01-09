package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.User;

import java.util.List;

public class UserBL {
    public static User add(User user) throws Exception {
        try(CRUD<User> usersDA = new CRUD<>()){
            return usersDA.add(user);
        }
    }

    public static User edit(User user) throws Exception {
        try(CRUD<User> usersDA = new CRUD<>()){
            return usersDA.edit(user);
        }
    }

    public static User remove(Class<User> usersClass, long id) throws Exception {
        try(CRUD<User> usersDA = new CRUD<>()){
            return usersDA.remove(usersClass, id);
        }
    }

    public static User findById(Class<User> usersClass, long id) throws Exception {
        try(CRUD<User> usersDA = new CRUD<>()){
            return usersDA.findById(usersClass, id);
        }
    }

    public static List<User> findAll() throws Exception {
        try(CRUD<User> usersDA = new CRUD<>()){
            return usersDA.findAll("userEntity");
        }
    }
}
