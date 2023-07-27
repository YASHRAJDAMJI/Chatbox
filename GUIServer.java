import java.awt.*; 
import javax.swing.*; 
import java.net.*; 
import java.io.*;
import java.awt.event.*;

class GUIServer extends JFrame implements ActionListener,KeyListener

{

JTextField f=new JTextField(4);
x
static JTextField fs=new JTextField(8); static JTextArea a=new JTextArea(5,20); static JLabel l=new JLabel();
ImageIcon dell = new ImageIcon("del.png"); ImageIcon cl = new ImageIcon("clear.png"); static ImageIcon ac = new ImageIcon("on.png"); ImageIcon pf = new ImageIcon("finalp.png"); static ImageIcon nc = new ImageIcon("off.png"); static JLabel la=new JLabel();
JLabel lpp=new JLabel(pf); JButton end=new JButton("End"); JButton ev=new JButton(cl); JButton del=new JButton(dell); static String msg="";
static String msg2=""; ServerSocket ss; static Socket s;
static BufferedReader br; PrintWriter w;
 
GridBagLayout g;

GUIServer(String title)

{

super(title); setSize(1017,735); setLayout(null);
setContentPane(new JLabel(new ImageIcon("moni3.jpg"))); a.setEditable(false);
a.setOpaque(false);

Font font = new Font("Courier", Font.BOLD,15); a.setFont(font);

a.setForeground(Color.WHITE); a.setBackground(new Color(0,0,0,0)); a.setBackground(new Color(0,0,0,0)); l.setFont(font); l.setForeground(Color.WHITE);
//add(fs);

l.setBackground(new Color(0,0,0,0)); l.setBackground(new Color(0,0,0,0)); l.setBounds(376,15,90,90); a.setBounds(345,50,500,400); f.setBounds(400,474,485,25);
//w.println("on"); ev.setBounds(790,38,29,29); del.setBounds(835,38,29,29); lpp.setBounds(80,35,257,470);

la.setBounds(376,2,90,90);
 
add(la);


add(l);

add(del);

add(ev);

add(lpp);

add(a);

add(f);

add(end);

//f.addKeyListener(this); f.addActionListener(this); del.addActionListener(this); ev.addActionListener(this); f.addKeyListener(this); end.addActionListener(this); setVisible(true);
addWindowListener(new WindowAdapter()

{

public void windowClosing(WindowEvent e)

{

System.exit(0);

}

});

try

{

ss=new ServerSocket(2300); s=ss.accept();
br=new BufferedReader(new InputStreamReader(s.getInputStream())); w=new PrintWriter(s.getOutputStream(),true);
 
w.println("on");

}

catch(Exception e)

{

a.append("\n"+e.toString());

}


}



 
public void keyPressed(KeyEvent e){

w.println("typing");}


w.println("");}







public void actionPerformed(ActionEvent e)

{

if(e.getSource()==f)

{

msg2=f.getText(); w.println(msg2); a.append("\n\n\t\t\t me:"+msg2); f.setText("");

}


if(e.getSource()==ev)
 



public void keyReleased(KeyEvent e){


public void keyTyped(KeyEvent e)

{

//w.println("typing");

}
 
{

a.setText(""); w.println("delall");

}

if(e.getSource()==del)

{

a.setText("");


}




if(e.getSource()==end)

{

w.println("bye"); System.exit(0);
}


}

public static void main(String ar[])throws Exception

{

GUIServer c=new GUIServer("Gui based server chat");


//w.println("on"); while(true)
{

msg=br.readLine(); int i=1;
int j=1;
 
if(msg.equals("typing"))

{

if(i==1)

{l.setText(msg);

} i++;
}

else

{

if(msg.equals(""))

{

if(j==1)

{

l.setText(msg);

}

j++;

}



else

{

if(msg.equals("delall"))

{

a.setText("");

msg="all msg deleted";

}

else{


if(msg.equals("on"))

{
 
//ImageIcon ac = new ImageIcon("on.png");

//JLabel la=new JLabel(ac);

//la(ac);

//la.setIcon(new ImageIcon("on.png"));

//la.setBounds(360,15,90,90);

//add(la);

Font font = new Font("Courier", Font.BOLD,15); la.setFont(font);

la.setForeground(Color.WHITE); la.setBackground(new Color(0,0,0,0)); la.setText("online");
}else{if(msg.equals("off"))

{

la.setText("offline");} else{
//a.append("\nClient:"+msg);


if(msg.equals("bye")) break;
}

}

}

if(msg.equals("on"))

{


}

else

{
 
if(msg.equals("off"))

{


}

else { a.append("\nClient:"+msg); if(msg.equals("bye")) break;
}

}}

}

/* if(msg.equals(""))
{

if(j==1)

{

fs.setText(msg);

}

j++;

}

*/

//else

//{

//a.append("\nClient:"+msg);

//if(msg.equals("bye"))

//break;

//}

}
 
s.close();

}

}

Client.java
import java.awt.*; import javax.swing.*; import java.net.*; import java.io.*;
import java.awt.event.*;

class GUIClient extends JFrame implements ActionListener,KeyListener

{

JTextField f=new JTextField(6);

static JTextField fs=new JTextField(6); static JTextArea a=new JTextArea(100,100); static JLabel l=new JLabel();

//static JLabel lp=new JLabel(); static JLabel JLabel2=new JLabel(); JButton end=new JButton("End");
ImageIcon th = new ImageIcon("th22.png"); ImageIcon sendd = new ImageIcon("send.png");

ImageIcon dell = new ImageIcon("del.png"); ImageIcon cl = new ImageIcon("clear.png");

ImageIcon ac = new ImageIcon("on.png"); static JLabel la=new JLabel();

//ImageIcon nc = new ImageIcon("off.png");
 
//JLabel ln=new JLabel(nc);


JLabel lp=new JLabel(sendd); JButton thm=new JButton(th); JButton del=new JButton(dell); JButton ev=new JButton(cl);
//JButton end=new JButton("End"); static String msg="";
static String msg2=""; static Socket s;
static BufferedReader br; PrintWriter w;
public static int y=1; GridBagLayout g; GUIClient(String title)
{
super(title); setSize(362,740);
setContentPane(new JLabel(new ImageIcon("phn4.jpg")));

//setBaground("phn4.jpg");

//setLayout(new GridBagLayout()); setLayout(null); a.setOpaque(false);
Font font = new Font("Courier", Font.BOLD,15); a.setFont(font);
a.setForeground(Color.WHITE); a.setBackground(new Color(0,0,0,0)); l.setFont(font); l.setForeground(Color.WHITE);
 
l.setBackground(new Color(0,0,0,0)); a.setBounds(60,40,400,400);
//fs.setOpaque(false);

//fs.setBorder(false); f.setBounds(50,630,235,30);
//fs.setBounds(125,100,50,20); l.setBounds(88,20,90,90);
//end.setBounds(50,110,30,20); thm.setBounds(265,50,29,29); del.setBounds(230,50,29,29); ev.setBounds(285,582,35,35); lp.setBounds(257,632,95,20); la.setBounds(80,10,95,90);
//w.println("on"); add(thm);
add(fs);

add(la);

add(l);

add(ev);

add(a);

add(f);

//add(ev); add(del);
add(lp);

//add(end);

//g.setConstraints(a); del.addActionListener(this); f.addKeyListener(this); ev.addActionListener(this);
 
a.setEditable(false);


f.addActionListener(this); end.addActionListener(this); thm.addActionListener(this); setVisible(true);







try

{

s=new Socket("127.0.0.1",2300);

br=new BufferedReader(new InputStreamReader(s.getInputStream()));


w=new PrintWriter(s.getOutputStream(),true); w.println("on");
}

catch(Exception e)

{

a.append("\n"+e.toString());

}


addWindowListener(new WindowAdapter()

{

public void windowClosing(WindowEvent e)

{

w.println("off"); System.exit(0);
 
}

});









 

}


w.println("typing");}


w.println("");}
 


public void keyPressed(KeyEvent e){


public void keyReleased(KeyEvent e){


public void keyTyped(KeyEvent e)

{

//w.println("typing");

}
 



public void actionPerformed(ActionEvent e)

{

if(e.getSource()==f)

{

msg2=f.getText(); w.println(msg2); a.append("\n\n\t\tme:"+msg2); f.setText("");
}


if(e.getSource()==del)

{
 
a.setText("");


}


if(e.getSource()==ev)

{

a.setText(""); w.println("delall");

}







 





{


setSize(369,740);
 
if(e.getSource()==thm)

{

if (y==1)


System.out.println("reached here");


setContentPane(new JLabel(new
 
ImageIcon("2.jpg")));



 










add(del);
 
add(thm);

add(fs);

add(l);

add(a);

add(f);

add(ev);
 
add(lp);

y++;

}

else

{

 
if (y==2)

{
 



System.out.println("reached here");
 

 
setSize(365,740);


ImageIcon("7.jpg")));
 


setContentPane(new JLabel(new
 



 










add(del);

add(lp);

y++;
 
add(thm);

add(fs);

add(l);

add(a);

add(f);

add(ev);
 

 
}

else

{


{
 










setSize(366,740);
 





if (y==3)


System.out.println("reached here");


setContentPane(new JLabel(new
 
ImageIcon("3.jpg")));
 









add(ev);

add(del);

add(lp);

y++;
 
add(thm);

add(fs);

add(l);

add(a);

add(f);
 

 
}

else

{
 





if (y==4)
 

 
{


setSize(367,740);
 


//System.out.println("reached here");


setContentPane(new JLabel(new
 
ImageIcon("8.jpg")));



 









add(ev);

add(del);

add(lp);

y++;
 
add(thm);

add(fs);

add(l);

add(a);

add(f);
 
}

else

{


{
 










setSize(366,740);
 





if (y==5)


//System.out.println("reached here");


setContentPane(new JLabel(new
 
ImageIcon("1.jpg")));



 









add(ev);

add(del);

add(lp);

y++;
 
add(thm);

add(fs);

add(l);

add(a);

add(f);
 

}

else

{

 
if (y==6)

{
 



//System.out.println("reached here");
 

 
setSize(365,740);


ImageIcon("6.jpg")));
 


setContentPane(new JLabel(new


//4 5 add(thm);
 







add(ev);

add(del);

add(lp);

y++;
 
add(fs);

add(l);

add(a);

add(f);
 

 
}

else

{
 





if (y==7)
 

 
{


setSize(367,740);
 


//System.out.println("reached here");


setContentPane(new JLabel(new
 
ImageIcon("4.jpg")));











add(ev);

add(del);

add(lp);

y++;
 


//4 5 add(thm);
add(fs);

add(l);

add(a);

add(f);
 

}
 
else

{

if (y==8)

{
 







//System.out.println("reached here");
 

 
setSize(368,740);


ImageIcon("5.jpg")));











add(ev);

add(del);

add(lp);

y=1;
 


setContentPane(new JLabel(new


//4 5 add(thm);
add(fs);

add(l);

add(a);

add(f);
 

}

else

{

y=1;


}


}


}
 
}


}




}


}




}














}

}

public static void main(String args[])throws Exception

{


GUIClient c=new GUIClient("Gui based client chat");


//w.println("on");


while(true)

{
 
msg=br.readLine();


int i=1; int j=1;
if(msg.equals("typing"))

{

if(i==1)

{l.setText(msg);

} i++;
}

else

{

if(msg.equals(""))

{

if(j==1)

{

l.setText(msg);

}

j++;

}



else

{

if(msg.equals("delall"))

{

a.setText("");

msg="all msg deleted";

}
 
else

{

if(msg.equals("off"))

{

Font font = new Font("Courier", Font.BOLD,15); la.setFont(font);

la.setForeground(Color.WHITE); la.setBackground(new Color(0,0,0,0)); la.setText("offline");

}


else

{

if(msg.equals("on"))

{

Font font = new Font("Courier", Font.BOLD,15); la.setFont(font);

la.setForeground(Color.WHITE); la.setBackground(new Color(0,0,0,0)); la.setText("online");

}

else

{

a.append("\n\nSERVER:"+msg); if(msg.equals("bye"))
 
break;

}

}

}

}


}


//a.append("\n\nSERVER:"+msg);

//if(msg.equals("bye"))

//break;

}

s.close();

}

}
