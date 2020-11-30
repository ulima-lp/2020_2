// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/ULInterprete\UL.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ULParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ULVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ULParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ULParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(ULParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ULParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#sentencia_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_definicion(ULParser.Sentencia_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_asignacion(ULParser.Sentencia_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_visualizacion(ULParser.Sentencia_visualizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#valor_a_asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_a_asignar(ULParser.Valor_a_asignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ULParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(ULParser.Operacion_aritmeticaContext ctx);
}