import java.util.ArrayList;

public class Lamdas{
    public static void main(String[]args){
        
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(4);
        number.add(9);
        number.add(16);
        
        number.forEach((n) ->{
            System.out.println(n);
        });
        
        number.forEach(item ->{
            if(item == 16){
                System.out.println("Found item 16");
            }
        });
        
    }
}