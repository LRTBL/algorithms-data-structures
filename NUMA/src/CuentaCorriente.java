
public class CuentaCorriente extends Cuenta{
	public float tasadeComision;
	
	public CuentaCorriente(int a , float b, Titular c , float d) {
		super(a,b , c);
		this.tasadeComision=d;
	}
	public float getSaldo() {
		return this.getSaldo();
	}
	public String toString() {
		return super.toString()+"Taza de comision:"+this.tasadeComision;
	}
}
