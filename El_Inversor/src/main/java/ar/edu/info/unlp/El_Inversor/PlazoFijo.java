package ar.edu.info.unlp.El_Inversor;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PlazoFijo implements IInversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	public PlazoFijo(double monto, double interes, LocalDate fechaInicio) {
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = interes;
		//this.fechaDeConstitucion = LocalDate.now();
		this.fechaDeConstitucion = fechaInicio;
	}
	public double valorActual() {
		//cuenta los dias que pasaron desde la fecha del deposito
		long diasDeDeposito = ChronoUnit.DAYS.between(fechaDeConstitucion,LocalDate.now());
		//double comision = this.porcentajeDeInteresDiario * diasDeDeposito;
		return montoDepositado + (montoDepositado * (diasDeDeposito * this.porcentajeDeInteresDiario / 100));
	}

}
