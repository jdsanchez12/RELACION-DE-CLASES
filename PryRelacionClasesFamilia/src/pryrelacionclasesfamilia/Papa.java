
package pryrelacionclasesfamilia;


public class Papa extends Persona {
//ATRIBUTO
    public String trabajo;
    //CONSTRUCTOR
    public Papa(String nombre, int edad, String trabajo) {
        super(nombre, edad);
        this.trabajo= trabajo;
    }
    //METODO
    public void Trabajo(){
        System.out.println(nombre+" TRABAJA EN LA "+trabajo);
    }
    
}
