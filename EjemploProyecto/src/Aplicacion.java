import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Se presentará la info de la persona!");
		
		Persona miPersona=new Persona("Pepito Perez",23,"Estudiante","7584632");
		
		System.out.println("Nombre: "+miPersona.getNombre());
		System.out.println("Edad: "+miPersona.getEdad());
		System.out.println("Profesion: "+miPersona.getProfesion());
		System.out.println("Telefono: "+miPersona.getTelefono());
	}
}
