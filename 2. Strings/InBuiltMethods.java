public class InBuiltMethods
{
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.length());  // 5
        
        
        System.out.println(s.charAt(1)); // e
        
        
        System.out.println(s.indexOf('l')); // 2
        
        
        System.out.println(s.replace('e','o')); // Hollo
        
        
        System.out.println(s.trim());
        
        
        //char[] array = s.toCharArray();
        
        System.out.println(s.toUpperCase()); // HELLO
        
        System.out.println(s.toLowerCase()); // hello
        
        System.out.println("apple".compareTo("banana"));
        //0 → equal
        //negative → smaller
        //positive → greater
        
        System.out.println("java".equalsIgnoreCase("JAVA")); // true
        
        String a = "Java";
        String b = "Java";
        System.out.println(a.equals(b)); // true
        
        System.out.println(a.concat(b)); //JavaJava
        
        String r = "Hello World";
        System.out.println(r.contains("World")); // true
        
        String c = "Java Programming";
        System.out.println(c.startsWith("Java")); // true
        
        String e = "Java.txt";
        System.out.println(e.endsWith(".txt")); // true
        
        String em = "";
        System.out.println(em.isEmpty()); // true
        
        
        String sub = "Programming";
        System.out.println(sub.substring(3));     // gramming
        System.out.println(sub.substring(0,4));   // Prog
        
        
        String sp = "Java,Python,C++";
        String[] arr = sp.split(",");


        for(String i : arr){
           System.out.println(i);
        }
        
        
        int num = 10;
        String number = String.valueOf(num);
        
    }
}