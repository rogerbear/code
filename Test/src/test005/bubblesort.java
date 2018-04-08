package test005;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int j = 0;j<arr.length-1;j++) {
			for(int k=0;k<arr.length-1-j;k++) {
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
