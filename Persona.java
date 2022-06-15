
package domain;


public class Persona {
    
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setNombre("Jorge");
        persona.setTelefono(1550687921);
        
        
        
        System.out.println("El señor " + persona.getNombre() + " tiene " + persona.getEdad() + " años y su numero de telefono es " + persona.getTelefono());
     
        
    }
    
    
    
}
        
