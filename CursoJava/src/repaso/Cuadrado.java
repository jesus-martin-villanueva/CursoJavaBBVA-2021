package repaso;

public class Cuadrado extends Figura {
	
	private float lado;
	
	public Cuadrado() {	
		super();
	}
	
	public Cuadrado(String nombre) { 
		super(nombre); 
	}
	
	public Cuadrado(String nombre, float lado) {
		super(nombre);
		this.lado = lado;
	}

	public float getLado() { return lado; }
	public void setLado(float lado) { this.lado = lado;	}
	
	@Override
	public float calcularPerimetro() {		
		return lado * 4;
	}

	@Override
	public float calcularSuperficie() {		
		return lado * lado;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("l=");
		sb.append(lado);		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(lado);
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
		Cuadrado other = (Cuadrado) obj;
		//una vez que se que es un cuadrado le agrego la validacion del nombre
		if (!super.equals( obj) || Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
}
