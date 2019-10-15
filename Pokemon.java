
public class Pokemon
{
    private String nombre;
    private String tipo;
       
    public Pokemon()
    {
    }

    public Pokemon(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;

    }
    
    public String getNombre(){
        return this.nombre; 
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}
