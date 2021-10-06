public class SpiralPrint {
	public static void spiralPrint(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		int i,rowStart=0,colStart=0,count=0;
		int numEle = rows*cols;
		while(count < numEle) {
			for(i=colStart;i<cols && count<numEle;i++) {
				System.out.print(arr[rowStart][i] + " ");
				count++;
			}
			rowStart++;
			for(i=rowStart;count<numEle && i<rows;i++) {
				System.out.print(arr[i][cols-1] + " ");
				count++;
			}
			cols--;
			for(i=cols-1;count<numEle && i>=colStart;i--) {
				System.out.print(arr[rows-1][i] + " ");
				count++;
			}
			rows--;
			for(i=rows-1;count<numEle && i>=rowStart;--i) {
				System.out.print(arr[i][colStart] + " ");
				count++;
			}
			colStart++;
		}
	}
}
