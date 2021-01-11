public class TestClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        System.out.println(className.validate("C0318G")); // true
        System.out.println(className.validate("M0318G")); // false
        System.out.println(className.validate("P03223A")); // false
    }
}
