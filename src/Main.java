import javax.swing.*;
import java.awt.*;


public class Main {
    static JFrame fereastra;
    static Font fontulMeu=new Font("Arial",Font.BOLD,16);
    static JLabel etichetaNumePrenume;
    static JPanel panouControale,panouAfisaj;
    public static void main(String[] args) {
        fereastra=new JFrame("Cros copii - Cermei 2024");
        fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fereastra.setLocationRelativeTo(null);
        fereastra.setVisible(true);
        fereastra.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panouControale=new JPanel();
        panouControale.setBackground(Color.BLUE);
        panouControale.setBounds(0,0,fereastra.getWidth(),300);

        panouAfisaj=new JPanel();
        panouAfisaj.setBackground(Color.cyan);

        fereastra.add(panouControale);
        fereastra.add(panouAfisaj);

        etichetaNumePrenume=new JLabel("Nume / Prenume");
        etichetaNumePrenume.setFont(fontulMeu);
        etichetaNumePrenume.setBounds(0,0,20,1);
        panouControale.add(etichetaNumePrenume);





    }
}