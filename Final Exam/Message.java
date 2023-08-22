
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Message{

     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;

     public Message(String msg){
         String[] sp = msg.split( " " );
         String idLengthstr = sp[0];
         
         idLength = Integer.parseInt( sp[0] );
         
         deviceID = sp[1];
         
         msgLength = Integer.parseInt( sp[2] );
         
         textMsg = msg.substring( idLengthstr.length() + deviceID.length() + String.valueOf(msgLength).length() + 3);
         
     }

     public boolean isValid(){
         
         return (idLength == deviceID.length()) && (msgLength == textMsg.length() );
     }

     public int wordCount(){
         
         return textMsg.split( " " ).length ;
     }

}
