Evelio Estuvo Aquí
void insertar(int valor, Nodo* nodo){//Talvez no funcione, arreglar
	if (nodo == NULL)
		return new Nodo(valor);
	else if (nodo -> dato < valor)
		nodo -> hijoDer = insertar (valor, nodo -> hijoDer);
	else if (nodo -> dato >= valor)
		nodo -> hijoIzq = insertar (valor, nodo -> hijoIzq);
	
}

Nodo* borrarElemento (int ele){
	//Buscar lo que debo borrar y ver si existe
	
	
	raiz = borrarElemento (ele, raiz);
	return raiz;
}
Nodo* borrarElemento (int ele, Nodo* arbol){
	if (arbol == NULL)
		return NULL;
	else if (ele < arbol -> dato)//Borrar hijo izquierdo
		arbol -> hijoIzq = borrarElemento (ele, arbol -> hijoIzq)
	else if (ele > arbol -> dato)
		arbol -> hijoDer = borrarElemento (ele, arbol -> hijoDer)
	else if (arbol -> hijoIzq == NULL && arbol -> hijoDer)
		arbol = NULL;
	else if (arbol -> hijoIzq == NULL)
		arbol = arbol -> hijoDer;
	else if (arbol -> hijoDer == NULL)
		arbol = arbol -> hijoIzq;
	else{//Tiene dos hijos
		Nodo* max = mayor (arbol -> hijoIzq);//mayor de
		arbol -> hijoIzq = borrarElemento (max -> dato)
	}
}
//Se sube el menor de los mayores
//O el mayor de los menores

















