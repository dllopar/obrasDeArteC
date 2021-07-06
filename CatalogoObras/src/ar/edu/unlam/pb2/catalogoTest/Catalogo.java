package ar.edu.unlam.pb2.catalogoTest;

import java.util.TreeSet;

public class Catalogo {

	private TreeSet<ObraDeArte> obras;

	public Catalogo() {
		obras = new TreeSet<>();
	}

	public Integer ontenerCantidadObras() {

		return obras.size();
	}

	public void agregarObra(ObraDeArte obraDeArte) throws Exception {

		if (existeObra(obraDeArte)) {
			throw new Exception();
		} else {
			obras.add(obraDeArte);
		}

	}

	public Boolean existeObra(ObraDeArte obraDeArte) {

		return obras.contains(obraDeArte);
	}

	public TreeSet<ObraDeArte> getObras() {

		return obras;
	}

	public Integer ontenerCantidadObrasPorAnio(Integer cantidadObras) {
		Integer contador = 0;

		for (ObraDeArte obraDeArte : obras) {
			if (obraDeArte.getAnio().equals(cantidadObras)) {
				contador++;
			}
		}
		return contador;
	}

}
