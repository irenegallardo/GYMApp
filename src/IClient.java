import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Irene on 04/04/2015.
 */

public class IClient extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = -6871895784138259155L;
    private JPanel contentPane;
    private JButton btnClients;
    private JButton btnInstructors;
    private JButton btnActivities;
    private JButton btnEditions;
    private JButton btnEquipment;


    public IClient(){

        setResizable(false);
        setTitle("GymApp");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setBounds(450, 200, 701, 500);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnMenu = new JMenu("Menu");
        menuBar.add(mnMenu);

        JMenuItem mntmLogOut = new JMenuItem("Log out");
        mnMenu.add(mntmLogOut);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mnMenu.add(mntmExit);


        contentPane = new JPanel();
        //contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel MenuSup = new JPanel();
        contentPane.add(MenuSup, BorderLayout.NORTH);
        MenuSup.setLayout(new GridLayout(1, 5));
        MenuSup.setBorder(BorderFactory.createRaisedBevelBorder());
        MenuSup.setBackground(Color.blue);

        btnClients = new JButton("CLIENTS");
        MenuSup.add(btnClients);

        btnInstructors= new JButton("INSTRUCTORS");
        MenuSup.add(btnInstructors);

        btnActivities= new JButton("ACTIVITIES");
        MenuSup.add(btnActivities);

        btnEditions= new JButton("EDITIONS");
        MenuSup.add(btnEditions);

        btnEquipment= new JButton("EQUIPMENT");
        MenuSup.add(btnEquipment);

        JPanel centralPanel = new JPanel();
        contentPane.add(centralPanel, BorderLayout.CENTER);
        centralPanel.setBackground(Color.pink);
        JLabel back = new JLabel();
        ImageIcon iBack= new ImageIcon(getClass().getResource("/imagenes/forzudo.jpg"));
        back.setIcon(iBack);
        centralPanel.add(back);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IClient frame = new IClient();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}