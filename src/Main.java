public class Main {
    public static void main(String[] args) {
        char [] apples = {'r','g','b','r','b','r','g','b','r','b','g','r','b','r','r','g','r','g','r','b','r','g','r','r','b','g'};
        int answer = 0;
        int answer2 =0;

        for (int i = 0; i < apples.length/2; i++) {
            if (apples[i] == 'g'){
                answer++;
            }
        }
        for (int i =apples.length/2 ; i < apples.length; i++) {
            if (apples[i] == 'r'){
                answer2++;

            }



        }
        System.out.println(answer2+answer);
    }
}