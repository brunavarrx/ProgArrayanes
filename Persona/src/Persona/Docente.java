package Persona;

public class Docente extends Persona {

    // Atributos específicos
    private float hora_mensual;
    private float valor_hora;
    private String materia;

    // Método constructor
    public Docente(String nombre, String apellido, int edad, String sexo) {
        super(nombre, apellido, edad, sexo);
    }

    public void setAtributosD(float valor_hora, float hora_mensual, String materia) {
        this.valor_hora = valor_hora;
        this.hora_mensual = hora_mensual;
        this.materia = materia;
    }

    public void mostrarDatosD() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Materia dada: " + getMateria());
        System.out.println("Sueldo: " + sueldo());
    }

    // Calcular sueldo
    public float sueldo() {
        float sueldo = hora_mensual * valor_hora;
        return sueldo;
    }

    // Getters y Setters
    public float getHora_mensual() {
        return hora_mensual;
    }

    public void setHora_mensual(float hora_mensual) {
        this.hora_mensual = hora_mensual;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
