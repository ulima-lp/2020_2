import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ULCustomVisitor implements ULVisitor{

    @Override
    public Object visitRoot(ULParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitCuerpo(ULParser.CuerpoContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia(ULParser.SentenciaContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_definicion(ULParser.Sentencia_definicionContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_asignacion(ULParser.Sentencia_asignacionContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_visualizacion(ULParser.Sentencia_visualizacionContext ctx) {
        return null;
    }

    @Override
    public Object visitValor_a_asignar(ULParser.Valor_a_asignarContext ctx) {
        return null;
    }

    @Override
    public Object visitOperacion_aritmetica(ULParser.Operacion_aritmeticaContext ctx) {
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
