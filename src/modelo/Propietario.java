package modelo;

/**
 * Permite crear una instancia de tipo Propietario
 * @author Oscar Cely
 */
public class Propietario {
    private String id, nom, tel;
    
    /**
     * Constructor basico que permite instanciar la clase Propietario con 
     * valores predeterminados
     */
    public Propietario(){
        this.id = "";
        this.nom = ""; 
        this.tel = "";
    }

    /**
     * Constructor parametrico que permite instanciar la clase Propietario
     * a partir de los datos identificacion (id), nombre (nom) y telefono (tel)
     * @param id
     * @param nom
     * @param tel
     */
    public Propietario(String id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }

    /**
     * Retorna el numero de identificacion del propietario
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Establece o modifica el numero de identificacion del propietario
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retorna el nombre del propietario
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Establece o modifica el nombre del propietario
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna el telefono del propietario
     * @return String
     */
    public String getTel() {
        return tel;
    }

    /**
     * Establece o modifica el telefono del propietario
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", tel=" + tel;
    }
    
    
    
}
