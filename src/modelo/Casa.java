package modelo;

/**
 * Permite crear una instancia de Inmueble tipo Casa
 * @author Oscar Cely
 */
public class Casa extends Inmueble{
    
    private int cantNiveles;
    
    /**
     * Constructor parametrico que permite instanciar la clase Casa
     * a partir de los datos Propietario, Chip, Direccion, valor de la casa y Cantidad de niveles
     * @param objP Apuntador a objeto Propietario de la casa
     * @param chip CHIP de la casa
     * @param dir Direccion de la casa
     * @param valor Valor de la casa
     * @param cantNiveles Cantidad de niveles o pisos de la casa
     */
    public Casa(int cantNiveles, Propietario objP, String chip, String dir, double valor) {
        super(objP, chip, dir, valor);
        this.cantNiveles = cantNiveles;
    }
       
    /**
     * Constructor basico que permite instanciar la clase con valores 
     * predeterminados
     */
    public Casa() {
        super();
        this.cantNiveles = 0;
    }
    
    /**
     * Retorna el valor del impuesto de la casa a partir del valor de esta y 
     * corresponde al 10%
     * @return double
     */
    
    
    @Override
    public double imuesto() {
        return this.valor * 0.1;
    }
    
    /* No es necesario los getters and setters de esta clase ya que los esta 
    heredando de la clase padre, a menos solo que se quieran sobreescribir los 
    metodos. Solo seria necesario los get y set de los atributos propios de la 
    clase, en este caso cantNiveles */

    /**
     * Retorna la cantidad de pisos o niveles definidos para la casa
     * @return int
     */
    //@return + tipo de dato que retorna

    public int getCantNiveles() {
        return cantNiveles;
    }

    /**
     * Establece o modifica la cantidad de niveles de la casa
     * @param cantNiveles
     */
    public void setCantNiveles(int cantNiveles) {
        this.cantNiveles = cantNiveles;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n cantNiveles=" + cantNiveles;
    }
    
    
    
}
