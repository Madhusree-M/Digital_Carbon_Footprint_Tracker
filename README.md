# 🌍 Digital Carbon Footprint Tracker
A **Java-based application** designed to calculate and monitor an individual’s **carbon emissions** from daily activities such as transport, electricity usage, and food consumption.  
This project demonstrates the use of **Object-Oriented Programming (OOP) principles** and **database integration** to build a scalable and maintainable system.  


## 🚀 Features
- Log daily activities:
  - 🚗 Transport (car, bike, bus, flight)  
  - ⚡ Electricity usage (kWh)  
  - 🍔 Food consumption (Veg/Non-Veg meals)  
- Automatic **CO₂ emission calculation** using predefined factors.  
- Store activity logs in a **database**.  
- View total emissions in **daily/weekly/monthly** reports.
- Visualization with charts (JFreeChart/JavaFX).  
- Ideas to enhance :  
  - 💡 Suggestions for reducing emissions.  
  - 👤 User registration & login system.  




## 🛠️ Tech Stack
### Backend
- **Java (Core + JDBC)** → Core application logic and database connection.  
- **CarbonCalculator Class** → Applies emission factors to activities.  

### Frontend
- **Console Support** → Basic input/output for beginners.  
- **JavaFX (Phase 2)** → GUI with forms, tables, and charts.  

### Database
- **MySQL** → Stores user activities, emissions, and history.  

### Visualization
- **JFreeChart / JavaFX Charts** → Graphs to show trends in CO₂ emissions.  




## 🎯 OOP Concepts Applied
- **Encapsulation**  
  - Calculation logic, activity data, and database operations are enclosed in separate classes.  
  - Example: `CarbonCalculator` hides formulas, exposing only `calculate()` methods.  

- **Abstraction**  
  - Abstract class `Activity` defines common fields (type, value, emission).  
  - Specific activity types (Transport, Electricity, Food) extend this base.  

- **Inheritance**  
  - `TransportActivity`, `FoodActivity`, and `EnergyActivity` inherit from `Activity`.  
  - Promotes reusability and clean design.  

- **Polymorphism**  
  - A single `calculateEmission()` method works differently depending on the activity type.  

- **Modularity**  
  - **Activity Module** → Handles user input & data.  
  - **Calculation Module** → Core emission logic.  
  - **Database Module** → JDBC connectivity & CRUD operations.  
  - **UI Module** → Console/JavaFX-based interaction.

## 🌍 Sample Input & Output
### Example 1 – Transport Activity

  - **Input (user interaction in console):**
  
    - Enter activity type (Transport / Food / Electricity): Transport
    - Enter detail (Car / Bike / Bus / Flight): Car
    - Enter distance (in km): 20
  

  - **System Output:**
  
    - Activity recorded: Car, 20 km
    - CO₂ Emission: 2.4 kg
    - Saved to database ✅

### Example 2 – Food Consumption

  - **Input:**
  
    - Enter activity type (Transport / Food / Electricity): Food
    - Enter detail (Veg Meal / Non-Veg Meal): Non-Veg Meal
    - Enter number of meals: 2
  
  
  - **System Output:**
  
    - Activity recorded: Non-Veg Meal, 2 meals
    - CO₂ Emission: 5.0 kg
    - Saved to database ✅

### Example 3 – Electricity Usage

  - **Input:**

    - Enter activity type (Transport / Food / Electricity): Electricity
    - Enter detail (Home / Office): Home
    - Enter units consumed (kWh): 15


  - **System Output:**

    - Activity recorded: Home Electricity, 15 kWh
    - CO₂ Emission: 10.5 kg
    - Saved to database ✅

### Example 4 – Generate Report

  - **Input:**

    - Enter option: View Weekly Report


  - **System Output:**
    - ---------- Weekly Report ----------
        - Total Transport CO₂: 12.4 kg
        - Total Food CO₂: 8.0 kg
        - Total Electricity CO₂: 25.5 kg
          
        - Total Carbon Footprint: 45.9 kg


## ⚙️ Installation & Setup
Follow these steps to set up and run the project on your system.

### 1️⃣ Prerequisites
- Install **Java JDK 17+**  
  [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

- Install **MySQL Server** (8.x recommended)  
  [Download MySQL](https://dev.mysql.com/downloads/)

- Install a **MySQL Client Tool**  
  - MySQL Workbench (GUI)  
  - OR command line (mysql CLI)  

- Install an **IDE for Java**  
  - IntelliJ IDEA / Eclipse / NetBeans / VS Code (with Java extension)  

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/carbon-footprint-tracker.git
cd carbon-footprint-tracker

