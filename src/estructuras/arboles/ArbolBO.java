package estructuras.arboles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;


/**
 * Árbol binario ordenado
 * @author adlvar-go
 * @param <K> tipo del identificador
 * @param <V> tipo de los elementos guardados
 */
public class ArbolBO<K extends Comparable<K>, V> implements SortedMap<K, V>
{

	/**
	 * Raíz del árbol
	 */
	private NodoABO<K, V> raiz;
	
	/**
	 * Crea un nuevo árbol sin elementos
	 * post: la raíz del árbol como null
	 */
	public ArbolBO() 
	{
		//TODO Completar según la documentación
	}
	
	/**
	 * Crea un nuevo árbol con elementos
	 * @param nRaiz la raíz del árbol
	 */
	public ArbolBO(NodoABO<K, V>  nRaiz) 
	{
		raiz = nRaiz;
	}
	
	/**
	 * Elimina todos los elementos del árbol
	 */
	public void clear() 
	{
		//TODO Completar según la documentación
	}

	/**
	 * Indica si el árbol contiene un elemento con el identificador dado
	 * @return true si el árbol contiene el identificador o false en caso contrario
	 */
	public boolean containsKey(Object id) 
	{
		K buscado = (K)id;
		//TODO Completar según la documentación
	}

	/**
	 * Indica si el árbol contiene el elemento dado por parámetro
	 * @return true si el árbol contiene el elemento o false en caso contrario
	 */
	public boolean containsValue(Object elem) 
	{
		V buscado = (V)elem;
		//TODO Completar según la documentación
	}

	/**
	 * Devuelve el elemento con el identificador dado
	 * @return el elemento o null si el elemento no está en el árbol
	 */
	public V get(Object id) 
	{
		K buscado = (K)id;
		//TODO Completar según la documentación
	}

	/**
	 * Indica si el árbol está vacio
	 * @return true en caso que el árbol esté vaio o false en caso contrario
	 */
	public boolean isEmpty() 
	{
		//TODO Completar según la documentación
	}

	/**
	 * Agrega un nuevo elemento al árbol
	 * @param id el identificador del elemento
	 * @param elem el elemento que se desea agregar
	 * @return null
	 * @throws NullPointerException si el identificador o el elemento son nulos
	 * @throws IllegalArgumentException si el elemento ya existe en el árbol
	 */
	public V put(K id, V elem)  throws NullPointerException, IllegalArgumentException
	{
		//TODO Completar según la documentación
		
	}


	/**
	 * Agrega todos los elementos dados por parámetro en el árbol
	 * @param map mapa con los elementos que se desean agregar
	 */
	public void putAll(Map<? extends K, ? extends V> map) 
	{
		Iterator<? extends K> llaves = map.keySet().iterator();
		while(llaves.hasNext())
		{
			K llave = llaves.next();
			put(llave, map.get(llave));
		}
		
	}


	/**
	 * Elimina un elemento del árbol
	 * @param id el identificador del elemento a agregar
	 * @return el elemento elimminado
	 */
	public V remove(Object id) 
	{
		K buscado = (K)id;
		//TODO Completar según la documentación
		
		
	}

	/**
	 * Indica la cantidad de elementos en el árbol
	 * @return peso del árbol
	 */
	public int size() 
	{
		//TODO Completar según la documentación
		
	}

	
	public Comparator<? super K> comparator() 
	{
		//No se implementa
		return null;
	}

	/**
	 * Devuelve los nodos del árbol en forma de conjunto
	 * @return conjunto de ids
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
	 * Devuelve el menor id del árbol
	 * @return el menor id o null si el árbol está vacio
	 */
	public K firstKey() 
	{
		//TODO Completar según la documentación
	}


	/**
	 * Crea y devuelve un árbol con los elementos cuyo identificador es estrictamente menor al parámetro
	 * @param limite identificador debajo del cual se quiere que estén todos los identificadores del árbol
	 * @return un árbol con los elementos con identificador al límite o un árbol vacio si el árbol está vacio
	 */
	public SortedMap<K, V> headMap(K limite) 
	{
		SortedMap<K, V> arbol = new ArbolBO<K,V>();
		if(raiz != null )
		{
			raiz.headMap(limite, arbol);
		}
		return arbol;
	}

	/**
	 * Devuelve el conjunto de todos los identificadores del árbol
	 * @return conjunto de identificadores
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
	 * Devuelve el identificador más grande del árbol
	 * @return identificador más grande
	 */
	public K lastKey() 
	{
		//TODO Completar según la documentación
	}

	/**
	 * Devuelve un árbol con los elementos cuyos identificadores están en los límites
	 * @param limiteInf identificador inferior (se incluye)
	 * @param limiteSupo identificador superior (se excluye)
	 * @return un árbol con los elementos entre los límites o un árbol vacio si el árbol está vacio
	 */
	public SortedMap<K, V> subMap(K limiteInf, K limiteSup) 
	{
		ArbolBO<K, V> s = new ArbolBO<K,V>();
		if(raiz != null && !limiteInf.equals(limiteSup))
		{
			raiz.subMap(limiteInf, limiteSup, s);
		}
		return s;
	}


	/**
	 * Devuelve un árbol con los elementos cuyo identificador es mayor o igual al límite
	 * @param limite identificador usado como límite para construir el árbol
	 * @return un árbol con los elementos con identificador mayor o igual al límite o un árbol vacio si el árbol está vacio
	 */
	public SortedMap<K, V> tailMap(K limite) {
		SortedMap<K, V> arbol = new ArbolBO<K,V>();
		if(raiz != null )
		{
			raiz.tailMap(limite, arbol);
		}
		return arbol;
	}


	/**
	 * Devuelve una colección con los elementos del árbol inorder
	 * @return colección con los elementos del árbol o una colección vacia si no hay elementos
	 */
	public Collection<V> values() {
		//TODO Completar según la documentación
	}

	/**
	 * Devuelve el nodo raíz del árbol
	 * @return raiz
	 */
	public NodoABO<K, V> darRaiz() {
		return raiz;
	}

}
