package ejemploCrud;

public class Producto {
	
	private String codigo;
	private String nombre;
	private double precioUnitario;
	private boolean activo;
	
	//mostrar todos los productos de la lista
	public void imprimirTodosLosProductos() {
		for(int i=0;i<lista.length;i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//mostar solo los productos cuyo atributo activo es true, es decir, estan a la venta
	
	public void imprimirSoloActivos() {
		for(int i=0; i<lista.length && lista[i]!=null;i++) {
			if(lista[i].isActivo()) {
				System.out.println((i+1)+ "."+lista[i]);
			}
		}
	}

	public int getPrecioUnitario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	}


