import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fereastra extends JFrame implements ActionListener {

    JPanel panouComponente;
    JPanel panouLista;
    JLabel labelNumePrenume;
    JLabel labelVarsta;
    Font fontulMeu = new Font("Arial", Font.BOLD, 20);
    TextField textNume;
    TextField textVarsta;
    JButton butonAdaugare;
    TextArea textAfisareConcurenti;

    ArrayList<String> listaConcurenti=new ArrayList<String>();


    public Fereastra() {
        setTitle("INSCRIERI CROS CERMEI-2024");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setLayout(new BorderLayout(10, 10));

        panouComponente = new JPanel();
        panouComponente.setBackground(Color.BLUE);
        panouComponente.setLayout(new GridLayout(15, 1));
        panouComponente.setPreferredSize(new Dimension(400,500));

        panouLista = new JPanel();
        panouLista.setBackground(Color.cyan);
        panouLista.setLayout(new GridLayout(1,1));

        labelNumePrenume = new JLabel("Nume / Prenume");
        labelNumePrenume.setFont(fontulMeu);
        panouComponente.add(labelNumePrenume);

        textNume = new TextField();
        textNume.setFont(fontulMeu);
        panouComponente.add(textNume);

        labelVarsta = new JLabel("Varsta");
        labelVarsta.setFont(fontulMeu);
        panouComponente.add(labelVarsta);

        textVarsta = new TextField();
        textVarsta.setFont(fontulMeu);
        panouComponente.add(textVarsta);

        add(panouComponente, BorderLayout.WEST);
        add(panouLista, BorderLayout.CENTER);

        butonAdaugare=new JButton("Adaugare Concurent");
        butonAdaugare.setFont(fontulMeu);
        panouComponente.add(new Label(""));
        panouComponente.add(butonAdaugare);

        textAfisareConcurenti=new TextArea();
        textAfisareConcurenti.setFont(fontulMeu);
        panouLista.add(textAfisareConcurenti);


        textAfisareConcurenti.append("Nume/Prenume--->Varsta"+"\n\n");

        butonAdaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            listaConcurenti.add(textNume.getText()+" "+textVarsta.getText());
            JOptionPane.showMessageDialog(null,textNume.getText()+",cu varsta de "+textVarsta.getText()+" ani,  a fost adaugat/a!");
            textAfisareConcurenti.append(textNume.getText()+"--->"+textVarsta.getText()+"\n");



            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
