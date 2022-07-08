package Partido;

public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE Y SU MÉTODO CONSTRUCTOR

    // Atributos
    boolean participaSorteo = false;

    // Constructor
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    public void participarSorteo(){
           setParticipaSorteo(!isParticipaSorteo());
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y SETTER DEL CASO
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
}
