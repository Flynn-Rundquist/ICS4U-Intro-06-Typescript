/*
 * This program prints out
 * "Hello, World!"
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-02-29
 */

final class HelloWorld {
        private HelloWorld() {
                throw new IllegalStateException("Cannot be instantiated");
        }

        public static void main(final String[] args) {
                System.out.println("Hello, World!");
                System.out.println("\nDone.");
        }
}
