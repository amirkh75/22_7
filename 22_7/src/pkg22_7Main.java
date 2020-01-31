
/**
 *
 * @author amirkh75 on github
 */
public class pkg22_7Main {
    public static void main(String[] args) {
        horse yor_horse = new horse(0,0);
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.println("_____________________________________________");
                yor_horse.reset(i, j);
                System.out.println(i + " is : ");
                horse.strategy_check_ways_by_move_method_priority(yor_horse);
                horse.show_map(yor_horse); 
                System.out.println("---------------------------------------------");
            }
        }
        for (int i = 0; i < 10; i++) {
             System.out.println("---------------------------------------------");
        }
        for (int i = 0; i <= 7; i++) {
             for (int j = 0; j <= 7; j++) {
                System.out.println("_____________________________________________");
                yor_horse.reset(i, j);
                System.out.println(i + " is : ");
                horse.strategy__priority_map(yor_horse);
                horse.show_map(yor_horse); 
                System.out.println("---------------------------------------------");
            }
        }
        
    }
    
}
