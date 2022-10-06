import javax.swing.JOptionPane;

public class Ej5App {
	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un número");
		int num=Integer.parseInt(numero);
		
		if (num %2==0) {
			System.out.println("Sí es divisible entre 2");
		}	else {
				  System.out.println("No es divisible entre 2");
		}
	}

}
