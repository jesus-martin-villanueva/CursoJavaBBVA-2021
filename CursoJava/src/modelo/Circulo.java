package modelo;

public class Circulo extends Figura { //Hereda de la clase Figura y está obligado a implementar los métodos abstract de la clase

	//Campos
	private float radio;
	
	//Constructores
	public Circulo() {
		super();
	}

	public Circulo(String nombre, Float radio) {
		super(nombre);
		this.radio = radio;
	}
	
	//Métodos heredados de Figura
	@Override
	public float calcularPerimetro() {
		return 2 * (float)Math.PI * this.radio;
	}

	@Override
	public float calcularSuperficie() {
		return (float)(Math.PI * Math.pow(this.radio, 2));
	}

	@Override
	public String getValores() {
		return "r=" + this.radio;
	}
	
	//Getters y Setters
	public float getRadio() {
		return this.radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	//equals, hashCode, toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}
