 import java.util.Scanner; 
 import javax.swing.JOptionPane;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
    public class projectMain
    {
       public static void main(String[] args)
      {
         
         
    double multiVal;
    double gpu;
    double clockSpeed;  
    double coreNum;  
    
         String str;
         
    str = JOptionPane.showInputDialog("Enter your clock speed in Mhz(GPU)");
        gpu = Double.parseDouble(str);
        
 str = JOptionPane.showInputDialog("Enter your clock speed in Mhz(CPU)");
         clockSpeed = Double.parseDouble(str);
         
       str = JOptionPane.showInputDialog("Enter your number of cores");
        coreNum = Double.parseDouble(str);
        
    
  String[] options = new String[] {"1280 x 720", "1920 x 1080", "2560 x 1440", "3840 x 2160"};
  
    int response = JOptionPane.showOptionDialog(null, "Please select your resolution", "Resolution",
    
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        
        null, options, options[0]);
        
   
 
    
     }
  }