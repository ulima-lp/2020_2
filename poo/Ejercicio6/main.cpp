#include <iostream>
#include "papanoel.h"

using namespace std;

int main()
{
    CartaPapaNoel* carta1 = new CartaPapaNoel("Pepito", 12);
    carta1->agregarRegalo("ps5");
    carta1->agregarRegalo("scooter");

    CartaPapaNoel* carta2 = new CartaPapaNoel("Diana", 10);
    carta2->agregarRegalo("ps5");

    CartaPapaNoel* carta3 = new CartaPapaNoel("Billy", 15);
    carta3->agregarRegalo("ps5");
    
    
    GestorCartas* gestor = new GestorCartas();
    gestor->agregarCarta(carta1);
    gestor->agregarCarta(carta2);
    gestor->agregarCarta(carta3);

    gestor->imprimir();
    //cout << gestor->obtener(2)->contenido << endl;
    cout << endl;
    //gestor->intercambiar(0, 1);
    gestor->ordenarPorEdad();
    gestor->imprimir();

    return 0;
}