
public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "Programming";
        // approach 1
        // StringBuilder sb = new StringBuilder();
        // str.chars().distinct().forEach(c -> sb.append((char) c));
        // System.out.println(sb);

        // approach2
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ind = str.indexOf(ch, i + 1);
            if (ind == -1) {
                sb2.append(ch);

            }

        }
        System.out.println(sb2);
    }
}
