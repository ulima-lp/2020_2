#pragma once
#include <iostream>

using namespace std;

class ArrayPila
{
public:
	bool buscar(int elemento);
	int servir();
	void apilar(int elemento);
	void toString();

private:
	int* elementos = nullptr;
	int longitud = 0;
};

class Elemento
{
public:
	int elemento;
	Elemento* siguienteElemento;
};

// Ejercicio
class LEPila
{
public:
	bool buscar(int elemento);
	int servir();
	void apilar(int elemento);
	void toString();

private:
	Elemento* elementos = nullptr;
	int longitud = 0;
};

