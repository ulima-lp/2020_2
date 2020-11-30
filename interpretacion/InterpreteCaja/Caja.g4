grammar Caja;

// Seccion 1 : Gramatioca libre contexto (Analisis Sintactico)

// Seccion 2 : Gramatica Regular (Analisis Lexico)
SS_ABONO : '+';
SS_RESTA : '-';
SS_FIN_SENTENCIA : '\n';
SS_FIN_ARCHIVO : EOF;

L_NUMEROS : '0' | [1-9][0-9]*;
IGNORED_CHARS : [ \t\r] -> skip;
