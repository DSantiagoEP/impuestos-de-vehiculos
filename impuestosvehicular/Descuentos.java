package impuestosvehicular;




import java.util.Scanner;

public class Descuentos extends ListaVehiculos{
    
    public int valorImpuesto;
    public int descuentoProntoPago;
    public int descuentoServicioPublico;
    public int descuentoTrasladoCuenta;
    
    Scanner sc = new Scanner(System.in);
    
    public Descuentos(){
        descuentoProntoPago=0;
        descuentoServicioPublico=0;
        descuentoServicioPublico=0;
    }
    
    public Descuentos (int descuentoProntoPago,int descuentoServicioPublico,int descuentoTrasladoCuenta){
        
        this.descuentoProntoPago= descuentoProntoPago;
        this.descuentoServicioPublico= descuentoServicioPublico;
        this.descuentoTrasladoCuenta= descuentoTrasladoCuenta;
        }

    public int getDescuentoProntoPago() {
        return descuentoProntoPago;
    }

    public void setDescuentoProntoPago(int descuentoProntoPago) {
        this.descuentoProntoPago = descuentoProntoPago;
    }

    public int getDescuentoServicioPublico() {
        return descuentoServicioPublico;
    }

    public void setDescuentoServicioPublico(int descuentoServicioPublico) {
        this.descuentoServicioPublico = descuentoServicioPublico;
    }

    public int getDescuentoTrasladoCuenta() {
        return descuentoTrasladoCuenta;
    }

    public void setDescuentoTrasladoCuenta(int descuentoTrasladoCuenta) {
        this.descuentoTrasladoCuenta = descuentoTrasladoCuenta;
    }
    
    public void calculaTotalImpuesto(){
        System.out.println("Ingrese el valor del impuesto: ");
        valorImpuesto = sc.nextInt(); 
        
        descuentoProntoPago= (int) (valorImpuesto*0.3);
        System.out.println("El total a pagar es de: "+ descuentoProntoPago);
        
        descuentoServicioPublico= valorImpuesto-150000;
        System.out.println("El total a pagar es de: "+ descuentoServicioPublico);
        
        descuentoTrasladoCuenta= (int) (valorImpuesto*0.5);
        System.out.println("El total a pagar es de: "+ descuentoTrasladoCuenta);
    }

}

