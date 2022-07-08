package TarjetaDeCine;

public class TarjetaPlata extends TarjetaCine {
    //Atributos
    int cantidadVisitas = 0;
    boolean elegibleOro = false;

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10.0);
    }

    //Método
    @Override
    public double pagar(String[] cuenta){
        cantidadVisitas++;  // Incrementamos la cantidad de visitas
        if (cantidadVisitas == 5) {
            elegibleOro = true;
        }
        return super.pagar(cuenta);
    }

    //Getters y Setters
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
}