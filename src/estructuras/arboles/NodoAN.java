package estructuras.arboles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Nodo de un árbol n-ario
 * @author Alvaro
 *
 * @param <K>
 * @param <V>
 */
public class NodoAN<K extends Comparable<K>,V> implements Serializable, Map.Entry<K, V> 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador del nodo 
	 */
	private K id;
	
	/**
	 * Elemento del nodo
	 */
	private V elem;
	
	/**
	 * Lista de hijos del nodo
	 */
	private List<NodoAN<K, V>> hijos;
	

	/**
	 * Construye un nuevo nodo con la información por parámetro
	 * @param nId el id del nodo. nId != null
	 * @param nElem el elemento del nodo. nElem != null
	 */
	public NodoAN(K nId, V nElem)
	{
		id = nId;
		elem = nElem;
		hijos = new ArrayList<NodoAN<K,V>>();

	}
	
	/**
	 * Devuelve el id del nodo
	 * @return id
	 */
	public K getKey() {
		return id;
	}

	/**
	 * Devuelve el elemento del nodo
	 * @return elem
	 */
	public V getValue() {
		return elem;
	}

	/**
	 * Cambia el elemento alamcenado en el nodo
	 * @param nElem el nuevo elemento del nodo
	 * @return el elemento previo del nodo
	 */
	public V setValue(V nElem)
	{
		V antiguo = elem;
		elem = nElem;
		return antiguo;
	}

	/**
	 * Inidica si el sub árbol que inicia en el nodo contiene el id por parámetro
	 * @param buscado el id buscado
	 * @return true en caso que el sub árbol contenga la llave o false en caso contrario
	 */
	public boolean containsKey(K buscado)
	{
		//TODO complete según la documentación
	}

	/**
	 * Devuelve el elemento del nodo con el id dado por parámetro
	 * @param buscado el id del nodo buscado
	 * @return el elemento del nodo o null en caso que no exista un nodo con el id dado
	 */
	public V get(K buscado) 
	{
		//TODO complete según la documentación
	}
	
	/**
	 * Devuelve un nodo del sub árbol dado su id
	 * @param buscado el id del nodo buscado
	 * @return el nodo con el id buscado o null en caso que no exista
	 */
	public NodoAN<K,V> getNodo(K buscado) 
	{
		//TODO complete según la documentación
	}

	/**
	 * Agrega un nuevo nodo a la lista de hijos del nodo
	 * @param nId el id del nuevo nodo. nId != null
	 * @param nElem el elemento del nuevo nodo. nElem != null
	 */
	public void put(K nId, V nElem)
	{
		//TODO complete según la documentación
	}

	/**
	 * Devuelve la cantidad de nodos del sub árbol que inicia en el nodo
	 * @return cantidad de nodos
	 */
	public int size()
	{
		//TODO complete según la documentación
	}

	/**
	 * Construye un conjunto de los ids de los nodos del árbol
	 * @param s el conjunto donde se acumulan los ids de los nodos del árbol
	 */
	public void keyset(Set<K> s) 
	{
		s.add(id);
		for (int i = 0; i < hijos.size(); i++) {
			 hijos.get(i).keyset(s);			
		}
	}

	/**
	 * Indica si el sub árbol que inicia en el nodo contiene el elemento por parámetro
	 * @param buscado el valor buscado
	 * @return true en caso que el árbol tenga el elemento o false en caso contrario
	 */
	public boolean containsValue(V buscado) 
	{
		//TODO complete según la documentación
	}

	/**
	 * Construye un conjunto con los nodos del árbol en pre orden
	 * @param s el conjunto donde se acumulan los nodos del árbol
	 */
	public void entrySet(Set<java.util.Map.Entry<K, V>> s) 
	{
		s.add(this);
		for (int i = 0; i < hijos.size(); i++) {
			 hijos.get(i).entrySet(s);			
		}
		
	}

	/**
	 * Construye una colección de los elementos del árbol en pre orden
	 * @param s la colección donde se acumulan los elementos del árbol
	 */
	public void values(Collection<V> s) 
	{
		//TODO complete según la documentación
		
	}
	
	/**
	 * Construye una colección de los elementos del árbol en pos orden
	 * @param s la colección donde se acumulan los elementos del árbol
	 */
	public void valuesPos(Collection<V> s) 
	{
		//TODO complete según la documentación
		
	}
	
	/**
	 * Construye una colección de los elementos de un nivel del árbol
	 * @param s la colección donde se acumulan los elementos del árbol
	 * @param level el nivel del que se desean los elementos
	 */
	public void valuesLevel(Collection<V> s, int level) 
	{
		//TODO complete según la documentación
	}
	
	/**
	 * Elimina un nodo del árbol, en caso que tenga hijos estos tambien se eliminan
	 * @param buscado el identificador del nodo a eliminar
	 * @return el elemento del nodo eleminado o null en caso que no se encuentre el nodo a eliminar
	 */
	public V remove(K buscado)
	{
		//TODO complete según la documentación
	}

	/**
	 * Indica si el nodo es hoja
	 * @return true en caso que el nodo sea hoja o false en caso contrario
	 */
	public boolean esHoja() 
	{
		//TODO complete según la documentación
	}
	
	/**
	 * Construye una colección con los valores en las hojas del árbol
	 * @param s la colección donde se acumulan las hojas del árbol
	 */
	public void darHojas(Collection<V> s) 
	{
		//TODO complete según la documentación
	}
	
	/**
	 * Devuelve la lista de hijos del árbol
	 * @return hijos
	 */
	public Collection<NodoAN<K, V>> darHijos()
	{
		return hijos;
	}
	
	public String toString()
	{
		return elem.toString();
	}



}
