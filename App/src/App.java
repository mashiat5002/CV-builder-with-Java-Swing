import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class App extends JFrame {
    
    private JButton b1,b2,b3;
    private JPanel jpnl,jpnl2;
    private JComboBox jcmb,jcmb_color,jcmbPanalColor;
    private JTextArea jtxName,jtxOccupation,bio,experience,underline,timeline,instName,occupation,occDetails,timeline2,
    instName2,occupation2,occDetails2,references,underline2,ref1,ref2,instName3,instName4,phone1,phone2,email1,
    email2,contact,underline3,selfPhone,selfPhoneNUm,selfEmail,selfEmailID,address,addressID,education,underline4,
    yearStydy,studysub,studyInst,yearStydy2,studysub2,studyInst2,focused;

    private String cl[]= {"RED","GREEN","BLUE","YELLOW","BLACK","WHITE","ORANGE","PINK","GRAY"}; 
    private Color selectedColor;


   

    private Container c;
    private Font f,f1,f2,f3,f4,f5,f6;
    private Integer[] fs= new Integer[101];
    App(){
        for(Integer i=0;i<=100;i++)
        fs[i]= i;
        
        jpnl = new JPanel();
        jpnl2 = new JPanel();

        
        
        jcmb = new JComboBox<Integer>(fs);
        jcmb.setBounds(640,0,50,50);

        jcmb_color = new JComboBox<String>(cl);
        jcmb_color.setBounds(640,200,50,50);


        jcmbPanalColor = new JComboBox<String>(cl);
        jcmbPanalColor.setBounds(640,300,50,50);

        f= new Font("name",Font.BOLD,35);
        f1= new Font("name",Font.BOLD,20);
        f2= new Font("name",Font.BOLD,10);
        f3= new Font("name",Font.BOLD,22);
        f4= new Font("name",Font.BOLD,16);
        f5= new Font("name",Font.BOLD,12);
        f6= new Font("name",Font.BOLD,17);
        setSize(720,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        c= getContentPane();
        jpnl.setBounds(230,0,395,800);
        jpnl.setLayout(null);
        jpnl2.setBounds(0,0,230,800);
        jpnl2.setLayout(null);
        jpnl2.setBackground(Color.orange);

        
        

        c.setLayout(null);
        handler hnd= new handler();
        jcmb.addActionListener(hnd);
        
        
        jtxName= createJTXA(jtxName,"MAZHAR ISLAM",0,0,395,90,f,Color.white);
        jtxOccupation=createJTXA(jtxOccupation,"Retail Sales ASSOCIATE",0,50,395,60,f1,Color.white);
        bio=createJTXA(bio,"Dynamic professional with a demonstrated expertise in retail sales, complemented by abackground in project management and international online service experience. Proven ability toexceed sales goals, deliver outstanding customer service, and thrive in diverse professionalenvironments.\r",2,80,395,80,f2,Color.white);
        experience = createJTXA(experience, "EXPERIENCE", 0, 160, 395, 60, f3,Color.white);
        underline = createJTXA(underline, "", 0, 190, 395, 1, f3,Color.black);
        timeline = createJTXA(timeline, "2022 March-Continuing", 2, 200, 395, 30, f4,Color.white);
        instName = createJTXA(instName, "Boots UK Limited, health and beauty retailer and pharmacy\r", 2, 220, 395, 30, f5,Color.white);
        occupation = createJTXA(occupation, "Retail Sales Associate\r\r", 2, 250, 395, 30, f6,Color.white);
        occDetails = createJTXA(occDetails, "During my tenure as a Retail Sales Associate at Boots UK Limited in London, I excelled in guiding customers through product selections by offering personalized recommendationsaligned with their preferences and needs. Adept at maintaining an organized inventory and optimizing product displays, I consistently contributed to heightened sales. Skillfullyaddressing customer inquiries and handling returns with professionalism, I ensured a positive shopping experience. Moreover, my collaborative efforts with the sales team inorganizing promotional events significantly contributed to the success of various salescampaigns, showcasing my commitment to driving both individual and collectiveachievements in a retail setting", 2, 270, 395, 150, f2,Color.white);
        timeline2 = createJTXA(timeline, "2022 March-Continuing", 2, 420, 395, 30, f4,Color.white);
        instName2 = createJTXA(instName, "Boots UK Limited, health and beauty retailer and pharmacy\r", 2, 440, 395, 30, f5,Color.white);
        occupation2 = createJTXA(occupation, "Retail Sales Associate\r\r", 2, 470, 395, 30, f6,Color.white);
        occDetails2 = createJTXA(occDetails, "During my tenure as a Retail Sales Associate at Boots UK Limited in London, I excelled in guiding customers through product selections by offering personalized recommendationsaligned with their preferences and needs. Adept at maintaining an organized inventory and optimizing product displays, I consistently contributed to heightened sales. Skillfullyaddressing customer inquiries and handling returns with professionalism, I ensured a positive shopping experience. Moreover, my collaborative efforts with the sales team inorganizing promotional events significantly contributed to the success of various salescampaigns, showcasing my commitment to driving both individual and collectiveachievements in a retail setting", 2, 490, 395, 150, f2,Color.white);
        references = createJTXA(references, "REFERENCES", 0, 640, 395, 30, f3,Color.white);
        underline2 = createJTXA(underline, "", 0, 670, 395, 1, f3,Color.black);
        ref1 = createJTXA(ref1, "Name Surname\r", 0, 671, 200, 30, f4,Color.white);
        ref2 = createJTXA(ref1, "Name Surname\r", 200, 671, 200, 30, f4,Color.white);
        instName3 = createJTXA(instName3, "Boots UK Limited, health and beauty retailer and pharmacy\r", 0, 690, 200, 30, f2,Color.white);
        instName4 = createJTXA(instName4, "Boots UK Limited, health and beauty retailer and pharmacy\r", 200, 690, 200, 30, f2,Color.white);
        phone1 = createJTXA(phone1, "PHONE: 123-456-7890\r", 0, 720, 200, 20, f2,Color.white);
        phone2 = createJTXA(phone2, "PHONE: 123-456-7890\r", 200, 720, 200, 20, f2,Color.white);
        email1 = createJTXA(email1, "EMAIL: hello@reallygreatsite.com\r", 0, 735, 200, 60, f2,Color.white);
        email2 = createJTXA(email2, "EMAIL: hello@reallygreatsite.com\r",200, 735, 200, 60, f2,Color.white);

        
        
        contact = createJTXA2(contact, "CONTACT", 10, 150, 220, 45, f3,Color.orange);
        underline3 = createJTXA2(underline3, "", 10, 190, 220, 1, f3,Color.white);
        
        selfPhone = createJTXA2(selfPhone, "PHONE", 10, 200, 220, 45, f4,Color.orange);
        selfPhoneNUm = createJTXA2(selfPhoneNUm, "01712675298", 10, 225, 220, 45, f5,Color.orange);
        selfEmail = createJTXA2(selfEmail, "Email", 10, 260, 220, 45, f3,Color.orange);
        selfEmailID = createJTXA2(selfEmailID, "01712675298", 10, 290, 220, 45, f5,Color.orange);
        address = createJTXA2(address, "ADDRESS", 10, 320, 220, 45, f3,Color.orange);
        addressID = createJTXA2(addressID, "119, LALA DIGIR PAR, SYLHET", 10, 350, 220, 45, f5,Color.orange);
        education = createJTXA2(education, "EDUCATION", 10, 395, 220, 45, f3,Color.orange);
        underline4 = createJTXA2(underline4, "", 10, 440, 220, 1, f3,Color.white);
        yearStydy = createJTXA2(yearStydy, "2010", 10, 450, 220, 45, f5,Color.orange);
        studysub = createJTXA2(studysub, "Master of Science International Project Mangement", 10, 470, 220, 45, f2,Color.orange);
        underline4 = createJTXA2(underline4, "", 10, 440, 220, 1, f3,Color.white);
        studyInst = createJTXA2(studyInst, "Northumbria University, London Campus,UK\r", 10, 520, 220, 45, f5,Color.orange);
        yearStydy2 = createJTXA2(yearStydy2, "2020", 10, 450+120, 220, 45, f5,Color.orange);
        studysub2 = createJTXA2(studysub2, "Master of Science International Project Mangement", 10, 470+120, 220, 45, f2,Color.orange);
        
        studyInst2 = createJTXA2(studyInst2, "Northumbria University, London Campus,UK\r", 10, 520+120, 220, 45, f5,Color.orange);
       
        
   
        
        
        b1= new JButton("↑");
        b1.setBounds(640,50,50,50);
        b1.setFont(f1);
        c.add(b1);
        b2= new JButton("↓");
        b2.setBounds(640,100,50,50);
        b2.setFont(f1);
        b3= new JButton("SAVE");
        b3.setBounds(630,600,70,50);
        b3.setFont(f2);
        c.add(b3);
        c.add(b2);
        
        c.add(jpnl);
        c.add(jpnl2);
        
        c.add(jcmbPanalColor);
        c.add(jcmb_color);
                c.add(jcmb);
                
                
                jpnl2.add(studyInst2);
                jpnl2.add(studysub2);
                jpnl2.add(yearStydy2);
                
                jpnl2.add(studyInst);
                jpnl2.add(studysub);
                jpnl2.add(yearStydy);
                jpnl2.add(underline4);
                jpnl2.add(education);
                jpnl2.add(addressID);
                jpnl2.add(address);
                jpnl2.add(selfEmailID);
                jpnl2.add(selfEmail);
                jpnl2.add(selfPhoneNUm);
                jpnl2.add(selfPhone);
                jpnl2.add(underline3);
                jpnl2.add(contact);
                jpnl.add(email1);
                jpnl.add(email2);
                jpnl.add(phone1);
                jpnl.add(phone2);
                jpnl.add(instName3);
                jpnl.add(instName4);
                jpnl.add(ref1);
                jpnl.add(ref2);
                jpnl.add(underline2);
                jpnl.add(references);
                jpnl.add(occDetails2);
                jpnl.add(occupation2);
                jpnl.add(instName2);
                jpnl.add(timeline2);
                jpnl.add(occDetails);
                jpnl.add(occupation);
                jpnl.add(instName);
                jpnl.add(timeline);
                jpnl.add(underline);
                jpnl.add(experience);
                jpnl.add(bio);
                jpnl.add(jtxOccupation);
                jpnl.add(jtxName);
                jpnl.setBackground(Color.WHITE);


                handlerDown hndDn= new handlerDown();
                handlerUp hndUp= new handlerUp();
                b1.addActionListener(hndUp);
                b2.addActionListener(hndDn);


                JTextArea[] JTX_Array={jtxName,jtxOccupation,bio,experience,underline,timeline,instName,occupation,occDetails,timeline2,
                    instName2,occupation2,occDetails2,references,underline2,ref1,ref2,instName3,instName4,phone1,phone2,email1,
                    email2,contact,underline3,selfPhone,selfPhoneNUm,selfEmail,selfEmailID,address,addressID,education,underline4,
                    yearStydy,studysub,studyInst,yearStydy2,studysub2,studyInst2};
                TextAreaFocusListener fl= new TextAreaFocusListener();

                for(JTextArea x: JTX_Array){
                    x.addFocusListener(fl);
                    

                }
                
                colorhandler clr_hnd= new colorhandler();
                jcmb_color.addActionListener(clr_hnd);
                

                colorhandlerSecond clr_hnd2= new colorhandlerSecond();
                jcmbPanalColor.addActionListener(clr_hnd2);
                
                saver svr= new saver();
                b3.addActionListener(svr);
                
                setVisible(true);
                
        
        
    }
    public JTextArea createJTXA(JTextArea jtx,String s,int x,int y, int w, int h,Font f, Color clr){
        
        
        jtx = new JTextArea();
        jtx.setFont(f);
        jtx.setBounds(x,y,w,h);
        jtx.setWrapStyleWord(true);
        jtx.setLineWrap(true);
        jtx.setText(s);
        jtx.setBackground(clr);
        return jtx;
    }
    public JTextArea createJTXA2(JTextArea jtx,String s,int x,int y, int w, int h,Font f, Color clr){
        
        
        jtx = new JTextArea();
        jtx.setFont(f);
        jtx.setBounds(x,y,w,h);
        jtx.setWrapStyleWord(true);
        jtx.setLineWrap(true);
        jtx.setText(s);
        jtx.setBackground(clr);
        jtx.setForeground(Color.white);
        return jtx;
    }
    class handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int s= (int) jcmb.getSelectedItem();
            f= new Font("name",Font.BOLD,s);
            focused.setFont(f);
            setVisible(false);
            setVisible(true);
            
           
        }
    }
  
    class handlerUp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JTextArea jtx= focused;
           up(jtx);
           
        }
    }
    
    
    class handlerDown implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JTextArea jtx= focused;
           down(jtx);
           
           
        }
    }
    class saver implements ActionListener{
        public void actionPerformed(ActionEvent e){
            takeScreenshot();
           
           
        }
    }
    class colorhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JTextArea[] JTX_Array2={contact,underline3,selfPhone,selfPhoneNUm,selfEmail,selfEmailID,address,addressID,education,underline4,
                yearStydy,studysub,studyInst,yearStydy2,studysub2,studyInst2};
            
           if(jcmb_color.getSelectedItem()=="RED"){
            selectedColor= Color.RED;
            
           }
           else if(jcmb_color.getSelectedItem()=="GREEN"){
            selectedColor= Color.GREEN;
           }
           else if(jcmb_color.getSelectedItem()=="BLUE"){
            selectedColor= Color.BLUE;
           }
           else if(jcmb_color.getSelectedItem()=="ORANGE"){
            selectedColor= Color.ORANGE;
           }
           else if(jcmb_color.getSelectedItem()=="YELLOW"){
            selectedColor= Color.YELLOW;
           }
           else if(jcmb_color.getSelectedItem()=="BLACK"){
            selectedColor= Color.BLACK;
           }
           else if(jcmb_color.getSelectedItem()=="GRAY"){
            selectedColor= Color.GRAY;
           }
           else if(jcmb_color.getSelectedItem()=="WHITE"){
            selectedColor= Color.WHITE;
           }
           else if(jcmb_color.getSelectedItem()=="PINK"){
            selectedColor= Color.PINK;
           }
           for(JTextArea x: JTX_Array2)
           x.setForeground(selectedColor);
           underline3.setBackground(selectedColor);
           underline4.setBackground(selectedColor);
           jtxName.setForeground(selectedColor);
           c.setVisible(false);
           c.setVisible(true);
           
           
        }
    }
    class colorhandlerSecond implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JTextArea[] JTX_Array2={contact,selfPhone,selfPhoneNUm,selfEmail,selfEmailID,address,addressID,education,
                yearStydy,studysub,studyInst,yearStydy2,studysub2,studyInst2};
            
           if(jcmbPanalColor.getSelectedItem()=="RED"){
            selectedColor= Color.RED;
            
           }
           else if(jcmbPanalColor.getSelectedItem()=="GREEN"){
            selectedColor= Color.GREEN;
           }
           else if(jcmbPanalColor.getSelectedItem()=="BLUE"){
            selectedColor= Color.BLUE;
           }
           else if(jcmbPanalColor.getSelectedItem()=="ORANGE"){
            selectedColor= Color.ORANGE;
           }
           else if(jcmbPanalColor.getSelectedItem()=="YELLOW"){
            selectedColor= Color.YELLOW;
           }
           else if(jcmbPanalColor.getSelectedItem()=="BLACK"){
            selectedColor= Color.BLACK;
           }
           else if(jcmbPanalColor.getSelectedItem()=="GRAY"){
            selectedColor= Color.GRAY;
           }
           else if(jcmbPanalColor.getSelectedItem()=="WHITE"){
            selectedColor= Color.WHITE;
           }
           else if(jcmbPanalColor.getSelectedItem()=="PINK"){
            selectedColor= Color.PINK;
           }
           for(JTextArea x: JTX_Array2)
           x.setBackground(selectedColor);
           jpnl2.setBackground(selectedColor);
           c.setVisible(false);
           c.setVisible(true);
           
           
        }
    }
    class TextAreaFocusListener implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
            JTextArea focusedTextArea = (JTextArea) e.getSource();
            focused= focusedTextArea;
            
            
        }
        public void focusLost(FocusEvent e) {
            System.out.println("Focus Lost");
        }
    }
    
  
    public void up(JTextArea jtx){
        
        jtx.setLocation((int)jtx.getLocation().getX(),(int)(jtx.getLocation().getY()-1));
        

    }
    public void down(JTextArea jtx){
        
        
        jtx.setLocation((int)jtx.getLocation().getX(),(int)(jtx.getLocation().getY()+1));
      
        

    }
    private void takeScreenshot() {
        try {
            Robot robot = new Robot();
            Rectangle captureRect = new Rectangle(420,40,625,760);
            BufferedImage screenCapture = robot.createScreenCapture(captureRect);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Screenshot");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                ImageIO.write(screenCapture, "png", fileToSave);
                JOptionPane.showMessageDialog(this, "Screenshot saved successfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (AWTException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error capturing screenshot", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     





    
    public static void main(String[] args) throws Exception {
         new App();
      
        
    }
}
