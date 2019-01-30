/*
Superclase
inmueble se compone de los datos del propietario, por ello se crea la clase propietario primero
 */
package modelo;

/**
 * Clase abstracta que hereda a Casa y Apartamento
 * @author Oscar Cely
 */
public abstract class Inmueble {

    protected Propietario objP;
    protected String chip, dir;
    protected double valor;

    /**
     * Constructor parametrico que permite instanciar las clases Casa y 
     * Apartamemto con los atributos que ambas tienen en comun
     * @param objP Apuntador al objeto Propietario
     * @param chip 
     * @param dir Direccion del inmueble
     * @param valor Valor del inmueble
     */
    public Inmueble(Propietario objP, String chip, String dir, double valor) {
        this.objP = objP;
        this.chip = chip;
        this.dir = dir;
        this.valor = valor;
    }

    /**
     * Constructor basico que permite instanciar la clase las clases Casa y 
     * Apartamemto con los atributos que ambas tienen en comun dando un valor
     * predeterminado a cada uno
     */
    public Inmueble() {
        objP = new Propietario();
        this.chip = "";
        this.dir = "";
        this.valor = 0;
    }

    /**
     * Retorna el apuntador al objeto propietario
     * @return Propietario
     */
    public Propietario getObjP() {
        return objP;
    }

    /**
     * Establece o modifica algun atributo del propietario por medio del 
     * apuntador de este 
     * @param objP
     */
    public void setObjP(Propietario objP) {
        this.objP = objP;
    }

    /**
     * Retorna el CHIP del inmueble
     * @return
     */
    public String getChip() {
        return chip;
    }

    /**
     * Establece o modifica el CHIP del inmueble
     * @param chip
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * Retorna la direccion del inmueble
     * @return String
     */
    public String getDir() {
        return dir;
    }

    /**
     * Establece o modifica la direccion del inmueble
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * Retorna el valor del inmueble
     * @return double
     */
    public double getValor() {
        return valor;
    }

    /**
     * Establece o modifica el valor del inmueble
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Propietario{" + "objP=" + objP.toString() + 
                "\n chip=" + chip + 
                "\n dir=" + dir + 
                "\n valor=" + valor;
    }
    
    /**
     * Retorna el valor del impuesto del inmueble a partir del valor de este
     * @return double
     */
    public abstract double imuesto();
     
    
}
