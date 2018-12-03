public class CodeWordRunner {
    public static void main(String[]args)
    {
        StringChecker sc1 = new CodeWordChecker (minLen: 5, maxLen: 6, symbol: "$");
        StringChecker sc2= new CodeWordChecker(symbol: "pass");

        System.out.println(sc1.isValid(str:"happy"));
        System.out.println(sc1.isValid(str:"happy$"));
        System.out.println(sc1.isValid(str:"Code"));
        System.out.println(sc1.isValid(str:"happyCode"));

        System.out.println(sc2.isValid(str:"MyPass"));
        System.out.println(sc2.isValid(str:"MypassPort"));
        System.out.println(sc2.isValid(str:"happy"));
        System.out.println(sc2.isValid(str:"1,000,000,000,000,000"));
    }


}
