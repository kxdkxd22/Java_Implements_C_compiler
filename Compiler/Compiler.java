public class Compiler {
    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        //lexer.runlexer();
        //BasicParser bp = new BasicParser(lexer);
        //bp.statements();
        //ImprovedParser im = new ImprovedParser(lexer);
        //im.statements();
        Parser p = new Parser(lexer);
        p.statements();

    }
}
