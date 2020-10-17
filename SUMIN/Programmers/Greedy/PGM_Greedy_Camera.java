import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PGM_Greedy_Camera {
	public static void main(String[] args) {
		int[][] routes = {{-10,15},{-14,-5},{-18,-13},{-5,-3}};
		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < routes.length; i++) {
			list.add(new int[] {routes[i][0],routes[i][1]});
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1];
			}
		});
		
		int tmp=list.get(0)[1];
		int answer = 1;
		
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i)[0]<=tmp && list.get(i)[1]>=tmp)	continue;
			tmp = list.get(i)[1];
			++answer;
		}
		System.out.println(answer);
		
	}
}
