package compiler.analizador_semantico;

import java.util.*;

/**Tabla de símobolos del compilador, es un singleton*/
public class TablaSimbolos {
    private static TablaSimbolos instance;
    private LinkedList<Map<String,Id>> Ids;
    
    private TablaSimbolos () {
        //El contructor es privado para prevenir al programador de crear
        //instancias si desconoce que es un singleton
        this.Ids = new LinkedList<Map<String, Id>>(); //creo una double linked list
    }

    /**Ejecución del patrón Singleton, si es null creo la instancia, sino
    devuelvo la instancia directamente*/
    public static TablaSimbolos getInstanceOf() {
        return instance == null ? instance = new TablaSimbolos() : instance;
    }

    public LinkedList<Map<String,Id>> getIds() {
        return this.Ids;
    }

    /**Cada vez que se abre una llave por ejemplo se debe agregar un
    nuevo contexto, es decir otro map a la lista, tener en cuenta que el
    contexto actual va a ser siempre el último nodo de la lista*/
    public void addContexto() {
        Ids.addLast(new HashMap<String, Id>());
    }

    /**Entienod que vamos a borrar un contexto al salir del mismo por
    lo que voy a borrar el último nodo de la lista*/
    public void delContexto() {
        Ids.removeLast();
    }

    /**Agrega un nuevo símbolo en el último nodo de la lista*/
    public void addSimbolo(Id id) {
        Ids.getLast().put(id.getNombre(), id);
    } 

    /**Esta función busca si un símbolo está presente sobre toda la tabla.
     * TODO: se podría ver si hay algún método o realizar un algoritmo más eficiente
     * */
    public Boolean buscarSimbolo(Id id) {
        for (Map<String,Id> aux : Ids) {
            if (aux.containsKey(id.getNombre())) return true;
        }
        return false;
    }

    /** Esta función busca un símbolo dentro del contexto actual */
    public Boolean buscarSimboloLocal (Id id) {
        return Ids.getLast().containsKey(id.getNombre());
    }
}