🌐 Spring REST API – Gestion de Comptes Bancaires

📝 Description

Ce projet est une API RESTful développée avec Spring Boot pour la gestion des comptes bancaires. Elle permet d'effectuer les opérations CRUD (Création, Lecture, Mise à jour, Suppression) sur les comptes, avec prise en charge des formats JSON et XML, et une base de données H2 embarquée pour le stockage en mémoire.

⚙️ Fonctionnalités

Gestion des comptes bancaires : COURANT et EPARGNE

Support des formats JSON et XML

Documentation automatique via Swagger UI

Base de données H2 embarquée

🔗 Endpoints REST

Méthode	URL	Description
GET	/banque/comptes	Liste des comptes
GET	/banque/comptes/{id}	Récupérer un compte par ID
POST	/banque/comptes	Créer un nouveau compte
PUT	/banque/comptes/{id}	Mettre à jour un compte
DELETE	/banque/comptes/{id}	Supprimer un compte

🧰 Technologies Utilisées

Java 17

Spring Boot

Spring Data JPA

H2 Database

Swagger / OpenAPI

Jackson (JSON/XML)

Maven

🚀 Installation et Exécution

1. Cloner le projet

git clone https://github.com/hassaneGuedad/Spring-RestController.git
cd Spring-RestController

2. Lancer l’application
   
mvn spring-boot:run

4. Accéder aux services
   
Swagger UI : http://localhost:8083/swagger-ui.html

H2 Console : http://localhost:8083/h2-console

Configuration H2 :

JDBC URL : jdbc:h2:mem:banque

Username : root

Password : (laisser vide)

📬 Exemples de Requêtes avec Postman

🔍 GET – Tous les comptes


GET http://localhost:8083/banque/comptes
Accept: application/json

🔍 GET – Compte par ID

GET http://localhost:8083/banque/comptes/1
Accept: application/xml
➕ POST – Créer un compte (JSON)

POST http://localhost:8083/banque/comptes
Content-Type: application/json

{
  "solde": 1500.0,
  "dateCreation": "2025-11-05",
  "type": "COURANT"
}
🗂️ Structure du Projet

src/
└── main/
    ├── java/
    │   └── ma/rest/spring/
    │       ├── MsBanqueApplication.java
    │       ├── controllers/
    │       │   └── CompteController.java
    │       ├── entities/
    │       │   ├── Compte.java
    │       │   └── TypeCompte.java
    │       └── repositories/
    │           └── CompteRepository.java
    └── resources/
        └── application.properties
        
🖼️ Captures d’écran

Crée un dossier screenshots à la racine du projet et ajoute-y les images suivantes :

postman-get-json.png

postman-get-xml.png

postman-post-json.png

h2-console.png

swagger-ui.png

🤝 Contribution

Les contributions sont les bienvenues ! Forkez le projet et créez vos pull requests pour ajouter de nouvelles fonctionnalités ou corriger des bugs.

📄 Licence

Ce projet est sous licence MIT – voir le fichier LICENSE.
