import java.util.*; 
import java.util.stream.IntStream; 
  
class averageOfList { 
  
    public static void main(String[] args) 
    { 
        IntStream inputs = IntStream.of(2, 3, 4, 5, 6, 7, 8,10);  
        OptionalDouble avg = inputs.average(); 
        if (avg.isPresent()) { 
            System.out.println(avg.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}