
public class MergeSort {
	static int[]array={9,8,7,6};
	
	
	
	public static void doMergSort(int lowerIndex,int higherIndex){
		if(lowerIndex < higherIndex){
		int middle=lowerIndex+(higherIndex-lowerIndex)/2;
		doMergSort(lowerIndex,middle);
		doMergSort(middle+1,higherIndex);		
		mergeParts(lowerIndex,middle,higherIndex);
		}
	}
	public static void mergeParts(int lowerIndex,int middle,int higherIndex){
		int[]tempMergeArray=new int[4];
		for(int i=lowerIndex;i<=higherIndex;i++){
			tempMergeArray[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex){
			if(tempMergeArray[i]<tempMergeArray[j]){
				array[k]=tempMergeArray[i];
				i++;
			}
				else{
				array[k]=tempMergeArray[j];
				j++;
				}
			k++;
			}
		while(i<=middle){
			array[k]=tempMergeArray[i];
			k++;
			i++;
		}
		}
	
	public static void main(String args[]){
		doMergSort(0,array.length-1);
		for(int i :array){
			System.out.println(i);
		}
	}

}
