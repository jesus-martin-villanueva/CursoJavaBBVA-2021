package repaso;

public class Triangulo extends Figura {
	
	//Campos
	private float altura;
	private float base;
	
	//Constructores
	public Triangulo() {
		super();
	}

	public Triangulo(String nombre) {
		super(nombre);
	}
	
	public Triangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}

	//Métodos heredados
	@Override
	public float calcularPerimetro() {
		int hipotenusa = (int)Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		return altura + base + hipotenusa;
	}

	@Override
	public float calcularSuperficie() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public String getValores() {
		return "h=" + this.altura + ", b=" + this.base;
	}

	//Getters y Setters
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
	
	//equals, hasCode, toString
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
		Triangulo other = (Triangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + "]";
	}
}
