// FILE: Kalkulator.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {
    JTextField display;
    double angka1 = 0, angka2 = 0;
    String operator = "";

    public Kalkulator(){
        setTitle("Aplikasi Kalkulator");
        setSize(350,450);
        setLayout(null);

        display = new JTextField();
        display.setBounds(30,20,270,40);
        add(display);

        String btnText[] = {"7","8","9","+","-","4","5","6","*","/","1","2","3","=","%","0",".","C","B","E"};
        JButton btn[] = new JButton[20];

        int x = 30, y = 80, j = 0;
        for(int i=0; i<20; i++){
            btn[i] = new JButton(btnText[i]);
            btn[i].setBounds(x, y, 50, 40);
            add(btn[i]);

            x+=60;
            j++;
            if(j==5){
                j=0;
                x=30;
                y+=50;
            }
        }

        for(JButton b : btn){
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String t = b.getText();

                    if(t.matches("[0-9.]")){
                        display.setText(display.getText() + t);
                    }
                    else if(t.matches("[+\\-*/%]")){
                        angka1 = Double.parseDouble(display.getText());
                        operator = t;
                        display.setText("");
                    }
                    else if(t.equals("=")){
                        angka2 = Double.parseDouble(display.getText());
                        double hasil = 0;

                        switch(operator){
                            case "+": hasil = angka1 + angka2; break;
                            case "-": hasil = angka1 - angka2; break;
                            case "*": hasil = angka1 * angka2; break;
                            case "/": hasil = angka1 / angka2; break;
                            case "%": hasil = angka1 % angka2; break;
                        }
                        display.setText(String.valueOf(hasil));
                    }
                    else if(t.equals("C")){
                        display.setText("");
                    }
                    else if(t.equals("B")){
                        String s = display.getText();
                        if(s.length()>0)
                            display.setText(s.substring(0, s.length()-1));
                    }
                    else if(t.equals("E")){
                        System.exit(0);
                    }
                }
            });
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]){ new Kalkulator(); }
}
