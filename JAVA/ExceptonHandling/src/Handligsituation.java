import com.sun.source.tree.CatchTree;

import java.util.Scanner;

public class Handligsituation {
    public static void Arrayhandling(int a[]) {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
