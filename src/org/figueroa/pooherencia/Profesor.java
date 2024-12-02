package org.figueroa.pooherencia;

public class Profesor extends Persona{

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor(){
        System.out.println("Profesor: inicializa el constructor Profesor");
    }


    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String Saludar() {
        return super.Saludar() + "Soy el Profesor "+this.getNombre()+" y mi asignatura es "+getAsignatura();
    }
}
