enum Status {
    Running , Failed , Pending , Success;
}

public class Main {
    public static void main(String [] args){
        int i =5;
        Status[] ss = Status.values();
        System.out.println(ss);

        for(Status s : ss){
            System.out.println(s);
            System.out.println(s + " : "+ s.ordinal());
        }

    }
}
