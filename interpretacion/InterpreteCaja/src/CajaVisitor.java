// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/InterpreteCaja\Caja.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CajaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CajaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CajaParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(CajaParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link CajaParser#sentencia_apertura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_apertura(CajaParser.Sentencia_aperturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CajaParser#sentencia_operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_operacion(CajaParser.Sentencia_operacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CajaParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(CajaParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CajaParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(CajaParser.FinContext ctx);
}