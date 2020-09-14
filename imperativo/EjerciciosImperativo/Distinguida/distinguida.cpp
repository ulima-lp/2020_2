#include "distinguida.h"

std::string Distinguida::obtenerPalabra() 
{
	std::string palabra;
	std::cout << "Ingrese palabra: ";
	std::cin >> palabra;
	return palabra;
}

bool esPalindroma(std::string palabra)
{
	// palabra[0] la primera letra
	// palabra[palabra.length()-1] la ultima letra
	// recoocer
	int i = 0;
	int j = palabra.length() - 1;
	bool palindroma = true;
	while (i<j)
	{
		if (palabra[i] != palabra[j])
		{
			return false;
		}
		i++;
		j--;
	}
	return palindroma;
}

bool* Distinguida::analizarPalabra(std::string palabra)
{
	
	bool* resp = new bool[4]; // asignacion dinamica de memoria
	// Analizar palindroma
	resp[TipoPalabra::Palindroma] = esPalindroma(palabra);
	// Analizar i-palindroma
	resp[TipoPalabra::I_Palindroma] = esPalindroma(palabra.substr(1, palabra.length() - 1));
	// Analizar d-palindroma
	resp[TipoPalabra::D_Palindroma] = esPalindroma(palabra.substr(0, palabra.length() - 1));
	// Analizar no es nada
	int suma = resp[TipoPalabra::Palindroma] 
		+ resp[TipoPalabra::I_Palindroma] 
		+ resp[TipoPalabra::D_Palindroma];
	if (suma == 0)
	{
		resp[TipoPalabra::Ninguna] = true;
	}
	else
	{
		resp[TipoPalabra::Ninguna] = false;
	}

	return resp;
}

void Distinguida::imprimirResultados(bool* resp) 
{
	if (resp[3] == true)
	{
		// no es nada
		std::cout << "La palabra NO ES distinguida" << std::endl;
	}
	else {
		std::cout << "La palabra ES distinguida porque es:" << std::endl;
		if (resp[0]) 
		{
			std::cout << "Palindroma" << std::endl;
		}
		if (resp[1])
		{
			std::cout << "I-Palindroma" << std::endl;
		}
		if (resp[2])
		{
			std::cout << "D-Palindroma" << std::endl;
		}
	}
}