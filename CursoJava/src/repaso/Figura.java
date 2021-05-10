package repaso;

public abstract class Figura implements Model { //Clase abstract es que no se instancia

	//Campos
	private static float maximaSuperficie; //Campo estático indicado subrayado en UML
	private String nombre; //En UML el - representa private y + public
	
	//Constructores
	public Figura() { super(); }
	
	public Figura(String nombre) {
		super(); //Clase Object (todas heredan de esa en Java)
		this.nombre = nombre;
	}
	
	//Métodos
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();
	public abstract String getValores();
	
	//Getters y Setters
	public static float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	public static void setMaximaSuperficie(float maximaSuperficie) {
		Figura.maximaSuperficie = maximaSuperficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//hashCode, equals, toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
