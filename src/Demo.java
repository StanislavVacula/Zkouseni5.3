import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo extends JFrame{
    private JMenuBar jMenuBar = new JMenuBar();
    private JMenu jMenu = new JMenu("Akce");
    private JMenuItem jMenuItem = new JMenuItem("Načíst soubor");
    private JPanel panelMain;
    private JTextField textField1;
    private List<Zakaznik> data = new ArrayList<>();
    private JTable table1;

    public Demo(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelMain);
        setTitle("Demo");
        setSize(600, 400);
        initComponents();
        naplnData();
        table1 =new JTable(new ZakaznikTableModel(data)); //JTable kreslí tabulku, ale neví co do té tabulky dát
        add(new JScrollPane(table1)); //JScrollPane umožňuje posouvat tabulku

    }

    private void naplnData() {
        data.addAll(List.of(
                new Zakaznik("Pepa", LocalDate.of(2000, 1, 1)),
                new Zakaznik("Jirka", LocalDate.of(2000, 2, 2)),
                new Zakaznik("Karel", LocalDate.of(2000, 3, 3))
        )
        );
    }

    public void initComponents(){
        setJMenuBar(jMenuBar);
        jMenuBar.add(jMenu);
        jMenu.add(jMenuItem);

        jMenuItem.addActionListener(e -> nactiSoubor());
    }
    public void nactiSoubor(){
        JFileChooser jFileChooser = new JFileChooser(".");
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            textField1.setText(jFileChooser.getSelectedFile().getName());
        }
        else {
            JOptionPane.showMessageDialog(this, "Soubor nebyl načten");
        }

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setVisible(true);
    }
}
