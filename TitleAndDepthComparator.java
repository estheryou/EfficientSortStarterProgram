import java.util.*;
/**
 * Write a description of TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleAndDepthComparator implements Comparator<QuakeEntry>{
   public int compare(QuakeEntry q1,QuakeEntry q2){
       int comp=q1.getInfo().compareTo(q2.getInfo());
        if(comp<0){
           return -1;
        }else if(comp>0){
           return 1;
        }else {
           return Double.compare(q1.getDepth(),q2.getDepth());
        }
    }
}
