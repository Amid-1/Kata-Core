package inputoutput.ы;

public class Yi {
    public static void main(String[] args) {
        String s = "Ы";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int)b[i]^ -1<<8) + " ");
        }
    }
}
