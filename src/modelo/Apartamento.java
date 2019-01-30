package modelo;

/**
 * Permite crear una instancia de Inmueble tipo Apartamento
 * @author Oscar Cely
 */
public class Apartamento extends Inmueble{
    
    private int bloque, numeroApto;

    /**
     * Constructor parametrico que permite instanciar la clase Apartamento
     * a partir de los datos bloque, y numeroApto
     * @param bloque
     * @param numeroApto
     */
    public Apartamento(int bloque, int numeroApto) {
        super();
        this.bloque = bloque;
        this.numeroApto = numeroApto;
    }

    /**
     * Constructor basico que permite instanciar la clase con valores 
     * predeterminados
     */
    public Apartamento() {
        super();
        this.bloque = 0;
        this.numeroApto = 0;
    }

    /**
     * Retorna el numero del bloque del apartamento
     * @return int
     */
    public int getBloque() {
        return bloque;
    }

    /**
     * Establece o modifica el numero del bloque del apartamento
     * @param bloque
     */
    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    /**
     * Retorna el numero del apartamento
     * @return int
     */
    public int getNumeroApto() {
        return numeroApto;
    }

    /**
     * Establece o modifica el numero del apartamento
     * @param numeroApto
     */
    public void setNumeroApto(int numeroApto) {
        this.numeroApto = numeroApto;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n bloque = " + bloque + ""
                + "\n numeroApto = " + numeroApto;
    }

    /**
     * Retorna el valor del impuesto del apartamento a partir del valor de este y 
     * corresponde al 10%
     * @return double
     */
    
    public double imuesto() {
        return this.valor * 0.1;
    }
    
        
}
