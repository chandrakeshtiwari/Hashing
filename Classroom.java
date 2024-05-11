import java.util.ArrayList;
public class Classroom{
    static class Edge{

        int src;
        int dest;
        int wt;
        

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest =d;
            this.wt =w;
        }
    }


            public static void main (String args[]) {

                // 0---1
                   

            //     2       3

            //     4
            int v= 5;

            ArrayList<Edge>[]graph=new ArrayList[v];

            for(int i=0; i<v; i++) {
                graph[i] = new ArrayList<>();
            }
            //0 vertex
            graph [0].add(new Edge (0, 1, 5));
            //1 vertex
            graph[1].add(new Edge(1, 0, 5));
            graph[1].add(new Edge(1, 2, 5));
            graph[1].add(new Edge(1, 3, 3));
            // 2 vertex
            graph[1].add(new Edge(2, 1, 1));
            graph[1].add(new Edge(2, 3, 1));
            graph[1].add(new Edge(2, 4, 4));
            // 3 vertex
            graph[1].add(new Edge(3, 1, 3));
            graph[1].add(new Edge(3, 2, 1));
            // 4vertex
            graph[1].add(new Edge(4, 2, 2));
            //2's neighbours
            for( int i =0; i<graph[2].size(); i++){
                Edge e= graph[2].get(i);
                System.out.println(e.dest);
            }
        }


            @Override
            public String toString() {
                return "Classroom []";
            }


            @Override
            protected Object clone() throws CloneNotSupportedException {
                // TODO Auto-generated method stub
                return super.clone();
            }


            @Override
            public boolean equals(Object obj) {
                // TODO Auto-generated method stub
                return super.equals(obj);
            }


            @Override
            protected void finalize() throws Throwable {
                // TODO Auto-generated method stub
                super.finalize();
            }


            @Override
            public int hashCode() {
                // TODO Auto-generated method stub
                return super.hashCode();
            }
    }
