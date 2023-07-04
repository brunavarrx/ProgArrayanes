package Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int opcion = 0;
			do {
			    System.out.println("1-Crear persona\n0-Salir");
			    opcion = input.nextInt();

			    switch (opcion) {
			        case 1:
			            System.out.println("Ingrese su nombre");
			            String nombre = input.next();
			            System.out.println("Ingrese su apellido");
			            String apellido = input.next();
			            System.out.println("Ingrese su edad");
			            int edad = input.nextInt();
			            System.out.println("Ingrese su sexo");
			            String sexo = input.next();

					// Clasificar persona
			            int op = 0;
			            do {
			                System.out.println("Ud es:\n1-Docente\n2-Auxiliar\n3-Alumno\n0-Volver atrás para crear una nueva Persona");
			                op = input.nextInt();

			                switch (op) {
			                    case 1:
			                        System.out.println("Cuantas horas al mes trabaja?");
			                        float hora_mensual = input.nextFloat();
			                        System.out.println("Cuánto vale una hora de trabajo?");
			                        float valor_hora = input.nextFloat();
			                        System.out.println("Qué materia se encarga de dar?");
			                        String materia = input.next();

			                        Docente docente1 = new Docente(nombre, apellido, edad, sexo);
			                        docente1.setAtributosD(valor_hora, hora_mensual, materia);
			                        docente1.mostrarDatosD();
			                        break;
			                    case 2:
			                        System.out.println("Ingrese su sueldo");
			                        int sueldo = input.nextInt();
			                        System.out.println("Ingrese sus horas de trabajo al día");
			                        int hora_trabajo = input.nextInt();

			                        Auxiliar auxiliar1 = new Auxiliar(nombre, apellido, edad, sexo);
			                        auxiliar1.setAtributosA(sueldo, hora_trabajo);
			                        auxiliar1.mostrarDatosAu();
			                        break;
			                    case 3:
			                        System.out.println("Cuantas materias cursa?");
			                        int cantidad_materias = input.nextInt();
			                        int[] calificacion = new int[cantidad_materias];
			                        for (int i = 0; i < cantidad_materias; i++) {
			                            System.out.print("Ingrese la calificación de la materia " + (i + 1) + ": ");
			                            calificacion[i] = input.nextInt();
			                        }

			                        Alumno alumno1 = new Alumno(nombre, apellido, edad, sexo);
			                        alumno1.setAtributosAl(cantidad_materias, calificacion);
			                        alumno1.mostrarDatosAl();
			                        break;
			                    case 0:
			                        System.out.println("Retornando...");
			                        break;
			                    default:
			                        System.out.println("Opcion incorrecta, por favor ingrese una opcion valida");
			                }
			            } while (op != 0);
			            break;
			        case 0:
			            System.out.println("Saliendo...");
			            break;
			        default:
			            System.out.println("Opcion incorrecta, por favor ingrese una opcion valida");
			    }
			} while (opcion != 0);
		}
    }
}
