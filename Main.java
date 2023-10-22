// Déclaration de la classe "Main"
public class Main {

    // Méthode principale "main" qui est le point d'entrée de l'application Java
    public static void main(String[] args) {

        // Création d'une nouvelle instance de la classe "NomDeLaClasse" avec les valeurs 0, 1.5 et "Toto"
        // et assignation de cette instance à la variable "maClassIntancie"
        NomDeLaClasse maClassIntancie = new NomDeLaClasse(0, 1.5d, "Toto", false);

        // Appel de la méthode "MaMethodePublic" de l'objet "maClassIntancie"
        // et stockage du résultat retourné par cette méthode dans la variable "returnMethode"
        String returnMethode = maClassIntancie.MaMethodePublic();
        System.out.println(returnMethode);

        maClassIntancie.setVariableInt(12);

        returnMethode = maClassIntancie.MaMethodePublic();

        maClassIntancie.setIsBool(true);

        returnMethode=maClassIntancie.MaMethodePublic();


        // Affichage du contenu de la variable "returnMethode" dans la console
        System.out.println(returnMethode);
    }
}
