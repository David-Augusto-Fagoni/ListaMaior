package controller;

import modelInt.IListaInt;

public class ArrumaLista {
	public void Ajeitar(IListaInt lista) throws Exception {
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(3);
		lista.addLast(7);
		lista.addLast(16);
	}
	public void Maior(IListaInt lista) throws Exception {
		Ajeitar(lista);
		quickSort(lista,0,lista.size()-1);
		int Tam = lista.size();
		System.out.println("Primeiro Maior: "+lista.get(Tam-1)+" Segundo maior:"+lista.get(Tam-2));
	}
	
	
	
	// QuickSort Lista
	public IListaInt quickSort (IListaInt lista, int inicio, int fim)throws Exception {
		if (fim > inicio) {
			int posicaoPivo = dividir(lista, inicio, fim);
			quickSort(lista, inicio, posicaoPivo-1);
			quickSort(lista, posicaoPivo + 1, fim);
			}
		return lista;
	}
	
	private int dividir (IListaInt lista, int inicio, int fim) throws Exception {
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = lista.get(inicio);
		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && lista.get(ponteiroEsq) <= pivo) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && lista.get(ponteiroDir) >= pivo) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(lista, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		trocar(lista, inicio, ponteiroDir);
		return ponteiroDir;
	}
	
	private void trocar (IListaInt lista, int esq, int dir)throws Exception {
		int aux = lista.get(dir);
		lista.add(lista.get(esq), dir);
		lista.remove(dir+1);
		lista.add(aux, esq);
		lista.remove(esq+1);
	}

}
