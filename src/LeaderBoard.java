import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LeaderBoard {
    private ArrayList<User> userLog;
    public LeaderBoard(ArrayList<User> pLog){
        userLog = pLog;
    }
    protected void initUI() {
        final JFrame frame = new JFrame();
        frame.setTitle("Leader Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextArea chat = new JTextArea(10, 40);
        chat.setLineWrap(true);
        chat.setEditable(false);
        chat.setWrapStyleWord(false);
        final JScrollPane scrollPane = new JScrollPane(chat);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        Timer t = new Timer(200, new ActionListener() {

            private int i = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                final Rectangle visibleRect = chat.getVisibleRect();
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            chat.scrollRectToVisible(visibleRect);
                        }
                    });
                }
        });
        t.start();
    }
    }
    
