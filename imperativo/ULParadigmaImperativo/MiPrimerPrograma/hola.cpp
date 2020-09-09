#include <iostream>

//lista
// |
//[A1] -> [A2] -> null

struct Alumno
{
	std::string nombre;
	std::string codigo;
	int edad;
	Alumno* siguienteAlumno = nullptr;
};

struct ListaAlumnos
{
	int cantidad = 0;
	Alumno* primerAlumno = nullptr;
};

void agregarAlumno(ListaAlumnos* lista,std::string nombre, std::string codigo, int edad)
{
	Alumno* nuevoAlumno = new Alumno(); // asignacion dinamica
	nuevoAlumno->codigo = codigo;
	//(*nuevoAlumno).codigo = codigo;
	(*nuevoAlumno).nombre = nombre;
	(*nuevoAlumno).edad = edad;
	(*nuevoAlumno).siguienteAlumno = nullptr;

	if (lista->primerAlumno == nullptr)
	{
		// lista vacia
		lista->primerAlumno = nuevoAlumno;
	}
	else
	{
		// recorrer la lista
		Alumno* pAlumno = lista->primerAlumno;
		while (pAlumno->siguienteAlumno != nullptr)
		{
			pAlumno = pAlumno->siguienteAlumno;
		}
		pAlumno->siguienteAlumno = nuevoAlumno;
	}
	lista->cantidad++;
}

void printAlumno(Alumno* alumno)
{
	std::cout << "[" << alumno->codigo << " , "
		<< alumno->nombre << "]" << std::endl;
}

void print(ListaAlumnos* lista)
{
	Alumno* pAlumno = lista->primerAlumno;
	while (pAlumno != nullptr)
	{
		printAlumno(pAlumno);
		pAlumno = pAlumno->siguienteAlumno;
	}
}

Alumno* obtenerAlumnoPorPosicion(ListaAlumnos* lista, int pos)
{
	if (lista->cantidad == 0 || pos >= lista->cantidad )
	{
		return nullptr;
	}
	
	int cont = 0;
	Alumno* pAlumno = lista->primerAlumno;
	while (cont < pos)
	{
		pAlumno = pAlumno->siguienteAlumno;
		cont++;
	}
	return pAlumno;
}

void eliminarAlumnoPorPosicion(ListaAlumnos* lista, int pos)
{
	if ( lista->cantidad > 0 && pos < lista->cantidad )
	{
		int cont = 0;
		Alumno* pAnteriorAlumno = nullptr;
		Alumno* pAlumno = lista->primerAlumno;
		while (cont < pos)
		{
			pAnteriorAlumno = pAlumno;
			pAlumno = pAlumno->siguienteAlumno;
			cont++;
		}

		if (pAnteriorAlumno == nullptr)
		{
			// nos encontramos en el primer caso
			lista->primerAlumno = pAlumno->siguienteAlumno;
		}
		else
		{
			pAnteriorAlumno->siguienteAlumno = pAlumno->siguienteAlumno;
		}
		lista->cantidad--;
		delete pAlumno;

	}
}

bool existeAlumno(ListaAlumnos* lista, std::string codigo)
{
	if (lista->primerAlumno == nullptr)
	{
		return false;
	}

	Alumno* pAlumno = lista->primerAlumno;
	while (pAlumno != nullptr)
	{
		if (pAlumno->codigo == codigo)
		{
			return true;
		}
		pAlumno = pAlumno->siguienteAlumno;
	}
	return false;
}



int main()
{
	ListaAlumnos listaAlumnos = {0, nullptr};
	agregarAlumno(&listaAlumnos, "Diana", "20164545", 25);
	agregarAlumno(&listaAlumnos, "Pepe", "20123233", 30);
	print(&listaAlumnos);

	Alumno* alumno = obtenerAlumnoPorPosicion(&listaAlumnos, 5);
	printAlumno(alumno);
	//eliminarAlumnoPorPosicion(&listaAlumnos, 1);
	//print(&listaAlumnos);

	return 0;
}