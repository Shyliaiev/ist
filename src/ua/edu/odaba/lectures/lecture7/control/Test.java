package ua.edu.odaba.lectures.lecture7.control;

public class Test {
    public static void main(String[] args) {
//        public - from everywhere
//        private - only from class
//        default - only from package
//        protected - only in inherited classes


        Sample sample = new Sample();
        sample.field = "Hello!";

        System.out.println(sample.field);
    }
}
