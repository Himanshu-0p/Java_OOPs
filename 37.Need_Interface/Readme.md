**Interview-Ready Notes (Java OOP & Interfaces)**
=================================================

### 1\. Passing Objects as Parameters

**Q: Can we pass an object as a parameter to a method in Java?**

*   Yes, in Java we can pass objects as parameters.
    
*   It increases flexibility when building applications.
    
*   We can use **parent class references** to hold **subclass objects** (polymorphism).
    
*   When a method accepts a parent class reference, any subclass object can be passed to it.
    

### 2\. Interface Basics

**Q: What is an Interface in Java?**

*   An interface is a collection of abstract methods (implicitly public and abstract).
    
*   It is used to achieve **abstraction** and **loose coupling** in applications.
    
*   A class uses the **implements** keyword to inherit an interface.
    

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`interface Computer {       void code();    }    class Desktop implements Computer {       public void code() {           System.out.println("Coding on Desktop");       }    }`  

### 3\. Need for Interface

**Q: Why do we need an interface in Java?**

*   To implement **abstraction** (hide implementation details).
    
*   To achieve **multiple inheritance** (a class can implement multiple interfaces).
    
*   To achieve **loose coupling** (code depends on interface, not specific classes).
    
*   A class can only extend **one class**, but it can implement **multiple interfaces**.
    

### 4\. Multiple Inheritance via Interface

**Q: Can Java support multiple inheritance?**

*   Java does not allow multiple inheritance using classes.
    
*   But, it allows multiple inheritance through **interfaces**.
    
*   Example:
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`interface A { void show(); }    interface B { void display(); }    class Test implements A, B {       public void show() { System.out.println("Show A"); }       public void display() { System.out.println("Display B"); }    }`