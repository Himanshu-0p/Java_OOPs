Method Overriding – Java Interview Notes
========================================

1\. Definition
--------------

*   **Method Overriding**: When a subclass provides its own implementation of a method already defined in its superclass with the **same method signature**.
    
*   It represents **Run-Time Polymorphism (Dynamic Method Dispatch)**.
    
*   Purpose: **Code reusability** and **extensibility** (customize parent behavior in child class).
    

2\. Example
-----------

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   class Parent {      public void show() {          System.out.println("This is parent method");      }  }  class Child extends Parent {      @Override      public void show() { // overriding parent method          System.out.println("This is child method");      }  }  class Main {      public static void main(String[] args) {          Child c = new Child();          c.show(); // calls child class method      }  }   `

✅ Output: This is child method

3\. Rules for Method Overriding
-------------------------------

1.  **Same Signature** → Method name, parameters must be identical.
    
2.  **Return Type** → Must be the same or a subtype (covariant return).
    
3.  **Access Modifier** →
    
    *   Cannot reduce visibility.
        
    *   Can increase visibility (e.g., default → protected → public).
        
4.  **Non-static & Non-final** →
    
    *   Static methods **cannot** be overridden (they are hidden).
        
    *   Final methods **cannot** be overridden.
        
5.  **Visibility** → Overridden method must be visible from subclass.
    
6.  **Constructor** → Constructors cannot be overridden.
    

4\. Access Modifier Example
---------------------------

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   class A {      void show() {  // default access          System.out.println("A");      }  }  class B extends A {      @Override      protected void show() { // increasing visibility          System.out.println("B");      }  }   `

5\. Key Points for Interviews
-----------------------------

*   Overriding = **Runtime Polymorphism** (decided at runtime via dynamic dispatch).
    
*   Overloading = **Compile-Time Polymorphism** (decided at compile time).
    
*   You can call the parent’s version of an overridden method using **super.methodName()**.
    
*   Static methods are **hidden** (method hiding), not overridden.
    

🔥 **Quick Tip:** Interviewers often ask:

*   “Can we override static methods?” → ❌ No, only hidden.
    
*   “Can we override private/final methods?” → ❌ No.
    
*   “Why overriding?” → To **customize/inherit behavior** in child classes without rewriting code.