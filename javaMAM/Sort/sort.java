package Sort;

public class sort {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int a[] = { 1, 5, 2, 4, 3 };
        b.sort(a);

        for (int i : a) {
            System.out.println(i);
        }
    }
}

interface Sortable {
    void sort(int arr[]);
}

class BubbleSort implements Sortable {

    @Override
    public void sort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        int i;
        
                }
            }
        }
    }

}

class SelectionSort implements Sortable {

    @Override
    public void sort(int arr[]) {

    }

}