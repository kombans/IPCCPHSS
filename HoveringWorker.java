/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class HoveringWorker implements Runnable{
    
    int timer_tick=0; log parentForm;
    
    HoveringWorker(log mf)
    {
        parentForm=mf;
    }
    
    @Override
    public void run()
    {
        timer_tick++;
        System.out.println("Timer Tick:" + timer_tick);
        
        if(timer_tick==3)
        {
            ///////////////////// The Hovering Event Goes here ////////////
            timer_tick=0;
            System.out.println("!Hover");
            parentForm.nexthover();
           // parentForm.setMessage("Mouse Hover!");
        }
        else
        {
           // parentForm.setMessage("No Hover!");
            
        }
    }
}
