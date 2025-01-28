package tiendaOnlinePC.tienda_online_pc.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiendaOnlinePC.tienda_online_pc.modelo.Users;
import tiendaOnlinePC.tienda_online_pc.repositorio.UserRepositorio;

import java.util.List;

//Para que spring reconozca los metodos
@Service
public class UsersServicio implements IUsersServicio{
    //Autoinyectabndo la capa de repositorio
    @Autowired
    private UserRepositorio userRepositorio;

    @Override
    public List<Users> listarUsers() {
        return userRepositorio.findAll();
    }

    @Override
    public Users buscarUsersId(Integer user_id) {
        Users users = userRepositorio.findById(user_id).orElse(null);
        return users;
    }

    @Override
    public Users guardarUsers(Users users) {
        return userRepositorio.save(users);
    }

    @Override
    public void eliminarUsers(Users users) {

        userRepositorio.delete(users);

    }
}
