import org.figueroa.pooherencia.Alumno;
import org.figueroa.pooherencia.AlumnoInternacional;
import org.figueroa.pooherencia.Persona;
import org.figueroa.pooherencia.Profesor;

public class mainConstructores {
    public static void main(String[] args) {


        Persona alumno = new Alumno("Bruno","Diaz",18, "IRLAND",10,10,10); //casteo

        Profesor profe = new Profesor();
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
   System.out.println("Imprimiendo datos tipo Profesor");
    System.out.println(" Nombre: "
            +persona.getNombre() + " Apellido "
            + persona.getApellido()+ "  gmail "
            + persona.getEmail());
    if (persona instanceof Alumno){
        System.out.println("Imprimiendo datos tipo Alumno");
        System.out.println("Institucion" + ((Alumno) persona).getInstitucion()
        + "Nota Matematica: "+ ((Alumno) persona).getNotaMatematica());
        System.out.println("===================SOBRE ESCRITURA PROMEDIO Alumno=======================================");
        System.out.println(((Alumno)persona).promedioNotas());
        System.out.println("==========================================================");
    }
 if(persona instanceof AlumnoInternacional){
     System.out.println("===================SOBRE ESCRITURA PROMEDIO ALUMNO iNTERNACIONAL=======================================");
     System.out.println(((AlumnoInternacional)persona).promedioNotas());
     System.out.println("==========================================================");
 }

}

}