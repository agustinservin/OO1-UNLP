package ar.edu.info.unlp.Ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double limiteDisponible;
	private double limiteDeDescubierto;
	public CuentaCorriente() {
		this.limiteDeDescubierto = 0;
	}
	public double getDescubierto() {
		return this.limiteDeDescubierto;
	}
	public void setDescubierto(double limite) {
		this.limiteDeDescubierto = limite;
		this.limiteDisponible = limite;
	}
	@Override
	public boolean extraer(double monto) {
		//si el monto es mayor al saldo, corroboro que tenga limite de credito disponible 
		if(monto > saldo) {
			if(monto <= limiteDisponible) {
				//limite disponible es lo que debo usar sin saldo. Ejemplo si tengo limite $10, una extraccion de $10 y un saldo de $5. 
				//el saldo deberia quedar en -$5 y el limite en $5 
				limiteDisponible -= monto - saldo;
				saldo -= monto;
				return true;
			}
			return false;	
		}
		else {
			return super.extraer(monto);
		}
	}
}
