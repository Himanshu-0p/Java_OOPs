Multilevel Inheritance – Java (Interview Notes)
===============================================

### 🔹 Definition

*   **Multilevel Inheritance** means a class is derived from another derived class.
    
*   It forms a **chain of inheritance** where features are passed down through multiple levels.
    

### Key Points

*   Promotes **reusability**: child class gets features of parent and grandparent.
    
*   Follows **“is-a” relationship** across multiple levels.
    
*   Helps build **hierarchical class structures**.
    
*   Only **single inheritance per level** is allowed in Java (no multiple inheritance with classes → avoids _diamond problem_).
    
*   Constructors are called **top-down** (parent → child → grandchild).
    

### 🔹 Pros

*   Reduces code duplication.
    
*   Easier to extend features gradually.
    

### 🔹 Cons

*   Deep chains can make code **complex** and harder to maintain.