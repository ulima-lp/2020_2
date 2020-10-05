#include<iostream>

int obtenerDigitoSegunPosicion(int numero, int pos)
{
    // 23425 , 0 -> 5
    // 23425 / 10 -> 2342
    // (23425 % 10) % 10 -> 2
    int digito = -1;
    int num = numero;

    for (int i=0; i<=pos; i++)
    {
        digito = num % 10;
    }

    return digito;
}

int obtenerTamanoNumero(int numero)
{
    int cont = 1;
    int num = numero;
    while(true)
    {
        num = num / 10;
        if (num == 0) break;
        else cont++;
    }
}

int factorial(int num)
{
    int fact = 1;

    for (int i=1; i<=num; i++)
    {
        fact = fact * i;
    }

    return fact;
}

int lnc(int numLnc)
{
    // LNC 367 -> 3*3! + 6*2! + 7*1!

    // 1. Obtenemos el tamano
    int tam = obtenerTamanoNumero(numLnc);
    int total = 0;
    for (int i=0; i<tam; i++)
    {
        int num = obtenerDigitoSegunPosicion(numLnc, i) * factorial(i+1);
        total += num;
    }
    return total;
}

int main()
{
    int numero;

    std::cin >> numero;
    int numDec = lnc(numero);
    std::cout << "Numero en decimal: " << numDec << std::endl;
    return 0;
}