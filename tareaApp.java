package Tarea05;

import javax.swing.JOptionPane;

public class tareaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		// ejercicio12();
		ejercicio13();
	}
	
	// Procedimiento para el ejercicio 1
	public static void ejercicio1() {
		int n1 = 55, n2 = 5;
		
		if (n1 > n2) {
			System.out.println("N1 es mas grande que N2");
		}
		else if (n1 < n2) {
			System.out.println("N2 es mas grande que N1");
		}
		else {
			System.out.println("Los dos numeros son iguales");
		}
	}
	
	// Procedimiento para el ejercicio 2
	public static void ejercicio2() {
		String nombre = "Adrian";
		
		System.out.println("Bienvenido " + nombre);
	}
	
	// Procedimiento para el ejercicio 3
	public static void ejercicio3() {
		String nombre = JOptionPane.showInputDialog("Como te llamas?");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}
	
	// Procedimiento para el ejercicio 4
	public static void ejercicio4() {
		double radio, area;
		String textoNum = JOptionPane.showInputDialog("Di el radio del circulo");
		
		radio = Double.parseDouble(textoNum);
		
		area = Math.PI * Math.pow(radio, 2);
		
		JOptionPane.showMessageDialog(null, "El área es = " + area);
	}
	
	// Procedimiento para el ejercicio 5
	public static void ejercicio5() {
		String textoNum =  JOptionPane.showInputDialog("Di un numero");
		int num = Integer.parseInt(textoNum);
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Es divisible entre 2");
		}
		else {
			JOptionPane.showMessageDialog(null, "No es divisible entre 2");
		}
	}
	
	// Procedimiento para el ejercicio 6
	public static void ejercicio6() {
		String textoNum =  JOptionPane.showInputDialog("Di el precio");
		double precio = Double.parseDouble(textoNum), pFinal;
		final double IVA = 0.21;
		
		pFinal = precio + (precio * IVA);
		
		JOptionPane.showMessageDialog(null, "El precio final es " + pFinal);
	}
	
	// Procedimiento para el ejercicio 7
	public static void ejercicio7() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}
	
	// Procedimiento para el ejercicio 8
	public static void ejercicio8() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	// Procedimiento para el ejercicio 9
	public static void ejercicio9() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	// Procedimiento para el ejercicio 10
	public static void ejercicio10() {
		String textoNum = JOptionPane.showInputDialog("Di el numero de ventas");
		int i, ventas = Integer.parseInt(textoNum);
		double pFinal = 0, precio;
		
		for (i = 0; i < ventas; i++) {
			textoNum = JOptionPane.showInputDialog("Di el precio");
			precio = Integer.parseInt(textoNum);
			pFinal += precio;
		}
		
		JOptionPane.showMessageDialog(null, "El precio final es " + pFinal);
	}
	
	// Procedimiento para el ejercicio 11
	public static void ejercicio11() {
		String texto = JOptionPane.showInputDialog("Di un dia de la semana").toLowerCase();
		boolean laboral = true; // Inicializo el boolean a true
		
		/* Solo tengo 2 case porque si no es ni sabado ni domingo va a ser laboral
		 * Asi que como tengo iniziado el boolean laboral a true solo necesito cambiarlo si es falso
		 */
		switch (texto) {
			case ("sabado"):
				laboral = false;
				break;
			case ("domingo"):
				laboral = false;
				break;
		}
		
		// Utilitzo esta sentencia para no tener que poner 7 JOptionPane
		if (laboral) {
			JOptionPane.showMessageDialog(null, "Es un dia laboral");
		}
		else {
			JOptionPane.showMessageDialog(null, "No es un dia laboral");
		}
	}
	
	// Procedimiento para el ejercicio 12
	public static void ejercicio12() {
		String password = "P@ssw0Rd", prueva;
		int intentos;
		boolean flag = false;
		
		for (intentos = 3; intentos != 0 && !flag; intentos--) {
			prueva = JOptionPane.showInputDialog("Pon la contraeña");
			if (prueva.equals(password)) {
				flag = true;
			}
		}
		
		if (intentos == 0) {
			JOptionPane.showMessageDialog(null, "Cuenta bloqueada");
	}
		else {
		JOptionPane.showMessageDialog(null, "Enhorabuena");
		}
	}
	
	// Procedimiento para el ejercicio 13
	public static void ejercicio13() {
		String texto = JOptionPane.showInputDialog("Di el primer num");
		int num1 = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el segundo num");
		int num2 = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el signo aritmético");
		double resultado = 0;
		
		switch (texto) {
			case ("+"):
				resultado = num1 + num2;
				break;
			case ("-"):
				resultado = num1 - num2;
				break;
			case ("*"):
				resultado = num1 * num2;
				break;
			case ("/"):
				resultado = num1 / num2;
				break;
			case ("^"):
				resultado = Math.pow(num1, num2);
				break;
			case ("%"):
				resultado = num1 % num2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Signo aritmetico arroneo");
		}
		JOptionPane.showMessageDialog(null, "Resultado " + resultado);
	}
}
