package ee.ut.cs.aa.grading.lab_8;

import java.util.List;

import ee.ut.cs.aa.grading.graph.Cost;
import ee.ut.cs.aa.grading.graph.Graph;

/** 
 * Task: Implement the method below. Use minimum spanning tree of a graph to find 
 * approximate solution to the traveling salesman problem. 
 *
 * @param <V> Type for graph vertex.
 * @param <E> Type for graph edge.
 */

public interface ApproximateTravelingSalesman<V, E> {
	
	/**
	 * Finds approximate solution to the Traveling salesman problem using minimum spanning tree.
	 * 
	 * @param graph Complete graph.
	 * @param costFunction Edge cost function.
	 * @return List of cycle vertices. Every vertex of the graph appears exactly once.
	 * Returns null if graph is not complete and empty list if graph is empty. 
	 */
	List<V> findApproximateTSP(Graph<V, E> graph, Cost<E> costFunction);
}
