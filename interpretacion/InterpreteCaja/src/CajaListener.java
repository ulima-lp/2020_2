// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/InterpreteCaja\Caja.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CajaParser}.
 */
public interface CajaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CajaParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CajaParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CajaParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CajaParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CajaParser#sentencia_apertura}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_apertura(CajaParser.Sentencia_aperturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CajaParser#sentencia_apertura}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_apertura(CajaParser.Sentencia_aperturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CajaParser#sentencia_operacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_operacion(CajaParser.Sentencia_operacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CajaParser#sentencia_operacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_operacion(CajaParser.Sentencia_operacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CajaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(CajaParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CajaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(CajaParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CajaParser#fin}.
	 * @param ctx the parse tree
	 */
	void enterFin(CajaParser.FinContext ctx);
	/**
	 * Exit a parse tree produced by {@link CajaParser#fin}.
	 * @param ctx the parse tree
	 */
	void exitFin(CajaParser.FinContext ctx);
}