
import java.awt.*;
import java.awt.event.*;

//aplikacija
public class Aplikacija {
    public static void main(String[] args) {
        Frame f=new Frame("Aplikacija");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Menu");
        MenuItem i=new MenuItem("Iziet");
        Button b=new Button("Poga");
        Button b1=new Button("Pieskaitit");
        Button b2=new Button("Atnemt");
        Button b3 = new Button("Izdzest");
        Button b4 = new Button("Peleks");
        Button b5 = new Button("Balts");
        Label l=new Label("Labdien!");
        final TextField tf=new TextField();
        Label l1=new Label("0");
        Label l2=new Label("Man patik: ");
        Label l3=new Label("Man patik: ");
        Label l4=new Label("Vertiba ir: ");
        Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 101);
        Checkbox cb1 = new Checkbox("Tigeri");
        Checkbox cb2 = new Checkbox("Aitas");

        f.add(cb1);
        f.add(cb2);
        tf.setBounds(25,90, 250,140);
        menu.add(i);
        i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
                }
        });

        b.setBounds(20,60,50,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Paldies, ka nospiedi pogu.");
            }
        });

        b3.setBounds(140,60,50,20);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
        });

        b4.setBounds(210,35,50,20);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setBackground(Color.darkGray);
                tf.setForeground(Color.white);
            }
        });

        b5.setBounds(210,60,50,20);
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setBackground(Color.white);
                tf.setForeground(Color.black);
            }
        });

        cb1.setBounds(340,130, 50,20);
        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l2.setText("Man patik: " + (e.getStateChange()==1?"Tigeri":""));
            }
        });

        cb2.setBounds(340,155, 50,20);
        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l3.setText("Man patik: " + (e.getStateChange()==1?"Aitas":""));
            }
        });

        b1.setBounds(300,60,60,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=l1.getText();
                int a=Integer.parseInt(s1);
                int c=0;
                if(e.getSource()==b1){
                    c=a+1;
                }
                String result=String.valueOf(c);
                l1.setText(result);
            }
        });

        b2.setBounds(360,60,60,20);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=l1.getText();
                int a=Integer.parseInt(s1);
                int c=0;
                if(e.getSource()==b2) {
                    c=a-1;
                }
                String result=String.valueOf(c);
                l1.setText(result);
            }
        });

        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l4.setText("Vertiba ir: " + s.getValue());
            }
        });

        s.setBounds(310, 280, 200, 30);

        l.setBounds(80,60,50,20);
        l1.setBounds(355,40,20,20);
        l2.setBounds(330,190,120,25);
        l3.setBounds(330,220,120,25);
        l4.setBounds(380, 250, 200, 25);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(640,360);
        f.setLayout(null);
        f.setVisible(true);
        f.add(tf);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(s);
        mb.add(menu);
        f.setMenuBar(mb);

    }
}