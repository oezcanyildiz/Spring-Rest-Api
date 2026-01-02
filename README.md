# Spring Boot REST API – Lernprojekt (Employee Management)

Dieses Projekt ist ein **Spring Boot REST-API Lernprojekt**, das die grundlegenden Konzepte von **RESTful Web Services**, **Layered Architecture** und **In-Memory-Datenhaltung** demonstriert.

Es eignet sich als Übungsprojekt sowie als **GitHub-Portfolio-Projekt**.

---

## 🎯 Lernziele

- Entwicklung von RESTful APIs mit Spring Boot
- Einsatz von HTTP-Methoden (GET, POST, PUT, DELETE)
- Dependency Injection
- Layered Architecture (Controller, Service, Repository)
- Arbeiten mit Java Collections als In-Memory-Datenquelle
- Saubere API-Struktur und URL-Design

---

## 🛠️ Technologien

- Java 21
- Spring Boot 3.x
- Spring Web
- Maven
- Lombok
- JSON (Request / Response)

---

## 📂 Projektstruktur

- **Controller**  
  REST-Endpunkte und Request-Handling

- **Service**  
  Business-Logik und Datenverarbeitung

- **Repository**  
  In-Memory-Datenhaltung (Java Collections)

- **Model**  
  Datenobjekte (z. B. `Employee`, `UpdateEmployee`)

- **Config**  
  Bean- und Projektkonfiguration

---

## 🔌 API-Endpunkte

### 1️⃣ Alle Mitarbeiter abrufen
- **Methode:** GET  
- **URL:** `/rest/api/employee/list`  
- **Beschreibung:** Liefert eine Liste aller Mitarbeiter zurück  

**Beispiel Response:**
```json
[
  {
    "id": "1",
    "firstname": "Ozcan",
    "lastname": "Yildiz"
  },
  {
    "id": "2",
    "firstname": "Max",
    "lastname": "Mustermann"
  }
]
