package pers.linus.sort;

public class Stragety {
    public static final String SELECTION = "selection";

    public static final String INSERTION_LINKED = "insertionLinked";

    public static final String INSERTION_ARRAY = "insertionArray";

    public static final String MERGE = "merge";

    public static final String QUICK = "quick";

    public static final String RADIX = "radix";

    public static Sort getSort(String name) {
        if (name.equals(SELECTION)) {
            return new SelectionSort();
        }
        else if (name.equals(INSERTION_LINKED)) {
            return new InsertionSortLinked();
        }
        else if (name.equals(INSERTION_ARRAY)) {
            return new InsertionSortArray();
        }
        else if (name.equals(MERGE)) {
            return new MergeSort();
        }
        else if (name.equals(QUICK)) {
            return new QuickSort();
        }
        else if (name.equals(RADIX)){
            return new RadixSort();
        }
        return null;
    }
}
