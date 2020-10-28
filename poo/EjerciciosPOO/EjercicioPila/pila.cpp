#include "pila.h"

bool ArrayPila::buscar(int elemento)
{
	for (int i = 0; i < longitud; i++)
	{
		if (elemento == elementos[i]) 
		{
			return true;
		}
	}
	return false;
}

int ArrayPila::servir()
{
	// Encontramos el elemento a devolver
	int elementoADevolver = elementos[longitud - 1];

	// Creamos un nuevo arreglo (con longitud - 1)
	int* nuevoArreglo = new int[longitud - 1];
	// Copiamos los elementos del antiguo arreglo al nuevo
	for (int i = 0; i < longitud - 1; i++)
	{
		nuevoArreglo[i] = elementos[i];
	}

	// Actualizar el arreglo de elementos y la longitud
	delete[] elementos;
	elementos = nuevoArreglo;
	longitud--;

	return elementoADevolver;
}

void ArrayPila::apilar(int elemento)
{
	// [2 3 4 7 ] <- apilar(9)
	// [2 3 4 7 9] -> servir
	// [2 3 4 7]

	// Crear un nuevo arreglo (longitud + 1)
	int* nuevoArreglo = new int[longitud + 1];

	// Copiar los elementos del arreglo anterior (elementos)
	// al nuevoArreglo
	for (int i = 0; i < longitud; i++)
	{
		nuevoArreglo[i] = elementos[i];
	}

	// Copiamos el nuevo elemento
	nuevoArreglo[longitud] = elemento;

	// Actualizamos el puntero de elementos
	delete[] elementos; // eliminamos elementos de arreglo anterior
	elementos = nuevoArreglo;
	longitud++;
}

void ArrayPila::toString()
{
	cout << "[";
	for (int i = 0; i < longitud; i++)
	{
		cout << elementos[i] << " ";
	}
	cout << "]" << endl;
}

bool LEPila::buscar(int elemento)
{
	Elemento* pElem = elementos;

	while (pElem != nullptr)
	{
		if (pElem->elemento == elemento)
		{
			return true;
		}
		pElem = pElem->siguienteElemento;
	}

	return false;
}

int LEPila::servir()
{
	/*
	1. Obtener el valor a devolver.
	2. Sacamos el primer elemento de la lisa (y eliminamos)
	3. Actualizamos propiedades
	4. Devolvemos el valor del paso 1
	*/
	int valor = elementos->elemento;

	Elemento* pTemp = elementos;
	elementos = elementos->siguienteElemento;
	delete pTemp;

	longitud--;

	return valor;
}

void LEPila::apilar(int elemento)
{
	/*
	1. Crear el nuevo elemento y setearle valor
	2. Agregar el elemento a la primera posicion
	3. Actualizar propiedades
	*/
	Elemento* nuevoElemento = new Elemento();
	nuevoElemento->elemento = elemento;

	if (elementos == nullptr)
	{
		// No hay elementos en la pila
		elementos = nuevoElemento;
	}
	else
	{
		nuevoElemento->siguienteElemento = elementos;
		elementos = nuevoElemento;
	}

	longitud++;
}

void LEPila::toString()
{
	Elemento* pElem = elementos;

	cout << "[";
	while (pElem != nullptr)
	{
		cout << pElem->elemento << " ";
		pElem = pElem->siguienteElemento;
	}
	cout << "]" << endl;;
}
