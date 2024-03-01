public class Nota {
    int importancai;
    int fecha;
    String texto;
    String color;
    String emisor;
    String reseptor;
    
    /* puedo extrear la fecha actual de la computadora, tambien puedo hacer que extraiga el usurio de nombre de la computadora */


    public Nota(String color, int fecha, int importancai, String texto, String emisor, String reseptor){

    this.importancai = importancai;
    this.fecha = fecha;
    this.texto = texto;
    this.color = color;
    this.emisor = emisor;
    this.reseptor = reseptor;

    }

    public int getImportancia(){
        return importancai;
    }

    public void setImprtanica(int importancai){
    this.importancai = importancai;

    }

    public int getFecha(){
        return fecha;
    }

    public void setFecha(int fecha){
        this.fecha = fecha;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public String geetColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getEmisor(){
        return emisor;
    }

    public void setEmisor(String emisor){
        this.emisor = emisor;
    }

    public String getReseptor(){
        return reseptor;
    }

    public void setReseptor(String reseptor){
        this.reseptor = reseptor;
    }

    public static void main(String[] args) {
        
        
    }



}