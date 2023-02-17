import java.awt.*;
import java.lang.*;
import java.awt.event.*;
public class Calc extends Frame implements ActionListener
{
    Button a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,aPlus,aEqual,aMinus,aDiv,aMul,aClr,aExt,aNeg,aDot;
    Label lbl;
    String str=new String();
    String stm=new String();
    String str1=new String();
    int temp=0;
    int m,s,mu,d;
    int aS,aM,aD,aMu;
    int t,i=0,r=0,k=0,neg=0,gt=0,gtt=0,at=0,c=0,adot=0,ad=0,aq=0;
    float temp3,temp4,temp5,tt;
    double temp6,temp7;
    Calc()
    {    
       aDot=new Button("."); 
       aExt=new Button("EXIT");
       aNeg=new Button("-/+");
       a1=new Button("1");
       a2=new Button("2");
       a3=new Button("3");
       a4=new Button("4");
       a5=new Button("5");
       a6=new Button("6");
       a7=new Button("7");
       a8=new Button("8");
       a9=new Button("9");
       a0=new Button("0");
       aPlus=new Button("+");
       aEqual=new Button("=");
       aMinus=new Button("-");
       aDiv=new Button("/");
       aMul=new Button("x");
       aClr=new Button("CE");

       lbl=new Label(" ");
       lbl.setAlignment(2);
       lbl.setText("0");
       setLayout(null);

       lbl.setBounds(20,50,150,20);
       a1.setBounds(20,80,30,20);
       a2.setBounds(60,80,30,20);
       a3.setBounds(100,80,30,20);
       a4.setBounds(20,110,30,20);
       a5.setBounds(60,110,30,20);
       a6.setBounds(100,110,30,20);
       a7.setBounds(20,140,30,20);
       a8.setBounds(60,140,30,20);
       a9.setBounds(100,140,30,20);
       a0.setBounds(60,170,30,20);
       aPlus.setBounds(140,80,30,20);
       aEqual.setBounds(60,200,70,20);
       aExt.setBounds(140,200,30,20);
       aMinus.setBounds(140,110,30,20);
       aDiv.setBounds(140,140,30,20);
       aMul.setBounds(140,170,30,20);
       aClr.setBounds(20,200,30,20);
       aNeg.setBounds(20,170,30,20);
       aDot.setBounds(100,170,30,20);


       add(a1);
       add(a2);
       add(a3);
       add(a4);
       add(a5);
       add(a6);
       add(a7);
       add(a8);
       add(a9);
       add(a0);
       add(aPlus);
       add(aEqual);
       add(aMinus);
       add(aDiv);
       add(aMul);
       add(aClr);
       add(aNeg);
       add(aExt);
       add(aDot);
       add(lbl);

      
       a1.addActionListener(this);
       a2.addActionListener(this);
       a3.addActionListener(this);
       a4.addActionListener(this);
       a5.addActionListener(this);
       a6.addActionListener(this);
       a7.addActionListener(this);
       a8.addActionListener(this);
       a9.addActionListener(this);
       a0.addActionListener(this);
       aPlus.addActionListener(this);
       aEqual.addActionListener(this);
       aMinus.addActionListener(this);
       aDiv.addActionListener(this);
       aMul.addActionListener(this);
       aClr.addActionListener(this);
       aNeg.addActionListener(this);
       aExt.addActionListener(this);
       aDot.addActionListener(this);

    }// I have used Awt version of java to implement this Calculator. Hope you find it useful..!!
    public void actionPerformed(ActionEvent ae)
    {
if(ae.getSource()==a0)
{
    str=str.concat("0");
    if(adot==1)
    {

            }
            else
    {
    int c=Integer.parseInt(str);
            if(c==0)
    {
   str=new String("0");
           gt=1;
        }
        else
        {
             gt=0;
        }
    }
    lbl.setText(str);
    i=1;
   
}
else if(ae.getSource()==a1)
{
    str=str.concat("1");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==1)
       {
   str=new String("1");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a2)
{
    str=str.concat("2");
    if(adot==1)
    {

            }
            else
    {    
int c=Integer.parseInt(str);
           if(c==2)
        {
   str=new String("2");
        }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a3)
{
    str=str.concat("3");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==3)
       {
   str=new String("3");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a4)
{
    str=str.concat("4");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==4)
       {
  str=new String("4");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a5)
{
    str=str.concat("5");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==5)
       {
   str=new String("5");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a6)
{
    str=str.concat("6");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==6)
       {
  str=new String("6");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a7)
{
    str=str.concat("7");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==7)
       {
   str=new String("7");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a8)
{
    str=str.concat("8");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==8)
       {
   str=new String("8");
       }
      }
    lbl.setText(str);
    i=1;
    gt=0;
}
else if(ae.getSource()==a9)
{
    str=str.concat("9");
    if(adot==1)
    {

            }
            else
    {
       int c=Integer.parseInt(str);
               if(c==9)
       {
   str=new String("9");
       }
    }
    lbl.setText(str);
    i=1;
    gt=0;

}
else if(ae.getSource()==aExt)
{
    System.exit(0);
}
else if(ae.getSource()==aDot)
{
    adot=1;
    if(i==1)
    {
      if(at==0)
      {
at=1;
str=str.concat(".");
        lbl.setText(str);
      }
    }
    else if(i==0)
    {
      if(at==0)
      {
        str=str.concat("0.");
        lbl.setText(str);
at=1;
      }
    }
    else { }
           
 
}
else if(ae.getSource()==aClr)
{
    str=new String();
    lbl.setText("0");
    i=0;
    stm=new String();
            str1=new String();
            temp=0;
        m=s=mu=d=0;
      aS=aM=aD=aMu=0;
            t=i=r=k=0;
            temp3=temp4=0.0f;
    at=0;
   
}

else if(ae.getSource()==aPlus)
{
    c=0;
    gt=1;
    at=0;
    if(adot==1&&i==1)
    {
temp4=Float.parseFloat(str);
str=null;
        str=new String();
        s=1;
        m=mu=d=0;
        aS=aM=aMu=aD=0;
adot=0;
        ad=1;
    }
   
    if(i==1)
    {
       temp=Integer.parseInt(str);
       str=null;
       str=new String();
       s=1;
       m=mu=d=0;
       aS=aM=aMu=aD=0;
    }
    if(i==0)
    {
       if(r==1)
       {
          temp4=Float.parseFloat(stm);
          s=1;
           m=mu=d=0;
           aS=aM=aMu=aD=0;
   k=1;
       }
       else if(r==0)
       {
           temp=Integer.parseInt(stm);
           s=1;
           m=mu=d=0;
           aS=aM=aMu=aD=0;
       }
       else {}
    }
}
else if(ae.getSource()==aMinus)
{
    c=0;
    gt=1;
    at=0;
    if(adot==1&&i==1)
    {
temp4=Float.parseFloat(str);
str=null;
        str=new String();
        m=1;
        s=mu=d=0;
        aS=aM=aMu=aD=0;
adot=0;
        ad=1;
    }
    if(i==1)
    {
temp=Integer.parseInt(str);
    str=null;
    str=new String();
    m=1;
    s=mu=d=0;
    aS=aM=aMu=aD=0;
    }
    if(i==0)
    {
if(r==1)
        {
   temp4=Float.parseFloat(stm);
          m=1;
       s=mu=d=0;
       aS=aM=aMu=aD=0;
   k=1;
}
else if(r==0)
        {
           temp=Integer.parseInt(stm);
           m=1;
       s=mu=d=0;
       aS=aM=aMu=aD=0;
        }
        else {}
    }
}
else if(ae.getSource()==aDiv)
{
    c=0;
    gt=1;
    at=0;
    if(adot==1&&i==1)
    {
temp4=Float.parseFloat(str);
str=null;
        str=new String();
        d=1;
        m=mu=s=0;
        aS=aM=aMu=aD=0;
adot=0;
        ad=1;
    }
    if(i==1)
    {
temp=Integer.parseInt(str);
str=null;
    str=new String();
    d=1;
    s=mu=m=0;
    aS=aM=aMu=aD=0;
ad=0;
    }
    if(i==0)
    {
if(r==1)
        {
   temp4=Float.parseFloat(stm);
          d=1;
       s=mu=m=0;
       aS=aM=aMu=aD=0;
   k=1;
}
else if(r==0)
        {
   stm=lbl.getText();
           temp3=Float.parseFloat(stm);
           d=1;
       s=mu=m=0;
       aS=aM=aMu=aD=0;
}
        else {}
     }     
}
else if(ae.getSource()==aMul)
{
    c=0;
    gt=1;
    at=0;
    if(adot==1&&i==1)
    {
//temp4=Float.parseFloat(str);
temp6=Double.parseDouble(str);
str=null;
        str=new String();
        mu=1;
        m=s=d=0;
        aS=aM=aMu=aD=0;
adot=0;
        ad=1;
System.out.println("sona");
    }
    if(i==1)
    {
   temp=Integer.parseInt(str);
    str=null;
    str=new String();
    mu=1;
    s=m=d=0;
    aS=aM=aMu=aD=0;
    }
    if(i==0)
    {
   if(r==1)
        {
   temp4=Float.parseFloat(stm);
          mu=1;
       s=m=d=0;
       aS=aM=aMu=aD=0;
   k=1;
}
else if(r==0)
        {
           temp=Integer.parseInt(stm);
           mu=1;
       s=m=d=0;
       aS=aM=aMu=aD=0;

}
        else {}
    }
}
else if(ae.getSource()==aNeg)
{
  if(gt==0)
  {
    String g=lbl.getText();
    float gText=Float.parseFloat(g);
    if(gText<0)
    {
gText=gText*(-1);
    }
    else if(gText>0)
    {
gText=gText*(-1);
    }
    else
    {
gText=0.0f;
    }
    if(adot==1)
    {
   str=Float.toString(gText);
lbl.setText(str);
    }
    else if(r==1&&i==0&&gtt==0)
    {
     stm=Float.toString(gText);
lbl.setText(stm);
    }
    else if(r==0&&i==0)
    {
stm=Integer.toString((int)gText);
lbl.setText(stm);
    }
    else if(i==1)
    {
str=Integer.toString((int)gText);
lbl.setText(str);
    }
    else {}
          }
          else {}
}

else if(ae.getSource()==aEqual)
{  
   
    int temp2=0;

    if(s==1)
    {
if(ad==1)
{
     temp5=Float.parseFloat(str);
   tt=temp5;
   temp3=temp4+temp5;
   s=0;
           aS=1;
}
else if(k==1)
{
                   temp2=Integer.parseInt(str);
   t=temp2;
   temp3=(float)temp2+temp4;
   s=0;
   aS=1;
        }
else if(k==0)
{
         temp2=Integer.parseInt(str);
   t=temp2;
   temp2=temp2+temp;
   s=0;
   aS=1;
        }
else {}
     
    }
    else if(m==1)
    {
if(ad==1)
{
     temp5=Float.parseFloat(str);
   tt=temp5;
   temp3=temp4-temp5;
   m=0;
           aM=1;
}
else if(k==1)
{
    temp2=Integer.parseInt(str);
            t=temp2;
    temp3=temp4-(float)temp2;
    m=0;
    aM=1;
}
else if(k==0)
{
    temp2=Integer.parseInt(str);
            t=temp2;
    temp2=temp-temp2;
    m=0;
    aM=1;
}
else {}
    }
    else if(d==1)
    {
if(ad==1)
{
     temp5=Float.parseFloat(str);
   tt=temp5;
   temp3=temp4/temp5;
   d=0;
           aD=1;
}
else if(k==1)
{
   temp2=Integer.parseInt(str);
           t=temp2;
   temp3=temp4/(float)(temp2);
   d=0;
   aD=1;
}
else if(k==0)
{
   temp2=Integer.parseInt(str);
           t=temp2;
   temp3=(float)temp/(float)(temp2);
   d=0;
   aD=1;
    }
else {}
        }
    else if(mu==1)
    {
if(ad==1)
{
     //temp5=Float.parseFloat(str);
         temp7=Double.parseDouble(str);
   tt=temp5;
   temp3=(float)(temp6*temp7);
   mu=0;
           aMu=1;
System.out.println("kiran");
}
if(k==1)
{
   temp2=Integer.parseInt(str);
           t=temp2;
   temp3=temp4*(float)temp2;
   mu=0;
   aMu=1;
}
if(k==0)
{
   temp2=Integer.parseInt(str);
           t=temp2;
   temp2=temp2*temp;
   mu=0;
   aMu=1;
}
else {}
    }
    else if(aS==1)
    {
if(r==1)
{
    aq=1;
    temp3=Float.parseFloat(stm);
    temp3=temp3+tt;
}
else
{
   temp2=Integer.parseInt(stm);
   temp2=temp2+t;
}
    }
    else if(aM==1)
    {
if(r==1)
{
    aq=1;
    temp3=Float.parseFloat(stm);
    temp3=temp3-tt;
}
else
{
   temp2=Integer.parseInt(stm);
   temp2=temp2-t;
}
    }
    else if(aD==1)
    {
if(r==1)
{
    aq=1;
    temp3=Float.parseFloat(stm);
    temp3=temp3/tt;
}
else
{
   temp3=Float.parseFloat(stm);
   temp3=(temp3/(float)t);
}
    }
    else if(aMu==1)
    {
if(r==1)
{
    aq=1;
    temp3=Float.parseFloat(stm);
    temp3=temp3*tt;
}
else
{
   temp2=Integer.parseInt(stm);
   temp2=temp2*t;
}
    }
    else if(i==1)
    {
lbl.setText(str);
c=1;
str1=str;
    }
    else { }
    if(d==1||aD==1||k==1||ad==1||aq==1)
    {
int g=(int)temp3;
float g1=(float)g;
stm=null;
if(g1==temp3)
{
   stm=Integer.toString(g);
   gtt=1;
}
else
{
   stm=Float.toString(temp3);
   gtt=0;
}
    lbl.setText(stm);
str=new String();
i=0;
r=1;
k=0;
    ad=0;
aq=0;
    }
    else
    {
stm=null;
    stm=Integer.toString(temp2);
if(c==1)
        {
   stm=str1;
}
    lbl.setText(stm);
str=new String();
        gtt=1;
i=0;
r=0;
    }
            adot=0;    
}
else
{
}

    }
    public static void main(String arg[])
    {
       Calc at=new Calc();
       at.setSize(190,240);
       at.setTitle("Calculator...");
       at.setVisible(true);
       at.setBackground(Color.blue);
    }
} 
