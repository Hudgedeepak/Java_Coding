import java.util.HashMap;

public class appearOnce {
    public static void main(String[] args) {
        int  a[]= {1,1,2,2,3,3,4,50,50,65,4,65,5};//find ele which one appear once
		
		// first approach
		 HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                System.out.println(num);
            }
        }


		//second approach



		
    }
}
