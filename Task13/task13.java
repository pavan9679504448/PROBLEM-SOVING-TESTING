package Task13;
import java.util.*;
public class task13 {
    public static void main(String[] args){
        List<List<Integer>>rooms=new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2 ));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList(4));
        rooms.add(Arrays.asList());
        int n=rooms.size();
        boolean[] visited = new boolean[n];
        ArrayDeque<Integer> pending = new ArrayDeque<>();
        pending.push(0);
        visited[0] = true;

        while(!pending.isEmpty()){
            int room = pending.pop();
            for(int key : rooms.get(room)){
                if(!visited[key]){
                    visited[key] = true;
                    pending.push(key);
                }
            }
        }
        boolean allVisited=true;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                allVisited=false;
                break;
            }
        }
        System.out.println(allVisited);
    }
}
