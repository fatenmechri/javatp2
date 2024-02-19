import com.sun.source.doctree.ThrowsTree;

public class  Main {
    public static  void main   (String[]vargs)
          {
        //liste des services

        //1.Enregistrement des étudiants ali et salma
        try {
           Etudiant ali = new Etudiant (100, "ali b med", 18);
            System.out.println(ali.tostring());
           Etudiant salma = new Etudiant (200, "salma b salem", -19);
            System.out.println(salma.tostring());
            //2.Test de tostring : Affichage  des info des deux étudiants
            System.out.println(salma.tostring());
            System.out.println(ali.tostring());
        }
        catch (MoyenneHorsPlageException e) {
            System.out.println(e);
        }
        }
    }
