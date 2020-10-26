#include "pila.h"

int main()
{
	ArrayPila* pila = new ArrayPila();

	pila->apilar(45);
	pila->apilar(10);

	pila->servir();

	pila->toString();

	return 0;
}