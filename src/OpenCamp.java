
public class OpenCamp {
	public static void main(String[] args) {
		
		Auto miAuto = new Auto();
		miAuto.añadirPuerta();
		miAuto.añadirPuerta();
		miAuto.añadirPuerta();
		
		System.out.println(miAuto.puertas);
		
		
		suma(30, 40, 10);
		
	}
	
	public static void suma(int a, int b, int c) {
		int resultado;
		resultado = a + b + c;
		
		System.out.println(resultado);
	}
	
}

class Auto {
	public int puertas = 0;
	
	
	public void añadirPuerta() {
		this.puertas++;
	}
}