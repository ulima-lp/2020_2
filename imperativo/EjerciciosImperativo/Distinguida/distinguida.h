#pragma once
#include <iostream>

namespace Distinguida {
	enum TipoPalabra
	{
		Palindroma, I_Palindroma, D_Palindroma, Ninguna
	};

	std::string obtenerPalabra();

	bool* analizarPalabra(std::string palabra);

	void imprimirResultados(bool* resp);
}

