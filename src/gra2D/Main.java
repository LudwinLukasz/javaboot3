package gra2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by arabk on 12.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Enemy e1 = new Enemy(1, 2, 3, 4, 5);
        Wall w1 = new Wall(2, 5, 6, 2, Colour.BLACK);
        Wall w2 = new Wall(2, 5, 6, 2, Colour.GREEN);
        Player p1 = new Player(2, 5, 1, 3, "ala");
        GameObject[][] game = {{e1, w2}, {p1, w1}};
      //  ArrayList<ArrayList<GameObject>> game2 = new ArrayList<ArrayList<GameObject>>();
       // game2.add([w1,e1]);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
             //   System.out.print("  " + game[i][j] + "  ");
                System.out.print(game[i][j].show());
            }
            System.out.println();
        }
        //System.out.println(game2);
    }


}
