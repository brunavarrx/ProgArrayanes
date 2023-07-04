package Persona;

public class Auxiliar extends Persona {

	//Atributos especificos 
	private int sueldo;
	private int hora_trabajo;
	
	//Metodos 
	
	//Metodo Constructor
	public Auxiliar(String nombre, String apellido, int edad, String sexo) {
		super(sexo, sexo, edad, sexo);
	}
	 public void setAtributosA (int sueldo,int hora_trabajo) {
		 this.hora_trabajo=hora_trabajo;
		 this.sueldo=sueldo;
	 }

	
	public void mostrarDatosAu() {
		String nombre = null;
		System.out.println("Nombre: "+nombre);
		String apellido = null;
		System.out.println("Apellido: "+apellido);
		String edad = null;
		System.out.println("Edad: "+edad);
		String sexo = null;
		System.out.println("Sexo: "+sexo);
		System.out.println("Sueldo: "+getSueldo());
		System.out.println("Horas de trabjo al dia: "+getHora_trabajo()+"hs");
	}
	

	//Getters y Setters
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}



	public int getHora_trabajo() {
		return hora_trabajo;
	}



	public void setHora_trabajo(int hora_trabajo) {
		this.hora_trabajo = hora_trabajo;
	}
	
	
	
}
