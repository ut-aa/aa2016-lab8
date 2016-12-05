package ee.ut.cs.aa.grading.lab_8;
import ee.ut.cs.aa.grading.graph.Cost;
import ee.ut.cs.aa.grading.graph.Graph;

/**
 * Task: Implement the algorithm for the problem described below. Use either Prim's algorithm 
 * or Kruskal's algorithm.
 *
 * @param <V> Type for graph vertex.
 * @param <E> Type for graph edge.
 */

public interface MinimumSpanningTreeAlgorithm<V, E> {
	
	/**
	 * Finds minimum weight spanning tree of a graph i.e. minimum weight tree that connects all the vertices
	 * of a graph.
	 * 
	 * @param graph Connected graph.
	 * @param costFunction Edge cost function.
	 * @return Minimum weight spanning tree. Returns null if graph is empty
	 * or not connected.
	 */
	Graph<V, E> findMinimumSpanningTree(Graph<V, E> graph, Cost<E> costFunction);

}
