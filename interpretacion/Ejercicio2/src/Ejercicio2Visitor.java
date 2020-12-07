// Generated from H:/ULIMA/2020_2/LP/602/ejercicios_interpretes/Ejercicio2\Ejercicio2.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ejercicio2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ejercicio2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(Ejercicio2Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(Ejercicio2Parser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#sentencia_operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_operacion(Ejercicio2Parser.Sentencia_operacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#asignacion_inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_inicial(Ejercicio2Parser.Asignacion_inicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(Ejercicio2Parser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(Ejercicio2Parser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#tipo_operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_operacion(Ejercicio2Parser.Tipo_operacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_visualizacion(Ejercicio2Parser.Sentencia_visualizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio2Parser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(Ejercicio2Parser.FinContext ctx);
}