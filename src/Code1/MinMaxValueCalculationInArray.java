package Code1;

public class MinMaxValueCalculationInArray {

	public static void main(String[] args) {
		
		int[] value = {12,1221,3121,333,3939,2201,22};
		int min = value[0];
		int max = value[0];
		int avg=0;
		
		
		
		for(int i=0;i<value.length;i++) {
			
			System.out.println(avg);
			
			
			
			if(value[i]<min) {
				min=value[i];
			}
			
			if(value[i]>max) {
				max=value[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);

		int result = min + max;
		System.out.println(result);
	}

}
