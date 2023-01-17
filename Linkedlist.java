
package linkedlist;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
      LinkedList<String> wabi=new LinkedList<>();
      wabi.add("wabi hachalu hundessa");  
       wabi.add("khelid");
       wabi.add("kemal");
       System.out.println(wabi); 
        wabi.add(0,"jemal");
         System.out.println(wabi);
       System.out.println( wabi.contains("jivril"));
       System.out.println(wabi.get(2));
       
       
       
    }
    
}
