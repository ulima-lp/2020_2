import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launcher {
    public static void main(String[] args) {
        String codigoFuente = "operaciones.ej2";
        try {
            CharStream cs = fromFileName(codigoFuente);
            Ejercicio2Lexer lexer = new Ejercicio2Lexer(cs);
            CommonTokenStream flujoTokens = new CommonTokenStream(lexer);
            Ejercicio2Parser parser = new Ejercicio2Parser(flujoTokens);
            Ejercicio2Parser.RootContext arbol = parser.root();

            CustomVisitor visitor = new CustomVisitor();
            visitor.visit(arbol);
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
