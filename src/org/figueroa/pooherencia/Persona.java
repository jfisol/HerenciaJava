package org.figueroa.pooherencia;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;


    public Persona(){
            System.out.println("Perosna: inicializa el constructor Persona");

    }
    public Persona(String nombre, String Apellido){
        this.nombre = nombre;
        this.apellido = Apellido;
    }

    public Persona(String nombre, String Apellido, int edad){
        this.nombre = nombre;
        this.apellido = Apellido;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Sobreescritura de Metodos de Herencia

    public String Saludar(){
       return "Hola que tal!";
    }
}
