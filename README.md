# TP Application Design - Design n°2

### Mélanie HERNANDEZ

## Introduction

* Design n°2 : achats de montres
* Technologie choisie : Android + XML
* Langage : Kotlin

J'ai réalisé les deux pages du design 2 et n'ai pas ajouté de nouvelles fonctionnalités en dehors de la page bonus. 

## Fonctionnement 

Les activités ont été faites en utilisant des layouts imbriqués les uns dans les autres. Des fichiers XML ont été créés pour chaque forme afin de réaliser des arrondis sur les côtés. Le projet ne contient que deux activités : activity_main et watch_page. La navigation entre les deux pages est entièrement fonctionnelle. Les informations contenues dans la watch_page sont modifiées en fonction de la montre sur laquelle l'utilisateur a appuyé dans l'activité ActivityMain.

En effet, dans ActivityMain, j'ai utilisé une intention qui renvoit en extra l'id de la montre sur laquelle l'utilisateur a cliqué. Cette information de l'intention est récupérée dans l'activité WatchPage qui change les textes et l'image en fonction de l'id de la montre reçue. Cela permet de n'avoir qu'un seul fichier xml qui est modifié en conséquence. 
