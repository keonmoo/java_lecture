package homework;

public class Lotto {
	public static void main(String[] args) {
		int []num = new int [6];
		int i = 0;
		int j = 0;
		
		for(i=0;i< num.length;i++) {
			num[i] = (int)(Math.random()*45) + 1;
			for(j = 0;j<i;j++) {
				if(num[i]==num[j]) {
					i--;
				}
			}
		}
		
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]+"-");
		}
		
		System.out.println("---------------------");
	
		for(int lotto:num) {
			System.out.println(lotto + ",");
		}
		
		
		
	}

}
