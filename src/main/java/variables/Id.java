package variables;

/** Id que define el usuario para sus variables o funciones, es abstracta asi no la puedo instanciar*/
public abstract class Id {
    /* TODO: preguntar al profe si haría falta un campo value para las variables y
     * un body para funciones (este creo que no, pero por las dudas).
     */

    protected String nombre;
    protected TipoDato tipo;
    protected Boolean inicializado;
    protected Boolean usado;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(TipoDato tipo) {
        this.tipo = tipo;
    }

    public TipoDato getTipo() {
        return tipo;
    }

    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }

    public Boolean getInicializado() {
        return inicializado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public Boolean getUsado() {
        return usado;
    }
}