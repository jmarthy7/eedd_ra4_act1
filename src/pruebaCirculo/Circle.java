package pruebaCirculo;

public class Circle implements IFiguraGeometrica {
	/**
	 * 
	 */
	private static final double CERO = 0.0;
	private int x;
	private int y;
	private double radio;

	
	// constructor
	public Circle(int valorX, int valorY, double valorRadio) {
		x = valorX;
		y = valorY;
		establecerRadio(valorRadio);
	}

	public void establecerX(int valorX) {
		x = valorX;
	}

	public int obtenerX() {
		return x;
	}

	public void establecerY(int valorY) {
		y = valorY;
	}

	public int obtenerY() {
		return y;
	}

	public void establecerRadio(double valorRadio) {
		radio = (valorRadio < CERO ? CERO : valorRadio);
	}

	public double obtenerRadio() {
		return radio;
	}

	public double getDiametro() {
		return 2 * radio;
	}

	public double getCircunferencia() {
		return Math.PI * getDiametro();
	}

	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
}