#include "Persona.h"

int Persona::cantidadPersonas = 0; // inicializacion de prop de clase

Persona::Persona()
{
	nombre = "";
	this->programador = false;
	lp = "";
	mascota = nullptr;
	Persona::aumentar();
}

Persona::Persona(std::string nom, bool prog, std::string lp)
{
	nombre = nom;
	programador = prog;
	this->lp = lp;
	mascota = nullptr;
	Persona::aumentar();
}

Persona::~Persona()
{
}

// Implementacion de metodo de clase
void Persona::aumentar()
{
	// No se puede acceder a propiedades de instancia
	int cantidad = cantidadPersonas;
	cantidadPersonas = cantidad + 1;
	cantidadPersonas++;
}

// Implementacion de metodo de instancia
void Persona::saludar()
{
	if (mascota != nullptr)
	{
		mascota->acariciar(); // Persona -> Perro
	}

}

void Persona::generarSonidoMascota()
{
	mascota->hacerSonido(); // enviando un mensaje a mascota:Animal que genere un sonido
}

// [mascota] -> [Animal] -> [Object] BINDING ESTATICO (tiempo de comp)
// [mascota] -> [Animal] -> [Object] BINDING DINAMICO (tiempo de ejec)
