	import static org.junit.Assert.*;
	import org.junit.Before;
	import org.junit.Test;
public class nepomuk {

	cocafreak simple_example, simple_cycle, complex_cycle, complex_graph;
	@Before
	public void setUp(){
	simple_example = new cocafreak(
	new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}}
	);
	simple_cycle = new cocafreak(new String[][]{{"A", "A"}});
	complex_cycle = new cocafreak(new String[][]{{"A", "B"}, {"B", "A"}});
	complex_graph = new cocafreak(
	new String[][]{
	{"A", "C"}, {"C", "D"}, {"B", "C"},
	{"A", "E"}, {"B", "F"}, {"E", "G"},
	{"D", "G"}, {"F", "G"}, {"C", "E"},
	{"C", "F"}
	}
	);
	}

}