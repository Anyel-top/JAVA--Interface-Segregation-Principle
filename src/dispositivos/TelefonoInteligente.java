package dispositivos;

public class TelefonoInteligente implements DispositivoElectronicoBasico,
        DispositivoConLlamadas, DispositivoDisplay {
    @Override
    public void encender() {
        System.out.println("Teléfono inteligente encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Teléfono inteligente apagado");
    }

    @Override
    public void hacerLlamada(String numero) {
        System.out.println("Llamando al número: " + numero);
    }

    @Override
    public void recibirLlamada(String numero) {
        System.out.println("Recibiendo llamada del número: " + numero);
    }

    @Override
    public void mostrarInformacion() {

    }
}