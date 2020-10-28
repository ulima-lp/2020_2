#include "pila.h"

int main()
{
	ArrayPila* pila1 = new ArrayPila();

	pila1->apilar(45);
	pila1->apilar(10);

	pila1->servir();

	pila1->toString();

	LEPila* pila2 = new LEPila();

	pila2->apilar(45);
	pila2->apilar(10);

	pila2->servir();
	pila2->toString();

	return 0;
}