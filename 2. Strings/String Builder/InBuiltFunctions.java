public class InBuiltFunctions
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        System.out.println(sb.length()); //5
        
        sb.append("World");
        System.out.println(sb);  //HelloWorld
        
        sb.insert(5," ");
        System.out.println(sb);  //Hello World
        
        sb.replace(1,5,"i");
        System.out.println(sb);  //Hi World
        
        sb.deleteCharAt(1);
        System.out.println(sb);  //H World
        
        sb.delete(0,2);
        System.out.println(sb);  //World
        
        sb.ensureCapacity(50); //Ensure Minimum
        System.out.println(sb.capacity());  // normal -> 21
        
        System.out.println(sb.charAt(4));  //d
        
        sb.setCharAt(0,'w');
        System.out.println(sb);  //world
        
        String s = sb.toString(); //StringBuilder To String
        System.out.println(s); //world
        
        StringBuilder sub = new StringBuilder("Java_Programming");
        
        System.out.println(sub.substring(5)); //Programming
        System.out.println(sub.substring(0,5)); //Java_
        
        System.out.println(sub.indexOf("_")); //4
        
        System.out.println(sub.lastIndexOf("a")); //10
        
        sub.setLength(4);
        System.out.println(sub); //Java
        
        System.out.println(sub.reverse()); //avaJ
    }
}