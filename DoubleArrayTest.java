public class DoubleArrayTest{
	public static void main(String[] args){
		int[][] array = new int[][]{{1,2},{3,4,5},{7,8,9}};
		for(int i=0;i<array.length;i++){//遍历大数组中的小数组
			for(int j=0;j<array[i].length;j++){//遍历位置为i的小数组中的元素
				int value = array[i][j];
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int[] arr : array){
			for(int value:arr){
				System.out.print(value+"\t");
			}
			System.out.println();
		}
	}
}