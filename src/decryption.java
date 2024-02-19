import javax.swing.*;
import java.util.*;

public class decryption {
    private int max;
    private char [] encrypted;
    private int w=0;

    public void decrypt(){
       String message= JOptionPane.showInputDialog("please input the encrypted text");
       int encryption_key= Integer.parseInt(JOptionPane.showInputDialog("please input the encryption key"));
       String authority_rights= "*"+encryption_key;

       //searching for encryption key in the message
        if (message.contains(authority_rights)){
            encrypted= message.toCharArray();
            max=encrypted.length;
            char [] Finalmessage=new char[max];

            for (int i=max-1; i>=0;i--){
                boolean truth= Character.isLowerCase(encrypted[i]);
                boolean truth2= Character.isWhitespace(encrypted[i]);
                if (truth==true|| truth2==true){
                    Finalmessage[w]=encrypted[i];
                    w++;
                }

            }

            String actualMessage=String.valueOf( Finalmessage);
            JOptionPane.showMessageDialog(null,actualMessage);

        }
        else{
            JOptionPane.showMessageDialog(null,"You do not have rights to decrypt this message");
        }

    }
}

