Dynamic Method Dispatch – Interview Notes
=========================================

### Definition

*   **Dynamic Method Dispatch** is the mechanism by which a **call to an overridden method** is resolved **at runtime** rather than compile time.
    
*   It is the foundation of **Run-Time Polymorphism** in Java.
    

### Key Concept

*   A **parent class reference** can point to objects of its **child classes**.
    
*   The method that gets executed is determined by the **actual object** (not the reference type).
    
*   Decision happens **at runtime**.
    

### Example Snippet

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   A obj;          // reference of parent class  obj = new A();  // calls A's show()  obj = new B();  // calls B's show()  obj = new C();  // calls C's show()   `

### Important Points

*   During **compile time**, the compiler only checks if the method exists in the reference type.
    
*   During **runtime**, the **JVM decides** which method implementation to invoke based on the object created.
    
*   This enables **flexibility** and supports the OOP principle of **polymorphism**.
    

### Real-World Analogy

*   Think of a **remote control (reference)** and different **devices (objects)**.
    
*   The same button (method) behaves differently depending on which device the remote is connected to.
    

👉 In interviews, remember:**Dynamic Method Dispatch = Run-Time Polymorphism = Overriding resolution at runtime.**