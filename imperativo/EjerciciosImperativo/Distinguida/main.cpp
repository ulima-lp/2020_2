#include <iostream>
#include "distinguida.h"

using namespace std;
using namespace Distinguida;

int main()
{
	/*
	1. obtener palabra por teclado
	2. analizar palabra -> nos vaa a devolver si es o no
	3. visualizar resultado
	*/
	string palabra = obtenerPalabra();
	bool* respuesta = analizarPalabra(palabra);
	imprimirResultados(respuesta);
	return 0;
}