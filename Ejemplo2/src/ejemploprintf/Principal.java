package ejemploprintf;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean mayoria=true;
		int edad=21;
		String apellido="Ayllon";
		float precio=2.50f;
		char letraDni='a';
		
		System.out.printf("Me apellido: %S \nTengo %d \n"
				+ "producto vale: %.1f"
				+ " euros", apellido, edad, precio );

	}

}
