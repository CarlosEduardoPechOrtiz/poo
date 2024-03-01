public class Hola {
    private String mensaje;

    // Constructor
    public Hola() {
        this.mensaje = "Hola Mundo";
    }

    // Método getter para obtener el mensaje
    public String getMensaje() {
        return mensaje;
    }

    // Método setter para modificar el mensaje
    public void setMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    public static void main(String[] args) {
        // Crear una instancia de HolaMundo
        Hola miHolaMundo = new Hola();

        // Cambiar el mensaje
        miHolaMundo.setMensaje("¡Hola Mundo!");

        // Imprimir el mensaje en amarillo
        System.out.println("\u001B[33m" + miHolaMundo.getMensaje() + "\u001B[0m");
    }
}