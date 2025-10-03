🔹 Understanding Enums in Java
==============================

1\. Enum as a Special Class
---------------------------

*   An **enum in Java is like a special class** that:
    
    *   Contains **fixed objects** (constants).
        
    *   Can have **constructors, methods, and variables**.
        
*   But enums **cannot extend other classes** (they implicitly extend java.lang.Enum).
    
*   Each enum constant (e.g., Mackbook, XPS, Surface) is an **object of the enum type**.
    

2\. Enum with Constructors
--------------------------

*   Each enum constant can **call a constructor** at the time of loading.
    
*   The constructor is **called once per constant** → so if there are 4 constants, constructor executes 4 times.
    
*   Constructor can be:
    
    *   **Default constructor** → assigns default value.
        
    *   **Parameterized constructor** → assigns specific values.
        
*   Mackbook calls constructor with 2000.
    
*   XPS calls constructor with 2200.
    
*   Surface calls **default constructor** → gets 500.
    
*   ThinkPad calls constructor with 1800.
    

Why?

*   Because each constant is an object with its own **price value** (set by constructor).
    
*   values() → returns an array of all enum constants (like \[Mackbook, XPS, Surface, ThinkPad\]).
    
*   Each constant calls its respective constructor once when the enum class is loaded.
    

4\. Key Points Simplified
-------------------------

1.  Enums = special classes with fixed objects.
    
2.  Each constant = object of enum type.
    
3.  Enum can have:
    
    *   Constructors (default + parameterized).
        
    *   Methods (getters, setters, etc.).
        
    *   Variables (always private, accessed with getters/setters).
        
4.  Constructor is **called once per constant** at enum loading.
    
5.  If a parameterized constructor is defined, default one is ignored.
    
6.  Enum constants can be looped using .values().
    

✅ **In short:**When you write Mackbook(2000), you are actually **creating an object of Laptop enum with price = 2000**.