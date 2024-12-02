package org.figueroa.pooherencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){

    }

    public AlumnoInternacional(String pais, double notaIdiomas) {
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String nombre, String Apellido, String pais, double notaIdiomas) {
        super(nombre, Apellido);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String nombre, String Apellido, int edad, String institucion, String pais, double notaIdiomas) {
        super(nombre, Apellido, edad, institucion);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String nombre, String Apellido, int edad, String institucion, double notaMatematica, double notaCastellano, double notaHistoria, String pais, double notaIdiomas) {
        super(nombre, Apellido, edad, institucion, notaMatematica, notaCastellano, notaHistoria);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String Saludar() {
        return super.Saludar()+ "Soy "+getNombre()+ "mi nacionalidad es: " + getPais();
    }

    @Override
    public double promedioNotas() {
        //System.out.println("Calcular Promedio: " + AlumnoInternacional.class.getCanonicalName());
        return ((super.promedioNotas()*3) +notaIdiomas)/4 ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas ;/*+
                ", promedio =" + this.promedioNotas();*/
    }
}
