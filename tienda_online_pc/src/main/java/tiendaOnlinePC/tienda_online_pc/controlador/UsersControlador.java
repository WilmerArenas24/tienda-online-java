package tiendaOnlinePC.tienda_online_pc.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tiendaOnlinePC.tienda_online_pc.modelo.Users;
import tiendaOnlinePC.tienda_online_pc.servicio.IUsersServicio;
import tiendaOnlinePC.tienda_online_pc.servicio.UsersServicio;

import java.util.List;

@RestController
@RequestMapping("top-app")
//IP de donde se recibira las peticiones
@CrossOrigin("http://localhost:3000")
public class UsersControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(UsersControlador.class);

    @Autowired
    private IUsersServicio usersServicio;

    // Obtener todo los usuarios
    @GetMapping("/users")
    public List<Users> obtenerUsers(){
        var users = usersServicio.listarUsers();
        //Imprimir informacion
        users.forEach((users1 -> logger.info(users1.toString())));
        return users;
    }

}
