package task33;
import java.util.*;
public class task33 {
    public boolean validpath(int n,int[][] edges,int sources,int destination){
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        boolean found=dfs(adjList,sources,destination,visited);
        return found;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adjList,int souce,int destination, boolean[] visited){
    visited[souce]=true;
    if(souce==destination){
        return  true;
    }
    for(int nei:adjList.get(souce)){
        if(!visited[nei]){
            boolean found=dfs(adjList,nei,destination,visited);
            if(found){
                return true;
            }
        }
    }
    return false;
    }

    public static void main(String[] args) {
        task33 obj = new task33();
        int n1 = 3;
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 0}};
        int source1 = 0, destination1 = 2;
        System.out.println("Path exists: " + obj.validpath(n1, edges1, source1, destination1));

}
}
