void main(){
    int[] arr = {5, 2, 9, 1, 5, 6};
    System.out.println("Array original: " + Arrays.toString(arr));
    int temp=0;
    int index=0;

    for(int i =0; i < arr.length-1; i++){
        index=i;
        for(int j = i+1; j < arr.length; j++) {
            if (arr[index] > arr[j]) {
                index = j;
            }
        }
            temp =arr[index];
            arr[index]=arr[i];
            arr[i]=temp;


        System.out.println(arr[i]);
    }
    System.out.println("Array Ordenado: " + Arrays.toString(arr));

}










