public class Pescaador {
    private String nombre;
    private int edad;
    private int peses;
    private boolean caña;

    public Pescaador(String nombre, int edad, int peses, boolean caña){
    this.nombre = nombre;
    this.edad = edad;
    this.peses = peses;
    this.caña = caña;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getPeses() {
        return peses;
    }

    public void setPeses(int peses) {
        this.peses = peses;
    }

    public boolean getCaña() {
        return caña;
    }

    public void setCaña(boolean caña) {
        this.caña = caña;
    }
    

    public void Navegar (){
        System.out.println( nombre + "esta navegando en el mar");
    }
    
    public void Fota (){
        System.out.println( nombre + "ahora esta flotando en el mar");
    }
    
    public void pescar(){ 
        boolean anzueloEnElAgua = true;  // Supongamos que el anzuelo está en el agua

        // Verificar si el pez ha mordido el anzuelo
        if (anzueloEnElAgua) {
            System.out.println("¡El pez ha mordido el anzuelo! ¡Estás atrapando un pez!");
        } else {
            System.out.println("Espera pacientemente...");
            
        }
    }


}
