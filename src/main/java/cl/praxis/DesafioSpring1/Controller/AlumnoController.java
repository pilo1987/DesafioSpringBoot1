package cl.praxis.DesafioSpring1.Controller;

import cl.praxis.DesafioSpring1.Model.Alumno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// RestController: para gestionar operaciones relacionadas con alumnos.
// Este controlador expone un endpoint que permite obtener información de un alumno.
// Este método crea una instancia con datos predefinidos
// y devuelve la información del alumno en formato JSON.
@RestController
@RequestMapping("/")
public class AlumnoController {

    @GetMapping("/alumno")
    public Alumno getAlumno() {

        //Crea una instancia de Alumno con datos predefinidos.
        Alumno alumno = new Alumno("AlumnoNombre", "AlumnoApellido", 20);

        // Imprime los detalles del alumno en la consola
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Apellido: " + alumno.getApellido());
        System.out.println("Edad: " + alumno.getEdad());

        // Devuelve el objeto Alumno en formato JSON.
        return alumno;
    }

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return " Hola, Pablo Pérez !";

    }
}
