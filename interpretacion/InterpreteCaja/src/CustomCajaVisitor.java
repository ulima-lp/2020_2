import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CustomCajaVisitor  implements CajaVisitor{

    @Override
    public Object visitRoot(CajaParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_apertura(CajaParser.Sentencia_aperturaContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_operacion(CajaParser.Sentencia_operacionContext ctx) {
        return null;
    }

    @Override
    public Object visitOperacion(CajaParser.OperacionContext ctx) {
        return null;
    }

    @Override
    public Object visitFin(CajaParser.FinContext ctx) {
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
