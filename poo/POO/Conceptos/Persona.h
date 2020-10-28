#pragma once
#include <iostream>
#include "Perro.h"
#include "Animal.h"

class Persona
{
public:
	static int cantidadPersonas; // prop de clase
	static void aumentar(); // prop (metodo) de clase

	std::string nombre; // prop instancia
	bool programador; // prop instancia
	std::string lp; // prop instancia
	Animal* mascota; // prop instancia

	void saludar(); // prop instancia
	void generarSonidoMascota();
	//void setMascota(Perro* perro);

	Persona(); // metodo constructor
	Persona(std::string nom, bool prog, std::string lp); // metodo constructor
	~Persona(); // metodo destructor

};

