package ar.edu.info.unlp.Ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	public boolean includesDate(LocalDate other) {
		return from.isBefore(other) && to.isAfter(other);
	}
}
