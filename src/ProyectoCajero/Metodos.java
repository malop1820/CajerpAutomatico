package ProyectoCajero;

import java.util.List;




public interface Metodos {
	public boolean guardar(Cliente clientes);
	
	public List<Cliente>listas();
	
	public Cliente buscar(int indice);
	
	public void editar(int indice, Cliente cleintes);
}
