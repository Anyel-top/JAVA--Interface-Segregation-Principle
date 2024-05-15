package dispositivos;

 class Tablet implements DispositivoElectronicoBasico,
         DispositivoDisplay{
    @Override
    public void encender() {
        System.out.println("Tablet encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Tablet apagada");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Mostrando " +
                "información en la tablet");
    }
}