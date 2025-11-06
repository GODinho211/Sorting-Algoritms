//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    int[] arr = {5, 2, 9, 1, 5, 6};

    System.out.println("Array original: " + Arrays.toString(arr));
    System.out.println(arr.length);
    //Bubble Sort
    for(int i =0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }

    }
    System.out.println("Array original: " + Arrays.toString(arr));
    System.out.println(arr.length);




}
