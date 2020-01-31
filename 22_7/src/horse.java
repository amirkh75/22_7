
/**
 *
 * @author amirkh75 on github
 */
public class horse {
    
    public horse(int x_present , int y_present ){
        this.x_present = x_present;
        this.y_present = y_present; /// first location on map
        map[x_present][y_present] = 1;
    }; ///constructor
    
    private  int[][] map = new int[8][8];
    private int x_present;
    private int y_present;
    private int number_of_movements = 1;
    private int[][] priority_map ={{2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},{3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}};
    private int[] priority_of_avalabel_movements = new int[8]; // priority of each 8 chose for avalabel_moves and its avalabel_moves result   value 0 means cant go
    
    public int get_x_present(){return x_present;};
    public int get_y_present(){return y_present;};
    
    public void set_x_present(int x_present){this.x_present = x_present;};
    public void set_y_present(int y_present){this.y_present = y_present;};
    public void reset(int x_present , int y_present){
        int[][] zeros_zeros = new int[8][8];
        map = zeros_zeros;
        map[x_present][y_present] = 1;
        number_of_movements = 1;
        set_x_present(x_present);
        set_y_present(y_present);
    }
    
    
    public static void show_map(horse your_horse){
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(your_horse.map[j][i] + "\t");
            }
            System.out.println();
        }
    }
    
    private void move1( ){
        if (((x_present-1) >= 0) && ((y_present+2) <=7) && ((map[x_present-1][y_present+2])==0)) {
            x_present = x_present-1;
            y_present = y_present+2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+1) <= 7) && ((y_present+2) <=7) && ((map[x_present+1][y_present+2])==0)) {
            x_present = x_present+1;
            y_present = y_present+2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-2) >= 0) && ((y_present-1) >=0) && ((map[x_present-2][y_present-1])==0)) {
            x_present = x_present-2;
            y_present = y_present-1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+2) <= 7) && ((y_present-1) >=0) && ((map[x_present+2][y_present-1])==0)) {
            x_present = x_present+2;
            y_present = y_present-1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-2) >= 0) && ((y_present+1) <=7) && ((map[x_present-2][y_present+1])==0)) {
            x_present = x_present-2;
            y_present = y_present+1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+2) <= 7) && ((y_present+1) <=7) && ((map[x_present+2][y_present+1])==0)) {
            x_present = x_present+2;
            y_present = y_present+1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-1) >= 0) && ((y_present-2) >=0) && ((map[x_present-1][y_present-2])==0)) {
            x_present = x_present-1;
            y_present = y_present-2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+1) <= 7) && ((y_present-2) >=0) && ((map[x_present+1][y_present-2])==0)) {
            x_present = x_present+1;
            y_present = y_present-2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
    } /// priority on 5 6 3 0 4 7 2 1 page 349 deitel
    
    private void move2( ){
        avalabel_moves_for_use_on_move2( );
        if (((x_present-1) >= 0) && ((y_present+2) <=7) && ((map[x_present-1][y_present+2])==0) && (priority_of_avalabel_movements[0]!=0)) {
            x_present = x_present-1;
            y_present = y_present+2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+1) <= 7) && ((y_present+2) <=7) && ((map[x_present+1][y_present+2])==0) && (priority_of_avalabel_movements[1]!=0)) {
            x_present = x_present+1;
            y_present = y_present+2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-2) >= 0) && ((y_present-1) >=0) && ((map[x_present-2][y_present-1])==0) && (priority_of_avalabel_movements[2]!=0)) {
            x_present = x_present-2;
            y_present = y_present-1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+2) <= 7) && ((y_present-1) >=0) && ((map[x_present+2][y_present-1])==0) && (priority_of_avalabel_movements[3]!=0)) {
            x_present = x_present+2;
            y_present = y_present-1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-2) >= 0) && ((y_present+1) <=7) && ((map[x_present-2][y_present+1])==0) && (priority_of_avalabel_movements[4]!=0)) {
            x_present = x_present-2;
            y_present = y_present+1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+2) <= 7) && ((y_present+1) <=7) && ((map[x_present+2][y_present+1])==0) && (priority_of_avalabel_movements[5]!=0)) {
            x_present = x_present+2;
            y_present = y_present+1;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present-1) >= 0) && ((y_present-2) >=0) && ((map[x_present-1][y_present-2])==0) && (priority_of_avalabel_movements[6]!=0)) {
            x_present = x_present-1;
            y_present = y_present-2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
        else if (((x_present+1) <= 7) && ((y_present-2) >=0) && ((map[x_present+1][y_present-2])==0) && (priority_of_avalabel_movements[7]!=0)) {
            x_present = x_present+1;
            y_present = y_present-2;
            number_of_movements = number_of_movements + 1;
            map[x_present][y_present] = number_of_movements;
        }
        
    } /// priority on 5 6 3 0 4 7 2 1 page 349 deitel
    private void avalabel_moves_for_use_on_move2( ){
        int[] reset = new int[8];
        priority_of_avalabel_movements = reset; // for assain 0 to all of 0 to 7 members
        if (((x_present-1) >= 0) && ((y_present+2) <=7) && ((map[x_present-1][y_present+2])==0)) {
            priority_of_avalabel_movements[0] = priority_map[x_present-1][y_present+2];
        }
        
        if (((x_present+1) <= 7) && ((y_present+2) <=7) && ((map[x_present+1][y_present+2])==0)) {
            priority_of_avalabel_movements[1] = priority_map[x_present+1][y_present+2];
        }
        
        if (((x_present-2) >= 0) && ((y_present-1) >=0) && ((map[x_present-2][y_present-1])==0)) {
            priority_of_avalabel_movements[2] = priority_map[x_present-2][y_present-1];
        }
        
        if (((x_present+2) <= 7) && ((y_present-1) >=0) && ((map[x_present+2][y_present-1])==0)) {
            priority_of_avalabel_movements[3] = priority_map[x_present+2][y_present-1];
        }
        
        if (((x_present-2) >= 0) && ((y_present+1) <=7) && ((map[x_present-2][y_present+1])==0)) {
            priority_of_avalabel_movements[4] = priority_map[x_present-2][y_present+1];
        }
        
        if (((x_present+2) <= 7) && ((y_present+1) <=7) && ((map[x_present+2][y_present+1])==0)) {
            priority_of_avalabel_movements[5] = priority_map[x_present+2][y_present+1];
        }
        
        if (((x_present-1) >= 0) && ((y_present-2) >=0) && ((map[x_present-1][y_present-2])==0)) {
            priority_of_avalabel_movements[6] = priority_map[x_present-1][y_present-2];
        }
        
        if (((x_present+1) <= 7) && ((y_present-2) >=0) && ((map[x_present+1][y_present-2])==0)) {
            priority_of_avalabel_movements[7] = priority_map[x_present+1][y_present-2];
        }
        avalabel_moves_for_doing_white_priority_for_use_on_move2();
    }
    
    private void avalabel_moves_for_doing_white_priority_for_use_on_move2(){ //chose mont important one and make others zero
        for (int i = 0; i <= 7; i++) {
           if ( priority_of_avalabel_movements[i] == 0) {
               // do nothing
           }
           else {
                for (int j = 0; j <= 7; j++) {
                    if (priority_of_avalabel_movements[i] < priority_of_avalabel_movements[j] ){
                        priority_of_avalabel_movements[j] = 0;
                    }
               }
           }
        }
//        for (int i = 0; i <= 7; i++) {
//            System.out.println(priority_of_avalabel_movements[i]);
//        }
    }
    
    public static void strategy_check_ways_by_move_method_priority(horse your_horse){
        for (int i = 0; i < 63; i++) {
            your_horse.move1();
        }
        if(your_horse.number_of_movements == 64){
            System.out.println(your_horse.number_of_movements + "  you wine \t :))");
        }
        else {
            System.out.println(your_horse.number_of_movements + "\t stoped ://");
        } 
    }
    
    public static void strategy__priority_map(horse your_horse){
        for (int i = 0; i < 63; i++) {
            your_horse.move2();
        }
        if(your_horse.number_of_movements == 64){
            System.out.println(your_horse.number_of_movements + "  you wine \t :))");
        }
        else {
            
            System.out.println(your_horse.number_of_movements + "\t stoped ://");
        }
    }
    
}
