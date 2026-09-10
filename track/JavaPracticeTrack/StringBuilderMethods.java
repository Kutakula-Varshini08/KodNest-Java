
class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("Program");
        System.out.println(sb);
        sb.insert(0, "Python");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
