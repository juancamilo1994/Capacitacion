package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.models;

public class BusquedaData {
	
	//se obtiene el nombre del producto buscado (televisor, nevera playstation etc)
	
	public String nombreDelProducto;
	
	//se crea el constructor para darle el valor a la variable previamente creada 
	public BusquedaData(String nombreDelProducto) {
		
		this.nombreDelProducto = nombreDelProducto;
	}
	
	//se retorna el nombre del producto
	public String getNombreDelProducto() {
		
		return nombreDelProducto;
	}

}
