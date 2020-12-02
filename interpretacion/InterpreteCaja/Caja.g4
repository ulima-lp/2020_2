grammar Caja;

@parser::members {
    int caja = 0;
}

// Seccion 1 : Gramatioca libre contexto (Analisis Sintactico)
root : sentencia_apertura sentencia*;
sentencia : sentencia_operacion | fin;
sentencia_apertura : L_NUMEROS SS_FIN_SENTENCIA
{
    caja = Integer.parseInt($L_NUMEROS.text);
};
sentencia_operacion : L_NUMEROS operacion (
    SS_FIN_SENTENCIA
    {
        if ($operacion.op.equals("+")){
            caja += Integer.parseInt($L_NUMEROS.text);
        } else {
            caja -= Integer.parseInt($L_NUMEROS.text);
        }
    }
    |
    EOF
    {
        if ($operacion.op.equals("+")){
            caja += Integer.parseInt($L_NUMEROS.text);
        } else {
            caja -= Integer.parseInt($L_NUMEROS.text);
        }
        System.out.println("Caja Total : " + caja);
    }
);
operacion returns [String op]:
SS_ABONO
{
    $op = "+";
}
|
SS_RESTA
{
    $op = "-";
};
fin : EOF {
    System.out.println("Caja Total : " + caja);
};


// Seccion 2 : Gramatica Regular (Analisis Lexico)
SS_ABONO : '+';
SS_RESTA : '-';
SS_FIN_SENTENCIA : '\n';

L_NUMEROS : '0' | [1-9][0-9]*;
IGNORED_CHARS : [ \t\r] -> skip;
