
class FindingElementInArray {

    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 30, 50};
        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}

class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (key == ref[i]) {
                System.out.println("Element found at index at " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not found");
        }
    }
}
