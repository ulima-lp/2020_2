import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launcher {
    public static void main(String[] args) {
        String codigoFuente = "ejemplo.ej1";
        try {
            CharStream cs = fromFileName(codigoFuente);
            CajaLexer lexer = new CajaLexer(cs);
            CommonTokenStream flujoTokens = new CommonTokenStream(lexer);
            CajaParser parser = new CajaParser(flujoTokens);
            CajaParser.RootContext arbol = parser.root();
            CustomCajaVisitor visitor = new CustomCajaVisitor();
            visitor.visit(arbol);
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
