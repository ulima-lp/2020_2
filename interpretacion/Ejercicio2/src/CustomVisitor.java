import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CustomVisitor implements Ejercicio2Visitor{
    @Override
    public Object visitRoot(Ejercicio2Parser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia(Ejercicio2Parser.SentenciaContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_operacion(Ejercicio2Parser.Sentencia_operacionContext ctx) {
        return null;
    }

    @Override
    public Object visitAsignacion_inicial(Ejercicio2Parser.Asignacion_inicialContext ctx) {
        return null;
    }

    @Override
    public Object visitDefinicion(Ejercicio2Parser.DefinicionContext ctx) {
        return null;
    }

    @Override
    public Object visitOperacion(Ejercicio2Parser.OperacionContext ctx) {
        return null;
    }

    @Override
    public Object visitTipo_operacion(Ejercicio2Parser.Tipo_operacionContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_visualizacion(Ejercicio2Parser.Sentencia_visualizacionContext ctx) {
        return null;
    }

    @Override
    public Object visitFin(Ejercicio2Parser.FinContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
