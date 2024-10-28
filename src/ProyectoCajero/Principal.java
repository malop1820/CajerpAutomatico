package ProyectoCajero;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		System.out.println("se feliz");

		Scanner lectura = null;
		long numCuenta;
		String nombres = null;
		String apellidos = null;
		LocalDate fechaAlta;
		float saldo=0;

		Cliente cliente = null;
		int menuPrin, subMenu, indice;
		Implementaciones imp = new Implementaciones();

		do {
			System.out.println("MENU BANCOMER BIENVENIDO");
			System.out.println("1------Alata Cliente");
			System.out.println("2------ Conslutar saldo");
			System.out.println("3------Deposito efectivo");
			System.out.println("4------ Retrio efectivo");
			System.out.println("5------Salir");
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch (menuPrin) {
			case 1:
				
				try {
					System.out.println("ingresa el numero de cuenta");
					lectura= new Scanner(System.in);
					numCuenta=lectura.nextLong();
					
					System.out.println("ingrese los nombre");
					lectura= new Scanner(System.in);
					nombres=lectura.nextLine();
					
					System.out.println("ingrese los apellidos");
					lectura= new Scanner(System.in);
					apellidos=lectura.nextLine();
					
					System.out.println("ingrese la fecha de registro(Ejemplo:2024-10-17)");
					lectura= new Scanner(System.in);
					String fechaIngresada=lectura.nextLine();
					fechaAlta= LocalDate.parse(fechaIngresada);// polimorfismo----- puro ----casteo
					cliente= new Cliente(numCuenta, nombres, apellidos, fechaAlta, saldo=0);
					
					
					
					
					if(imp.guardar(cliente)==false)
						System.out.println("se guardo el registro correcramente");
					else		
						System.out.println("este registro ya existe");
					
				} catch (Exception e) {
					System.out.println("error en el registro");
				}
				
				break;
			case 2:
				try {
					System.out.println("\nIngresa el número de cuenta del cliente que deseas buscar:");
					lectura= new Scanner(System.in);
			        numCuenta = lectura.nextLong();
			        imp.bucarNumeroseire(numCuenta);
					
				} catch (Exception e) {
					System.out.println("error en la consulta");
				}
				
				
				break;
				
			case 3:
				
				try {
					System.out.println("\nIngresa el número de cuenta del cliente que desea ingresar dinero:");
					lectura= new Scanner(System.in);
			        numCuenta = lectura.nextLong();
					imp.ingresarDinero(numCuenta, saldo);
					
				} catch (Exception e) {
					System.out.println("error en el deposito");
				}
				
				
				
			
				break;
				
				

			case 4:
				
				try {
					System.out.println("\nIngresa el número de cuenta del cliente que desea retirar dinero:");
					lectura= new Scanner(System.in);
			        numCuenta = lectura.nextLong();
					imp.retiratDinero(numCuenta, saldo);
				} catch (Exception e) {
					System.out.println("error en el retiro");
				}
				
				
				
				break;
				
			case 5:
				
				break;

			}
		} while (menuPrin < 5);
	}
}
