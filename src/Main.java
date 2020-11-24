import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        CustomComparator customComparator = new CustomComparator();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(customComparator);
        treeMap.put(100,"Maddison");
        treeMap.put(300,"Karl");
        treeMap.put(250,"Jake");
        treeMap.put(230,"Mike");
        treeMap.put(240,"Anna");
        treeMap.put(210,"Karina");


        System.out.println("treeMap : " + treeMap + "\n");

        Comparator<?> comparator = treeMap.comparator();

        System.out.println("Comparator name : " +comparator.getClass().getName());

        System.out.println("-------------------");

    }
}
