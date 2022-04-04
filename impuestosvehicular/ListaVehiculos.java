
package impuestosvehicular;

import java.util.ArrayList;

public class ListaVehiculos extends Vehiculo {

private ArrayList <Vehiculo> listaVehiculos;

  public ListaVehiculos (){      
       listaVehiculos= new ArrayList <Vehiculo> ();
}
       public void addVehiculo (Vehiculo vehículo) {
       listaVehiculos.add(vehículo); 
}

public void listar (){
    Vehiculo vehiculo1 = new Vehiculo("Ford", "Taurus", 2018);
    Vehiculo vehiculo2= new  Vehiculo("Chevrolet", "Camaro", 2015);
    Vehiculo vehiculo3= new Vehiculo("Dodge", "Challenger", 1979);
    Vehiculo vehiculo4= new Vehiculo("Ford", "Fiesta", 2012);
    Vehiculo vehiculo5= new Vehiculo("Renault", "Logan", 2012);
    Vehiculo vehiculo6= new Vehiculo("Ford", "Mustang", 2003);
    Vehiculo vehiculo7= new Vehiculo("Dodge", "Avenger", 2010);
    Vehiculo vehiculo8= new Vehiculo("Chevrolet", "Spark", 2021);
    Vehiculo vehiculo9= new Vehiculo("Chevrolet", "Aveo Sedan", 2010);
    Vehiculo vehiculo10= new Vehiculo("Dodge", "Charger", 2018);
    
    //Descuentos descuento = new Descuentos(0, 0, 0);
    
       System.out.println ("Se muestra los datos de los vehículos");
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo1.getMarca()+"\nLinea: "+vehiculo1.getLinea()+"\nSacado en el año: "
        +vehiculo1.getModelo() + "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo2.getMarca()+"\nLinea: "+vehiculo2.getLinea()+"\nSacado en el año: "
        +vehiculo2.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo3.getMarca()+"\nLinea: "+vehiculo3.getLinea()+"\nSacado en el año: "
        +vehiculo3.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo4.getMarca()+"\nLinea: "+vehiculo4.getLinea()+"\nSacado en el año: "
        +vehiculo4.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo5.getMarca()+"\nLinea: "+vehiculo5.getLinea()+"\nSacado en el año: "
        +vehiculo5.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo6.getMarca()+"\nLinea: "+vehiculo6.getLinea()+"\nSacado en el año: "
        +vehiculo6.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo7.getMarca()+"\nLinea: "+vehiculo7.getLinea()+"\nSacado en el año: "
        +vehiculo7.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo8.getMarca()+"\nLinea: "+vehiculo8.getLinea()+"\nSacado en el año: "
        +vehiculo8.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo9.getMarca()+"\nLinea: "+vehiculo9.getLinea()+"\nSacado en el año: "
        +vehiculo9.getModelo()+ "\n");
       
       System.out.println("Datos del vehiculo: \n"+
        "Marca: "+vehiculo10.getMarca()+"\nLinea: "+vehiculo10.getLinea()+"\nSacado en el año: "
        +vehiculo10.getModelo()+ "\n");
       

 for (Vehiculo tmp: listaVehiculos){

      tmp.mostrarDatos();
      

}
}
}