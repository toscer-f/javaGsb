package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Secretaire extends JFrame
{

    private static final JFrame JFrame = null;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try {
                    Secretaire frame = new Secretaire();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Secretaire()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 150, 800, 300);
        setTitle("Partie Secretaire GSB Ressources Humaines");
        this.setContentPane(new ConsulterFiche(this));
        this.revalidate();
    }

}
