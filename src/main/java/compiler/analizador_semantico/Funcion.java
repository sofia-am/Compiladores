package compiler.analizador_semantico;

import java.util.*;

/**Define una función que puede recibir múltiples argumentos, y un tipo de dato que es el retorno.
*/
public class Funcion extends Id {
    /*No se si se va a usar el retorno, porque creo que no lo pide, pero por las dudas lo dejo */
    private List<TipoDato> args;

    public Funcion(TipoDato tipo, String nombre, List<TipoDato> args, Boolean inicializado, Boolean usado) {
        super.tipo = tipo;
        super.nombre = nombre;        
        this.args = args;
        super.inicializado = inicializado;        
        super.usado = usado;
    }

    public TipoDato getRetorno() {
        return tipo;
    }

    public List<TipoDato> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return tipo.name() + " " + getNombre() + " " + getArgs().toString() + " inicializado: " 
        + getInicializado().toString() + " usado: " + getUsado().toString();
    }
}