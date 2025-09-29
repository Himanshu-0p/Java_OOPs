<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>Multilevel Inheritance — Java (Interview Notes)</title>
  <style>
    :root{
      --bg:#0f1724; --card:#0b1220; --muted:#9aa4b2; --accent:#7dd3fc;
      --glass: rgba(255,255,255,0.03);
      font-family: Inter, ui-sans-serif, system-ui, -apple-system, "Segoe UI", Roboto, "Helvetica Neue", Arial;
    }
    html,body{height:100%;margin:0;background:linear-gradient(180deg,#071029 0%, #071022 100%);color:#e6eef6}
    .container{max-width:900px;margin:40px auto;padding:28px;background:linear-gradient(180deg, rgba(255,255,255,0.02), rgba(255,255,255,0.01));border-radius:12px;box-shadow:0 8px 30px rgba(2,6,23,0.7);border:1px solid rgba(255,255,255,0.03)}
    header h1{margin:0;font-size:20px;letter-spacing:0.2px}
    header p{margin:6px 0 18px;color:var(--muted);font-size:13px}
    section{margin-bottom:18px}
    h2{font-size:14px;margin:0 0 8px;color:var(--accent)}
    p{margin:0 0 8px;color:#cfe7ff;line-height:1.45}
    .notes-list{display:grid;gap:10px}
    pre{background:var(--glass);padding:12px;border-radius:8px;overflow:auto;font-family:ui-monospace, SFMono-Regular, Menlo, Monaco, "Roboto Mono", "Helvetica Neue", monospace;color:#e6f5ff;font-size:13px;border:1px solid rgba(255,255,255,0.02)}
    code{font-family:inherit}
    .tag{display:inline-block;padding:6px 10px;border-radius:999px;background:rgba(125,211,252,0.08);color:var(--accent);font-size:12px;margin-right:8px;border:1px solid rgba(125,211,252,0.06)}
    .compact{font-size:13px;color:var(--muted)}
    .footer{margin-top:18px;color:var(--muted);font-size:12px}
    @media (max-width:600px){.container{margin:18px;padding:16px}}
  </style>
</head>
<body>
  <main class="container" role="main" aria-labelledby="title">
    <header>
      <div style="display:flex;align-items:center;gap:12px;margin-bottom:8px">
        <div class="tag">Java</div>
        <h1 id="title">Multilevel Inheritance — Interview Notes (Concise)</h1>
      </div>
      <p class="compact">Short, clear points you can quickly read before an interview. Includes definition, syntax, example, and pros/cons.</p>
    </header>

    <section aria-labelledby="definition">
      <h2 id="definition">Definition</h2>
      <p>Multilevel inheritance occurs when a class is derived from a class which is also derived from another class — forming a chain of inheritance across multiple levels.</p>
    </section>

    <section aria-labelledby="syntax">
      <h2 id="syntax">Syntax</h2>
      <pre><code>// base class
class A { }

// derived from A
class B extends A { }

// derived from B (multilevel)
class C extends B { }</code></pre>
    </section>

    <section aria-labelledby="example">
      <h2 id="example">Example</h2>
      <pre><code>class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeping"); }
}

public class Test {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}</code></pre>
    </section>

    <section aria-labelledby="keypoints">
      <h2 id="keypoints">Key Points (Quick)</h2>
      <div class="notes-list">
        <p><strong>Reusability:</strong> Child classes reuse parent and grandparent code.</p>
        <p><strong>Relationship:</strong> Follows an <em>is-a</em> relationship across multiple levels.</p>
        <p><strong>Constructors:</strong> Called top-down — superclass constructors run first.</p>
        <p><strong>Java limitation:</strong> Java supports single inheritance for classes (prevents diamond problem).</p>
        <p><strong>Maintenance:</strong> Deep chains can increase complexity and reduce clarity.</p>
      </div>
    </section>

    <section aria-labelledby="proscons">
      <h2 id="proscons">Pros &amp; Cons</h2>
      <p><strong>Pros:</strong> Reduces duplication; makes incremental extension easy.</p>
      <p><strong>Cons:</strong> Can become hard to maintain; debugging may be trickier with long chains.</p>
    </section>

    <section aria-labelledby="tips">
      <h2 id="tips">Interview Tips (Say this if asked)</h2>
      <p class="compact">“Multilevel inheritance lets classes inherit properties across a chain. Java uses single-class inheritance per level to avoid the diamond problem; use interfaces for multiple-type contracts. Constructors execute from top (superclass) to bottom (subclass). Keep inheritance shallow to stay maintainable.”</p>
    </section>

    <div class="footer">
      <div>Prepared for quick interview revision • concise & copy-paste ready</div>
    </div>
  </main>
</body>
</html>
