
public class ReverseWord {

    public static void main(String[] args) {
        String str = "I am an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans = ans + sb;
                ans += " ";
                sb.delete(0, sb.length());
                // sb=new StringBuilder("");
            }
        }
        // sb.append(" ");
        sb.reverse();
        ans += sb;
        System.out.println(ans);

    }
}