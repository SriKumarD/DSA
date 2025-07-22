# 📚 Modular Arithmetic Fundamentals

Modular arithmetic is a system of arithmetic for integers where numbers **wrap around** upon reaching a certain value called the **modulus**.


## 📘 What is Modular Arithmetic?

Modular arithmetic is used to compute **remainders** after division.

- **Notation**:  
  `a mod m` gives the **remainder** when `a` is divided by `m`.

- **Example**:  
  `17 mod 5 = 2`  
  (since `17 = 3 × 5 + 2`)


## 🧮 Core Modular Properties

Let `a`, `b`, `c ∈ ℤ` (integers), and let `m ∈ ℕ` (a positive integer):

### 1. Addition (mod m)
```

(a + b) mod m = ((a mod m) + (b mod m)) mod m

```

### 2. Subtraction (mod m)
```

(a - b) mod m = ((a mod m) - (b mod m) + m) mod m

```
> We add `m` to prevent a negative result.

### 3. Multiplication (mod m)
```

(a × b) mod m = ((a mod m) × (b mod m)) mod m

```

### 4. Exponentiation (mod m)
```

a^b mod m

```
Use **modular exponentiation** (like binary exponentiation) for large `b`.

## 🔢 Why Use a Prime Modulus Like 10⁹ + 7?

The number `10^9 + 7` (i.e. `1,000,000,007`) is a **large prime**. It's commonly used in programming and cryptography for several reasons:

- Every `1 ≤ a < m` has a **modular inverse** when `m` is prime.
- Prevents integer overflow in most 64-bit languages (like Java, C++).
- Leads to well-behaved math in modulo operations.

## 💡 Quick Tips

- Always reduce inputs using `a mod m` **before** multiplication to avoid overflow.
- To divide under a modulus (modular division), multiply by the **modular inverse**.
- For inverse:  
  If `m` is prime, use **Fermat's Little Theorem**:  
```

a⁻¹ mod m = a^(m-2) mod m

```


## ✅ Summary Table

| Operation        | Formula                                          |
|------------------|--------------------------------------------------|
| Addition         | `(a + b) mod m`                                  |
| Subtraction      | `(a - b + m) mod m`                              |
| Multiplication   | `(a × b) mod m`                                  |
| Exponentiation   | `a^b mod m`                                      |
| Modular Inverse  | `a^(m-2) mod m` (if `m` is prime)                |



## 🔗 References

- [Wikipedia: Modular Arithmetic](https://en.wikipedia.org/wiki/Modular_arithmetic)
- [Fermat’s Little Theorem](https://en.wikipedia.org/wiki/Fermat%27s_little_theorem)
- [Modular Exponentiation (GeeksforGeeks)](https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/)
- [Modular Inverse (CP-Algorithms)](https://cp-algorithms.com/algebra/module-inverse.html)

