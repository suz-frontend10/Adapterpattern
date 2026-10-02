# Adapter Pattern

A clean, production-ready Java implementation of the **Adapter Design Pattern** using a payment application scenario (**PhonePe** integrating with **ICICI Bank API**).

---

## 📌 Problem Statement
`PhonePe` expects all bank APIs to conform to a standard `BankApis` interface (`makeTransaction` and `checkBalance`). However, `IciciBankApi` is a third-party class with different method names (`sendMoney` and `fetchBalance`). 

Without modifying `IciciBankApi` or hardcoding vendor-specific code into `PhonePe`, the **Adapter Design Pattern** acts as a bridge between `PhonePe` and `IciciBankApi`.

---

## 🏗️ Architecture & Structure

```
Adapterpattern/
├── src/
│   ├── BankApis.java          # Target Interface
│   ├── IciciBankApi.java      # Adaptee (Third-party class)
│   ├── IciciBankAdapter.java  # Adapter (Implements BankApis, wraps IciciBankApi)
│   ├── PhonePe.java           # Client Context
│   └── Client.java            # Main Runner / Test Entry Point
├── .gitignore                 # Git ignore rules for Java compilation artifacts
└── README.md                  # Project documentation
```

---

## 🚀 How to Run

### Prerequisite
- Java Development Kit (JDK 8 or higher) installed.

### Compilation and Execution Steps

1. **Navigate to the project root directory**:
   ```bash
   cd Adapterpattern
   ```

2. **Compile the Java source files**:
   ```bash
   javac src/*.java
   ```

3. **Run the Client program**:
   ```bash
   java -cp src Client
   ```

---

## 📊 Expected Output
```text
==================================================
   ADAPTER DESIGN PATTERN DEMO - PhonePe & ICICI  
==================================================

1. Performing Transaction...
Processing transaction via ICICI Bank API...
  Account Number: ACC-987654321
  Amount: $600
Transaction status: SUCCESS

2. Checking Account Balance...
Fetching balance from ICICI Bank API for account: ACC-987654321
Available Balance: $5000

==================================================
   DEMO COMPLETED SUCCESSFULLY                    
==================================================
```
