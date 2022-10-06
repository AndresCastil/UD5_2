import javax.swing.JOptionPane;
public class Ej11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia=JOptionPane.showInputDialog("Introduce un día de la semana");
		
		switch(dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es un día laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Es un día festivo");
		default:
			System.out.println("Introduce un día de la semana");
		}

	}

}
