import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("123,142,199");
        pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
        System.out.println(pitches.get(1));
        System.out.println("pitches = " + pitches);
    }

}

