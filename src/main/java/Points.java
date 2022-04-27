import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Points {
    public static void main(String[] args) {
        ObjectContainer db = Db4o.openFile("test.yap");
        Pilot p = new Pilot("Umang",31);
       db.store(p);
        Pilot p2 = new Pilot(null,0);
        ObjectSet result = db.queryByExample(p2);
        System.out.println(result.size());
        while(result.hasNext()) {
            System.out.println(result.next());
        }


    }
}
