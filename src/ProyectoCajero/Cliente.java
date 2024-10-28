package ProyectoCajero;

import java.time.LocalDate;

public class Cliente {
	private long numCuenta;
	private String nombres;
	private String apellidos;
	private LocalDate fechaAlta;
	private float saldo =0;
	
	
	
	public Cliente() {
		
	}



	public Cliente(long numCuenta, String nombres, String apellidos, LocalDate fechaAlta, float saldo) {
		this.numCuenta = numCuenta;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		return "Cliente [numCuenta=" + numCuenta + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaAlta="
				+ fechaAlta + ", saldo=" + saldo + "]\n";
	}



	public long getNumCuenta() {
		return numCuenta;
	}



	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public LocalDate getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	

}