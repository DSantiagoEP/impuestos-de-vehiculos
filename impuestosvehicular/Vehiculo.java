
package impuestosvehicular;

public class Vehiculo {
    
    public String marca;
    public String linea;
    public int modelo;
    
    public Vehiculo (){
        
        marca="";
        linea="";
        modelo=0;   
    
    }   
    public Vehiculo (String marca, String linea, int modelo){       
        this.marca=marca;
        this.linea=linea;
        this.modelo=modelo;
    }
    
    //Metodos getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
        
//Metodo para mostrar datos
    public void mostrarDatos(){
        /*System.out.println("Datos del vehiculo: \n"+
        "Marca: "+getMarca()+"\nLinea: "+getLinea()+"\nSacado en el año: "
        +getModelo());*/
    }

}
