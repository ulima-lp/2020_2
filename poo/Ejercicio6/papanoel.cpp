#include "papanoel.h"

CartaPapaNoel::CartaPapaNoel()
{
    contenido = "";
    siguienteCarta = nullptr;
}

CartaPapaNoel::CartaPapaNoel(string nombre, int edad)
{
    siguienteCarta = nullptr;
    contenido = contenido.append(nombre).append(",").append(to_string(edad));
}

void CartaPapaNoel::agregarRegalo(string regalo)
{
    if (contenido != "")
    {
        contenido = contenido.append(",").append(regalo);
    }
}

int CartaPapaNoel::obtenerBytes()
{
    return contenido.length();
}

int CartaPapaNoel::getEdad()
{
    int cantComas = 0;
    int edad = 0;
    for (int i=0; i < contenido.length(); i++)
    {
        if (cantComas == 1 &&contenido[i] != ',' )
        {
            int num = contenido[i] - '0';
            edad = edad*10 + num;
        }
        if (contenido[i] == ',')
        {
            cantComas++;
        }
        
    }
    return edad;
}

GestorCartas::GestorCartas()
{
    primeraCarta = nullptr;
    numeroCartas = 0;
    byteUsados = 0;
}

void GestorCartas::agregarCarta(CartaPapaNoel* carta)
{
    // Se va a ejecutar luego de verificar si hay espacio

    CartaPapaNoel* pCarta = primeraCarta;

    if (pCarta != nullptr)
    {
        while (pCarta->siguienteCarta != nullptr)
        {
            pCarta = pCarta->siguienteCarta;
        }
        pCarta->siguienteCarta = carta;
    }else
    {
        primeraCarta = carta;
    }
    numeroCartas++;
    byteUsados += carta->obtenerBytes();
}
void GestorCartas::eliminarCarta(int pos)
{
    int bytesABorrar = 0;
    if (pos < numeroCartas)
    {
        CartaPapaNoel* pCarta = primeraCarta;
        CartaPapaNoel* pCartaAnterior = nullptr;

        int cont = 0;
        while (pCarta->siguienteCarta != nullptr)
        {
            if (cont == pos)
            {
                // debemos eliminar
                if (pCartaAnterior == nullptr)
                {
                    // queremos eliminar el primer elemento
                    primeraCarta = pCarta->siguienteCarta;
                }else
                {
                    pCartaAnterior->siguienteCarta = pCarta->siguienteCarta;
                }
                bytesABorrar = pCarta->obtenerBytes();
                delete pCarta;
                numeroCartas--;
                byteUsados -= bytesABorrar;
                break;
            }
            pCartaAnterior = pCarta;
            pCarta = pCarta->siguienteCarta;
        }
        
    }

}
void GestorCartas::ordenarPorEdad()
{
    for (int i=1; i<numeroCartas; i++)
    {
        for (int j=0 ; j<numeroCartas - 1; j++)
        {
            if (obtener(j)->getEdad() > obtener(j+1)->getEdad())
            {
                intercambiar(j, j+1);
            }
        }
    }
                /*temp = lista[j];
                lista[j] = lista[j+1];
                lista[j+1] = temp;*/
 
}

CartaPapaNoel* GestorCartas::obtener(int pos)
{
    if (pos < numeroCartas)
    {
        CartaPapaNoel* pCarta = primeraCarta;
        int cont = 0;
        while (pCarta != nullptr)
        {
            if (cont == pos)
            {
                return pCarta;
            }
            cont++;
            pCarta = pCarta->siguienteCarta;
        }
    }
    return nullptr;
}
void GestorCartas::intercambiar(int pos1, int pos2)
{
    // Obtener una carta (y anterior) para pos1
    // Obtener unaa carta (y anterior) para pos2
    if (pos1 > 0)
    {
        CartaPapaNoel* cartaAnterior = obtener(pos1-1);
        CartaPapaNoel* carta1 = obtener(pos1);
        CartaPapaNoel* carta2 = obtener(pos2);

        CartaPapaNoel* temp = carta2->siguienteCarta;
        cartaAnterior->siguienteCarta = carta2;
        carta2->siguienteCarta = carta1;
        carta1->siguienteCarta = temp;
    }else
    {
        CartaPapaNoel* carta1 = obtener(pos1);
        CartaPapaNoel* carta2 = obtener(pos2);
        CartaPapaNoel* temp = carta2->siguienteCarta;
        primeraCarta = carta2;
        carta2->siguienteCarta = carta1;
        carta1->siguienteCarta = temp;
    }
    


    /*CartaPapaNoel* carta1 = nullptr;
    CartaPapaNoel* carta1Anterior = nullptr;
    CartaPapaNoel* carta2 = nullptr;
    CartaPapaNoel* carta2Anterior = nullptr;

    if (pos1 > 0)
    {
        carta1 = obtener(pos1);
        carta1Anterior = obtener(pos1-1);
    }else
    {
        carta1 = obtener(pos1);
    }

    if (pos2 > 0)
    {
        carta2 = obtener(pos2);
        carta2Anterior = obtener(pos2-1);
    }else
    {
        carta2 = obtener(pos2);
    }

    CartaPapaNoel* temp1 = carta1;
    CartaPapaNoel* temp2 = carta2;

    carta1->siguienteCarta = carta2->siguienteCarta;
    carta2->siguienteCarta = temp1->siguienteCarta;

    if (carta1Anterior != nullptr)
    {

        carta1Anterior->siguienteCarta = temp2;
    }else
    {
        primeraCarta = carta2;
    }

    if (carta2Anterior != nullptr)
    {
        carta2Anterior->siguienteCarta = temp1;
    }else
    {
        primeraCarta = carta1;
    }*/
    
    
    
}

void GestorCartas::imprimir()
{
    CartaPapaNoel* pCarta = primeraCarta;
    while (pCarta != nullptr)
    {
        cout << pCarta->contenido << endl;
        pCarta = pCarta->siguienteCarta;
    }
}