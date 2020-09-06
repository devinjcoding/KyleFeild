import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderBoardGUI implements AdjustmentListener {
    ArrayList<User> pLog;
    private JScrollBar scrollBar;
    private JTextComponent textComponent;
    private int previousExtent = -1;
    private JPanel mainPanel;

    public LeaderBoardGUI(JScrollPane scrollPane, ArrayList<User> userLog)
    {
        Collections.sort(userLog);
        pLog = userLog;
        Component view = scrollPane.getViewport().getView();

        if (! (view instanceof JTextComponent))
            throw new IllegalArgumentException("Scrollpane must contain a JTextComponent");

        textComponent = (JTextComponent)view;

        scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.addAdjustmentListener( this );
    }

    @Override
    public void adjustmentValueChanged(final AdjustmentEvent e)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                checkScrollBar(e);
            }
        });
    }

    private void checkScrollBar(AdjustmentEvent e)
    {
        //  The scroll bar model contains information needed to determine the
        //  caret update policy.

        JScrollBar scrollBar = (JScrollBar)e.getSource();
        BoundedRangeModel model = scrollBar.getModel();
        int value = model.getValue();
        int extent = model.getExtent();
        int maximum = model.getMaximum();
        DefaultCaret caret = (DefaultCaret)textComponent.getCaret();

        //  When the size of the viewport changes there is no need to change the
        //  caret update policy.

        if (previousExtent != extent)
        {
            //  When the height of a scrollpane is decreased the scrollbar is
            //  moved up from the bottom for some reason. Reposition the
            //  scrollbar at the bottom

            if (extent < previousExtent
                    &&  caret.getUpdatePolicy() == DefaultCaret.UPDATE_WHEN_ON_EDT)
            {
                scrollBar.setValue( maximum );
            }

            previousExtent = extent;
            return;
        }

        //  Text components will not scroll to the bottom of a scroll pane when
        //  a bottom inset is used. Therefore the location of the scrollbar,
        //  the height of the viewport, and the bottom inset value must be
        //  considered when determining if the scrollbar is at the bottom.

        int bottom = textComponent.getInsets().bottom;

        if (value + extent + bottom < maximum)
        {
            if (caret.getUpdatePolicy() != DefaultCaret.NEVER_UPDATE)
                caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        }
        else
        {
            if (caret.getUpdatePolicy() != DefaultCaret.UPDATE_WHEN_ON_EDT)
            {
                caret.setDot(textComponent.getDocument().getLength());
                caret.setUpdatePolicy(DefaultCaret.UPDATE_WHEN_ON_EDT);
            }
        }
    }

    private static void createAndShowUI(ArrayList<User> userLog){
        Collections.sort(userLog);
        //Component view = scrollPane.getViewport().getView();
        JPanel center = new JPanel( new GridLayout(1, 2) );
        final JTextArea textArea = new JTextArea();
        textArea.setText(String.valueOf(userLog));
        textArea.setEditable( false );
        center.add( createScrollPane( textArea ) );
        System.out.println(textArea.getInsets());

        final JTextPane textPane = new JTextPane();
        textPane.setText(String.valueOf(userLog));
        textPane.setEditable( false );
        center.add( createScrollPane( textPane )  );
        textPane.setMargin( new Insets(5, 3, 7, 3) );
        System.out.println(textPane.getInsets());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(center, BorderLayout.CENTER);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Timer timer = new Timer(2000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    for (int i = 0; i < userLog.size(); i++) {
                        textArea.append(String.valueOf(userLog.get(i)));
                        textPane.getDocument().insertString(textPane.getDocument().getLength(), String.valueOf(userLog.get(i)),null);
                    }

                }
                catch (BadLocationException e1) {}
            }
        });
        timer.start();
    }

    private static JComponent createScrollPane(JComponent component)
    {
        JScrollPane scrollPane = new JScrollPane(component);
        //new ScrollControl( scrollPane );

        return scrollPane;
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowUI();
            }
        });
    }
}