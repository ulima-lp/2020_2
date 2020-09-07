#include <iostream>

//lista
// |
//[A1] -> [A2] -> [A3] -> null

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

void print(ListaAlumnos* lista)
{
	Alumno* pAlumno = lista->primerAlumno;
	while (pAlumno != nullptr)
	{
		std::cout << "[" << pAlumno->codigo << " , " 
			<< pAlumno->nombre <<  "]" << std::endl;
		pAlumno = pAlumno->siguienteAlumno;
	}
}

Alumno* obtenerAlumnoPorPosicion(ListaAlumnos* lista, int pos)
{
	return nullptr;
}

void eliminarAlumnoPorPosicion(ListaAlumnos* lista, int pos)
{

}

bool existeAlumno(ListaAlumnos* lista, std::string codigo)
{
	return false;
}



int main()
{
	ListaAlumnos listaAlumnos = {0, nullptr};
	agregarAlumno(&listaAlumnos, "Diana", "20164545", 25);
	agregarAlumno(&listaAlumnos, "Pepe", "20123233", 30);
	print(&listaAlumnos);

	return 0;
}