public class RecursionMultibranch2 {
        static void fun(int x) {
            System.out.println(x);
            if(x >= 3) {
                return;
            }
            fun(x + 1);
            System.out.println("Uvesh Ahmad Khan");
            fun(x + 2);
        }
        public static void main(String[] args) {
            fun(0);
        }
    }
