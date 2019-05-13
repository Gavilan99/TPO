package apis;

public interface ColaPrioridadTDA {
	void inicializarCola();
	//siempre que la cola este inicializada
	void acolarPrioridad(int x,int prioridad);
	//siempre que la cola este inicializada y no este vacia
	void desacolar();
	//siempre que la cola este inicializada y no este vacia
	void primero();
	//siempre que la cola este inicializada
	boolean colaVacia();
	//siempre que la cola esté inicializada y no esté vacia
	int prioridad();
	

}
