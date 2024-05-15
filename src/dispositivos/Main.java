package dispositivos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TelefonoInteligente telefono = new TelefonoInteligente();
        telefono.encender();
        telefono.hacerLlamada("123456789");

        Tablet tablet = new Tablet();
        tablet.encender();
        tablet.mostrarInformacion();
        // tablet.hacerLlamada("987654321"); // Esto no se puede hacer ya que una tablet no tiene capacidad de llamadas
    }
}