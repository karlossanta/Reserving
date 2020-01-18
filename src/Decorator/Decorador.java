package Decorator;

/**
 * Decorador.
 */
public abstract class Decorador implements Usuario {

   public Decorador(Usuario u) {
        this.usuario = u;
    }
     
    private Usuario usuario;

    /**
     * Set the value of contrasenna
     *
     * @param contrasenna new value of contrasenna
     */
   @Override
    public void setContrasenna(String contrasenna) {
        this.usuario.setContrasenna(contrasenna);
    }


    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
   @Override
    public String getUsuario() {
        return usuario.getUsuario();
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
   @Override
    public void setUsuario(String usuario) {
        this.usuario.setUsuario(usuario);
    }
    
   @Override
    public boolean validarUsuario(String contrasenna){
        return usuario.validarUsuario(contrasenna);
    }
}
