package Moodle;

public class Tripulante extends UsuarioMoodle{
    //Atributos
    double[] calificaciones;
    boolean[] entregas;
    
    //Constructor
    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        calificaciones = new double[n];
        entregas = new boolean[n];

        for(int i = 0; i < n; i++){
            calificaciones[i] = 0;
            entregas[i] = false;
        }

    }

    //Método
    public void resolverReto(int retoAEntregar){
        if (retoAEntregar >= 0 && retoAEntregar < calificaciones.length){
            entregas[retoAEntregar] = true;
        }
    }

    //Getter del atributo calificaciones
    public double[] getCalificaciones() {
        return calificaciones;
    }

    //Setter del atributo calificaciones
    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    //Getter del atributo entregas
    public boolean[] getEntregas() {
        return entregas;
    }

    //Setter del atributo entregas
    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
}
