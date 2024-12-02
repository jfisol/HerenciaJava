package org.figueroa.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializa el constructor Alumno");

    }

    public Alumno(String nombre, String Apellido ){
        super(nombre, Apellido);
    }
    public Alumno(String nombre, String Apellido, int edad, String institucion){
        super(nombre, Apellido, edad);
        this.institucion = institucion;
    }
    public Alumno(String nombre, String Apellido, int edad, String institucion, double notaMatematica, double notaCastellano, double notaHistoria) {
        super(nombre, Apellido, edad);
        this.institucion = institucion;
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String Saludar(){
        return super.Saludar()+" soy un alumno y mi nombre es: " + this.getNombre();
    }

    public double promedioNotas(){
        System.out.println("Calcular Promedio: " + Alumno.class.getCanonicalName());
        return (notaHistoria + notaCastellano + notaMatematica)/3;
    }


    @Override
    public String toString() {
        return super.toString() +
                "institucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio: " + this.promedioNotas();
    }
}
