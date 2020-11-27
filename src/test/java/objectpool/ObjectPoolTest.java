package objectpool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import objectpool.*;

public class ObjectPoolTest {
    @Test
    public void main() {
        PolarizedGlassPool pool = new PolarizedGlassPool();
        System.out.println(pool.toString());
        PolarizedGlass PolarizedGlass1 = pool.checkOut();
        String checkedOut = "Checked out ";

        System.out.println(checkedOut + PolarizedGlass1);
        System.out.println(pool.toString());
        PolarizedGlass PolarizedGlass2 = pool.checkOut();
        System.out.println(checkedOut + PolarizedGlass2);
        PolarizedGlass PolarizedGlass3 = pool.checkOut();
        System.out.println(checkedOut + PolarizedGlass3);
        System.out.println(pool.toString());
        System.out.printf("Checking in %s\n", PolarizedGlass1);
        pool.checkIn(PolarizedGlass1);
        System.out.printf("Checking in %s\n", PolarizedGlass2);
        pool.checkIn(PolarizedGlass2);
        System.out.println(pool.toString());
        PolarizedGlass PolarizedGlass4 = pool.checkOut();
        System.out.println(checkedOut + PolarizedGlass4);
        PolarizedGlass PolarizedGlass5 = pool.checkOut();
        System.out.println(checkedOut + PolarizedGlass5);
        System.out.println(pool.toString());
    }
}
