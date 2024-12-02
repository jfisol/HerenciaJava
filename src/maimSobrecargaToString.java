import org.figueroa.pooherencia.Alumno;
import org.figueroa.pooherencia.AlumnoInternacional;
import org.figueroa.pooherencia.Persona;
import org.figueroa.pooherencia.Profesor;

public class maimSobrecargaToString {
    public static void main(String[] args) {


        Persona alumno = new Alumno("Bruno","Diaz",18, "IRLAND",10,10,10); //casteo

        Profesor profe = new Profesor();
        profe.setNombre("Aristides");
        profe.setApellido("Rambo");
        profe.setAsignatura("Matematica");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Cotlin",18,"LAS AMERICAS",10,9,8,"USA",10);
        alumnoInt.setInstitucion("Las islas");
        alumnoInt.setNotaIdiomas(10);
        alumnoInt.setNotaMatematica(10);


       // System.out.println("Alumno "+alumno.getNombre() + " "+ alumno.getApellido()+ "  " + ((Alumno)alumno).getInstitucion());

        System.out.println(profe.getApellido() + " "+ profe.getAsignatura());

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profe);




    }


public static void imprimir(Persona persona){
   System.out.println(persona);


}

}