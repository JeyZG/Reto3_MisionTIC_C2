import java.util.Arrays;
import Moodle.*;
import TarjetaDeCine.*;
import Partido.*;

public class Reto3_tester {

    public static void main(String[] args) {

        Moodle_tester();
        //TarjetaDeCine_tester();
        //Partido_tester();

    }

    public static void Moodle_tester() {
        Tripulante John = new Tripulante(
                "John Doe",
                "1037654354",
                "123456789",
                "john.doe@udea.edu.co",
                "Soy una persona con muchas ganas de aprender",
                5
        );

        Formador Jane = new Formador(
                "3D",
                "Jane Di",
                "1038654355",
                "987654321",
                "jane.di@udea.edu.co",
                "¡Me apasiona ensenar!"
        );

        // John resuelve los retos 2, 3 y 4
        John.resolverReto(1);
        John.resolverReto(2);
        John.resolverReto(3);

        // Jane le califica los 5 retos a John
        for (int i = 0; i < 5; i++) {
            Jane.calificar(John, i);
        }

        // John y Jane actualizan su perfil
        John.editarPerfil("John Doe", "1037654354", "123456789", "john.doe@udea.edu.co","¡Estoy muy feliz en este programa!");
        Jane.editarPerfil("Jane de María Di", "1038654355", "987654321", "jane.di@udea.edu.co","¡Enamorada de la vida!");

        // Imprimimos los datos usando los getters
        System.out.println("\nDatos del Tripulante");
        System.out.println("Nombre completo: " + John.getNombreCompleto());
        System.out.println("Documento de identidad: " + John.getDocumentoIdentidad());
        System.out.println("Contraseña: " + John.getPassword());
        System.out.println("Correo electrónico: " + John.getCorreo());
        System.out.println("Descripción: " + John.getDescripcion());
        System.out.println("Entregas: " + Arrays.toString(John.getEntregas()));
        System.out.println("Calificaciones: " + Arrays.toString(John.getCalificaciones()));

        System.out.println("\nDatos del Formador");
        System.out.println("Nombre completo: " + Jane.getNombreCompleto());
        System.out.println("Documento de identidad: " + Jane.getDocumentoIdentidad());
        System.out.println("Contraseña: " + Jane.getPassword());
        System.out.println("Correo electrónico: " + Jane.getCorreo());
        System.out.println("Descripción: " + Jane.getDescripcion());
        System.out.println("Escalafón: " + Jane.getEscalafon());

    }
    public static void TarjetaDeCine_tester() {

        String id = "0123";
        String nombre = "John Doe";
        String email = "jd32@correo.co";
        String tel = "5553221";
        int edad = 26;

        TarjetaPlata tp1 = new TarjetaPlata(id, nombre,email, tel, edad);

        System.out.println("John pagó:");

        System.out.println(tp1.pagar(new String[] {"Boleta", "Boleta", "Combo 1 - Crispetas + Gaseosa", "Combo 2 - Perro + Gaseosa"}));

        System.out.println(tp1.pagar(new String[] {"Boleta"}));
        System.out.println(tp1.pagar(new String[] {"Boleta"}));
        System.out.println(tp1.pagar(new String[] {"Boleta"}));
        System.out.println(tp1.pagar(new String[] {"Boleta"}));

        System.out.println("ID de la tarjeta: ");
        System.out.println(tp1.getIdTarjeta());

        System.out.println("Nombre del cliente: ");
        System.out.println(tp1.getNombreCompleto());

        System.out.println("Email del cliente: ");
        System.out.println(tp1.getEmail());

        System.out.println("Teléfono del cliente: ");
        System.out.println(tp1.getTelefono());

        System.out.println("Edad del cliente: ");
        System.out.println(tp1.getEdad());

        System.out.println("Porcentaje de descuento: ");
        System.out.println(tp1.getPorcentajeDescuento());

        System.out.println("Cantidad de visitas: ");
        System.out.println(tp1.getCantidadVisitas());

        System.out.println("¿El cliente es elegible para la tarjeta Oro?: ");
        System.out.println(tp1.isElegibleOro());

        TarjetaOro to2 = new TarjetaOro(id, nombre, email, tel, edad);

        System.out.println("\nJohn pagó: ");
        System.out.println(to2.pagar(new String[] {"Boleta", "Combo 1 - Crispetas + Gaseosa"}));

        System.out.println("¿Puede John redimir la boleta gratis?: ");
        System.out.println(to2.redimirBeneficio(0));

        System.out.println("¿Puede John redimir las crispetas gratis?: ");
        System.out.println(to2.redimirBeneficio(1));

        System.out.println("¿Puede John redimir la gaseosa gratis?: ");
        System.out.println(to2.redimirBeneficio(2));

        System.out.println("¿Puede John redimir la otra gaseosa gratis?: ");
        System.out.println(to2.redimirBeneficio(2));

        System.out.println("ID de la tarjeta: ");
        System.out.println(to2.getIdTarjeta());

        System.out.println("Nombre del cliente: ");
        System.out.println(to2.getNombreCompleto());

        System.out.println("Email del cliente: ");
        System.out.println(to2.getEmail());

        System.out.println("Teléfono del cliente: ");
        System.out.println(to2.getTelefono());

        System.out.println("Edad del cliente: ");
        System.out.println(to2.getEdad());

        System.out.println("Porcentaje de descuento: ");
        System.out.println(to2.getPorcentajeDescuento());

        System.out.println("Beneficios:");
        System.out.println(Arrays.toString(to2.getBeneficiosDescripcion()));

        System.out.println("Estado de los beneficios: ");
        System.out.println(Arrays.toString(to2.getBeneficiosEstado()));
    }
    public static void Partido_tester() {

        Preferencial tiq_pref1 = new Preferencial(
                "0123",
                "Juan Perez",
                "CL 01 CR 02-03"
        );

        VIP tiq_vip1 = new VIP(
                "5434",
                "María López",
                "CR 29 CL 28-27"
        );

        tiq_pref1.participarSorteo();
        tiq_pref1.generarCredenciales();
        tiq_pref1.setDireccionResidencia("CL 04 CR 05-06");
        tiq_vip1.generarCredenciales();
        tiq_vip1.generarCredencialesPrevia();
        tiq_vip1.asignarPantalla(1);
        tiq_vip1.asignarPantalla(2);
        tiq_vip1.asignarPantalla(3);
        tiq_vip1.asignarPantalla(3);

        System.out.println("ID del tiquete:");
        System.out.println(tiq_pref1.getIdTiquete());
        System.out.println("Nombre del cliente:");
        System.out.println(tiq_pref1.getNombreCompleto());
        System.out.println("Dirección del cliente:");
        System.out.println(tiq_pref1.getDireccionResidencia());
        System.out.println("Credenciales del cliente:");
        System.out.println(tiq_pref1.getCredenciales());
        System.out.println("¿Participa en el sorteo?");
        System.out.println(tiq_pref1.isParticipaSorteo());

        System.out.println("ID del tiquete:");
        System.out.println(tiq_vip1.getIdTiquete());
        System.out.println("Nombre del cliente:");
        System.out.println(tiq_vip1.getNombreCompleto());
        System.out.println("Dirección del cliente:");
        System.out.println(tiq_vip1.getDireccionResidencia());

        System.out.println("Estado de las pantallas del cliente:"); System.out.println(Arrays.toString(tiq_vip1.getPantallas()));
        System.out.println("Credenciales del cliente:");
        System.out.println(tiq_vip1.getCredenciales());
        System.out.println("Credenciales del cliente para la previa:");
        System.out.println(tiq_vip1.getCredencialesPrevia());

    }

}