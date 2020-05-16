// Quick Find Algorithm

import java.util.*;

public class MyClass{
    static int [] id;
    public MyClass(int N){
        id = new int[N];
        for(int i=0;i<N;i++)
            id[i] = i;
    }
    static boolean connected(int p, int q){
        return id[p] == id[q];
    }
    static void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i=0;i<id.length;i++){
            if(id[i] == pid)
                id[i]= qid;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        MyClass myobj = new MyClass(N);
        union(4,3);
        union(3,8);
        union(6,5);
        union(9,4);
        union(2,1);
        boolean res = connected(0,7);
        System.out.println(res);
        res = connected(8,9);
        System.out.println(res);
        int numunion = in.nextInt();
        for(int i=0;i<numunion;i++){
            int a,b;
            a = in.nextInt();
            b = in.nextInt();
            union(a,b);
        }
        res = connected(0,7);
        System.out.println(res);
    }
}