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
    double chosenValue;
    double finScore;
    
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
        double mut;
       if(response == 0){
      
       }else
       if(response == 1){
   mut = .75;
       }else
       if(response == 2){
    mut = .55;
       }else   
       if(response == 3){
       mut = .35;
       
       }
 mut = 1;
 finScore =((5*gpu)+(coreNum*clockSpeed)*mut);
 
 if(finScore >= 17000){
 JOptionPane.showMessageDialog(null,"Ultra");
 
 }else{
 
 
 if(15000 <= finScore && finScore <= 17000){
 JOptionPane.showMessageDialog(null,"High");
 
 }else{
 
 if(13000< finScore && finScore <= 15000){
 JOptionPane.showMessageDialog(null,"Medium");
 
 }
 
 }
 if(11000< finScore && finScore <= 13000){
 JOptionPane.showMessageDialog(null,"Low");
 
 }else{
 
 if(finScore <= 11000){
JOptionPane.showMessageDialog(null,"Unable to Play");
 
 }
 
 }
 
 }
    
     }
  }