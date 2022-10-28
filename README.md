# Examen Blanc Design Pattern et Programmation Orientée Aspect

#### 1. Etablir un Diagramme de classe du modèle en appliquant les design patterns appropriés en
justifiant les designs patterns appliqués.
### -Composite :
dessins. Un Dessin contient un ensemble de figures géométriques qui peuvent être soit des rectangles ou des cercles.
Donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres groupes.
### -Observer :
Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se mettre à jour.
### -Strategy :
Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin qui les utilise.
![Dessin](https://user-images.githubusercontent.com/62363101/198710000-c3fe6f25-04b0-424f-b6a2-143a81e04127.png)

#### 2. Faire une implémentation du modèle en utilisant un projet Maven sans prendre en considération des aspects techniques.

Structure de l'application

![image](https://user-images.githubusercontent.com/62363101/198719603-c3f2677e-edc2-42d3-a146-1a48b8007d8f.png)
#### 3. Effectuer des Tests du modèle

-Test Design Pattern Composite:

![image](https://user-images.githubusercontent.com/62363101/198723295-e538cee4-5860-4cc3-bee1-8faa1ab9157f.png)

-Résultat :

![image](https://user-images.githubusercontent.com/62363101/198723456-a423e617-9016-4ad1-a62f-b6fa5f28b5ca.png)

-Test des fonctions périmètre et surface:

![image](https://user-images.githubusercontent.com/62363101/198723546-a33cf98e-1b08-402e-ae1d-608b2b26e4e6.png)

-Resultat

![image](https://user-images.githubusercontent.com/62363101/198723849-0da3c0ab-0ba7-45bd-8616-17003b3866d8.png)

-Test de la fonction sérialise()

![image](https://user-images.githubusercontent.com/62363101/198723926-8ae3f4f8-e642-45b0-a6eb-d9f6dcb18601.png)

-Résultat

![image](https://user-images.githubusercontent.com/62363101/198723972-647e2860-db34-4265-ae14-8b050812be64.png)

Le fichier a été créer

![image](https://user-images.githubusercontent.com/62363101/198724059-be11d105-a95c-418a-a913-1b3ffb242210.png)

Le contenu du fichier dessin.serial

![image](https://user-images.githubusercontent.com/62363101/198724108-a9d1247e-f32f-4d50-be53-705d87740142.png)

-Test Design Pattern Observer:

![image](https://user-images.githubusercontent.com/62363101/198724359-01b89f79-de6d-46f6-9855-4020e12012ad.png)

-Résultat

![image](https://user-images.githubusercontent.com/62363101/198724395-b40661f7-cb9d-4ada-8449-8dbb3ff99559.png)

-Test de design pattern Strategy

![image](https://user-images.githubusercontent.com/62363101/198724540-818a5f7c-ac53-4d9c-b02f-f20c14462373.png)

Résultat

![image](https://user-images.githubusercontent.com/62363101/198724580-c0d4688a-a4ef-412a-8ac6-611de44c9b7f.png)
