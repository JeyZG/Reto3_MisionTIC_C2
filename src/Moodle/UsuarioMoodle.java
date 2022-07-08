package Moodle;

public class UsuarioMoodle {
    //Atributos
    String nombreCompleto, documentoIdentidad, password,  correo,  descripcion;

    //Constructor
    /*public UsuarioMoodle(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {

    }*/
    public UsuarioMoodle(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }

    //Método
    public void editarPerfil(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }

    //GETTERS y SETTERS
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}