import java.util.*;
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
 public int compare(QuakeEntry q1, QuakeEntry q2){
    String s1=q1.getInfo().trim();
    String ss1=s1.substring(s1.lastIndexOf(" ")+1);
    
    String s2=q2.getInfo().trim();
    String ss2=s2.substring(s2.lastIndexOf(" ")+1);
    
    int comp=ss1.compareTo(ss2);
    if(comp!=0){
        return comp;
    }
    else{
      return Double.compare(q1.getMagnitude(),q2.getMagnitude());
    }
  }    
}
