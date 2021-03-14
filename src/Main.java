import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){

        TreeMap<Info, String> treeMap = new TreeMap<Info, String>(new Imena());
        treeMap.put(new Info("Madison", 10000)," Madison");
        treeMap.put(new Info("Karl", 20000)," Karl");
        treeMap.put(new Info("Jake", 30000)," Jake");
        treeMap.put(new Info("Mike", 40000)," Mike");
        treeMap.put(new Info("Anna", 50000)," Anna");

        System.out.println("treeMap : " + treeMap + "\n");

        Comparator<?> comparator = treeMap.comparator();

        System.out.println("Comparator name : " +comparator.getClass().getName());

        System.out.println("--------ForEach-----------");

        Set<Info> ks = treeMap.keySet();
        for(Info key:ks){
            System.out.println(key + " ==> " + " getKey: " + treeMap.get(key));
        }

    }
}
