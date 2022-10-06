import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		
		String contraseña="ladesiempre";
		
		//Tiene hasta 3 intentos
		String clave="";
		for (int i=0; i<3; i++) {
			clave=JOptionPane.showInputDialog("Introduce una contraseña");
			
			if (clave.equals(contraseña)) {
				System.out.println("Enhorabuena");
			}
		}
		
	}

}
