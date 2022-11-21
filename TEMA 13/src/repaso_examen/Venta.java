package repaso_examen;

public class Venta {
	private int codigo;
	private double importeVenta;
	private char formaPago;
	
	public Venta(int codigo, double importeVenta, char formaPago) {
		this.codigo = codigo;
		this.importeVenta = importeVenta;
		this.formaPago = formaPago;
	}

	public Venta() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(double importeVenta) {
		this.importeVenta = importeVenta;
	}

	public char getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(char formaPago) {
		this.formaPago = formaPago;
	}

	@Override
	public String toString() {
		return "venta [codigo=" + codigo + ", importeVenta=" + importeVenta + ", formaPago=" + formaPago + "]";
	}
	
}