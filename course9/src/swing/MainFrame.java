package swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author cvoinea
 */
public class MainFrame extends JFrame {

    private Toolbar toolbar;
    private TextPanel textPanel;

    public MainFrame() throws HeadlessException {
        super("Hello World");
        setLayout(new BorderLayout());
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);

        textPanel = new TextPanel();
        add(textPanel, BorderLayout.CENTER);

        toolbar.setTypingListener(text -> textPanel.appendText(text));

        setVisible(true);
    }
}
