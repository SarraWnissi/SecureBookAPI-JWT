# SecureBookAPI-JWT


Ce petit projet illustre une API REST basique pour gérer une bibliothèque de livres (ajout, liste, suppression) en utilisant Spring Boot. L'authentification des utilisateurs est gérée via des tokens JWT, qui permettent une vérification stateless des requêtes sans sessions serveur, améliorant la scalabilité et la sécurité (ex. : protection contre les attaques CSRF et gestion des expirations).  

**Technologies utilisées :**  
- **Spring Boot** : Framework principal pour l'API REST et l'injection de dépendances.  
- **Spring Security** : Gestion de l'authentification et des filtres JWT.  
- **JPA/Hibernate** : Persistance des données (entités User et Livre).  
- **JWT (JSON Web Tokens)** : Génération et validation de tokens pour l'authentification sécurisée.  
- **Maven** : Gestion des dépendances.  

Pour démarrer : Clonez le repo, configurez `application.properties` (BD H2 ou autre), et lancez via `mvn spring-boot:run`. Testez l'auth via `/auth/login` pour obtenir un token, puis accédez aux endpoints `/livres`.
