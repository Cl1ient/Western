
# <span style="color: blue;"> Western </span>


_Inspiré de « A l’ouest de Java Town » de A. Lemay et des adaptations de Pascal Divoux et Loïc Mazo._

On désire réaliser un modèle UML, puis des classes Java, qui permettront d'écrire facilement des histoires de Western.
Dans nos histoires, nous croiserons des _brigands_, des _cowboys_ et des _dames_ en détresses.

### Scénario 1 : Les personnages ...

Les intervenants de nos histoires sont tous des _personnages_.

Un personnage porte un nom et possède une boisson favorite. Par défaut, la boisson favorite d'un personnage est l'eau.
Un personnage pourra dire un texte. Son discours sera traduit par un affichage sur la sortie standard de la forme :
`« <nom du personnage > - <texte> »`.  
> _Exemple_ :   
> Quand le personnage nommé Luke dit « I'm a poor lonesome cowboy ! », on affichera :   
>    `Luke – I’m a poor lonesome cowboy ! `  

Un personnage pourra également se présenter (il dit `« Bonjour »`, son nom, et indique sa boisson favorite).
> Lorsque Luke se présente, on affichera  
>    `Luke - Bonjour, je suis Luke et j'aime la bière.`

Il pourra aussi boire une boisson, par défaut sa boisson favorite, ou éventuellement une autre boisson.  
Il dira alors :   
`« Ah ! boire <nom de sa boisson favorite> ! GLOUPS ! »`  
ou   
`« GLOUPS ! Faut vraiment avoir soif pour boire <nom de l’autre boisson> !
J’aurais préféré boire <nom de sa boisson favorite> ! »`.   

Afin de gérer correctement les dialogues, il convient de faire un peu de grammaire.  
Dans les phrases, les _noms_ (et en particulier ceux des boissons) peuvent s’accompagner :
-	soit d’un article _défini_ (**le** thé, **la** bière, ou **l**'eau)
-	soit d’un article _indéfini_ (**un** thé, **une** bière, **une** eau)
-	soit d’un article _partitif_ (**du** thé, **de la** bière, **de l**’eau)
-	soit de la préposition « **de** » (un verre **de** thé, **de** bière ou **d**’eau)

Les noms en général, et ceux des boissons en particulier, ne sont donc pas de simples chaînes de caractères,
mais des objets plus complexes qui ont un genre (masculin, féminin)
et peuvent fournir les opérations qui renvoient le nom avec les articles ou la préposition appropriée.

#### Questions:
- Proposer un diagramme de classes, puis écrire le code Java.
- Tester ce code avec `Histoire1.java`.
- Faire le diagramme de séquence du début de l’exécution de `Histoire1` (création des personnages et intervention de max).
  On introduira l’objet `System.out` pour visualiser l’affichage des messages sur la sortie standard.
#### Indications:
- Vous pouvez commencer par commenter le code qui ne compile pas dans les tests fournis et les fichiers `Histoire1.java` et `Histoire2.java` puis les décommenter une fois le code implémenté
- Respecter la structure en packages définie par les ```import```

### Scénario 2 : Des brigands, des cowboys et des dames en détresse

Les dames, les brigands, et les cowboys, sont des personnages qui ont un nom et peuvent se présenter, parler et boire.   
Il y a toutefois certaines différences entre ces trois types de personnages.
Les brigands peuvent kidnapper des dames.
Les cowboys peuvent tirer sur les brigands et même les capturer et de cette manière libérer les dames captives.

A ce stade, nous ne voulons plus laisser la possibilité de créer un personnage
qui ne serait pas de l'un de ces types  : dame, cowboy, brigand ou narrateur.

En plus de leur nom, ces personnages possèdent aussi un pseudonyme par lequel ils se font appeler.
Le pseudonyme d'une dame sera `« Miss »` suivi de son nom.
Celui d'un brigand sera son nom suivi de son look ("le méchant" par défaut): `« Bob le méchant »`.
Un cowboy conservera simplement son nom (ce sont des gens simples).
Lorsqu'ils se présentent, les personnages donnent leur pseudonyme plutôt que leur nom.

Une **dame** peut être libre ou captive ; initialement, elle est toujours libre.
Quand une dame se fait enlever (par un brigand) elle crie : `« Hiiii ! Au secours ! <pseudo du brigand> m’enlève !»`.
Elle peut se faire libérer (par un cowboy, bien sûr) ; elle remercie alors le héros qui l'a libérée :
`« Merci <pseudo du cowboy>, tu es mon sauveur ! »`.

Un **brigand** est caractérisé par la récompense qui est offerte pour sa capture ;
elle est de 100\$ par défaut et augmente de 50\$ à chaque enlèvement.
Il peut kidnapper une dame ; auquel cas, il s'exclame `« Ah, ah ! <pseudo de la dame>, tu es mienne désormais ! »`.
Quand il se fait capturer par un cowboy, il hurle `« Damned, je suis fait ! Tu m'as eu, <pseudo du cowboy> !
Mais tu n'emporteras pas les <montant de la récompense> $ au paradis. »`.

Un **cowboy** peut tirer sur un brigand ; le cowboy s'exclame alors `« PAN ! PAN ! Prends ça, chacal  de <pseudo du brigand>! »`.
Dans la foulée, le brigand répond `« Tu n’es qu’un coyote, <pseudo du cowboy> ! »`.
Le cowboy peut également capturer un brigand. Il touche alors la récompense offerte et libère immédiatement les dames captives.
Lorsqu’il délivre une dame captive, il dit `« Voilà <pseudo de la dame>, tu es libre maintenant ! »`.
Le cowboy est caractérisé par le montant total des récompenses qu’il a touchées pour ses captures.



#### Questions:
- Proposer un diagramme de classe.
- Modifier la classe `Personnage` et écrire le code Java des nouvelles classes.
- Tester avec `Histoire2.java`.
- Pourquoi votre `Histoire1` ne fonctionne-t-elle plus ?
  Comment peut-on la modifier pour la refaire fonctionner ? Supprimer les tests de ```western.PersonnageTest.java```.
- On s’intéresse au déroulement du scénario à partir de l’enlèvement de Scarlett dans `Histoire2`.
  Faire un diagramme de séquence qui illustre les échanges de messages qui ont lieu dans cette partie de l’histoire.
#### Indications:
- Vous pouvez commencer par commenter le code qui ne compile pas dans les tests fournis et les fichiers `Histoire1.java` et `Histoire2.java` puis les décommenter une fois le code implémenté
- Respecter la structure en packages définie par les ```import```
