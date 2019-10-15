import java.util.Vector;

public class Entrenador
{
    //ARREGLO PARA GUARDAR POKEMONES
    Vector<Pokemon> p= new Vector<Pokemon>();
    
    
    //ATRIBUTOS
    private String nombre;
    private Integer edad;
    
    
    public Entrenador(String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public Entrenador()
    {
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Integer getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    public Integer getNumeroPokemones(){
        return p.size(); /** TAMAÑO DEL VECTOR QUE NOS DEFINE EL NUMERO DE POKEMONES QUE TIENE EL ENTRENADOR **/
    }
    
    public void capturarPokemon(Pokemon pokemon){
        p.addElement(pokemon); 
        /**AÑADIMOS EL OBJETO POKEMON EN LA POSICION FINAL DEL VECTOR O ARREGLO
        TENGAMOS EN CUENTA QUE DESDE UN PRINCIPIO EL VECTOR ESTA VACIO Y CADA VEZ QUE SE LE AÑADA UN ELEMENTO ESTE SE VA LLENANDO
        TAMBIEN LLAMADO VECTOR O ARREGLO DINAMICO **/
    }
    
    public void liberarPokemon(Integer numeroPokemon){
        int aux= numeroPokemon-1; /** RESTAMOS UNO PORQUE LOS ARREGLOS COMIENZAN DESDE 0 **/
        p.removeElementAt(aux); /** ELIMINAMOS EL POKEMON POR MEDIO DE UN METODO PROPIO DE LA CLASE VECTOR **/
    }
        
    public Pokemon getPokemon(Integer numeroPokemon){
        return p.get(numeroPokemon-1); 
        /** ACCEDEMOS AL OBJETO POKEMON EN LA POSICION INDICADA POR EL USUARIO
        TENIENDO EN CUENTA QUE EL CONTEO DEL ENTRENADOR ES DESDE 1 Y EL DEL VECTOR ES DESDE 0**/
    }
    
    public void setPokemon(Integer numeroPokemon, Pokemon pokemon){
        p.set(numeroPokemon-1, pokemon);
        /** MODIFICAMOS AL OBJETO POKEMON EN LA POSICION INDICADA POR EL USUARIO
        TENIENDO EN CUENTA QUE EL CONTEO DEL ENTRENADOR ES DESDE 1 Y EL DEL VECTOR ES DESDE 0**/
    }
}
