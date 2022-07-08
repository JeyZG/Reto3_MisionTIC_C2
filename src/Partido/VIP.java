package Partido;

//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()

import java.util.Random;

public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE Y SU MÉTODO CONSTRUCTOR
    // Atributos
    boolean[] pantallas = new boolean[] {false, false, false};
    String credencialesPrevia = "";

    // Constructor
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        if(pantalla>=1 && pantalla<=3){
            pantallas[pantalla-1] = !pantallas[pantalla-1];
        }
    }

    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y SETTER DEL CASO
    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
}
