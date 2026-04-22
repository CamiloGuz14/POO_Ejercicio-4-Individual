public class UsuarioSeguroAvanzado {

    private String username;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private int maxIntentos;
    private boolean accesoExitoso;

    public UsuarioSeguroAvanzado(String username, String password, int maxIntentos) {
        this.username = username;
        this.password = password;
        this.maxIntentos = maxIntentos;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.accesoExitoso = false;
    }

    public String getUsername() {
        return "";
    }

    public int getIntentosFallidos() {
        return 0;
    }

    public boolean isBloqueado() {
        return false;
    }

    public int getMaxIntentos() {
        return 0;
    }

    public boolean isAccesoExitoso() {
        return false;
    }

    public boolean autenticar(String passwordIngresada) {
        return false;
    }

    public void reiniciarAcceso() {

    }

    public boolean cambiarPassword(String actual, String nueva) {
        return false;
    }
}