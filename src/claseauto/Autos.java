
package claseauto;

//clase Autos
public class Autos {
    private String Nombre;
    private String tipoDeAuto;
    private int velocidad;

    //molde constructor vacío. Debe tener el mismo nombre de la clase, de lo contrario sería un metodo y hay que especificarle tipo de dato a los métodos.
    public Autos(){}
    
   //se unsa uno u otro, el constructor vacio, o el que tiene parámetros.
    
    //molde constructor con parámetros.
    public Autos(String Nombre1, String tipoDeAuto1, int velocidad1){
        
        this.Nombre=Nombre1;
        this.tipoDeAuto=tipoDeAuto1;
        this.velocidad=velocidad1;
        
              
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(String tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
