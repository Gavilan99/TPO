package metodos;

import implementaciones.PilaTF;

public class TP1 {
	public void test() {
		PilaTF pila = new PilaTF(); 
		pila.InicializarPila();
		pila.Apilar(1);
		System.out.println(pila.Tope());
		pila.Desapilar();
	}
}

