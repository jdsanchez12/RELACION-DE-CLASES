
package pryrelacionclasesfamilia;


public class Hijo extends Persona{
//ATRIBUTO
    public String escuela;
    //CONSTRUCTOR
    public Hijo(String nombre, int edad, String escuela) {
        super(nombre, edad);
        this.escuela=escuela;
    }
    //METODO
    public void mtEstudia(){
        System.out.println(nombre+ " ESTUDIA EN LA "+escuela);
    }
    
}
