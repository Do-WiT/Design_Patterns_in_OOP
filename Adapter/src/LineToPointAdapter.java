import java.util.ArrayList;

public class LineToPointAdapter extends ArrayList<Point> {

    public LineToPointAdapter(Line line) {
       int dx = Math.abs(line.stop.x - line.start.x);
       int dy = Math.abs(line.stop.y - line.start.y);

       int sx = (line.start.x < line.stop.x) ? 1 : -1;
       int sy = (line.start.y < line.stop.y) ? 1 : -1;
       boolean isSwap = false;

       if (dy > dx){

           int temp = dx;
           dx = dy;
           dy = temp;
           isSwap = true;

       }

        int D = 2 * dy - dx;
        int x = line.start.x;
        int y = line.start.y;

        for (int i = 1; i <= dx; i++) {
            add(new Point(x, y));
            if (D >= 0) {
                if (isSwap) x += sx;
                else y += sy;
                D -= 2 * dx;
            }
            if (isSwap) y += sy;
            else x += sx;
            D += 2 * dy;
        }




    }
}
