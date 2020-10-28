#pragma once
#include <iostream>

using namespace std;

class Pila
{
public:
	virtual bool buscar(int elemento) = 0;
	virtual int servir() = 0;
	virtual void apilar(int elemento) = 0;
	virtual void toString() = 0;
};

class ArrayPila : public Pila
{
public:
	bool buscar(int elemento) override;
	int servir() override;
	void apilar(int elemento) override;
	void toString() override;

private:
	int* elementos = nullptr;
	int longitud = 0;
};

class Elemento
{
public:
	int elemento = 0;
	Elemento* siguienteElemento = nullptr;
};

// Ejercicio
class LEPila : public Pila
{
public:
	bool buscar(int elemento) override;
	int servir() override;
	void apilar(int elemento) override;
	void toString() override;

private:
	Elemento* elementos = nullptr;
	int longitud = 0;
};

