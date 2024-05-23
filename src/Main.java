import javax.swing.*;
import java.awt.*;


public class Main {
    static JFrame fereastra;
    static Font fontulMeu = new Font("Arial", Font.BOLD, 25);
    static JLabel etichetaNumePrenume, etichetaVarsta;
    static JPanel panouControale, panouAfisaj;
    static JTextField campNume, campVarsta;
    static JButton butonAdaugare;

    public static void main(String[] args) {
        fereastra = new JFrame("Inscriere cros copii - Cermei 2024");
        fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fereastra.setLocationRelativeTo(null);
        fereastra.setVisible(true);
        fereastra.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fereastra.setResizable(false);

        panouControale = new JPanel();
        panouControale.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        panouControale.setLayout(new GridLayout(20, 2));
        panouControale.setBackground(Color.gray);
        panouControale.setBounds(0, 0, fereastra.getWidth() / 4, fereastra.getHeight());

        panouAfisaj = new JPanel();
        panouAfisaj.setBackground(Color.green);
        panouAfisaj.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));


        fereastra.add(panouControale);
        fereastra.add(panouAfisaj);

        etichetaNumePrenume = new JLabel("Nume / Prenume");
        etichetaNumePrenume.setFont(fontulMeu);
        campNume = new JTextField();
        campNume.setFont(fontulMeu);

        etichetaVarsta = new JLabel("Varsta");
        etichetaVarsta.setFont(fontulMeu);
        campVarsta = new JTextField();
        campVarsta.setFont(fontulMeu);

        butonAdaugare=new JButton("Adaugare concurent");
        //butonAdaugare.setVisible(true);
        butonAdaugare.setFont(fontulMeu);


        panouControale.add(etichetaNumePrenume);
        panouControale.add(campNume);
        panouControale.add(etichetaVarsta);
        panouControale.add(campVarsta);
        panouControale.add(butonAdaugare);





    }
}