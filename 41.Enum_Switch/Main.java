enum Status {
    Running, Failed, Pending, Success;
}

public class Main {
    public static void main(String[] args) {
        Status s = Status.Success; // Correct variable name

        // Switch case with enum
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Success:
                System.out.println("Success");
                break;
        }

        // If-else with enum
        if (s == Status.Running) {
            System.out.println("All Good");
        } else if (s == Status.Failed) {
            System.out.println("Try Again");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait");
        } else {
            System.out.println("Done");
        }
    }
}
