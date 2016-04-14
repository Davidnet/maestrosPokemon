package estructuras.arboles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * �rbol N-ario
 * @author Alvaro
 *
 * @param <K>
 * @param <V>
 */
public class ArbolN <K extends Comparable<K>, V> implements Serializable, Map<K, V> {

	/**
	 * Nodo ra�z del �rbol n-ario
	 */
	private NodoAN<K, V> raiz;
	
	/**
	 * Construye un nuevo �rbol n-ario sin elementos
	 */
	public ArbolN() 
	{
		raiz = null;
	}
	/**
	 * Construye un �rbol con la ra�z que llega por par�metro
	 * @param nRaiz la nueva ra�z del �rbol
	 */
	public ArbolN(NodoAN<K, V>  nRaiz) 
	{
		raiz = nRaiz;
	}
	
	/**
	 * Elimina todos los elementos del �rbol
	 */
	public void clear() 
	{
		//TODO complete seg�n la documentaci�n
	}

	/**
	 * Indica si en el �rbol alg�n nodo tiene el identificador por par�metro
	 * @param id identificador que se desea buscar
	 * @return true en caso de que el �rbol contenga un el nodo con id dado por par�metro, false en caso contrario
	 */
	public boolean containsKey(Object id) 
	{
		K buscado = (K)id;
		//TODO complete seg�n la documentaci�n
	}

	/**
	 * Indica si alg�n nodo del �rbol tiene el elemento por par�metro
	 * @param elem el elemento que se desea buscador
	 * @return true en caso de que el �rbol contenga un nodo con el elemento dado por par�metro
	 */
	public boolean containsValue(Object elem) 
	{
		V buscado = (V)elem;
		//TODO complete seg�n la documentaci�n
	}


	/**
	 * Devuelve el elemento con el identificador dado por par�metro
	 * @param id el identificador del elemento que se desea buscar
	 * @return el elemento con el identificador dado por par�metro o null en caso que no se encuentre en el �rbol
	 */
	public V get(Object id) 
	{
		K buscado = (K)id;
		//TODO complete seg�n la documentaci�n
	}
	
	/**
	 * Deuvelve un nodo del �rbol dado su identificador
	 * @param id el identificador del nodo
	 * @return el nodo o null en caso de que no exista
	 */
	public NodoAN<K,V> getNodo(Object id) 
	{
		K buscado = (K)id;
		//TODO complete seg�n la documentaci�n
	}


	/**
	 * Indica si el �rbol est� vac�o
	 * @return true en caso que el �rbol est� vac�o o false en caso contrario
	 */
	public boolean isEmpty() 
	{
		//TODO complete seg�n la documentaci�n
	}

	/**
	 * Devuelve un conjunto con los nodos del �rbol
	 * @return nodos del �rbol o un conjunto vac�o en caso que el �rbol lo est�
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
	 * Devuelve un conjunto con todos los id del �rbol
	 * @return conjunto con los identificadores de todos los nodos del �rbol o un conjunto vac�o si el �rbol lo est�
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
	 * Agrega un nodo al �rbol dada su informaci�n
	 * @param idPadre identificador del padre del nodo si es null el nuevo nodo se agrega como ra�z
	 * @param id el identificador del nuevo nodo
	 * @param elem el elemento del nuevo nodo
	 * @return el elemento del nodo agregado
	 * @throws NullPointerException Se lanza en caso que el id o elemento se�n nulos
	 * @throws IllegalArgumentException Se lanza en caso que ya exista un nodo con el id dado o que no exista el padre en el �rbol
	 */
	public V put(K idPadre, K id, V elem) throws NullPointerException, IllegalArgumentException
	{
		//TODO complete seg�n la documentaci�n
		
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
	 * Elimina un nodo del �rbol
	 * @param id el identificador del nodo
	 * @return el elemento almacenado en el nodo eliminado
	 */
	public V remove(Object id) {
		K buscado = (K)id;
		//TODO complete seg�n la documentaci�n
		
	}

	/**
	 * Devuelve la cantidad de nodos en el �rbol
	 * @return nodos en el �rbol
	 */
	public int size() 
	{
		//TODO complete seg�n la documentaci�n
	}

	/**
	 * Devuelve la colecci�n de elementos del �rbol en preorden
	 * @return colecci�n de elementos almacenados en el �rbol o colecci�n vac�a si el �rbol lo est�
	 */
	public Collection<V> values() {
		//TODO complete seg�n la documentaci�n
	}
	
	/**
	 * Devuelve el nodo ra�z del �rbol
	 * @return raiz
	 */
	public NodoAN<K,V> darRaiz()
	{
		return raiz;
	}
	
	/**
	 * Devuelve la colecci�n de elementos del �rbol en postorden
	 * @return colecci�n de elementos almacenados en el �rbol o colecci�n vac�a si el �rbol lo est�
	 */
	public Collection<V> valuesPos() {
		//TODO complete seg�n la documentaci�n
	}
	
	/**
	 * Devuelve la colecci�n de elementos del �rbol por nivel
	 * @param level el nivel del que se desean los elementos
	 * @return colecci�n de elementos almacenados en el �rbol o colecci�n vac�a si el �rbol lo est�
	 */
	public Collection<V> valuesLevel(int level) {
		//TODO complete seg�n la documentaci�n
	}
}
