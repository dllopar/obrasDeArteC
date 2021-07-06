package ar.edu.unlam.pb2.catalogoTest;

public class ObraDeArte {

	private String nombre;
	private Autor autor;
	private Integer anio;

	public ObraDeArte(String nombre, Autor autor, Integer anio) {

		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
	}

	public String getNombre() {
		
		return nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
