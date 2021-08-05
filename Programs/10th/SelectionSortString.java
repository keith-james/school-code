public class SelectionSortString{
	public static void main(String args[]){
		String array[] = {"Ben", "Ajeet", "Frank", "Alan", "Zyan", "Brown"};
		int size = array.length;
		for(int i = 0; i < size - 1; i++){
			int min = i;
			for(int j = i + 1; j < size; j++){
				if(array[j].compareTo(array[min]) < 0){
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		for(int i = 0; i < size; i++){
			System.out.print(" " + array[i];
		}
	}
}
