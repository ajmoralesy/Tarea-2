package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped //Delego el control al contendor ArC

public class ReservaService {
    @Inject
    NotificacionService notificacionService;

    public void procesarReserva(Reserva reserva) {
        System.out.println("Reserva creada para el cliente: " + reserva.getCliente());
        System.out.println("Habitación: " + reserva.getHabitacion());
        System.out.println("Noches: " + reserva.getNoches());
        System.out.println("Precio por noche: " + reserva.getPrecioPorNoche());
        System.out.println("Total a pagar: " + reserva.calcularTotal());
        String mensaje = "Reserva confirmada";
        String cuerpo = "Estimado " + reserva.getCliente() + ", su reserva para la habitación " + reserva.getHabitacion() + " por " + reserva.getNoches() + " noches ha sido confirmada. Total a pagar: " + reserva.calcularTotal();
        this.notificacionService.enviar(reserva.getCorreo(), mensaje, cuerpo);
    }

}
