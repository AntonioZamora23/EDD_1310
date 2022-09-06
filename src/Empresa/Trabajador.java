package Empresa;


public final class Trabajador {
	private int numTrabajador;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int horasExtra;
	private float sueldo;
	private int anodeIngreso;

	public Trabajador() {
	}

	public Trabajador(int numeroTrabajador, String nombre, String apellidoPat, String apellidoMat, int horasExtra,
			float sueldo, int anoIngreso) {
		this.numTrabajador = numeroTrabajador;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPat;
		this.apellidoMaterno = apellidoMat;
		this.horasExtra = horasExtra;
		this.sueldo = calcularSueldo(horasExtra, anoIngreso, sueldo);
		this.anodeIngreso = anoIngreso;
	}

	public float calcularSueldo(int hora, int ano, float sueldo) {
		int difAno = 2022 - ano;
		for (int i = 0; i < difAno; i++) {

			sueldo *= 1.03;
		}
		if (hora > 0) {
			sueldo += hora * (276.5);

		}
		return sueldo;
	}

	public int getNumTrabajador(int num) {
		return numTrabajador = num;
	}

	public void setNumTrabajador(int numTrabajador) {
		this.numTrabajador = numTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getHoraExtra() {
		return horasExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horasExtra = horaExtra;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public int getAnodeIngreso() {
		return anodeIngreso;
	}

	public void setAnoIngreso(int anoIngreso) {
		this.anodeIngreso = anoIngreso;
	}

	@Override
	public String toString() {
		return "Trabajador{" + "numeroTrabajador=" + numTrabajador + ", nombre=" + nombre + ", apellidoPat="+ apellidoPaterno + ", apellidoMat=" + apellidoMaterno + ", horaExtra=" + horasExtra + ", sueldo="+ sueldo + ", anoIngreso=" + anodeIngreso + '}';
	}

}
