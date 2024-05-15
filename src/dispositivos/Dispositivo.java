package dispositivos;

public interface Dispositivo {
    void hacerLlamada(String numero);
    void recibirLlamada(String numero);
    void encender();
    void apagar();
    void mostrarInformacion();
}
