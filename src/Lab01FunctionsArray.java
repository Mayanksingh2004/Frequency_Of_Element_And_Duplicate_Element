public class Lab01FunctionsArray {
    int[] arr;
    int[] temp;
    int visited = -1;

    public Lab01FunctionsArray(int[] arr) {
        this.arr = arr;
        temp = new int[arr.length];
    }

    public void duplicateElements() {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    temp[j] = visited;
                }
            }
            if (temp[i] != visited)
                temp[i] = count;
        }
        printElement();
    }

    private void printElement() {
        System.out.println("Occurrence of each element : ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != visited)
                System.out.println(arr[i] + "    --->    " + temp[i]);
        }
    }

    public void duplicateElementsPrint() {
        System.out.print("Duplicate Elements are : ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == visited) {
                System.out.print(arr[i] + "  " + "at index : " + i);
            }
        }
    }
}