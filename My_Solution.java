package misc;

import java.util.ArrayList;

public class main_misc {
    
	
	public static void main(String[] args) {
	
	
	System.out.println(longest_1s(1775));
	
	  

	 
	}
	public static int longest_1s (int x){
		
		String bits = Integer.toBinaryString(x);
		
		
		ArrayList<Integer> l = new ArrayList<>();
		int curr = 0;
		for(int i = 0;i < bits.length();i++){
			String bit = bits.substring(i, i+1);
			if(bit.equals("1")){
				curr++;
				if(i == bits.length()-1) {
					l.add(curr);
				}
				continue;
			}
			if(bit.equals("0")){
				l.add(curr);
				l.add(0);
				curr = 0;
				continue;
			}
		}
		
		int max = 0;
		
		for(int i = 0;i < l.size();i++){
			int n = l.get(i);
			if(n == 0){
				int k = 0;
				if(i == 0) {
					k += l.get(i+1);
				}
				if(i == l.size()-1) {
					k += l.get(i-1);
				}
				else {
					k += l.get(i-1);
					k += l.get(i+1);
				}
				if(max <= k) {
					max = k;
				}
			}
		}

		return max+1;
		
	}
	
		
	
	}
	
	
