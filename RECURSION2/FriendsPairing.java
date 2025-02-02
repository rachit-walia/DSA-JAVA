
public class FriendsPairing {

    public static int pairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // 1. single 
        // 2 pairing

        return pairing(n - 1) + (n - 1) * pairing(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(pairing(100));
    }
}
