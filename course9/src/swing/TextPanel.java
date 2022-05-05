package swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author cvoinea
 */
public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel() {
        this.textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
