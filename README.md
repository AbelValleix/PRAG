# PRAG

Bonjour, 
Voici ce que j'ai pu faire pour mon code de l'application Weather selon le diagramme UML que je vous avais envoyé. 
J'ai donc transcris le code en Java, en "deux parties" (une pour la météo et une pour le compte de l'utilisateur). 

Dans le package InformationTemperature, vous trouverez la classe principale Weather avec différents constructeurs (un pour les informations essentielles, un pour y ajouter des attributs optionnels, la vitesse du vent et la qualité de l'air)

Il y a ensuite une classe par type d'information météréologique. (Temperature, Humidité, Localisation, Qualité de l'air, Vitesse du vent)
Les contraintes de ces types sont définies dans les setters respectifs des classes. 
Enfin, il y a 2 classe pour les unités de mesure de la température (en Fahrenheit, Celsius ou Kelvin) et de la vitesse de vent (en km/h ou miles/h)


Dans le package InformationCompte, vous trouverez la classe principale Account permettant de créer un compte si on possède un identifiant et un mot de passe.
Il y a ensuite deux classes, une pour l'identifiant (qui ne peut contenir que des caractères alpha numériques, et avoir une taille de moins de 16 caractères) et une pour son mot de passe (qui doit avoir moins de 16 caractères)

