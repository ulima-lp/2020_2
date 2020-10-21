#pragma once
#include <iostream>
#include "Perro.h"

class Persona
{
public:
	static int cantidadPersonas; // prop de clase
	static void aumentar(); // prop (metodo) de clase

	std::string nombre; // prop instancia
	bool programador; // prop instancia
	std::string lp; // prop instancia
	Perro* mascota;

	void saludar(); // prop instancia
	//void setMascota(Perro* perro);

	Persona(); // metodo constructor
	Persona(std::string nom, bool prog, std::string lp); // metodo constructor
	~Persona(); // metodo destructor

};

