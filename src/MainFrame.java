import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame{
    private JButton btn1=new JButton("exit");
    private JButton btn2=new JButton("+");
    private JButton btn3=new JButton("-");
    private int n;
    private JLabel lab=new JLabel("0");

    public MainFrame(){
        init();

    }
    private void init(){
        this.setBounds(350,400,500,500);
        this.setLayout(null);
        btn1.setBounds(100,100,150,50);
        btn2.setBounds(160,150,150,50);
        btn3.setBounds(160,250,150,50);
        lab.setBounds(220,200,150,50);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(lab);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText((Integer.toString(n)));
            }
        });btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                lab.setText((Integer.toString(n)));
            }
        });

    }
}
