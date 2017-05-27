final class HashCodeCollision {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(120_000);
        for (int i = 0; i < 10_000; ++i) {
            sb.append(new Object().hashCode());
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
