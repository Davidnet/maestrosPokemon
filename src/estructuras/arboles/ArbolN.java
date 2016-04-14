package estructuras.arboles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Árbol N-ario
 * @author Alvaro
 *
 * @param <K>
 * @param <V>
 */
public class ArbolN <K extends Comparable<K>, V> implements Serializable, Map<K, V> {

	/**
	 * Nodo raíz del árbol n-ario
	 */
	private NodoAN<K, V> raiz;
	
	/**
	 * Construye un nuevo árbol n-ario sin elementos
	 */
	public ArbolN() 
	{
		raiz = null;
	}
	/**
	 * Construye un árbol con la raíz que llega por parámetro
	 * @param nRaiz la nueva raíz del árbol
	 */
	public ArbolN(NodoAN<K, V>  nRaiz) 
	{
		raiz = nRaiz;
	}
	
	/**
	 * Elimina todos los elementos del árbol
	 */
	public void clear() 
	{
		//TODO complete según la documentación
	}

	/**
	 * Indica si en el árbol algún nodo tiene el identificador por parámetro
	 * @param id identificador que se desea buscar
	 * @return true en caso de que el árbol contenga un el nodo con id dado por parámetro, false en caso contrario
	 */
	public boolean containsKey(Object id) 
	{
		K buscado = (K)id;
		//TODO complete según la documentación
	}

	/**
	 * Indica si algún nodo del árbol tiene el elemento por parámetro
	 * @param elem el elemento que se desea buscador
	 * @return true en caso de que el árbol contenga un nodo con el elemento dado por parámetro
	 */
	public boolean containsValue(Object elem) 
	{
		V buscado = (V)elem;
		//TODO complete según la documentación
	}


	/**
	 * Devuelve el elemento con el identificador dado por parámetro
	 * @param id el identificador del elemento que se desea buscar
	 * @return el elemento con el identificador dado por parámetro o null en caso que no se encuentre en el árbol
	 */
	public V get(Object id) 
	{
		K buscado = (K)id;
		//TODO complete según la documentación
	}
	
	/**
	 * Deuvelve un nodo del árbol dado su identificador
	 * @param id el identificador del nodo
	 * @return el nodo o null en caso de que no exista
	 */
	public NodoAN<K,V> getNodo(Object id) 
	{
		K buscado = (K)id;
		//TODO complete según la documentación
	}


	/**
	 * Indica si el árbol está vacío
	 * @return true en caso que el árbol esté vacío o false en caso contrario
	 */
	public boolean isEmpty() 
	{
		//TODO complete según la documentación
	}

	/**
	 * Devuelve un conjunto con los nodos del árbol
	 * @return nodos del árbol o un conjunto vacío en caso que el árbol lo esté
	 */
	public Set<java.util.Map.Entry<K, V>> entrySet() 
	{
		Set<java.util.Map.Entry<K, V>> s = new HashSet<java.util.Map.Entry<K, V>>();
		if(raiz!=null)
		{
			raiz.entrySet(s);
		}
		
		return s;
	}

	/**
	 * Devuelve un conjunto con todos los id del árbol
	 * @return conjunto con los identificadores de todos los nodos del árbol o un conjunto vacío si el árbol lo está
	 */
	public Set<K> keySet() 
	{
		Set<K> s = new HashSet<K>();
		if(raiz!=null)
		{
			raiz.keyset(s);
		}
		
		return s;
	}

	/**
	 * Agrega un nodo al árbol dada su información
	 * @param idPadre identificador del padre del nodo si es null el nuevo nodo se agrega como raíz
	 * @param id el identificador del nuevo nodo
	 * @param elem el elemento del nuevo nodo
	 * @return el elemento del nodo agregado
	 * @throws NullPointerException Se lanza en caso que el id o elemento seán nulos
	 * @throws IllegalArgumentException Se lanza en caso que ya exista un nodo con el id dado o que no exista el padre en el árbol
	 */
	public V put(K idPadre, K id, V elem) throws NullPointerException, IllegalArgumentException
	{
		//TODO complete según la documentación
		
	}
	
	public V put(K key, V value) 
	{
		// TODO No se implementa
		return null;
	}


	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO No se implementa
	}

	/**
	 * Elimina un nodo del árbol
	 * @param id el identificador del nodo
	 * @return el elemento almacenado en el nodo eliminado
	 */
	public V remove(Object id) {
		K buscado = (K)id;
		//TODO complete según la documentación
		
	}

	/**
	 * Devuelve la cantidad de nodos en el árbol
	 * @return nodos en el árbol
	 */
	public int size() 
	{
		//TODO complete según la documentación
	}

	/**
	 * Devuelve la colección de elementos del árbol en preorden
	 * @return colección de elementos almacenados en el árbol o colección vacía si el árbol lo está
	 */
	public Collection<V> values() {
		//TODO complete según la documentación
	}
	
	/**
	 * Devuelve el nodo raíz del árbol
	 * @return raiz
	 */
	public NodoAN<K,V> darRaiz()
	{
		return raiz;
	}
	
	/**
	 * Devuelve la colección de elementos del árbol en postorden
	 * @return colección de elementos almacenados en el árbol o colección vacía si el árbol lo está
	 */
	public Collection<V> valuesPos() {
		//TODO complete según la documentación
	}
	
	/**
	 * Devuelve la colección de elementos del árbol por nivel
	 * @param level el nivel del que se desean los elementos
	 * @return colección de elementos almacenados en el árbol o colección vacía si el árbol lo está
	 */
	public Collection<V> valuesLevel(int level) {
		//TODO complete según la documentación
	}
}
