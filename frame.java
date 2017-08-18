
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class frame extends javax.swing.JFrame {   
        int imagesequence[]= new int[6];
        int imagetemp;
        int selectedimagecount=0;
        int xviewport,yviewport;
        int x,y;
        int p,q;
        Random random = new Random();
        int phase=0;
        int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0,x5=0,y5=0;
        int selectedimage=0;
    
        private Object pccpframe; 
    public frame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unamepanel = new javax.swing.JPanel();
        unamelabel = new javax.swing.JLabel();
        unametextfield = new javax.swing.JTextField();
        selectedimagespanel = new javax.swing.JPanel();
        ImageIcon selectedimg1= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        selectedimage1 = new javax.swing.JButton(selectedimg1);
        ImageIcon selectedimg2= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        selectedimage2 = new javax.swing.JButton(selectedimg2);
        ImageIcon selectedimg3= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        selectedimage3 = new javax.swing.JButton(selectedimg3);
        ImageIcon selectedimg4= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        selectedimage4 = new javax.swing.JButton(selectedimg4);
        ImageIcon selectedimg5= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        selectedimage5 = new javax.swing.JButton(selectedimg5);
        jLabel2 = new javax.swing.JLabel();
        availableimagespanel = new javax.swing.JPanel();
        ImageIcon img1= new ImageIcon(((new ImageIcon("images\\01.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image1 = new javax.swing.JButton(img1);
        ImageIcon img2= new ImageIcon(((new ImageIcon("images\\02.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image2 = new javax.swing.JButton(img2);
        ImageIcon img3= new ImageIcon(((new ImageIcon("images\\03.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image3 = new javax.swing.JButton(img3);
        ImageIcon img4= new ImageIcon(((new ImageIcon("images\\04.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image4 = new javax.swing.JButton(img4);
        ImageIcon img5= new ImageIcon(((new ImageIcon("images\\05.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image5 = new javax.swing.JButton(img5);
        ImageIcon img6= new ImageIcon(((new ImageIcon("images\\06.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image6 = new javax.swing.JButton(img6);
        ImageIcon img7= new ImageIcon(((new ImageIcon("images\\07.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image7 = new javax.swing.JButton(img7);
        ImageIcon img8= new ImageIcon(((new ImageIcon("images\\08.jpg")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
        image8 = new javax.swing.JButton(img8);
        jLabel1 = new javax.swing.JLabel();
        currentimagepanel = new javax.swing.JPanel();
        ImageIcon currentimg= new ImageIcon(((new ImageIcon("C:\\pccp\\src\\images\\noimage.jpg")).getImage()).getScaledInstance(450, 450, java.awt.Image.SCALE_SMOOTH));
        currentimage = new javax.swing.JButton(currentimg);
        buttonspanel = new javax.swing.JPanel();
        selectbutton = new javax.swing.JButton();
        shufflebutton = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        nextbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Persusasive Cued Click Points - Registration");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        unamepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        unamelabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        unamelabel.setText("Username");

        unametextfield.setToolTipText("");
        unametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unametextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout unamepanelLayout = new javax.swing.GroupLayout(unamepanel);
        unamepanel.setLayout(unamepanelLayout);
        unamepanelLayout.setHorizontalGroup(
            unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unamepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unamelabel)
                .addGap(18, 18, 18)
                .addComponent(unametextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        unamepanelLayout.setVerticalGroup(
            unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unamepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamelabel)
                    .addComponent(unametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        selectedimagespanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectedimage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedimage1ActionPerformed(evt);
            }
        });

        selectedimage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedimage2ActionPerformed(evt);
            }
        });

        selectedimage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedimage3ActionPerformed(evt);
            }
        });

        selectedimage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedimage4ActionPerformed(evt);
            }
        });

        selectedimage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedimage5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Selected Images");

        javax.swing.GroupLayout selectedimagespanelLayout = new javax.swing.GroupLayout(selectedimagespanel);
        selectedimagespanel.setLayout(selectedimagespanelLayout);
        selectedimagespanelLayout.setHorizontalGroup(
            selectedimagespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectedimagespanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(selectedimagespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(selectedimagespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(selectedimage5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(selectedimage4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedimage3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedimage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedimage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        selectedimagespanelLayout.setVerticalGroup(
            selectedimagespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedimagespanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(selectedimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(selectedimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(selectedimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(selectedimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(selectedimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
        );

        availableimagespanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        availableimagespanel.setLayout(null);

        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
        });
        image1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image1ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image1);
        image1.setBounds(20, 10, 90, 70);

        image2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image2ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image2);
        image2.setBounds(160, 10, 90, 70);

        image3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image3ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image3);
        image3.setBounds(20, 100, 90, 70);

        image4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image4ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image4);
        image4.setBounds(160, 100, 90, 70);

        image5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image5ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image5);
        image5.setBounds(20, 190, 90, 70);

        image6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image6ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image6);
        image6.setBounds(160, 190, 90, 70);

        image7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image7ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image7);
        image7.setBounds(20, 280, 90, 70);

        image8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image8ActionPerformed(evt);
            }
        });
        availableimagespanel.add(image8);
        image8.setBounds(160, 280, 90, 70);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("  Image Box");
        availableimagespanel.add(jLabel1);
        jLabel1.setBounds(100, 360, 80, 14);

        currentimagepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentimage.setFocusPainted(false);
        currentimage.setFocusable(false);
        currentimage.setRequestFocusEnabled(false);
        currentimage.setRolloverEnabled(false);
        currentimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentimageMouseClicked(evt);
            }
        });
        currentimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentimageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout currentimagepanelLayout = new javax.swing.GroupLayout(currentimagepanel);
        currentimagepanel.setLayout(currentimagepanelLayout);
        currentimagepanelLayout.setHorizontalGroup(
            currentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentimagepanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(currentimage, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        currentimagepanelLayout.setVerticalGroup(
            currentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentimagepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentimage, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonspanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectbutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        selectbutton.setText("Select");
        selectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbuttonActionPerformed(evt);
            }
        });

        shufflebutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        shufflebutton.setText("Shuffle");
        shufflebutton.setEnabled(false);
        shufflebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shufflebuttonActionPerformed(evt);
            }
        });

        submitbutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        submitbutton.setText("Submit");
        //submitbutton.setEnabled(false);
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        submitbutton.setEnabled(false);

        nextbutton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        nextbutton.setText("Next");
        nextbutton.setEnabled(false);
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonspanelLayout = new javax.swing.GroupLayout(buttonspanel);
        buttonspanel.setLayout(buttonspanelLayout);
        buttonspanelLayout.setHorizontalGroup(
            buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonspanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(selectbutton)
                .addGap(52, 52, 52)
                .addComponent(nextbutton)
                .addGap(52, 52, 52)
                .addComponent(shufflebutton)
                .addGap(52, 52, 52)
                .addComponent(submitbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonspanelLayout.setVerticalGroup(
            buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonspanelLayout.createSequentialGroup()
                .addGroup(buttonspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbutton)
                    .addComponent(nextbutton)
                    .addComponent(shufflebutton)
                    .addComponent(selectbutton))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title.setText("Persuasive Cued Click Points:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availableimagespanel, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(unamepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(title)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentimagepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedimagespanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(currentimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(unamepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(availableimagespanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(selectedimagespanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("pccpframe");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unametextfieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_unametextfieldActionPerformed

    private void image1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image1ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=1;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/01.jpg"));
    currentimage.setIcon(ic1);
   
   }
    }//GEN-LAST:event_image1ActionPerformed

    private void image2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image2ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=2;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/02.jpg"));
    currentimage.setIcon(ic1); 
   }     
    }//GEN-LAST:event_image2ActionPerformed

    private void image8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image8ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=8;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/08.jpg"));
    currentimage.setIcon(ic1);
   }    
    }//GEN-LAST:event_image8ActionPerformed

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked

    }//GEN-LAST:event_image1MouseClicked

    private void image3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image3ActionPerformed
if(evt.getActionCommand().equals(""))
   {
       imagetemp=3;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/03.jpg"));
  currentimage.setIcon(ic1);
   }        // TODO add your handling code here:
    }//GEN-LAST:event_image3ActionPerformed

    private void image4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image4ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=4;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/04.jpg"));
  currentimage.setIcon(ic1); 
   }        // TODO add your handling code here:
    }//GEN-LAST:event_image4ActionPerformed

    private void image5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image5ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=5;
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/05.jpg"));
  currentimage.setIcon(ic1); 
   }
    }//GEN-LAST:event_image5ActionPerformed

    private void image6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image6ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=6;
   ImageIcon ic1=new ImageIcon(getClass().getResource("/images/06.jpg"));
  currentimage.setIcon(ic1);
   }
    }//GEN-LAST:event_image6ActionPerformed

    private void image7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image7ActionPerformed
    if(evt.getActionCommand().equals(""))
   {
       imagetemp=7;
   ImageIcon ic1=new ImageIcon(getClass().getResource("/images/07.jpg"));
  currentimage.setIcon(ic1);
   }        
    }//GEN-LAST:event_image7ActionPerformed

    private void currentimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentimageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentimageActionPerformed

    public void buttondisabler()
    {
        switch(imagetemp)
        {
            case 1:
               image1.setEnabled(false);
                break;
            case 2:
                image2.setEnabled(false);
                break;
            case 3:
                image3.setEnabled(false);
                break;
            case 4:
                image4.setEnabled(false);
                break;
            case 5:
                image5.setEnabled(false);
                break;
            case 6:
                image6.setEnabled(false);
                break;
            case 7:
                image7.setEnabled(false);
                break;
            case 8:
                image8.setEnabled(false);
                break;   
        }
        if(selectedimagecount==5)
        {
            selectbutton.setEnabled(false);
            nextbutton.setEnabled(true);
        }   
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(new Color(255,0,0));
        if(selectedimagecount==5)
        g.drawRect(xviewport, yviewport, 100, 100);
    }

    private void selectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbuttonActionPerformed
    
        if(evt.getActionCommand().equals("Select"))   
    {
        if(selectedimagecount<=5)
        {
            if(selectedimagecount==0)
            {
        ImageIcon ic1= new ImageIcon(((new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"))).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
     selectedimage1.setIcon(ic1);  
     imagesequence[1]=imagetemp;
               selectedimagecount++; 
               buttondisabler();
              return;
             }
            
            if(selectedimagecount==1)
            {//ImageIcon ic1=new ImageIcon(getClass().getResource("/images/01.jpg"));
        ImageIcon ic1= new ImageIcon(((new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"))).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
     selectedimage2.setIcon(ic1);  
     imagesequence[2]=imagetemp;
               selectedimagecount++;
               buttondisabler();
               return;
            }
            if(selectedimagecount==2)
            {
        ImageIcon ic1= new ImageIcon(((new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"))).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
     selectedimage3.setIcon(ic1);  
     imagesequence[3]=imagetemp;
               selectedimagecount++;
               buttondisabler();
               return;
            }
            if(selectedimagecount==3)
            {
        ImageIcon ic1= new ImageIcon(((new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"))).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
     selectedimage4.setIcon(ic1);  
     imagesequence[4]=imagetemp;
               selectedimagecount++;
               buttondisabler();
               return;
            }
            if(selectedimagecount==4)
            {
        ImageIcon ic1= new ImageIcon(((new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"))).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH));
     selectedimage5.setIcon(ic1);  
     imagesequence[5]=imagetemp;
               selectedimagecount++;
               buttondisabler();
               return;
            }
        }
     }
    }//GEN-LAST:event_selectbuttonActionPerformed

    private void selectedimage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedimage1ActionPerformed
if(evt.getActionCommand().equals(""))
   {
       imagetemp=imagesequence[1];
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
    currentimage.setIcon(ic1);  
    if(phase==1)
       {
        selectedimage=1;
        displayviewport();
       }  
   }
    }//GEN-LAST:event_selectedimage1ActionPerformed

    private void selectedimage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedimage2ActionPerformed
if(evt.getActionCommand().equals(""))
   {
     imagetemp=imagesequence[2];
     ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
     currentimage.setIcon(ic1);  
     if(phase==1)
       {
        selectedimage=2;
        displayviewport();
       }
   }   
    }//GEN-LAST:event_selectedimage2ActionPerformed

    private void selectedimage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedimage3ActionPerformed
if(evt.getActionCommand().equals(""))
   {
    imagetemp=imagesequence[3];
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
    currentimage.setIcon(ic1);  
     if(phase==1)
      {
        selectedimage=3;
        displayviewport();
      }
   }  
    }//GEN-LAST:event_selectedimage3ActionPerformed

    private void selectedimage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedimage4ActionPerformed
if(evt.getActionCommand().equals(""))
   {
       imagetemp=imagesequence[4];
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
    currentimage.setIcon(ic1);  
     if(phase==1)
       {
        selectedimage=4;
        displayviewport();
       }
   }     
    }//GEN-LAST:event_selectedimage4ActionPerformed

    private void selectedimage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedimage5ActionPerformed
if(evt.getActionCommand().equals(""))
   {
       imagetemp=imagesequence[5];
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
    currentimage.setIcon(ic1);  
     if(phase==1)
      {
        selectedimage=5;
        displayviewport();
      }
   }
    }//GEN-LAST:event_selectedimage5ActionPerformed
 
    public void displayviewport()
    {
         do
	{
	this.xviewport= random.nextInt(800);
	this.yviewport= random.nextInt(800);
	}while(xviewport<328||xviewport>=651||yviewport<51||yviewport>=398);
        this.repaint();
    }
    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
       image1.setEnabled(false);
       image2.setEnabled(false);
       image3.setEnabled(false);
       image4.setEnabled(false);
       image5.setEnabled(false);
       image6.setEnabled(false);
       image7.setEnabled(false);
       image8.setEnabled(false);

    imagetemp=imagesequence[1];
    ImageIcon ic1=new ImageIcon(getClass().getResource("/images/0"+imagetemp+".jpg"));
    currentimage.setIcon(ic1);
    phase=1; 
    shufflebutton.setEnabled(true);
    nextbutton.setEnabled(false);
    selectedimage=1;
    displayviewport();
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void shufflebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shufflebuttonActionPerformed
    
      displayviewport();
    }//GEN-LAST:event_shufflebuttonActionPerformed

    private void currentimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentimageMouseClicked
    if(phase==1)
    {
        
        p=evt.getX();
        q=evt.getY();
        if(p+326>=xviewport&&p+326<=xviewport+100&&q+41>=yviewport&&q+41<=yviewport+100)
        {
            x=p;
            y=q;
            
            switch(selectedimage)
            {
                case 1: x1=x;
                    y1=y;
                    
                    break;
                case 2: x2=x;
                    y2=y;
                    
                    break;
                case 3: x3=x;
                    y3=y;
                    break;
                case 4: x4=x;
                    y4=y;
                    break;
                case 5: x5=x;
                    y5=y;
                    submitbutton.setEnabled(true);
                    break;   
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new Frame(),"Please click inside the viewport only");
            displayviewport();
        } 
    }
    }//GEN-LAST:event_currentimageMouseClicked

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
  
        try
   {String abc=new String("asd");
    int r2=0;
   
          String uname = unametextfield.getText();
            
    if(uname.equals("")) r2=2; 
    Class.forName("com.mysql.jdbc.Driver");
    String connectionQuery="jdbc:mysql://localhost:3306/pccp";  

    Connection con = DriverManager.getConnection(connectionQuery,"root",""); 
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from plog where uname='"+uname+"'"); 
    while(rs.next())
    {
     if(uname.equals(rs.getString("uname"))) 
      { r2=1; break;}    
    }  
    if(r2==1)
    {
     JOptionPane.showMessageDialog(new Frame(),"Login failed due to having same user");
        this.dispose();
        new frame().setVisible(true);
    }
    else if(r2==2)
    {
        JOptionPane.showMessageDialog(new Frame(),"Please enter username");
        this.dispose();
        new frame().setVisible(true);
    }
    else
    {
     st=con.createStatement();
     int seq=0;
     for(int i=1;i<=5;i++)
     {
         seq=seq*10+imagesequence[i];
     }
     st.executeUpdate("insert into plog values('"+uname+"','"+x1+"','"+y1+"','"+x2+"','"+y2+"','"+x3+"','"+y3+"','"+x4+"','"+y4+"','"+x5+"','"+y5+"','"+seq+"','"+abc+"')");
     JOptionPane.showMessageDialog(new Frame(),"Image selected.!Choose audio for recovery.");
     submitbutton.setEnabled(false);
      F1 nf1 = new F1();
      nf1.tf.setText(this.unametextfield.getText());
      nf1.setVisible(true);
         this.setVisible(false);
         this.setVisible(false);
    }
   }	
   catch(Exception e)
   {
    JOptionPane.showMessageDialog(new Frame()," Error :"+e); 
   }
    }//GEN-LAST:event_submitbuttonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableimagespanel;
    private javax.swing.JPanel buttonspanel;
    private javax.swing.JButton currentimage;
    private javax.swing.JPanel currentimagepanel;
    private javax.swing.JButton image1;
    private javax.swing.JButton image2;
    private javax.swing.JButton image3;
    private javax.swing.JButton image4;
    private javax.swing.JButton image5;
    private javax.swing.JButton image6;
    private javax.swing.JButton image7;
    private javax.swing.JButton image8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextbutton;
    private javax.swing.JButton selectbutton;
    private javax.swing.JButton selectedimage1;
    private javax.swing.JButton selectedimage2;
    private javax.swing.JButton selectedimage3;
    private javax.swing.JButton selectedimage4;
    private javax.swing.JButton selectedimage5;
    private javax.swing.JPanel selectedimagespanel;
    private javax.swing.JButton shufflebutton;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel unamelabel;
    private javax.swing.JPanel unamepanel;
    public javax.swing.JTextField unametextfield;
    // End of variables declaration//GEN-END:variables

    private Object nf1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
