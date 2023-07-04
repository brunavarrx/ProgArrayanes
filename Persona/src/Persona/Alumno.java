package Persona;

public class Alumno extends Persona {
	
	// Atributos específicos 
	private int cantidad_materias;
	private int[] calificacion;

	// Método constructor
	public Alumno(String nombre, String apellido, int edad, String sexo) {
		super(nombre, apellido, edad, sexo);
	}

	// Setter para los atributos específicos
	public void setAtributosAl(int cantidad_materias, int[] calificacion) {
		this.cantidad_materias = cantidad_materias;
		this.calificacion = calificacion;
	}

	// Método para mostrar los datos del alumno
	public void mostrarDatosAl() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + sexo);
		System.out.println("Promedio: " + div_promedio(calificacion));
	}

	// Método para calcular la suma de las calificaciones
	public static int suma_promedio(int[] calificacion) {
		int suma = 0;
		for (int i = 0; i < calificacion.length; i++) {
			suma += calificacion[i];
		}
		return suma;
	}

	// Método para calcular el promedio de las calificaciones
	public static int div_promedio(int[] calificacion) {
		int suma = suma_promedio(calificacion);
		int promedio = suma / calificacion.length;
		return promedio;
	}

	// Getters y Setters
	public int getCantidad_materias() {
		return cantidad_materias;
	}

	public void setCantidad_materias(int cantidad_materias) {
		this.cantidad_materias = cantidad_materias;
	}

	public int[] getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int[] calificacion) {
		this.calificacion = calificacion;
	}
}
