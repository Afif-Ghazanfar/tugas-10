// FILE: PenentuNilaiMahasiswa.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PenentuNilaiMahasiswa extends JFrame {
    JTextField tfNama, tfTugas, tfUTS, tfUAS;
    JLabel lNama, lRata, lGrade, lHasil;

    public PenentuNilaiMahasiswa() {
        setTitle("Aplikasi Penentu Nilai Mahasiswa");
        setSize(500,400);
        setLayout(null);

        JLabel lblNama = new JLabel("Nama Lengkap");
        lblNama.setBounds(30,20,120,20);
        add(lblNama);

        tfNama = new JTextField();
        tfNama.setBounds(150,20,200,25);
        add(tfNama);

        JLabel lblTugas = new JLabel("Tugas Murni");
        lblTugas.setBounds(30,70,120,20);
        add(lblTugas);

        tfTugas = new JTextField();
        tfTugas.setBounds(150,70,80,25);
        add(tfTugas);

        JLabel lblUTS = new JLabel("Nilai UTS");
        lblUTS.setBounds(30,110,120,20);
        add(lblUTS);

        tfUTS = new JTextField();
        tfUTS.setBounds(150,110,80,25);
        add(tfUTS);

        JLabel lblUAS = new JLabel("Nilai UAS");
        lblUAS.setBounds(30,150,120,20);
        add(lblUAS);

        tfUAS = new JTextField();
        tfUAS.setBounds(150,150,80,25);
        add(tfUAS);

        JLabel h1 = new JLabel("Nama:"); h1.setBounds(280,70,100,20); add(h1);
        lNama = new JLabel("-"); lNama.setBounds(350,70,150,20); add(lNama);

        JLabel h2 = new JLabel("Nilai Rata-rata:"); h2.setBounds(260,110,150,20); add(h2);
        lRata = new JLabel("-"); lRata.setBounds(380,110,150,20); add(lRata);

        JLabel h3 = new JLabel("Grade:"); h3.setBounds(300,150,100,20); add(h3);
        lGrade = new JLabel("-"); lGrade.setBounds(350,150,150,20); add(lGrade);

        JLabel h4 = new JLabel("Hasil:"); h4.setBounds(300,190,100,20); add(h4);
        lHasil = new JLabel("-"); lHasil.setBounds(350,190,150,20); add(lHasil);

        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBounds(30,250,90,30);
        add(btnHitung);

        JButton btnClear = new JButton("Bersihkan");
        btnClear.setBounds(140,250,100,30);
        add(btnClear);

        btnHitung.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double tugas = Double.parseDouble(tfTugas.getText());
                    double uts = Double.parseDouble(tfUTS.getText());
                    double uas = Double.parseDouble(tfUAS.getText());

                    double rata = (tugas + uts + uas) / 3;
                    String grade;

                    if(rata >= 85) grade = "A";
                    else if(rata >= 75) grade = "B";
                    else if(rata >= 65) grade = "C";
                    else grade = "D";

                    String kelulusan = rata >= 65 ? "Lulus" : "Tidak Lulus";

                    lNama.setText(tfNama.getText());
                    lRata.setText(String.format("%.2f", rata));
                    lGrade.setText(grade);
                    lHasil.setText(kelulusan);

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Input nilai harus angka!");
                }
            }
        });

        btnClear.addActionListener(e ->{
            tfNama.setText("");
            tfTugas.setText("");
            tfUTS.setText("");
            tfUAS.setText("");
            lNama.setText("-");
            lRata.setText("-");
            lGrade.setText("-");
            lHasil.setText("-");
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PenentuNilaiMahasiswa();
    }
}
