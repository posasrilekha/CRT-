public  void dfs(int start){
	Set<Integer>visited =new HashSet<>();
	dfsHelper(start,visited);
}
private void dfsHelper(int vertex,set<Integer>visited){
	visited.add(vertex);
	System.out.print(vertex+"");
	for(int neighbor:adjList.getOrDefault(vertex,new ArrayList<>())){
		if(!visited.contains(neighbor)){
			dfsHelper(neighbor,visited);
		}
	}
}
