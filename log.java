
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sriram pillutla
 */
public class log extends javax.swing.JFrame {
    
    int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
    int xo1,yo1,xo2,yo2,xo3,yo3,xo4,yo4,xo5,yo5;
    //int imagesequence[];
    int flag=0;
   int imagesequence[]={1,2,3,4,5,6};
   int imagetemp;
   int count=0;
   int wrongclickpoint=0;
   
   int hcount=0;     ScheduledExecutorService scheduler ; HoveringWorker myWorker;
   // private Object moveTimer;
   // private boolean moving=false;
  
    /**
     * Creates new form login
     */
    public log() {
      /*  moveTimer=new Timer(25,new ActionListener(){public void actionperformed(ActionEvent evt){moving=false;}

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        moveTimer.setRepeats(false);
       */ initComponents();
      
    }
    
    public int imagesequence(int seq)
    {
        int temp;
         
            for(int i=5;i>=1;i--)
            {
             temp=seq%10;
             imagesequence[i]=temp;
             seq=seq/10;
             
            } //for closed 
           
        return 1;
    }
    
    
    public void wrongclickpoint()
    {
        
            imagetemp=imagesequence[count]+2;
           // ImageIcon ic1=new ImageIcon("images\\"+imagetemp+".jpg");
              ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg")); 
            currentimage.setIcon(ic1);
            wrongclickpoint=1;
            imagetemp=imagesequence[count+1];
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentimagepanel = new javax.swing.JPanel();
        ImageIcon currentimg= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(450, 450, java.awt.Image.SCALE_SMOOTH));
        currentimage = new javax.swing.JButton(currentimg);
        unamepanel = new javax.swing.JPanel();
        unamelabel = new javax.swing.JLabel();
        unametextfield = new javax.swing.JTextField();
        buttonspanel = new javax.swing.JPanel();
        nextbutton = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        trybutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        currentimagepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentimage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        currentimage.setFocusPainted(false);

        currentimage.setFocusable(false);

        currentimage.setRequestFocusEnabled(false);

        currentimage.setRolloverEnabled(false);
        currentimage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                currentimageMouseMoved(evt);
            }
        });
        currentimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentimageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentimageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentimageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout currentimagepanelLayout = new javax.swing.GroupLayout(currentimagepanel);
        currentimagepanel.setLayout(currentimagepanelLayout);
        currentimagepanelLayout.setHorizontalGroup(
            currentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentimagepanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(currentimage, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        currentimagepanelLayout.setVerticalGroup(
            currentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentimagepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentimage, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        unamepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        unamelabel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        unamelabel.setText("Username");

        javax.swing.GroupLayout unamepanelLayout = new javax.swing.GroupLayout(unamepanel);
        unamepanel.setLayout(unamepanelLayout);
        unamepanelLayout.setHorizontalGroup(
            unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unamepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unamelabel)
                .addGap(18, 18, 18)
                .addComponent(unametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        unamepanelLayout.setVerticalGroup(
            unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unamepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamelabel)
                    .addComponent(unametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        buttonspanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nextbutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        nextbutton.setText("Next");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        submitbutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.setEnabled(false);
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        trybutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        trybutton.setText("Try Again");
        trybutton.setMaximumSize(new java.awt.Dimension(65, 23));
        trybutton.setMinimumSize(new java.awt.Dimension(65, 23));
        trybutton.setPreferredSize(new java.awt.Dimension(65, 23));
        trybutton.setEnabled(false);
        trybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonspanelLayout = new javax.swing.GroupLayout(buttonspanel);
        buttonspanel.setLayout(buttonspanelLayout);
        buttonspanelLayout.setHorizontalGroup(
            buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonspanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nextbutton)
                .addGap(18, 18, 18)
                .addComponent(submitbutton)
                .addGap(18, 18, 18)
                .addComponent(trybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonspanelLayout.setVerticalGroup(
            buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonspanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbutton)
                    .addComponent(trybutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextbutton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Orator Std", 1, 14)); // NOI18N
        jLabel1.setText("Persuasive Cued Click Points - Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(unamepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(currentimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(unamepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
        String uname = unametextfield.getText();
        try
        {
        if(uname.equals(""))
        {
             JOptionPane.showMessageDialog(new Frame(),"Enter Username");
        }
        
        else
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            String connectionQuery="jdbc:mysql://localhost:3306/pccp";  
            Connection con = DriverManager.getConnection(connectionQuery,"root",""); 
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from plog where uname='"+uname+"'"); 
            while(rs.next())
            {
            flag=1;
            this.xo1=rs.getInt("x1");
            this.yo1=rs.getInt("y1");
            this.xo2=rs.getInt("x2");
            this.yo2=rs.getInt("y2");
            this.xo3=rs.getInt("x3");
            this.yo3=rs.getInt("y3");
            this.xo4=rs.getInt("x4");
            this.yo4=rs.getInt("y4");
            this.xo5=rs.getInt("x5");
            this.yo5=rs.getInt("y5");
            int seqn = rs.getInt("seq");
            int temp1= imagesequence(seqn);
                      
            }//while closed 
    
    
    
        }//else closed
        
        if(flag==1)
        {
            imagetemp=imagesequence[1];
            ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
            currentimage.setIcon(ic1);
            
            
        }
        
        if(flag!=1)
        {
            JOptionPane.showMessageDialog(new Frame(),"Login failed due to incorrect Username");
            nextbutton.setEnabled(true);
            
        }
        
         }//try closed
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(new Frame()," Error :"+e); 
        }

// TODO add your handling code here:
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void currentimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentimageMouseClicked
        if(imagetemp==imagesequence[1]) 
        {
            count=1;
            nextbutton.setEnabled(false);
            trybutton.setEnabled(true);
            x1=evt.getX();
            y1=evt.getY();
                 if((xo1<=x1+30&&xo1>=x1-30)&&(yo1<=y1+30&&yo1>=y1-30))
             {
                imagetemp=imagesequence[2];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
             else
             {
                 wrongclickpoint();
             }
                  
            
        }
        else if(imagetemp==imagesequence[2])
        {
            x2=evt.getX();
            y2=evt.getY();
            count=2;
            if((xo2<=x2+30&&xo2>=x2-30)&&(yo2<=y2+30&&yo2>=y2-30))
             {
                imagetemp=imagesequence[3];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();
            
        }
        
        else if(imagetemp==imagesequence[3])
        {
            x3=evt.getX();
            y3=evt.getY();
            count=3;        
            if((xo3<=x3+30&&xo3>=x3-30)&&(yo3<=y3+30&&yo3>=y3-30))
             {
                imagetemp=imagesequence[4];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();
            
        }
        
        
        else if(imagetemp==imagesequence[4])
        {
            x4=evt.getX();
            y4=evt.getY();
            count=4;
            
            if((xo4<=x4+30&&xo4>=x4-30)&&(yo4<=y4+30&&yo4>=y4-30))
             {
                imagetemp=imagesequence[5];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();
            
        }
        
        
        else if(imagetemp==imagesequence[5])
        {
            x5=evt.getX();
            y5=evt.getY();
            count=5;
            submitbutton.setEnabled(true);
            if((xo5<=x5+30&&xo5>=x5-30)&&(yo5<=y5+30&&yo5>=y5-30))
             {
                
             }
            else
            {
                wrongclickpoint=1;
                
            }
            
        }
        
                      
        
         
    }//GEN-LAST:event_currentimageMouseClicked

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        if(wrongclickpoint==0)
        {
            JOptionPane.showMessageDialog(new Frame(),"Login Successful");
                this.dispose();
                
        }
        
        else
        {
            JOptionPane.showMessageDialog(new Frame(),"Incorrect Login");
                this.dispose();
                new log().setVisible(true);
            
        }

// TODO add your handling code here:
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void trybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trybuttonActionPerformed
        // TODO add your handling code here:
          new NewJFrame3().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_trybuttonActionPerformed
public void nexthover()
{
 myWorker.timer_tick=0;    
      if(imagetemp==imagesequence[1]) 
        {
                 if((xo1<=x1+30&&xo1>=x1-30)&&(yo1<=y1+30&&yo1>=y1-30))
             {
                imagetemp=imagesequence[2];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
             else
             {
                 wrongclickpoint();
             }   
        }
        else if(imagetemp==imagesequence[2])
        {
            if((xo2<=x2+30&&xo2>=x2-30)&&(yo2<=y2+30&&yo2>=y2-30))
             {
                imagetemp=imagesequence[3];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();   
        }  
        else if(imagetemp==imagesequence[3])
        {       
            if((xo3<=x3+30&&xo3>=x3-30)&&(yo3<=y3+30&&yo3>=y3-30))
             {
                imagetemp=imagesequence[4];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();  
        }
        else if(imagetemp==imagesequence[4])
        {
            if((xo4<=x4+30&&xo4>=x4-30)&&(yo4<=y4+30&&yo4>=y4-30))
             {
                imagetemp=imagesequence[5];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1);
             }
            else
                wrongclickpoint();    
        }
        else if(imagetemp==imagesequence[5])
        {
            submitbutton.setEnabled(true);
            if((xo5<=x5+30&&xo5>=x5-30)&&(yo5<=y5+30&&yo5>=y5-30))
             {
               /*imagetemp=imagesequence[6];
                ImageIcon ic1=new ImageIcon(getClass().getResource("images\\0"+imagetemp+".jpg"));
                currentimage.setIcon(ic1); */
             }
            else
            {
                wrongclickpoint=1;    
            }
        }
}
    private void currentimageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentimageMouseMoved
     myWorker.timer_tick=0;    
      if(imagetemp==imagesequence[1]) 
        {
            hcount=1;
            nextbutton.setEnabled(false);
            trybutton.setEnabled(true);
            x1=evt.getX();
            y1=evt.getY();
        }   
        else if(imagetemp==imagesequence[2])
        {
            x2=evt.getX();
            y2=evt.getY();
            hcount=2;
           
        }
        else if(imagetemp==imagesequence[3])
        {
            x3=evt.getX();
            y3=evt.getY();
            hcount=3;           
        }  
        else if(imagetemp==imagesequence[4])
        {
            x4=evt.getX();
            y4=evt.getY();
            hcount=4;
        }    
        else if(imagetemp==imagesequence[5])
        {
            x5=evt.getX();
            y5=evt.getY();
            hcount=5;
            submitbutton.setEnabled(true);
        }
     /*  else if(imagetemp==imagesequence[6])
        {
            hcount=6;
        }*/
    }//GEN-LAST:event_currentimageMouseMoved

    private void currentimageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentimageMouseEntered
        // TODO add your handling code here:
         
      //  labMsg.setText("Mouse Entered");

            myWorker=new HoveringWorker(this);

            scheduler = Executors.newScheduledThreadPool(1);
            // schedule the worker at an intervall of 5 seconds
            scheduler.scheduleAtFixedRate(myWorker,0, 1, TimeUnit.SECONDS);
    }//GEN-LAST:event_currentimageMouseEntered

    private void currentimageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentimageMouseExited
        scheduler.shutdown();
        
    }//GEN-LAST:event_currentimageMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonspanel;
    private javax.swing.JButton currentimage;
    private javax.swing.JPanel currentimagepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextbutton;
    private javax.swing.JButton submitbutton;
    private javax.swing.JButton trybutton;
    private javax.swing.JLabel unamelabel;
    private javax.swing.JPanel unamepanel;
    private javax.swing.JTextField unametextfield;
    // End of variables declaration//GEN-END:variables

   /* private void lastMoveTime() {
        //System.out.println("Hello....");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
