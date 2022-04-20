package day33_varargs_stringBuilder;

public class C03_Sb {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 lengt : " + sb1.length());// 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16

        System.out.println("sb2 lengt : " + sb2.length());// 14
        System.out.println("sb2 capacity : " + sb2.capacity()); // 30

        System.out.println("sb3 lengt : " + sb3.length());// 0
        System.out.println("sb3 capacity : " + sb3.capacity()); // 10

        // append methodu ile sbye ekleme yapabilriz

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel").append(" ").append("cok");
        System.out.println("sb1 lengt : " + sb1.length());// 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16

        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);

        sb1.append("tum dersler java olsa");
        System.out.println("sb1 lengt : " +sb1.length());// 40
        System.out.println("sb1 capacity : " + sb1.capacity()); // 70
        System.out.println(sb1);
    }
}
