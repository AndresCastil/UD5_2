import javax.swing.JOptionPane;

public class Ej10App {
	public static void main(String[] args) {
		
		
		String texto=JOptionPane.showInputDialog("Introduce número de ventas");
		
		int nVentas=Integer.parseInt(texto);
		
		double sumVentas=0;
		for (int i=0; i<nVentas; i++) {
		     texto = JOptionPane.showInputDialog("Introduce precio de venta");
			double venta=Double.parseDouble(texto);
			
			sumVentas=sumVentas+venta;
		}	
			System.out.println(sumVentas);
			
		
	}

}
