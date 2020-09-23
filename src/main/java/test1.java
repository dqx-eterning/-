import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.security.Key;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        float a = 1.0f  - 0.9f;
        float b = 0.9f - 0.8f;
        boolean reult1= (a == b);

        Float x = Float.valueOf(a);
        Float y = Float.valueOf(b);

        boolean result2 = (x.equals(y));
        System.out.println(reult1 + ","+result2);

    }
}
