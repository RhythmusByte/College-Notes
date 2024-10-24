import java.applet.*;
import java.awt.*;

/* 
    <applet code="Rectangle.class" width="300" height="200">
        <param name="x" value="100">
        <param name="y" value="100">
        <param name="w" value="100">
        <param name="h" value="100">
        <param name="r" value="0">
        <param name="g" value="255">
        <param name="b" value="0">
    </applet>
     */

public class Rectangle extends Applet {
    public void paint(Graphics g) {
        int x = Integer.parseInt(getParameter("x"));
        int y = Integer.parseInt(getParameter("y"));
        int w = Integer.parseInt(getParameter("w"));
        int h = Integer.parseInt(getParameter("h"));
        int rv = Integer.parseInt(getParameter("r"));
        int gv = Integer.parseInt(getParameter("g"));
        int bv = Integer.parseInt(getParameter("b"));
        g.setColor(new Color(rv, gv, bv));
        g.fillRect(x, y, w, h);
    }
}
