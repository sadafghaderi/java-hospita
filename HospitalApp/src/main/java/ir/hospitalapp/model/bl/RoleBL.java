package ir.hospitalapp.model.bl;

import ir.hospitalapp.model.da.CRUD;
import ir.hospitalapp.model.entity.Role;

import java.util.List;

public class RoleBL {
    public static Role add(Role role) throws Exception {
        try(CRUD<Role> roleDA = new CRUD<>()){
            return roleDA.add(role);
        }
    }

    public static Role edit(Role role) throws Exception {
        try(CRUD<Role> roleDA = new CRUD<>()){
            return roleDA.edit(role);
        }
    }

    public static Role remove(Class<Role> roleClass, long id) throws Exception {
        try(CRUD<Role> roleDA = new CRUD<>()){
            return roleDA.remove(roleClass, id);
        }
    }

    public static Role findById(Class<Role> roleClass, long id) throws Exception {
        try(CRUD<Role> roleDA = new CRUD<>()){
            return roleDA.findById(roleClass, id);
        }
    }

    public static List<Role> findAll() throws Exception {
        try(CRUD<Role> roleDA = new CRUD<>()){
            return roleDA.findAll("roleEntity");
        }
    }
}
