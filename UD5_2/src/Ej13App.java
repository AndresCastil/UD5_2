import javax.swing.JOptionPane;
public class Ej13App {

	public static void main(String[] args) {
		
		int ope1=0;
		int ope2=0;
		int resultado=0; 
		
		String texto=JOptionPane.showInputDialog("Introduce operando 1");
				ope1=Integer.parseInt(texto);
				
		String texto1=JOptionPane.showInputDialog("Introduce operando 2");
		        ope2=Integer.parseInt(texto1);
				
		String operacion=JOptionPane.showInputDialog("Introduce signo aritmético");
		
		
		switch (operacion) {
		 	case "+":
		 	    resultado=ope1+ope2;
		 	    break;
		 	case "-":
		 		resultado=ope1-ope2;
		 		break;
		 	case "*":
		 		resultado=ope1*ope2;
		 		break;
		 	case "/":
		 		resultado=ope1/ope2;
		 		break;
		 	case "^":
		 		resultado=(int)Math.pow(ope1, ope2);
		 		break;
		 	case "%":
		 		resultado=ope1%ope2;
		 		break;
		 }
		 	System.out.println(resultado);
		 
		 }

	}


