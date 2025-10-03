1\. Interface Basics
--------------------

**Q: What is an interface in Java?**

*   An interface is **not a class**; it is a collection of **abstract methods**.
    
*   Used when you only need method declarations (no implementation).
    
*   All methods are **public and abstract** by default.
    
*   You **cannot instantiate** an interface.
    
*   An interface only provides **design (contract)**, not implementation.
    

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   interface A {     void method();   // public & abstract by default  }   `

2\. Abstract Class vs Interface
-------------------------------

**Q: When should we use an interface instead of an abstract class?**

*   Abstract class: Can contain **abstract + concrete methods**.
    
*   Interface: If the class has **only abstract methods**, prefer an **interface**.
    

3\. implements Keyword
----------------------

**Q: How do we use implements in Java?**

*   A class uses **implements** keyword to inherit an interface.
    
*   It is **mandatory** to provide implementation for **all methods** of the interface.
    
*   If not, the class automatically becomes **abstract**.
    

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   class B implements A {     public void method() {         System.out.println("Implemented method");     }  }   `

4\. Variables in an Interface
-----------------------------

**Q: Can we declare variables inside an interface?**

*   Yes, but all variables are by default:
    
    *   **public**
        
    *   **static**
        
    *   **final**
        
*   Must be **initialized** at the time of declaration.
    
*   Accessed directly with **interface name** (no object needed).
    
*   Value **cannot be changed** once assigned.
    

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   interface Shape {     int AREA = 100;   // public static final by default  }  class Circle implements Shape {     void display() {         System.out.println("Area = " + Shape.AREA);     }  }   `

5\. Summary (Key Points for Quick Revision)
-------------------------------------------

*   Interface = design/contract (no implementation).
    
*   All methods → public & abstract by default.
    
*   Cannot instantiate an interface.
    
*   implements → to provide implementation.
    
*   If all methods not implemented → class becomes abstract.
    
*   Variables → public, static, final → must be initialized → accessed by interface name.