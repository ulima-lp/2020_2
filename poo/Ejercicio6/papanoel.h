#pragma once
#include <iostream>

using namespace std;

class CartaPapaNoel
{
public:
    string contenido;
    CartaPapaNoel* siguienteCarta;
    CartaPapaNoel();
    CartaPapaNoel(string nombre, int edad);
    void agregarRegalo(string regalo);
    int obtenerBytes();
    int getEdad();
};

class GestorCartas
{
public:
    CartaPapaNoel* primeraCarta;
    int numeroCartas;
    long byteUsados;

    GestorCartas();
    void agregarCarta(CartaPapaNoel* carta);
    void eliminarCarta(int pos);
    void ordenarPorEdad();
    CartaPapaNoel* obtener(int pos);
    void intercambiar(int pos1, int pos2);
    void imprimir();
};
