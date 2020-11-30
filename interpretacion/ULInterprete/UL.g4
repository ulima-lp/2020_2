grammar UL;

@parser::header {
    import java.util.HashMap;
}

@parser::members {
    HashMap<String, Object> tablaSimbolos = new HashMap<>();
    int suma = 0;
}

// Seccion 1: Gramatica libre de contexto (analisis sintactico)
root : KW_PROGRAM I_VARIABLE_NAME SS_START_BRACE cuerpo SS_END_BRACE;
cuerpo : sentencia*;
sentencia : sentencia_definicion | sentencia_asignacion | sentencia_visualizacion;
sentencia_definicion : KW_VAR I_VARIABLE_NAME SS_END_STATEMENT
{
    tablaSimbolos.put($I_VARIABLE_NAME.text, null);
};
sentencia_asignacion : I_VARIABLE_NAME SS_ASSIGNMENT_OPERATOR valor_a_asignar SS_END_STATEMENT
{
    tablaSimbolos.put($I_VARIABLE_NAME.text, $valor_a_asignar.valor);
};
sentencia_visualizacion : KW_PRINT I_VARIABLE_NAME SS_END_STATEMENT
{
    System.out.println(tablaSimbolos.get($I_VARIABLE_NAME.text));
};
valor_a_asignar returns [Object valor] :
(
    L_ENTEROS
    {
        $valor = Integer.parseInt($L_ENTEROS.text);
    }
    |
    operacion_aritmetica
    {
        $valor = $operacion_aritmetica.valor;
    }
);
operacion_aritmetica returns [Object valor]:
L_ENTEROS
{
    suma = Integer.parseInt($L_ENTEROS.text);
}
SS_ARITHMETIC_OPERATOR
L_ENTEROS
{
    String operacion = $SS_ARITHMETIC_OPERATOR.text;
    if (operacion.equals("+")) {
        suma += Integer.parseInt($L_ENTEROS.text);
    }else if (operacion.equals("-")) {
        suma -= Integer.parseInt($L_ENTEROS.text);
    }
    $valor = suma;
};

// Seccion 2: Gramatica regular
// Forma: <IDENTIFICADOR_REGLA> : regla

// Reglas Palabras reservadas
KW_PROGRAM : 'programa';
KW_VAR : 'variable';
KW_PRINT : 'mostrar';

// Reglas Simbolos Especiales
SS_START_BRACE : '{';
SS_END_BRACE : '}';
SS_ASSIGNMENT_OPERATOR : '=';
SS_END_STATEMENT : ';';
SS_ARITHMETIC_OPERATOR : '+' | '-';

// Reglas Identificadores
// var1, num, numeroASumar, numero_a_sumar, x
// NO SE PUEDE: 1num, _jugar, numero-a-sumar
I_VARIABLE_NAME : [a-zA-Z][a-zA-Z0-9_]*;

// Reglas Literales
// 12, 2342423, 232, 0
// NO: 012, 12sesq
L_ENTEROS : '0' | [1-9][0-9]*;

// Caracteres a ser ignorados
IGNORED_CHARACTERS : [ \t\n\r]+ -> skip;