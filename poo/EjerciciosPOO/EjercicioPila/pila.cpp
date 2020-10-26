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