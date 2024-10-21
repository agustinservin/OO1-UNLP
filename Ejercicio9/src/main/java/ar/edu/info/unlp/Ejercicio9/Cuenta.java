package ar.edu.info.unlp.Ejercicio9;

import java.security.PublicKey;

public abstract class Cuenta {
	
	Double saldo;
	public Cuenta() {
		this.saldo = 0.00;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void depositar(double monto) {
		this.saldo+=monto;
	}
	protected boolean puedeExtraer(double monto) {
		return this.saldo - monto >= 0;
	}
	protected void extraerSinControlar(double monto) {
		this.saldo-=monto;
	}
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)){
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
}
