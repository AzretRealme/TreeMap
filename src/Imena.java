import java.util.Comparator;

public class Imena  implements Comparator<Info> {

    @Override
    public int compare(Info e1, Info e2) {
        return e1.getName().compareTo(e2.getName());
    }

}
