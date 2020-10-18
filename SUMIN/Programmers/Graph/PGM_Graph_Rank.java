
public class PGM_Graph_Rank {

	public static void main(String[] args) {
		int n = 5;
		int[][] result = {{4,3},{4,2},{3,2},{1,2},{2,5}};
		int answer = new PGM_Graph_Rank().solution(n, result);
		System.out.println(answer);
	}
	
	public int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] graph = new boolean[n+1][n+1];
        
        for (int[] result : results) {
        	graph[result[0]][result[1]]=true;
		}
        
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				for (int j2 = 1; j2 <= n; j2++) {
					if(graph[j][i] && graph[i][j2])
						graph[j][j2]=true;
				}
			}
		}
        for (int i = 1; i <= n; i++) {
        	int count=0;
			for (int j = 1; j <= n; j++) {
				if(graph[i][j] || graph[j][i])
					++count;
			}
			if(count==n-1)	++answer;
		}
        
        return answer;
    }

}
