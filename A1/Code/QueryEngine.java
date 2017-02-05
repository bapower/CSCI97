package cscie97.asn1.knowledge.engine;

/**
 * The QueryEngine class supports the execution of Knowledge 
 * Graph queries. Queries are specified as Triples in N-Triple 
 * format with the special “?” identifier representing query 
 * or “wild card”. 
 *
 */
public class QueryEngine {
	/**
	 * Public method for executing a single query on the
	 * knowledge graph. Checks for non null and well formed
	 * query string. Throws QueryEngineException on error.
	 * @param query 
	 */
	public void executeQuery(String query) {
        // ...
    }
	
	/**
	 * Public method for executing a set of queries read from a
	 * file. Checks for valid filename. Delegates to executeQuery 
	 * for processing individual queries. Throws QueryEngineException 
	 * on error.
	 * @param fileName 
	 */
	public void executeQueryFile(String fileName) {
        // ...
    }
	
}
