grammar Ejercicio2;

@parser::header {
    import java.util.HashMap;
}

@parser::members {
    HashMap<String, Integer> tablaSimbolos = new HashMap<>();
    int total = 0;
}

// Seccion 1 : Gramatica libre de contexto (analisis sintactico y evaluadores)
root : sentencia+ fin;
sentencia : sentencia_operacion | sentencia_visualizacion;
sentencia_operacion: SS_INICIO_SENTENCIA definicion asignacion_inicial operacion* SS_FIN_SENTENCIA
{
    tablaSimbolos.put($definicion.var, total);
    total = 0;
};
asignacion_inicial : L_ENTEROS
{
    total = Integer.parseInt($L_ENTEROS.text);
};
definicion returns [String var] : I_VARIABLE
{
    tablaSimbolos.put($I_VARIABLE.text, 0);
    $var = $I_VARIABLE.text;
};
operacion : L_ENTEROS tipo_operacion
{
    switch($tipo_operacion.op) {
        case 0:
            total += Integer.parseInt($L_ENTEROS.text);
        break;
        case 1:
            total -= Integer.parseInt($L_ENTEROS.text);
        break;
        case 2:
            total *= Integer.parseInt($L_ENTEROS.text);
        break;
        case 3:
            total /= Integer.parseInt($L_ENTEROS.text);
        break;
    }
};
tipo_operacion returns [Integer op] :
    SS_OP_SUMAR{ $op = 0;}
    |
    SS_OP_RESTAR{ $op = 1;}
    |
    SS_OP_MULTIPLICAR{ $op = 2;}
    |
    SS_OP_DIVIDIR{ $op = 3;};
sentencia_visualizacion : SS_INICIO_SENTENCIA KW_PRINT I_VARIABLE SS_FIN_SENTENCIA
{
    Integer valor = tablaSimbolos.get($I_VARIABLE.text);
    System.out.println(valor);
};
fin : EOF;

// Seccion 2: Gramatica regular (analisis lexico)
SS_INICIO_SENTENCIA : '(';
SS_FIN_SENTENCIA : ')';
SS_OP_SUMAR : '+';
SS_OP_RESTAR : '-';
SS_OP_MULTIPLICAR : '*';
SS_OP_DIVIDIR : '/';
KW_PRINT : 'mostrar';

I_VARIABLE : [a-zA-Z_]+;
L_ENTEROS : '0' | [1-9][0-9]*;

IGNORED_CHARS : [ \t\r\n]+ -> skip;
