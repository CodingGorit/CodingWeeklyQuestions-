import java.util.*;
/**
 * @author gorit
 * @date 2019-3-12
 * @冒泡排序
 * */
public class BubbleSort {
	public static void main(String[] args)  {
		Scanner input=new Scanner(System.in);
		int n;//数组的大小
		n=input.nextInt();
		int[] arr=new int[n];//定义长度为n的数组
		for (int i = 0; i < arr.length; i++) {//依次往数组中填入元素
			arr[i]=input.nextInt();
		}
		BubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {//打印元素
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] BubbleSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}

