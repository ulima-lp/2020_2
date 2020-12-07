// Generated from H:/ULIMA/2020_2/LP/602/ejercicios_interpretes/Ejercicio2\Ejercicio2.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ejercicio2Parser}.
 */
public interface Ejercicio2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(Ejercicio2Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(Ejercicio2Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(Ejercicio2Parser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(Ejercicio2Parser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#sentencia_operacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_operacion(Ejercicio2Parser.Sentencia_operacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#sentencia_operacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_operacion(Ejercicio2Parser.Sentencia_operacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#asignacion_inicial}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_inicial(Ejercicio2Parser.Asignacion_inicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#asignacion_inicial}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_inicial(Ejercicio2Parser.Asignacion_inicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(Ejercicio2Parser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(Ejercicio2Parser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(Ejercicio2Parser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(Ejercicio2Parser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#tipo_operacion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_operacion(Ejercicio2Parser.Tipo_operacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#tipo_operacion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_operacion(Ejercicio2Parser.Tipo_operacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_visualizacion(Ejercicio2Parser.Sentencia_visualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_visualizacion(Ejercicio2Parser.Sentencia_visualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejercicio2Parser#fin}.
	 * @param ctx the parse tree
	 */
	void enterFin(Ejercicio2Parser.FinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejercicio2Parser#fin}.
	 * @param ctx the parse tree
	 */
	void exitFin(Ejercicio2Parser.FinContext ctx);
}