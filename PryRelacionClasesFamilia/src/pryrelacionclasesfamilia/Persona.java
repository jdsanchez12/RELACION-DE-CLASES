
package pryrelacionclasesfamilia;


public class Persona {
    //ATRIBUTOS
   public String nombre;
   public int edad;
   //CONSTRUCTOR

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
   //METODO
    public void saludar(){
        System.out.println("HOLA MI NOMBRE ES: "+nombre+" Y MI EDAD ES: "+edad);
    }
}
