import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList<EsAlimento> Lista = new ArrayList<>(); //úedo meter cuañquier onjeto por qu epertebece a es alimiento
        Cereal celereal1 = new Cereal("Galletein" , 15,"trigo");
        Cereal celeral2 = new Cereal("Kellos",17, "trigo");
        Vino vino1 = new Vino("Don ron" , "sueco" , 15 , 200  );
        Vino vino2 = new Vino("patito vinos" , "Ron dulce", 15 , 1000  );
        Lista.add(celereal1);
        Lista.add(celeral2);
        Lista.add(vino1);
        Lista.add(vino2);

        int totalcalorias = 0 ;
        for(EsAlimento alimento:Lista ){
            totalcalorias += alimento.getCalorias(); // += es  para acumular todas las calorias del todas los prodcutos;
        }
        System.out.println("total de calorias " + totalcalorias);


    }

    }
interface  EsLiquido{

    public void setVolumen (double v);
    public double getVolumen();
    public void setTipoEnvase (String env);
    public String getTipoEnvase();

}
interface  EsAlimento{

    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();
}
interface ConDescuento {
    public  void setDescuento(double des);
    public double getDescuento();
    public  double getPrecioDescuento();

}
 class Detergente implements ConDescuento {
    private  String marca;
    private double precio;

    private double descuento;


public  Detergente (String marca , double precio){
    this.marca = marca;
    this.precio = precio;

}
public void setMarca(String  marca){
    this.marca = marca;

}
public String getMarca(){
    return marca;
}

public void setPrecio(double precio){
    this.precio = precio;
}

public Double getPrecio(){
    return precio;
}

    public  void setDescuento( double des){
    this.descuento = des;

    }
    public  double getDescuento(){
        return descuento;

    }

    public double getPrecioDescuento(){
        return precio * (1-descuento);

    }
    public String toString(){
    return  "Detergente" + marca + "su precio es de " + precio + "descuento " +  descuento
            + "precio final " + getPrecioDescuento() + " ";
    }

 }
 class Cereal implements EsAlimento {
     private String marca;
     private double precio;

     private String tipodecereal;
     private LocalDate Caducidad;

     private int Calorias;

     public Cereal(String marca, double precio, String tipodecereal) {
         this.marca = marca;
         this.precio = precio;
         this.tipodecereal = tipodecereal;

     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getMarca() {
         return marca;
     }

     public void setPrecio(double precio) {
         this.precio = precio;
     }

     public double getPrecio() {
         return precio;
     }

     public void setTipodecereal(String tipodecereal) {
         this.tipodecereal = tipodecereal;
     }

     public String getTipodecereal() {
         return tipodecereal;
     }

     public void setCaducidad(LocalDate fc) {
         this.Caducidad = fc;
     }


     public LocalDate getCaducidad() {
         return Caducidad;
     }


     public int getCalorias() {
         if ( tipodecereal.equals("espelta")){
             return 5;
         } else if ( tipodecereal.equals("maiz")){
             return 8;
         } else if (tipodecereal.equals("trigo")){
             return 12;
         } else{
             return 15;
         }
     }

     public String toString(){

         return  "Celreal (" + tipodecereal + "Precio" + precio +
                 "Caducidad" + Caducidad + "Calorias" + getCalorias() +
                 ")";
     }
 }
 class Vino implements EsLiquido , ConDescuento ,EsAlimento{
    private  String  marca;
    private  String tipodevino;
    private double grados;
    private  double precio;
     private  double descuento;
     private double volumen;
     private  String tipoenvase;
     private LocalDate caducidad;

    public Vino(String marca ,String tipodevino , double grados , double precio ) {

        this.marca = marca;
        this.precio = precio;
        this.grados = grados;
        this.tipodevino = tipodevino;
    }

    public void setMarca(String marca){
        this.marca = marca;

    }
    public String getMarca(){
        return marca;
    }
    public void setPrecio (double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return  precio;
    }
    public void setGrados (double grados){
        this.grados = grados;
    }
    public double getGrados (){
        return  grados;
    }
    public void setTipodevino(String tipoEnvase){
        this.tipoenvase = tipoEnvase;
    }

     public void setDescuento(double des) {
        this.descuento = des;

     }


     public double getDescuento() {
         return descuento;
     }


     public double getPrecioDescuento() {
         return  precio * (1-descuento);
     }


     public void setVolumen(double v) {
        this.volumen = v;

     }


     public double getVolumen() {
         return volumen;
     }


     public void setTipoEnvase(String env) {
        this.tipoenvase = env;

     }


     public String getTipoEnvase() {
         return tipoenvase;
     }


     public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;

     }


     public LocalDate getCaducidad() {
         return caducidad;
     }


     public int getCalorias() {
         return  (int) (grados * 10 );
     }
 }

