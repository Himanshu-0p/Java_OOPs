**Java Enums – Theory Notes**
=============================

1.  **Definition**
    

*   Enum stands for _Enumeration_.
    
*   It represents a fixed group of **named constants** in Java.
    
*   Used to define values like statuses, error codes, directions, etc.
    

1.  **Enum as a Class**
    

*   Enums in Java are internally treated as **classes** with a fixed set of objects.
    
*   Every enum constant is an **object** of the enum type.
    
*   Example: Status.Running is an object of enum Status.
    
*   Enums improve **type-safety** (only valid constants can be used).
    

1.  **Declaration and Usage**
    

*   Enum is defined using the enum keyword.
    
*   enum Status { Running, Failed, Pending, Success }
    
*   A variable can hold an enum constant, e.g., Status s = Status.Running;.
    
*   Enums can also be used in **switch statements** for clean code.
    

1.  **Key Characteristics**
    

*   Enums **cannot be instantiated** with new.
    
*   All enum constants are implicitly public, static, and final.
    
*   Enum values are fixed at compile time.
    
*   Enums provide a better alternative to **string constants** or **integer codes**.
    

1.  **Built-in Methods**
    

*   **ordinal()** → returns the index (position) of the enum constant (0-based).
    
*   **values()** → returns an array of all enum constants (used for iteration).
    

1.  **Summary**
    

*   Enums = **named constants grouped together**.
    
*   Treated as special **classes** in Java.
    
*   Improve **readability, maintainability, and type-safety**.
    
*   Can be used in switch-case, loops, and method arguments.