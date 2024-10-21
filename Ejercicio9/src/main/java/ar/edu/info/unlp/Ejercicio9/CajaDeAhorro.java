package ar.edu.info.unlp.Ejercicio9;

public class CajaDeAhorro extends Cuenta {
	private double recargoTransferencia(double monto) {
		return monto+= monto*0.02;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		monto = recargoTransferencia(monto);
		return super.puedeExtraer(monto);
	}
	@Override
	protected void extraerSinControlar(double monto) {
		// TODO Auto-generated method stub
		monto = recargoTransferencia(monto);
		super.extraerSinControlar(monto);
	}
	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		
		super.depositar(monto);
	}
}
