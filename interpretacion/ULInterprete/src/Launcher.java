import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launcher {
    public static void main(String[] args) {
        String codigoFuente = "miprograma.ul";

        try{
            CharStream cs = fromFileName(codigoFuente);
            ULLexer lexer = new ULLexer(cs);
            List<Token> listaTokens = (List<Token>)lexer.getAllTokens();
            for (Token t : listaTokens) {
                System.out.println(t.getText());
            }
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
