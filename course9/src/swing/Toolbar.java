package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author cvoinea
 */
public class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton byeButton;

    private TypingListener typingListener;

    public Toolbar() {
        helloButton = new JButton("hello");
        helloButton.addActionListener(this);

        byeButton = new JButton("bye");
        byeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(byeButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == helloButton) {
            if (typingListener != null) {
                typingListener.textTyped("hello button clicked \n");
            }
        } else if (clicked == byeButton) {
            if (typingListener != null) {
                typingListener.textTyped("bye button clicked \n");
            }
        }
    }

    public TypingListener getTypingListener() {
        return typingListener;
    }

    public void setTypingListener(TypingListener typingListener) {
        this.typingListener = typingListener;
    }
}
