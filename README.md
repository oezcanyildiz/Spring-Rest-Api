# Spring Boot REST API – Lernprojekt

Dieses Projekt dient zum Lernen von:
- Spring Boot
- RESTful APIs
- Dependency Injection
- Layered Architecture (Controller, Service, Repository)
- Java Collections als In-Memory-Datenquelle

## Technologien
- Java 21
- Spring Boot 3.x
- Maven
- Lombok

## Projektstruktur
- Controller: REST-Endpunkte
- Service: Business-Logik
- Repository: Datenzugriff (In-Memory)
- Config: Bean-Konfiguration
- Model: Datenobjekte


### Beispiel-Response
```json
### 1. Alle Mitarbeiter abrufen
- **Methode:** GET  
- **URL:** `/rest/api/employee/list`  
- **Beschreibung:** Liefert eine Liste aller Mitarbeiter zurück.  
- **Beispiel Response:**
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
2. Mitarbeiter nach ID abrufen

Methode: GET

URL: /rest/api/employee/{id}

Beschreibung: Liefert einen einzelnen Mitarbeiter anhand seiner ID.

Path Variable: id – die eindeutige ID des Mitarbeiters

Beispiel Response:
{
  "id": "1",
  "firstname": "Ozcan",
  "lastname": "Yildiz"
}
3. Mitarbeiter nach Vor- und Nachname suchen

Methode: GET

URL: /rest/api/employee/with-params?firstnameString=Ozcan&lastnameString=Yildiz

Beschreibung: Filtert die Mitarbeiter nach Vorname und/oder Nachname.

Query-Parameter:

firstnameString (optional)

lastnameString (optional)

Beispiel Response:

[
  {
    "id": "1",
    "firstname": "Ozcan",
    "lastname": "Yildiz"
  }
]

4. Mitarbeiter speichern / anlegen

Methode: POST

URL: /rest/api/employee/save-employee

Beschreibung: Legt einen neuen Mitarbeiter an oder speichert Änderungen.

Request Body:
{
  "id": "3",
  "firstname": "Anna",
  "lastname": "Schmidt"
}

Beispiel Response:

{
  "id": "3",
  "firstname": "Anna",
  "lastname": "Schmidt"
}
