package cl.inacap.ejemplosplit;

public class Start {

	public static void main(String[] args) {
		String textoUnido = "daniel@ejemplo.local";
		String[] textoSeparado = textoUnido.split("@"); //El m�todo "split()", separa el string en un Array basandose en el par�metro entregado.
		
		for (int i = 0; i < textoSeparado.length; i++) {
			System.out.println(textoSeparado[i]);
		}
	}

}
