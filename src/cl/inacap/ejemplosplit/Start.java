package cl.inacap.ejemplosplit;

public class Start {

	public static void main(String[] args) {
		String textoUnido = "daniel@ejemplo.local";
		String[] textoSeparado = textoUnido.split("@"); //El método "split()", separa el string en un Array basandose en el parámetro entregado.
		
		for (int i = 0; i < textoSeparado.length; i++) {
			System.out.println(textoSeparado[i]);
		}
	}

}
