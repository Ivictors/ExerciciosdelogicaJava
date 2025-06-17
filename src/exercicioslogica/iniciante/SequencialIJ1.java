package exercicioslogica.iniciante;

public class SequencialIJ1 {
    public static void main(String[] args) {

        int j = 60;
        for (int i = 1; i <=61; i += 3) {
            System.out.println("I=" + i + " " + "J=" + j);
            j -= 5;
            if (j < 0) break;
        }
    }
}
