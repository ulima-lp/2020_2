#include<iostream>

struct Celda
{
    int col;
    int valor = 0;
    Celda* siguienteCelda = nullptr;
};

struct Fila
{
    int numero;
    int cantCeldas = 0;
    Fila* siguienteFila = nullptr;
    Celda* primeraCelda = nullptr;
    Celda* ultimaCelda = nullptr;
};

struct Hoja
{
    Fila* primeraFila = nullptr;
    std::string nombre;
    int numFilas=0;
    int numColumnas=0;
};

void crearColumnas(Fila* fila, int num)
{
    Celda* pCelda = fila->ultimaCelda;
    int cont = fila->cantCeldas;
    for (int i=0; i< num; i++)
    {
        Celda* nuevaCelda = new Celda();
        nuevaCelda->col = ++cont;
        if (pCelda == nullptr)
        {
            fila->primeraCelda = nuevaCelda;
            pCelda = nuevaCelda;
        }else
        {
            pCelda->siguienteCelda = nuevaCelda;
            pCelda = pCelda->siguienteCelda;
        }
    }
    fila->ultimaCelda = pCelda;
    fila->cantCeldas += num;
}

void agregarFila(Hoja* hoja)
{
    Fila* pFila = hoja->primeraFila;
    Fila* nuevaFila = new Fila();

    if (pFila == nullptr)
    {
        nuevaFila->numero = 1;
        hoja->primeraFila = nuevaFila;
    }else
    {
        while(pFila->siguienteFila != nullptr)
        {
            pFila = pFila->siguienteFila;
        }
        
        nuevaFila->numero = pFila->numero + 1;
        pFila->siguienteFila = nuevaFila;
    }
    crearColumnas(nuevaFila, hoja->numColumnas);
    hoja->numFilas++;
}

void agregarColumna(Hoja* hoja)
{
    // [f:1] -> [f:2] -> [f:3] -> nullptr
    //   |        |        |
    // [c:1]    [c:1]    [c:1]
    // [c:2]    [c:2]    [c:2]
    // [c:3]
    Fila* pFila = hoja->primeraFila;
    while(pFila != nullptr)
    {
        Celda* nuevaCelda = new Celda();
        nuevaCelda->col = hoja->numColumnas + 1;

        Celda* pCelda = pFila->ultimaCelda;
        if (pCelda == nullptr)
        {
            // No hay celdas
            pFila->primeraCelda = nuevaCelda;
            pFila->ultimaCelda = nuevaCelda;
        }else
        {
            pCelda->siguienteCelda = nuevaCelda;
            pFila->ultimaCelda = nuevaCelda;
        }

        pFila->cantCeldas++;
        pFila = pFila->siguienteFila;
    }
    hoja->numColumnas++;

}

void imprimirHoja(Hoja* hoja)
{
    int numCols = hoja->numColumnas;
    int numFilas = hoja->numFilas;

    Fila* pFila = hoja->primeraFila;
    for (int i=0 ; i<numFilas; i++)
    {
        Celda* pCelda = pFila->primeraCelda;
        for (int j=0; j<numCols; j++)
        {
            std::cout << " " << pCelda->valor;
            pCelda = pCelda->siguienteCelda;
        }
        std::cout << std::endl;
        pFila = pFila->siguienteFila;
    }
}

bool setValorColumnaFila(Hoja* hoja, int numeroFila, int numeroCol, int valor)
{
    Fila* pFila = hoja->primeraFila;
    for (int i = 0; i<hoja->numFilas; i++)
    {
        if (pFila->numero == numeroFila)
        {
            // Comenzar a buscar en las celdas
            Celda* pCelda = pFila->primeraCelda;
            for (int j=0; j < hoja->numColumnas; j++)
            {
                if (pCelda->col == numeroCol)
                {
                    // Encontramos la celda (fil y col)!!
                    pCelda->valor = valor;
                    return true;
                }
                pCelda = pCelda->siguienteCelda;
            }
        }
        pFila = pFila->siguienteFila;
    }
    return false;
}

int main()
{
    Hoja* hoja = new Hoja();
    hoja->nombre = "Hoja Inicio";
    agregarFila(hoja);
    agregarFila(hoja);
    agregarColumna(hoja);
    agregarColumna(hoja);
    agregarColumna(hoja);
    agregarColumna(hoja);
    agregarColumna(hoja);

    imprimirHoja(hoja);
    std::cout << "-----" << std::endl;

    setValorColumnaFila(hoja, 2, 2, 10);

    imprimirHoja(hoja);

}