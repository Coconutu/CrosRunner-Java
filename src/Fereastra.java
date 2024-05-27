import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fereastra extends JFrame implements ActionListener {

    JPanel panouComponente;
    JPanel panouLista;
    JLabel labelNumePrenume;
    JLabel labelVarsta;
    Font fontulMeu = new Font("Arial", Font.BOLD, 20);
    TextField textNume;
    TextField textVarsta;
    JButton butonAdaugare,butonStergere;
    static TextArea textAfisareConcurenti;
    JButton butonSalvareInFisier;

    ArrayList<String> listaConcurenti = new ArrayList<String>();


    public static  void incarcaDateDinFisier() {
        textAfisareConcurenti.setText("Nume/Prenume--->Varsta" + "\n\n");
        textAfisareConcurenti.setText("___________________________________________");
        try {
        FileReader fileReader = new FileReader("concurenti.csv");
        BufferedReader bufferedReader = null;



            bufferedReader = new BufferedReader(fileReader);
            String inString;
            while ((inString = bufferedReader.readLine()) !=null) {
                textAfisareConcurenti.append(inString);
                textAfisareConcurenti.append("\n");
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public Fereastra() {
        setTitle("INSCRIERI CROS CERMEI-2024");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setExtendedState(MAXIMIZED_BOTH);

        setLayout(new BorderLayout(10, 10));

        panouComponente = new JPanel();
        panouComponente.setBackground(Color.BLUE);
        panouComponente.setLayout(new GridLayout(15, 1));
        panouComponente.setPreferredSize(new Dimension(400, 500));

        panouLista = new JPanel();
        panouLista.setBackground(Color.cyan);
        panouLista.setLayout(new GridLayout(1, 1));

        labelNumePrenume = new JLabel(" Nume / Prenume");
        labelNumePrenume.setFont(fontulMeu);
        panouComponente.add(labelNumePrenume);

        textNume = new TextField();
        textNume.setFont(fontulMeu);
        panouComponente.add(textNume);

        labelVarsta = new JLabel(" Varsta");
        labelVarsta.setFont(fontulMeu);
        panouComponente.add(labelVarsta);

        textVarsta = new TextField();
        textVarsta.setFont(fontulMeu);
        panouComponente.add(textVarsta);

        add(panouComponente, BorderLayout.WEST);
        add(panouLista, BorderLayout.CENTER);

        butonAdaugare = new JButton("Adaugare Concurent");
        butonAdaugare.setBackground(Color.GREEN);
        butonAdaugare.setFont(fontulMeu);
        panouComponente.add(new Label(""));
        panouComponente.add(butonAdaugare);

        butonStergere = new JButton("Stergere Concurent");
        butonStergere.setBackground(Color.RED);
        butonStergere.setFont(fontulMeu);
        panouComponente.add(new Label(""));
        panouComponente.add(butonStergere);





        butonSalvareInFisier = new JButton("Salvare *.csv");
        butonSalvareInFisier.setFont(fontulMeu);
        panouComponente.add(new Label(""));
        panouComponente.add(butonSalvareInFisier);

        textAfisareConcurenti = new TextArea();
        textAfisareConcurenti.setFont(fontulMeu);
        panouLista.add(textAfisareConcurenti);

        incarcaDateDinFisier();


        butonSalvareInFisier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter("concurenti.csv", true);

                    for (String concurent : listaConcurenti) {
                        fileWriter.append(concurent + "\n");
                    }
                    fileWriter.close();
                    JOptionPane.showMessageDialog(null, "Fisierul 'concurenti.csv' a fost actualizat cu succes!");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                incarcaDateDinFisier();

            }
        });

        butonAdaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((!textNume.getText().isBlank()) && (!textVarsta.getText().isBlank())) {
                    listaConcurenti.add(textNume.getText() + " " + textVarsta.getText());
                    JOptionPane.showMessageDialog(null, textNume.getText() + ",cu varsta de " + textVarsta.getText() + " ani,  a fost adaugat/a!");
                    textAfisareConcurenti.append(textNume.getText() + "--->" + textVarsta.getText() + "\n");
                } else {

                    JOptionPane.showMessageDialog(null, "Introduceti numele si varsta concurentului!");
                }
            }

        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
