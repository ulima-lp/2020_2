// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/ULInterprete\UL.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ULParser}.
 */
public interface ULListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ULParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ULParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ULParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(ULParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(ULParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ULParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ULParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#sentencia_definicion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_definicion(ULParser.Sentencia_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#sentencia_definicion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_definicion(ULParser.Sentencia_definicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_asignacion(ULParser.Sentencia_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_asignacion(ULParser.Sentencia_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_visualizacion(ULParser.Sentencia_visualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_visualizacion(ULParser.Sentencia_visualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#valor_a_asignar}.
	 * @param ctx the parse tree
	 */
	void enterValor_a_asignar(ULParser.Valor_a_asignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#valor_a_asignar}.
	 * @param ctx the parse tree
	 */
	void exitValor_a_asignar(ULParser.Valor_a_asignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ULParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(ULParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ULParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(ULParser.Operacion_aritmeticaContext ctx);
}