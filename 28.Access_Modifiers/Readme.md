Key Points
----------

*   **private** → Accessible only inside the same class (best for encapsulation).
    
*   **default (package-private)** → Accessible within the same package.
    
*   **protected** → Accessible in same package + subclasses (even in different packages).
    
*   **public** → Accessible everywhere.
    

Interview Tips
--------------

*   **private** → highest restriction.
    
*   **public** → no restriction.
    
*   **default** → package-level visibility (if no modifier given).
    
*   **protected** → mainly used in **inheritance**.
    
*   Cannot apply access modifiers on **local variables**.
    
*   **Constructor** can also have access modifiers (to control object creation).
    

👉 **One-liner memory hook:****private < default < protected < public** (increasing visibility).