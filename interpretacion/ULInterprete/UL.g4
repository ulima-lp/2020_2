grammar UL;

// Seccion 1: Gramatica libre de contexto (analisis sintactico)
root : KW_PROGRAM I_VARIABLE_NAME SS_START_BRACE cuerpo SS_END_BRACE;
cuerpo : sentencia*;
sentencia : sentencia_definicion | sentencia_asignacion | sentencia_visualizacion;
sentencia_definicion : KW_VAR I_VARIABLE_NAME SS_END_STATEMENT;
sentencia_asignacion : I_VARIABLE_NAME SS_ASSIGNMENT_OPERATOR L_ENTEROS SS_END_STATEMENT;
sentencia_visualizacion : KW_PRINT I_VARIABLE_NAME SS_END_STATEMENT;

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