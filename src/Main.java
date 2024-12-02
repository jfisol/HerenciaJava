import org.figueroa.pooherencia.*;

public class Main {
    public static void main(String[] args) {

        Persona alumno = new Alumno(); //casteo
        alumno.setNombre("Bruno");
        alumno.setApellido("Diaz");
        ((Alumno)alumno).setInstitucion("IRLAND"); //casteo para usar el metodo setInstitucion

        Profesor profe = new Profesor();
        profe.setApellido("Rambo");
        profe.setAsignatura("Matematica");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Cotlin");
        alumnoInt.setPais("Albania");
        alumnoInt.setEdad(24);
        alumnoInt.setInstitucion("Las islas");
        alumnoInt.setNotaIdiomas(10);
        alumnoInt.setNotaMatematica(10);


        System.out.println("Alumno "+alumno.getNombre() + " "+ alumno.getApellido()+ "  " + ((Alumno)alumno).getInstitucion());

        System.out.println(profe.getApellido() + " "+ profe.getAsignatura());

        //ver gerarquias de clase
        Class Clase = alumnoInt.getClass();
        while (Clase.getSuperclass() != null){
            String hija = Clase.getName();
            String padre = Clase.getSuperclass().getName();

            System.out.println(hija + "Clase hija de la clase padre " + padre);

            Clase = Clase.getSuperclass();

        }


    }
}