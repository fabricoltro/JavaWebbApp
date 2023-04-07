package dao2;

	

import java.util.ArrayList;
import java.util.List;

public class Persona {

	
	
	private int id_persona = 0;
	
	private String nombre;
	private String apellido;
	private int telefono;
	private String email;
	private int dni;
	private String usser;
	private String password;
		
	public Persona(int id_persona, String usser, String password) {
		super();
		this.id_persona = id_persona;
		this.usser = usser;
		this.password = password;
	}


	private List<Persona> 	Personas = new ArrayList<Persona>();


	public Persona(int id, String nombre, String apellido, int telefono, String email, int dni,
					String usser, String password,List<Persona> Personas) {
		super();
		this.id_persona = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.Personas = Personas;
		this.usser = usser;
		this.password = password;
		
	}


	public Persona( int id, String nombre, String apellido, int telefono, 
			String email, int dni, String usser, String password) {
		super();
		this.id_persona = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.dni = dni;
		this.usser = usser;
		this.password = password;
		
	}
	
	public Persona( String nombre, String apellido, int telefono, String email, int dni, String usser, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.dni = dni;
		this.usser = usser;
		this.password = password;
		
	}
	
	public Persona(String usser, String password) {
		super();
		this.usser = usser;
		this.password = password;
	}


	public Persona(int id) {	
		super();
		this.id_persona = id;
	}




	public Persona() {
		super();
	}


	

	public int getId() {
		return id_persona;
	}


	public void setId(int id) {
		this.id_persona = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public List<Persona> getPersonas() {
		return Personas;
	}


	public void setPersonas(List<Persona> personas) {
		Personas = personas;
	}



	public String getUsser() {
		return usser;
	}


	public void setUsser(String usser) {
		this.usser = usser;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + ", dni=" + dni + ", usser=" + usser + ", password=" + password
				+ ", Personas=" + Personas + "]";
	}


	
	
	
}
