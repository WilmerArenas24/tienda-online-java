package tiendaOnlinePC.tienda_online_pc.servicio;

import tiendaOnlinePC.tienda_online_pc.modelo.Users;

import java.util.List;

public interface IUsersServicio{
    public List<Users> listarUsers();

    public Users buscarUsersId(Integer user_id);

    public Users guardarUsers(Users users);

    public void eliminarUsers(Users users);

}
