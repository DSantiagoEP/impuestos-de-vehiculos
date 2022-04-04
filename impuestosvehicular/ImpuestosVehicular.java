
package impuestosvehicular;


import impuestosvehicular.Descuentos;
 
public class ImpuestosVehicular {

    public static void main(String[] args) {
        
        Descuentos descuento = new Descuentos(0, 0, 0);
        
        Vehiculo vehiculo1 = new Vehiculo ();
        
        ListaVehiculos lista1=new ListaVehiculos();
        lista1.addVehiculo(vehiculo1);
        lista1.addVehiculo(vehiculo1);
        lista1.listar();
      
    }
    
 
}

