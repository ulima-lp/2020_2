#pragma once
#include <iostream>
#include "Persona.h"
#include "Perro.h"
#include "Gato.h"

int main()
{
	Gato* gato = new Gato();
	Perro* perro = new Perro();

	Persona* diana = new Persona("Diana Rupaylla", true, "Java");
	diana->mascota = gato;

	diana->saludar();
	diana->generarSonidoMascota();

	diana->mascota = perro;
	diana->generarSonidoMascota();
	//gato->hacerSonido();

	//perro->hacerSonido();





	/*Persona* diana = new Persona("Diana Rupaylla", true, "Java"); // por puntero
	Perro* pipo = new Perro();
	diana->mascota = pipo;
	diana->saludar(); // main -> Persona

	std::cout << "Cantidad de personas: " 
		<< Persona::cantidadPersonas << std::endl; */

	return 0;
}

