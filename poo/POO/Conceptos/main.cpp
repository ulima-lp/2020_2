#pragma once
#include <iostream>
#include "Persona.h"
#include "Perro.h"

int main()
{
	Persona* diana = new Persona("Diana Rupaylla", true, "Java"); // por puntero
	Perro* pipo = new Perro();
	diana->mascota = pipo;
	diana->saludar(); // main -> Persona

	std::cout << "Cantidad de personas: " 
		<< Persona::cantidadPersonas << std::endl;

	return 0;
}

