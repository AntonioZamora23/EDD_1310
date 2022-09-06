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

	public Trabajador(int numTrabajador, String nombre, String apellidoPaterno, String apellidoMaterno, int horasExtra,float sueldo, int anodeIngreso) {
		this.numTrabajador = numTrabajador;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.horasExtra = horasExtra;
		this.sueldo = calcularSueldo(horasExtra, anodeIngreso, sueldo);
		this.anodeIngreso = anodeIngreso;
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

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHoraExtra(int horasExtra) {
		this.horasExtra = horasExtra;
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

	public void setAnodeIngreso(int anodeIngreso) {
		this.anodeIngreso = anodeIngreso;
	}

	@Override
	public String toString() {
		return "Trabajador{" + "numTrabajador=" + numTrabajador + ", nombre=" + nombre + ", apellidoPat="+ apellidoPaterno + ", apellidoMat=" + apellidoMaterno + ", horasExtra=" + horasExtra + ", sueldo="+ sueldo + ", anodeIngreso=" + anodeIngreso + '}';
	}

}
