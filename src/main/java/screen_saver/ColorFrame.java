package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Random random;

    @Autowired
    private Color color;

    @PostConstruct
    public void init() {
        System.out.println(color.getClass());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        setLocation(random.nextInt(1000), random.nextInt(800));
        getContentPane().setBackground(color);
        repaint();
    }


}
