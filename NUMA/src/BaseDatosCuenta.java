import java.util.ArrayList;

public class BaseDatosCuenta {
	private ArrayList<Cuenta> cuentas;
	
	public BaseDatosCuenta() {
		this.cuentas = new ArrayList<Cuenta>();
	}
	public void AgregarCuenta(Cuenta a) {
		this.cuentas.add(a);
	}
	public void MostrarCuenta() {
		System.out.println("BASE DE DATOS CUENTAS");
		for (Cuenta  i :  this.cuentas) {
			System.out.println(i.toString()+"\n");
		}

	}
}
