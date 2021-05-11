package modelo;

public class Rectangulo extends Figura {
	
	private float altura;
	private float base;
	
	public Rectangulo() {
		super();
	}

	public Rectangulo(String nombre) {
		super(nombre);
	}
	
	public Rectangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public float calcularPerimetro() {
		return (base * 2) + (altura * 2);
	}

	@Override
	public float calcularSuperficie() {
		return base * altura;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("h=");
		sb.append(altura + ", b=" + base);		
		return sb.toString();
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
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
		Rectangulo other = (Rectangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}
}
