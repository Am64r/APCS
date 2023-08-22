
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;
     
     public boolean isValid(){
         String msg = "04 92a1 16 Computer Science";
         
         String[] sp = msg.split( " " );
         String idLengthstr = sp[0];
         //String x = msg.substring( 0, msg.indexOf( " " ) )
         idLength = Integer.parseInt( sp[0] );
         
         System.out.println(idLength);
         
         //deviceID = msg.substring( msg.indexOf(" "), msg.indexOf( " " ) );
         deviceID = sp[1];
         
         System.out.println(deviceID);
         
         msgLength = Integer.parseInt( sp[2] );
         
         System.out.println(msgLength);
         
         int x = idLengthstr.length();
         int y = deviceID.length();
         int z = String.valueOf(msgLength).length();
         
         textMsg = msg.substring( x + y + z + 3);
         
         System.out.println( textMsg );
         
            
         return (idLength == deviceID.length()) && (msgLength == textMsg.length() );
         
     }
     
     public int wordCount(){
         
         
         return 3;
     }
}
