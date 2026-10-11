package task11;
import java.util.*;
public class task11 {
    public boolean validpath(int n,int[][] edges,int source,int destination){
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add( new ArrayList<>());
        }
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(source);
        visited[source]=true;

        while(!stack.isEmpty()){
            int current=stack.pop();
            if(current==destination){
                return true;
            }
            for(int neighbor:adjList.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] edges = new int[m][2];

        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        task11 obj = new task11();
        boolean answer = obj.validpath(n, edges, source, destination);

        System.out.println(answer);

        sc.close();
    }
}
