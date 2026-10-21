package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
@QuarkusMain
public class App implements QuarkusApplication {

    @Inject
    ReservaService reservaService;

    @Override
    public int run(String... args) throws Exception {
        Reserva reserva = new Reserva("Alexis Morales", "Habitación Deluxe", 2, 65.0, "ajmoralesy@uce.edu.ec");
        this.reservaService.procesarReserva(reserva);
        return 0;
    }

}
