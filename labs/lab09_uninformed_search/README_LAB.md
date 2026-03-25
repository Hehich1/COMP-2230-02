# Uninformed Search Algorithms Lab

## Overview
In this lab, you will implement and test three fundamental uninformed search algorithms: Breadth First Search (BFS), Depth First Search (DFS), and Uniform Cost Search (UCS). These algorithms are used to navigate through state spaces to find paths between nodes.

## Lab Structure

The lab is organized into three Java files:

### 1. **UninformedSearches.java** - Graph Infrastructure (Reference)
- **Purpose**: Provides the graph structure and helper methods
- **Contains**:
  - Graph initialization with 20 Romanian cities
  - Inner class `Node` - represents a city
  - Inner class `Edge` - represents connections between cities
  - Inner class `NodeComparator` - for priority queue sorting
  - Helper methods: `findAdjNodes()`, `findAdjEdges()`, `getCost()`
- **Your Role**: Study this file to understand the data structure, but do NOT modify it

### 2. **SearchAlgorithms.java** - Algorithm Implementation (Student Work)
- **Purpose**: Implement the three search algorithms
- **Contains** (with TODO sections):
  - `bfs()` - TODO Exercise 1: Implement Breadth First Search
  - `dfs()` - TODO Exercise 2: Implement Depth First Search
  - `ucs()` - TODO Exercise 3: Implement Uniform Cost Search
- **Your Role**: Complete the three TODO methods by implementing the algorithms

### 3. **SearchLab.java** - Testing Framework (Student Work)
- **Purpose**: Test and compare the algorithms
- **Contains** (with TODO sections):
  - `runBFSTest()` - TODO Exercise 4: Test BFS
  - `runDFSTest()` - TODO Exercise 5: Test DFS
  - `runUCSTest()` - TODO Exercise 6: Test UCS
  - `runComparativeAnalysis()` - TODO Exercise 7: Compare algorithms
  - `runInteractiveMode()` - TODO Exercise 8: Interactive testing
- **Your Role**: Complete the test methods and analyze results

---

## Tasks

### Task 1: Understand the Graph Structure
**Read and understand**: `UninformedSearches.java`
- Study how cities are represented as nodes
- Understand the adjacency matrix `map[][]` that stores edge costs
- Review helper methods for finding adjacent nodes and edges

### Task 2: Implement BFS Algorithm
**File**: `SearchAlgorithms.java` - Method `bfs()`

**Algorithm Overview**:
- Uses a **Queue** (FIFO - First In First Out)
- Explores nodes level-by-level (breadth-first)
- Finds the shortest path in terms of number of hops
- May not find the lowest-cost path

**Pseudocode**:
```
1. Create Queue and add source node
2. Create list to track visited nodes
3. While queue is not empty:
   a. Dequeue a node
   b. Add to visited list
   c. If this is destination, return visited
   d. Find all adjacent nodes
   e. For each unvisited neighbor not in queue:
      - Add to queue
4. Update statistics and return visited list
```

**Requirements**:
- Track `numOfNodesGenerated` (total nodes visited)
- Track `maxNumOfNodesInMemory` (max frontier size)
- Avoid revisiting nodes (check visited list and frontier)

---

### Task 3: Implement DFS Algorithm
**File**: `SearchAlgorithms.java` - Method `dfs()`

**Algorithm Overview**:
- Uses a **Stack** (LIFO - Last In First Out)
- Explores as deep as possible before backtracking
- May find a different path than BFS
- Uses more memory for very deep paths

**Pseudocode**:
```
1. Create Stack and push source node
2. Create list to track visited nodes
3. While stack is not empty:
   a. Pop a node
   b. Add to visited list
   c. If this is destination, return visited
   d. Find all adjacent nodes
   e. For each unvisited neighbor not in stack:
      - Push to stack
4. Update statistics and return visited list
```

**Requirements**:
- Same tracking as BFS
- Use Stack instead of Queue
- All other logic similar to BFS

---

### Task 4: Implement UCS Algorithm
**File**: `SearchAlgorithms.java` - Method `ucs()`

**Algorithm Overview**:
- Uses a **PriorityQueue** (sorted by cumulative cost)
- Always explores the lowest-cost node first
- Guaranteed to find the minimum-cost path
- Most computationally expensive

**Pseudocode**:
```
1. Create PriorityQueue and add source node (cost = 0)
2. Create list to track visited nodes
3. While priority queue is not empty:
   a. Remove lowest-cost node
   b. Add to visited list
   c. If this is destination, return visited
   d. Find all adjacent nodes
   e. For each unvisited neighbor not in queue:
      - Calculate new cost = current_cost + edge_cost
      - Update node cost
      - Add to priority queue
4. Update statistics and return visited list
```

**Requirements**:
- Use `UninformedSearches.NodeComparator` for PriorityQueue
- Track cumulative costs from source
- Update cost when a cheaper path is found

---

### Task 5: Implement Test Methods
**File**: `SearchLab.java`

Implement the following test methods:

1. **`runBFSTest()`** - Run BFS and display results
2. **`runDFSTest()`** - Run DFS and display results
3. **`runUCSTest()`** - Run UCS and display results
4. **`runComparativeAnalysis()`** - Compare all three algorithms on multiple routes

**Expected Output Format**:
```
BFS Results:
  Nodes Generated: 8
  Max Nodes in Memory: 5
  Path: 0 -> 2 -> 9 -> 12
```

---

### Task 6: Analysis Questions
After implementing all algorithms, answer these questions:

1. **Which algorithm finds the shortest path in terms of number of hops?**
   - Answer: ___________

2. **Which algorithm finds the lowest-cost path?**
   - Answer: ___________

3. **Which algorithm uses the least memory?**
   - Answer: ___________

4. **When would you use each algorithm?**
   - BFS: ___________
   - DFS: ___________
   - UCS: ___________

5. **What are the time and space complexities?**
   - BFS: O(___) time, O(___) space
   - DFS: O(___) time, O(___) space
   - UCS: O(___) time, O(___) space

---

## Test Cases to Try

### Test Case 1: Oradea (0) to Bucharest (12)
```
Expected Results:
- BFS: Shortest path in hops
- DFS: May take longer path
- UCS: Lowest cost path
```

### Test Case 2: Arad (2) to Bucharest (12)
### Test Case 3: Sibiu (9) to Bucharest (12)

---

## City Reference
| City | Index | City | Index |
|------|-------|------|-------|
| Oradea | 0 | Bucharest | 12 |
| Zerind | 1 | Giurgiu | 13 |
| Arad | 2 | Urziceni | 14 |
| Timisora | 3 | Vaslui | 15 |
| Lugoj | 4 | Iasi | 16 |
| Mehadia | 5 | Neamt | 17 |
| Drobeta | 6 | Hirsova | 18 |
| Craiova | 7 | Eforie | 19 |
| Rimnicu Vilcea | 8 | | |
| Sibiu | 9 | | |
| Fagaras | 10 | | |
| Pitesti | 11 | | |

---

## Submission Checklist

- [ ] BFS algorithm implemented
- [ ] DFS algorithm implemented
- [ ] UCS algorithm implemented
- [ ] All test methods implemented
- [ ] Test cases run successfully
- [ ] Analysis questions answered
- [ ] Code is commented and readable
- [ ] Statistics are tracked correctly

---

## Tips & Hints

1. **Use HashSet for visited check**: Checking `visited.contains(node)` on ArrayList is O(n). Consider using HashSet for O(1) lookup.

2. **Initialize costs correctly**: For UCS, make sure child nodes get properly updated costs.

3. **Debug output**: Print intermediate steps to understand what's happening:
   ```java
   System.out.println("Visiting: " + node.getCity());
   System.out.println("Adjacent: " + adjNodes);
   System.out.println("Frontier size: " + frontier.size());
   ```

4. **Test incrementally**: Implement BFS first, then DFS (very similar), then UCS.

5. **Check edge cases**: What happens if source == destination? What if no path exists?

---

## References

- **Breadth-First Search**: Explores nodes in layers, guaranteed shortest path in unweighted graphs
- **Depth-First Search**: Explores as deep as possible before backtracking, uses less memory for wide graphs
- **Uniform Cost Search**: Always expands lowest-cost node, guaranteed optimal path in weighted graphs

---

## Questions or Issues?

If you encounter any issues:
1. Check the graph structure in `UninformedSearches.java`
2. Review the provided TODO comments
3. Print debug output to trace algorithm execution
4. Compare your implementation with the algorithm pseudocode
