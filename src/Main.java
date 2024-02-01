

public class Main {
    public static void main(String[] args) {

        //ALFA OG OMEGA v2.0
//FIXSHIT
        printNumbers();

    }

    public static void printNumbers(){
        for(int i = 1; i < 200; i++){


            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzFizz");

            }

            else if(i % 3 == 0){
                System.out.println("Fizz");

            }

            else if(i % 5 == 0){
                System.out.println("Buzz!");

            }
            else{
                System.out.println(i);
            }

        }
    }
}