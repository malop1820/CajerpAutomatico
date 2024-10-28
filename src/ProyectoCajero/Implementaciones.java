package ProyectoCajero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementaciones implements Metodos {
	Scanner lectura = null;
	public List<Cliente> listaReg = new ArrayList<Cliente>();

	@Override
	// validar si existe el nuemero de serie
	public boolean guardar(Cliente clientes) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		// cilclo
		// condicional
		for (Cliente e : listaReg) {
			// validar si existe el numeroSerie
			if (e.getNumCuenta() == clientes.getNumCuenta()) {
				bandera = true;
			}
		}
		if (bandera == false)
			listaReg.add(clientes);
		return bandera;

	}

	@Override
	public List<Cliente> listas() {
		// TODO Auto-generated method stub
		return listaReg;
	}

	@Override
	public Cliente buscar(int indice) {
		// TODO Auto-generated method stub
		return listaReg.get(indice);
	}

	@Override
	public void editar(int indice, Cliente cleintes) {
		// TODO Auto-generated method stub
		listaReg.set(indice, cleintes);
	}

	public void bucarNumeroseire(long numCuenta) {

		// Buscar el cliente por número de cuenta
		boolean encontrado = false;
		for (Cliente cliente : listaReg) {
			if (cliente.getNumCuenta() == numCuenta) {
				// Si se encuentra el cliente, imprimir mensaje personalizado
				System.out.println(cliente.getNombres() + " " + cliente.getApellidos() + ", tu saldo es de $ "
						+ cliente.getSaldo());
				encontrado = true;
				break; // Salir del ciclo si se encuentra el cliente
			}
		}

		// Si no se encuentra ningún cliente con ese número de cuenta
		if (!encontrado) {
			System.out.println("Cliente no encontrado con ese número de cuenta.");
		}
	}

	public void ingresarDinero(long numCuenta, float cantidad) {

		// Buscar el cliente por número de cuenta
		boolean encontrado = false;
		for (Cliente cliente : listaReg) {

			if (cliente.getNumCuenta() == numCuenta) {
				System.out.println("cliente encontrado");
				encontrado = true;
				System.out.println(
						"Ingresa la cantidad que deseas agregar al saldo (debe ser mayor a 0 y menor a 10,000):");
				lectura = new Scanner(System.in);
				cantidad = lectura.nextFloat();
				if (cantidad > 0 && cantidad < 10000) {
					// Agregar la cantidad al saldo del cliente
					cliente.setSaldo(cliente.getSaldo() + cantidad);
					System.out.println("Saldo actualizado. " + cliente.getNombres() + ", tu nuevo saldo es de $"
							+ cliente.getSaldo());

				} else {
					System.out.println("La cantidad ingresada no es válida. Debe ser mayor a 0 y menor a 10,000.");
					break;
				}
			}

		}

		// Si no se encuentra ningún cliente con ese número de cuenta
		if (!encontrado) {
			System.out.println("Cliente no encontrado con ese número de cuenta.");
		}

	}
	
	public void retiratDinero(long numCuenta, float cantidadR) {

		// Buscar el cliente por número de cuenta
		boolean encontrado = false;
		for (Cliente cliente : listaReg) {

			if (cliente.getNumCuenta() == numCuenta) {
				System.out.println("cliente encontrado");
				encontrado = true;
				System.out.println("Ingresa la cantidad que deseas agregar al saldo (debe ser mayor a 0 y menor a 10,000):");
				lectura = new Scanner(System.in);
				cantidadR = lectura.nextFloat();
				if (cantidadR > 0 && cantidadR <= cliente.getSaldo()) {
                    // Retirar la cantidad del saldo del cliente si tiene suficiente saldo
                    cliente.setSaldo(cliente.getSaldo() - cantidadR);
                    System.out.println("Retiro exitoso. " + cliente.getNombres() + ", tu nuevo saldo es de $" + cliente.getSaldo());
                } else if (cantidadR > cliente.getSaldo()) {
                    // Si la cantidad a retirar es mayor que el saldo disponible
                    System.out.println("Saldo insuficiente. No puedes retirar más de lo que tienes en tu cuenta.");
                } else {
                    System.out.println("La cantidad ingresada no es válida. Debe ser mayor a 0.");
                }
			}

		}

		// Si no se encuentra ningún cliente con ese número de cuenta
		if (!encontrado) {
			System.out.println("Cliente no encontrado con ese número de cuenta.");
		}

	}

}
