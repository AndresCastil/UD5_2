import javax.swing.JOptionPane;

public class Ej4App {
	public static void main(String[] args) {
		
		final double PI=3.14;
			 
		
	    String radio=JOptionPane.showInputDialog("Calcula el área de un círculo. Introduce el radio");
		double r=Double.parseDouble(radio);
		
		double area=PI*Math.pow(r,2);
				
		System.out.println("El área del círculo es: "+area);

	}
		
}
