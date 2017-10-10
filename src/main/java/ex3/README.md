ISMAËL :
J'ai identifié quelque petit problème :

1) Type compte bancaire : au lieu d'un string, faire une ennum CC=Compte courant, LA=Livret A

2) appliquerRemuAnnuelle() : Dans la Classe LivretA car non utilisable dans la classe mère CompteBancaire

3) le paramètre tauxRemuneration => mettre dans la classe Livret A