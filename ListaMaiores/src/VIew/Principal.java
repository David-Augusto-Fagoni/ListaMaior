package VIew;

import controller.ArrumaLista;
import modelInt.IListaInt;
import modelInt.ListaInt;

public class Principal {

	public static void main(String[] args) {
		IListaInt Lista = new ListaInt();
		ArrumaLista Arruma = new ArrumaLista();
		try {
			Arruma.Maior(Lista);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
