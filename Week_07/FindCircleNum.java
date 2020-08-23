package Week_07;

public class FindCircleNum {
private int N;
public int findCircleNum(int[][] M) {		
    N=M[0].length;
    boolean []hasVisited=new boolean[N];
    int nums=0;
    for(int i=0;i<N;i++) {
        if(hasVisited[i]==false){
            hasVisited[i]=true;
            nums++;
            dfs(M,i,hasVisited);
        }
    }
    return nums;
}

private void dfs(int [][]M,int n,boolean[]hasVisited) {	
    for(int i=0;i<N;i++){
        if(M[i][n]==1&&hasVisited[i]==false){
            hasVisited[i]=true;
            dfs(M,i,hasVisited);
        }
    }
}

}

