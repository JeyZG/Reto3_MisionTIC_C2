package TarjetaDeCine;

public class TarjetaCine {

    //Atributos
    String idTarjeta, nombreCompleto,  email, telefono;
    int edad;
    double porcentajeDescuento;

    //Constructor
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //Método
    public double pagar(String[] cuenta){

        // Definimos e inicializamos la variable que almacenará el total a pagar
        double total = 0, valorProducto = 0;

        // Recorremos el array de cuentas para calcular el total a pagar
        for (int i = 0; i < cuenta.length; i++) {

            switch (cuenta[i]){
                case "Boleta":
                    valorProducto = 6000;
                    break;
                case "Combo 1 - Crispetas + Gaseosa":
                    valorProducto = 8000;
                    break;
                case "Combo 2 - Perro + Gaseosa":
                    valorProducto = 12000;
                    break;
            }

            total += valorProducto;
        }

        // Devolvemos el total a pagar con el descuento aplicado
        return total * (1 - porcentajeDescuento / 100);
    }

    //Getters y Setters
    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
