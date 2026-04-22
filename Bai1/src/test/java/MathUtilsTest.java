import com.mathutils.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testAdd(){
        MathUtils utils = new MathUtils();
        assertEquals(5, utils.add(2,3), "Phep cong phai cho ket qua la 5");
    }
}
