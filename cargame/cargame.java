import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.Random;
class a extends JFrame
{
    int x=350,y=500,speed=15,cx=400,cy=650;
    int tr1y=430,tr2y=210,tr3y=0,tr4y=430,tr5y=210,tr6y=0,y1=0;
    int next;
    int tcoin=0;
    int ter=0;
    int x4;
    int count=0;
    ImageIcon acc;
    ImageIcon coin;
    JLabel coll;
    JLabel l10;
    JLabel collect;
    JLabel spd;
    JLabel go;
    ImageIcon game;
    JPanel p;
    JButton b1;
    ImageIcon car;
    ImageIcon cr;
    JLabel cr2;
    JLabel l1;
    ImageIcon tr;
    JLabel tr1;
    JLabel tr2;
    JLabel tr3;
    JLabel tr4;
    JLabel tr5;
    JLabel tr6;
    a()
    {
        setTitle("Develop by Nilesh Khemani");
        setVisible(true);
        setSize(2000,1600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
       getContentPane().setBackground(new Color(48,25,52));
       JLabel tc = new JLabel("Speed");
       tc.setBounds(1300, 200, 130, 40);  
       tc.setFont(new Font("Arrial",Font.BOLD,40));
       tc.setForeground(Color.RED); 
       add(tc); 
       spd = new JLabel("0");  
        spd.setFont(new Font("Arial", Font.BOLD, 40));  
        spd.setForeground(Color.RED);
        spd.setBounds(1300, 250, 80, 40);
        spd.setBackground(new Color(0, 0, 0));
        spd.setOpaque(true);
        JLabel cc= new JLabel("Coin");
        cc.setBounds(1300,310,130,40);
        cc.setFont(new Font("Arrial",Font.BOLD,40));
        cc.setForeground(Color.YELLOW);
        add(cc);
        add(spd);
        collect = new JLabel("0");  
        collect.setFont(new Font("Arial", Font.BOLD, 40));  
        collect.setForeground(Color.RED);
        collect.setBounds(1300, 360, 80, 40);
        collect.setBackground(new Color(0, 0, 0));
        collect.setOpaque(true);
        add(collect);

    }
    void pan()
    {
         p = new JPanel();
        p.setBounds(300, 100, 950, 660);
        p.setBackground(Color.gray);
         car= new ImageIcon("car.png");
         l1 = new JLabel(car);
         cr = new ImageIcon("car2.png");
     cr2 = new JLabel(cr);
        l1.setFont(new Font("Arial", Font.PLAIN, 50));
        l1.setBounds(x,y,130,130);
        coin=new ImageIcon("coin.png");
        coll= new JLabel(coin);
        coll.setFont(new Font("Arrial",Font.PLAIN,50));
        coll.setBounds(cx, cy, 130, 130);
        p.setLayout(null);
        p.add(l1);
        add(p);
        p.repaint();
        p.revalidate();
        ic();
        p.setFocusable(true);
        p.requestFocusInWindow(); 
        
        p.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int keycode=e.getKeyCode();
                switch(keycode)
                {
                    case KeyEvent.VK_LEFT:
                                        if(x>140)
                                        {
                                        x-=70;
                                        l1.setBounds(x,y,130,130);
                                        }
                                        break;
                    case KeyEvent.VK_UP:
                                            speed=5;
                                            ter=5;
                                            break;
                    case KeyEvent.VK_RIGHT:
                                        if(x<690)
                                        {
                                            x+=70;
                                            l1.setBounds(x,y,130,130);
                                        }
                                        break;
                                        case KeyEvent.VK_DOWN:
                                        speed=15;
                                        ter=2;
                                        break;
                }
            }
        });
    }
    void ic()
    {
         tr = new ImageIcon("tree.png");
         tr1= new JLabel(tr);
        tr1.setBounds(20, tr1y, 130, 230);
        tr = new ImageIcon("tree.png");
        tr2= new JLabel(tr);
       tr2.setBounds(20, tr2y, 130, 230);
       tr = new ImageIcon("tree.png");
       tr3= new JLabel(tr);
      tr3.setBounds(20, tr3y, 130, 230);
      tr = new ImageIcon("tree.png");
       tr4= new JLabel(tr);
      tr4.setBounds(800, tr4y, 130, 230);
      tr = new ImageIcon("tree.png");
       tr5= new JLabel(tr);
      tr5.setBounds(800, tr5y, 130, 230);
      tr = new ImageIcon("tree.png");
       tr6= new JLabel(tr);
      tr6.setBounds(800, tr6y, 130, 230);
      p.add(coll);
      p.repaint();
      p.revalidate();
        p.add(tr1);
        p.add(tr2);
        p.add(tr3);
        p.add(tr4);
        p.add(tr5);
        p.add(tr6);
    }
    void run()
    {
        while(true)
        {
         try{
            Thread.sleep(speed); 
            fast();  
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        System.out.println(e);
    }
}
}
void fast()
{
                                         tr1y += 10;
                                        tr2y += 10;
                                        tr3y += 10;
                                        tr4y += 10;
                                        tr5y += 10;
                                        tr6y += 10;
                                        y1+=10;
                                        cy+=10;
                                            if (tr1y > 630) {
                                                    tr1y = 0;
                                                    if(ter==5)
                                                    {
                                                        highspeed();
                                                    }
                                                    else if(ter==2)
                                                    {
                                                        slowspeed();
                                                    }
                                                    else{
                                                        speed();
                                                    }
                                                            }
                                                     if (tr2y > 630) {
                                                             tr2y = 0;
                                                                 }
    if (tr3y > 630) {
        tr3y = 0;
    }
    if (tr4y > 630) {
        tr4y = 0;
    }
    if (tr5y > 630) {
        tr5y = 0;
    }
    if (tr6y > 630) {
        tr6y = 0;
    }
     if(y1 > 630 || y1==0)
    {
        y1=0;
        cy=0;
        x4=second();
        cx=cr();
    }
    tr1.setBounds(20, tr1y, 130, 230);  
    tr2.setBounds(20, tr2y, 130, 230);
    tr3.setBounds(20, tr3y, 130, 230);

    tr4.setBounds(800, tr4y, 130, 230);  
    tr5.setBounds(800, tr5y, 130, 230);
    tr6.setBounds(800, tr6y, 130, 230);
    cr2.setBounds(x4, y1, 130, 230);
    coll.setBounds(cx, cy, 130, 130);
    if(Math.abs(y - y1) < 60 && Math.abs(x - x4) < 60) {
        accident();
    }
    if(Math.abs(y - cy) < 60 && Math.abs(x - cx) < 60) {
        tcoin++;
        collect.setText(String.valueOf(tcoin)); 
        revalidate();
        repaint();
        cx = cr();  
        cy = 0;  
    }
}
int second()
{
    Random r1 = new Random();
    int  x=r1.nextInt(680);
    while(x<140)
    {
        x=r1.nextInt(680);
    }
    p.add(cr2);
    next=x;
    return x;
}
int cr()
{
    Random r1 = new Random();
    int  x=r1.nextInt(680);
    while (x < 140 || Math.abs(x - next) < 130 || Math.abs(x - this.x) < 130) {
        x = r1.nextInt(680);  
    }
    return x;
}
void accident()
{
        try{
            acc = new ImageIcon("blast.png");
            l10= new JLabel(acc);
            l10.setBounds(x, 400, 290, 260);
            p.add(l10); 
            p.repaint();
            p.remove(l1);
            p.remove(coll);
            p.remove(cr2);
            Thread.sleep(3000);
            p.remove(l10);
            p.remove(tr1);
            p.remove(tr2);
            p.remove(tr3);
            p.remove(tr4);
            p.remove(tr5);
            p.remove(tr6);
            game = new ImageIcon("gameover.png");
            go = new JLabel(game);
            go.setBounds(0, 0, 960, 660);
            p.add(go);
            p.repaint();
            Thread.sleep(4000);
            remove(p);
            intiliaze();
            pan();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
}
void speed()
{
    if (count<15) {
        count++;
        spd.setText(String.valueOf(count));  
        revalidate();
        repaint();
    }
    }
    void highspeed()
    {
        if(count<25)
        {
        count++;
        spd.setText(String.valueOf(count));  
        revalidate();
        repaint();
    }
    }
    void slowspeed()
    {
        if(count>15)
        {
            count--;
            spd.setText(String.valueOf(count));  
            revalidate();
            repaint();
        }
        else if(count==15||count<=15)
        {
            ter=0;
        }
    }
    void intiliaze()
    {
         x=350;y=500;speed=15;cx=400;cy=650;
     tr1y=430;tr2y=210;tr3y=0;tr4y=430;tr5y=210;tr6y=0;y1=0;
     x4=0;
     next=0;
     ter=0;
     tcoin=0;
     count=0;
     collect.setText("0");
     spd.setText("0");
    }
}
public class cargame {
public static void main(String[] args) {
    a ob = new a();
    ob.pan();
    ob.run();
}
}