package Moodle;

public class Formador extends UsuarioMoodle{
    //Atributos
    String escalafon;

    //Constructor
    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }

    //Método calificar
    public void calificar(Tripulante tripulanteACalificar, int k){
        if (k >= 0 && k < tripulanteACalificar.getCalificaciones().length){
            if(tripulanteACalificar.getEntregas()[k]){
                tripulanteACalificar.getCalificaciones()[k] = 5;
            }else{
                tripulanteACalificar.getCalificaciones()[k] = 0;
            }
        }
    }
    
    //Getter del atributo escalafon
    public String getEscalafon() {
        return escalafon;
    }
    
    //Setter del atributo escalafon
    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
    
}