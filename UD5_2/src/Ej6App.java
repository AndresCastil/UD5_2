import javax.swing.JOptionPane;

public class Ej6App {
	public static void main(String[] args) {
		
		String texto=JOptionPane.showInputDialog("Introduce precio del producto");
		double precio=Double.parseDouble(texto);
		
		//Cálculo del precio final del producto con IVA
		
		final double IVA = 0.21;
		
		double preciofinal =precio +(precio*IVA);
		
		System.out.println("Precio final con IVA: "+preciofinal);
		
	
	}

}
