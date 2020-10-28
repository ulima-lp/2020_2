#pragma once
#include <iostream>

using namespace std;

class Animal
{
public:
	string nombre;
	virtual void hacerSonido(); // metodo es sobreescribible
};

