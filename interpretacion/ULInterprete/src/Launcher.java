import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launcher {
    public static void main(String[] args) {
        String codigoFuente = "miprograma.ul";

        try{
            CharStream cs = fromFileName(codigoFuente);
            ULLexer lexer = new ULLexer(cs);
//            List<Token> listaTokens = (List<Token>)lexer.getAllTokens();
//            for (Token t : listaTokens) {
//                System.out.println(t.getText());
//            }
            CommonTokenStream flujoToken = new CommonTokenStream(lexer);

            ULParser parser = new ULParser(flujoToken);
            ParseTree arbolSintaxisConcreta = parser.root();

            ULCustomVisitor visitor = new ULCustomVisitor();
            visitor.visit(arbolSintaxisConcreta);


        }catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
