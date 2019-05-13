package implementaciones;

import apis.ColaTDA;

public class ColaCD implements ColaTDA{
	
	Nodo ultimo;
	Nodo primero;
		
	@Override
	public void InicializarCola() {
		primero=ultimo=null;
		
	}

	@Override
	public void Acolar(int x) {
		Nodo nuevo=new Nodo();
		nuevo.info=x;
		nuevo.sig=null;
		
		//si la cola no está vacia
		while(ultimo!=null) {
			ultimo.sig=nuevo;
		}
	
	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Primero() {
		// TODO Auto-generated method stub
		return false;
	}

}
