import java.util.*;

public class Dijkstra {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int V=sc.nextInt();
        int[][] g=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                g[i][j]=sc.nextInt();
            }
        }

        int[] dist=new int[V];
        boolean isv[]=new boolean[V];
        int s=sc.nextInt();
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[s]=0;
        for(int c=0;c<V-1;c++){
            int u =-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<V;i++){
                if (!isv[i]&&dist[i]<min) {
                    min=dist[i];
                    u=i;
                }
            }
            isv[u]=true;
            for(int v=0;v<V;v++){
                if (!isv[v]&&g[u][v]!=0&&dist[u]+g[u][v]<dist[v]) {
                    dist[v]=g[u][v]+dist[u];
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.println("To"+i+" "+dist[i]);
        }

    }
}