package Decorator;

/**
 * Componente concreto.
 */
public class UsuarioGeneral implements Usuario {

   public UsuarioGeneral(String usuario, String contrasenna) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }
     
    private String usuario; 
    private String contrasenna;

    /**
     * Set the value of contrasenna
     *
     * @param contrasenna new value of contrasenna
     */
   @Override
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }


    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
   @Override
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
   @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
   @Override
    public boolean validarUsuario(String contrasenna){
        return contrasenna.equals(this.contrasenna);
    }
}
