import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestT {
	public static void main(String[] args) throws Exception {
		TLexer t = new TLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream tokens = new CommonTokenStream(t);
//		tokens.fill();
//		for (Object tok : tokens.getTokens()) {
//			System.out.println(tok);
//		}
		TParser p = new TParser(tokens);
		p.setBuildParseTrees(true);
		TParser.sContext ret = p.s();
		System.out.println(ret.toStringTree(p));
	}
}
