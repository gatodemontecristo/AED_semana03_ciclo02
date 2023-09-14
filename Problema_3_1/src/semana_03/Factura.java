package semana_03;

public class Factura {
	private String ruc, empresa;
	private int uni;
	private double pre;
	
	private static int cantidad;
	private static double suma;
	
	public static final String entidad;
	
	static{
		entidad = "Sunat";
		cantidad = 0;
		suma = 0;
	}

	public Factura(String ruc, String empresa, int uni, double pre) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.uni = uni;
		this.pre = pre;
		cantidad++;
		suma += importeFacturado();
	}
	public Factura(String ruc, String empresa){
		this(ruc,empresa,10,50.0);
	}
	public Factura(){
		this("11111111111","MN-Global SRL");
	}
	
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getUni() {
		return uni;
	}
	public void setUni(int uni) {
		this.uni = uni;
	}
	public double getPre() {
		return pre;
	}
	public void setPre(double pre) {
		this.pre = pre;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}
	public static double getSuma() {
		return suma;
	}
	public static void setSuma(double suma) {
		Factura.suma = suma;
	}
	
	public double importeFacturado(){
		return uni * pre;
	}
	
	
}
