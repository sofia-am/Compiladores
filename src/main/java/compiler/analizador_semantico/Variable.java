package compiler.analizador_semantico;

/**Variables del programa*/
public class Variable extends Id {

    public Variable(TipoDato tipo, String nombre, Boolean inicializado, Boolean usado) {
        super.tipo = tipo;
        super.nombre = nombre;
        super.inicializado = inicializado;
        super.usado = usado;
    }    

    @Override
    public String toString() {
        return tipo.name() + " " + getNombre() + " " + "inicializado: " + getInicializado()
        + " usado: " + getUsado(); 
    }
}