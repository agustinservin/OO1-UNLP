package ejercicio3App;

public class Main {

	public static void main(String[] args) {
		String saludo = new String("hola");
		funcion(saludo);
	}
	public static void funcion(String s) {
		String hola = new String("hola");
		System.out.println(s.equals(hola));
		System.out.println(s == hola);
	}
}
