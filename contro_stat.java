public class contro_stat {
    public static void main(String[] args) {
        int marks=9;
        if (marks==10){
            System.out.println("garde:O");
        }
        else if (9<=marks && marks<10){
            System.out.println("grade A+");

        }
        else if (8<=marks && marks<9){
            System.out.println("grade A");

        }
        else if (7<=marks && marks<8){
            System.out.println("grade b");

        }
        else if (6<=marks && marks<7){
            System.out.println("grade c");

        }
        else if ( marks<6){
            System.out.println("grade d(fail)");

        }
        else{
            System.out.println("wrong input");
        }
    }
    
}
