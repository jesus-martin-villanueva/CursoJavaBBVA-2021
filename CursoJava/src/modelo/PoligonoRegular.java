package modelo;

public class PoligonoRegular extends Figura {
	
	private float apotema;
	private int cantidadDeLados;
	private int lado;

	public PoligonoRegular() {
		super();
	}

	public PoligonoRegular(String nombre) {
		super(nombre);
	}
	
	public PoligonoRegular(String nombre, float apotema, int lado, int cantidadLados) {
		super(nombre);
		this.apotema = apotema;
		this.lado = lado;
		this.cantidadDeLados = cantidadLados;
	}

	@Override
	public float calcularPerimetro() {
		return cantidadDeLados * lado;
	}

	@Override
	public float calcularSuperficie() {
		return ((cantidadDeLados * lado) * apotema) / 2;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("a=");
		sb.append(apotema + ", l=" + lado + ",cl=" + cantidadDeLados);		
		return sb.toString();
	}

	public float getApotema() {
		return apotema;
	}

	public void setApotema(float apotema) {
		this.apotema = apotema;
	}

	public int getCantidadDeLados() {
		return cantidadDeLados;
	}

	public void setCantidadDeLados(int cantidadDeLados) {
		this.cantidadDeLados = cantidadDeLados;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(apotema);
		result = prime * result + cantidadDeLados;
		result = prime * result + lado;
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
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Float.floatToIntBits(apotema) != Float.floatToIntBits(other.apotema))
			return false;
		if (cantidadDeLados != other.cantidadDeLados)
			return false;
		if (lado != other.lado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoligonoRegular [apotema=" + apotema + ", cantidadDeLados=" + cantidadDeLados + ", lado=" + lado + "]";
	}
}
