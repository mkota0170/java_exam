package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */
public class Reverse {

    public static void main(String[] args) {
        String reversed = reverse("あいうえお");
        System.out.println(reversed);

    }

    /**
     * 文字列をさかさまにして返すメソッド
     * @param mozi さかさまにしたい文字列
     * @return さかさまにした文字列
     */
    public static String reverse(String mozi) {
    String[] reverse = mozi.split("");
    String result = "";
    for (int i = reverse.length - 1; i >= 0; i--) {
        result += reverse[i];
    }
    return result;
}

}
