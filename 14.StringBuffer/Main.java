public class Main {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("Himanshu");
        System.out.println(sb.capacity());
        sb.append(" Patil");
        System.out.println(sb);
    }
}
// Difference between StringBuffer and StringBuilder is that StringBuffer is thread safe but StringBuilder is not thread safe
