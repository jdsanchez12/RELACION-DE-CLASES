
package pryrelacionclasesfamilia;


public class PryRelacionClasesFamilia {

    
    public static void main(String[] args) {
        //LLAMADO ALA CLASE PAPA
        Papa papa=new Papa("JOSUE", 35, "ESPE");
        Hijo hijo=new Hijo("JOHN", 19, "ESPE");
        papa.saludar();
        papa.Trabajo();
        hijo.saludar();
        hijo.mtEstudia();
        
    }
    
}
