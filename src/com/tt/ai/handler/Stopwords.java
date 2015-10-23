package com.tt.ai.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The stopwords class provide a method to compare whether the word is stopwords
 * Use the map and list to store the stopwords and can provide a faster search rather search all words
 * @author Tian
 */
public class Stopwords {

	private static List<String> stopwordsA = new ArrayList<String>(){{
		add("a");
		add("able");
		add("about");
		add("above");
		add("according");
		add("accordingly");
		add("across");
		add("actually");
		add("after");
		add("afterwards");
		add("again");
		add("against");
		add("all");
		add("allow");
		add("allows");
		add("almost");
		add("alone");
		add("along");
		add("already");
		add("also");
		add("although");
		add("always");
		add("am");
		add("among");
		add("amongst");
		add("an");
		add("and");
		add("another");
		add("any");
		add("anybody");
		add("anyhow");
		add("anyone");
		add("anything");
		add("anyway");
		add("anyways");
		add("anywhere");
		add("apart");
		add("appear");
		add("appreciate");
		add("appropriate");
		add("are");
		add("around");
		add("as");
		add("aside");
		add("ask");
		add("asking");
		add("associated");
		add("at");
		add("available");
		add("away");
		add("awfully");
	}};
	private static List<String> stopwordsB = new ArrayList<String>(){{
		add("b");
		add("be");
		add("became");
		add("because");
		add("become");
		add("becomes");
		add("becoming");
		add("been");
		add("before");
		add("beforehand");
		add("behind");
		add("being");
		add("believe");
		add("below");
		add("beside");
		add("besides");
		add("best");
		add("better");
		add("between");
		add("beyond");
		add("both");
		add("brief");
		add("but");
		add("by");
	}};
	private static List<String> stopwordsC = new ArrayList<String>(){{
		add("c");
		add("came");
		add("can");
		add("cannot");
		add("cant");
		add("cause");
		add("causes");
		add("certain");
		add("certainly");
		add("changes");
		add("clearly");
		add("co");
		add("com");
		add("come");
		add("comes");
		add("concerning");
		add("consequently");
		add("consider");
		add("considering");
		add("contain");
		add("containing");
		add("contains");
		add("corresponding");
		add("could");
		add("course");
		add("currently");
	}};
	private static List<String> stopwordsD = new ArrayList<String>(){{
		add("d");
		add("definitely");
		add("described");
		add("despite");
		add("did");
		add("different");
		add("do");
		add("does");
		add("doing");
		add("done");
		add("down");
		add("downwards");
		add("during");
	}};
	private static List<String> stopwordsE = new ArrayList<String>(){{
		add("e");
		add("each");
		add("edu");
		add("eg");
		add("eight");
		add("either");
		add("else");
		add("elsewhere");
		add("enough");
		add("entirely");
		add("especially");
		add("et");
		add("etc");
		add("even");
		add("ever");
		add("every");
		add("everybody");
		add("everyone");
		add("everything");
		add("everywhere");
		add("ex");
		add("exactly");
		add("example");
		add("except");
	}};
	private static List<String> stopwordsF = new ArrayList<String>(){{
		add("f");
		add("far");
		add("few");
		add("fifth");
		add("first");
		add("five");
		add("followed");
		add("following");
		add("follows");
		add("for");
		add("former");
		add("formerly");
		add("forth");
		add("four");
		add("from");
		add("further");
		add("furthermore");
	}};
	private static List<String> stopwordsG = new ArrayList<String>(){{
		add("g");
		add("get");
		add("gets");
		add("getting");
		add("given");
		add("gives");
		add("go");
		add("goes");
		add("going");
		add("gone");
		add("got");
		add("gotten");
		add("greetings");
	}};
	private static List<String> stopwordsH = new ArrayList<String>(){{
		add("h");
		add("had");
		add("happens");
		add("hardly");
		add("has");
		add("have");
		add("having");
		add("he");
		add("hello");
		add("help");
		add("hence");
		add("her");
		add("here");
		add("hereafter");
		add("hereby");
		add("herein");
		add("hereupon");
		add("hers");
		add("herself");
		add("hi");
		add("him");
		add("himself");
		add("his");
		add("hither");
		add("hopefully");
		add("how");
		add("howbeit");
		add("however");
	}};
	private static List<String> stopwordsI = new ArrayList<String>(){{
		add("i");
		add("ie");
		add("if");
		add("ignored");
		add("immediate");
		add("in");
		add("inasmuch");
		add("inc");
		add("indeed");
		add("indicate");
		add("indicated");
		add("indicates");
		add("inner");
		add("insofar");
		add("instead");
		add("into");
		add("inward");
		add("is");
		add("it");
		add("its");
		add("itself");
	}};
	private static List<String> stopwordsJ = new ArrayList<String>(){{
		add("j");
		add("just");
	}};
	private static List<String> stopwordsK = new ArrayList<String>(){{
		add("k");
		add("keep");
		add("keeps");
		add("kept");
		add("know");
		add("knows");
		add("known");
	}};
	private static List<String> stopwordsL = new ArrayList<String>(){{
		add("l");
		add("last");
		add("lately");
		add("later");
		add("latter");
		add("latterly");
		add("least");
		add("less");
		add("lest");
		add("let");
		add("like");
		add("liked");
		add("likely");
		add("little");
		add("ll"); //added to avoid words like you'll,I'll etc.
		add("look");
		add("looking");
		add("looks");
		add("ltd");
	}};
	private static List<String> stopwordsM = new ArrayList<String>(){{
		add("m");
		add("mainly");
		add("many");
		add("may");
		add("maybe");
		add("me");
		add("mean");
		add("meanwhile");
		add("merely");
		add("might");
		add("more");
		add("moreover");
		add("most");
		add("mostly");
		add("much");
		add("must");
		add("my");
		add("myself");
	}};
	private static List<String> stopwordsN = new ArrayList<String>(){{
		add("n");
		add("name");
		add("namely");
		add("nd");
		add("near");
		add("nearly");
		add("necessary");
		add("need");
		add("needs");
		add("neither");
		add("never");
		add("nevertheless");
		add("new");
		add("next");
		add("nine");
		add("no");
		add("nobody");
		add("non");
		add("none");
		add("noone");
		add("nor"); 
		add("normally");
		add("not"); 
		add("nothing");
		add("novel");
		add("now");
		add("nowhere");
	}};
	private static List<String> stopwordsO = new ArrayList<String>(){{
		add("o");
		add("obviously");
		add("of");
		add("off");
		add("often");
		add("oh");
		add("ok");
		add("okay");
		add("old");
		add("on");
		add("once");
		add("one");
		add("ones");
		add("only");
		add("onto");
		add("or");
		add("other");
		add("others");
		add("otherwise");
		add("ought");
		add("our");
		add("ours");
		add("ourselves");
		add("out");
		add("outside");
		add("over");
		add("overall");
		add("own");
	}};
	private static List<String> stopwordsP = new ArrayList<String>(){{
		add("p");
		add("particular");
		add("particularly");
		add("per");
		add("perhaps");
		add("placed");
		add("please");
		add("plus");
		add("possible");
		add("presumably");
		add("probably");
		add("provides");
	}};
	private static List<String> stopwordsQ = new ArrayList<String>(){{
		add("q");
		add("que");
		add("quite");
		add("qv");
	}};
	private static List<String> stopwordsR = new ArrayList<String>(){{
		add("r");
		add("rather");
		add("rd");
		add("re");
		add("really");
		add("reasonably");
		add("regarding");
		add("regardless");
		add("regards");
		add("relatively");
		add("respectively");
		add("right");
	}};
	private static List<String> stopwordsS = new ArrayList<String>(){{
		add("s");
		add("said");
		add("same");
		add("saw");
		add("say");
		add("saying");
		add("says");
		add("second");
		add("secondly");
		add("see");
		add("seeing");
		add("seem");
		add("seemed");
		add("seeming");
		add("seems");
		add("seen");
		add("self");
		add("selves");
		add("sensible");
		add("sent");
		add("serious");
		add("seriously");
		add("seven");
		add("several");
		add("shall");
		add("she");
		add("should");
		add("since");
		add("six");
		add("so");
		add("some");
		add("somebody");
		add("somehow");
		add("someone");
		add("something");
		add("sometime");
		add("sometimes");
		add("somewhat");
		add("somewhere");
		add("soon");
		add("sorry");
		add("specified");
		add("specify");
		add("specifying");
		add("still");
		add("sub");
		add("such");
		add("sup");
		add("sure");
	}};
	private static List<String> stopwordsT = new ArrayList<String>(){{
		add("t");
		add("take");
		add("taken");
		add("tell");
		add("tends");
		add("th");
		add("than");
		add("thank");
		add("thanks");
		add("thanx");
		add("that");
		add("thats");
		add("the");
		add("their");
		add("theirs");
		add("them");
		add("themselves");
		add("then");
		add("thence");
		add("there");
		add("thereafter");
		add("thereby");
		add("therefore");
		add("therein");
		add("theres");
		add("thereupon");
		add("these");
		add("they");
		add("think");
		add("third");
		add("this");
		add("thorough");
		add("thoroughly");
		add("those");
		add("though");
		add("three");
		add("through");
		add("throughout");
		add("thru");
		add("thus");
		add("to");
		add("together");
		add("too");
		add("took");
		add("toward");
		add("towards");
		add("tried");
		add("tries");
		add("truly");
		add("try");
		add("trying");
		add("twice");
		add("two");
	}};
	private static List<String> stopwordsU = new ArrayList<String>(){{
		add("u");
		add("un");
		add("under");
		add("unfortunately");
		add("unless");
		add("unlikely");
		add("until");
		add("unto");
		add("up");
		add("upon");
		add("us");
		add("use");
		add("used");
		add("useful");
		add("uses");
		add("using");
		add("usually");
		add("uucp");
	}};
	private static List<String> stopwordsV = new ArrayList<String>(){{
		add("v");
		add("value");
		add("various");
		add("ve"); //added to avoid words like I've,you've etc.
		add("very");
		add("via");
		add("viz");
		add("vs");
	}};
	private static List<String> stopwordsW = new ArrayList<String>(){{
		add("w");
		add("want");
		add("wants");
		add("was");
		add("way");
		add("we");
		add("welcome");
		add("well");
		add("went");
		add("were");
		add("what");
		add("whatever");
		add("when");
		add("whence");
		add("whenever");
		add("where");
		add("whereafter");
		add("whereas");
		add("whereby");
		add("wherein");
		add("whereupon");
		add("wherever");
		add("whether");
		add("which");
		add("while");
		add("whither");
		add("who");
		add("whoever");
		add("whole");
		add("whom");
		add("whose");
		add("why");
		add("will");
		add("willing");
		add("wish");
		add("with");
		add("within");
		add("without");
		add("wonder");
		add("would");
		add("would");
	}};
	private static List<String> stopwordsX = new ArrayList<String>(){{
		add("x");
	}};
	private static List<String> stopwordsY = new ArrayList<String>(){{
		add("y");
		add("yes");
		add("yet");
		add("you");
		add("your");
		add("yours");
		add("yourself");
		add("yourselves");
	}};
	private static List<String> stopwordsZ = new ArrayList<String>(){{
		add("z");
		add("zero");
	}};
	private static Map<String,List> spMap = new HashMap<String,List>(){{
		put("a", stopwordsA);
		put("b", stopwordsB);
		put("c", stopwordsC);
		put("d", stopwordsD);
		put("e", stopwordsE);
		put("f", stopwordsF);
		put("g", stopwordsG);
		put("h", stopwordsH);
		put("i", stopwordsI);
		put("j", stopwordsJ);
		put("k", stopwordsK);
		put("l", stopwordsL);
		put("m", stopwordsM);
		put("n", stopwordsN);
		put("o", stopwordsO);
		put("p", stopwordsP);
		put("q", stopwordsQ);
		put("r", stopwordsR);
		put("s", stopwordsS);
		put("t", stopwordsT);
		put("u", stopwordsU);
		put("v", stopwordsV);
		put("w", stopwordsW);
		put("x", stopwordsX);
		put("y", stopwordsY);
		put("z", stopwordsZ);
	}};

	/**
	 * Can compare the word if it is stopwords 
	 * @param word is the string want to compare
	 * @return if the word is stopwords return true, else return false
	 */
	public static boolean compare(String word){
		if(NumberHandler.isInteger(word)||NumberHandler.isDouble(word)){
			return false; // if the word is a number it is not stop words return false will not remove
		}else if(word.equals(null)||word.equals("")){
			return true; // if the word is null or "" it need to remove return true
		}
		String s = word.substring(0,1);
		char[] ch = s.toCharArray();
		if(!Character.isLetter(ch[0])){ // if the word is not letter return true and remove it
			return true;
		}
		try{
			List<String> temp = spMap.get(s);
			return temp.contains(word);
		}catch(Exception e){
			return true;
		}
		
	}
}
