import javax.lang.model.util.SimpleElementVisitor14;
public class Etudiant  {
    private int id; String nom; float moy;

    Etudiant (int id, String nom,  float moy) throws MoyenneHorsPlageException {

            if (moy < 0 || moy> 20) {
                throw new  MoyenneHorsPlageException ("les moyen n'est valide pur etre dons l'intrvalle[0,20]");
                }

            this.id = id;
            this.nom = nom;
            this.moy = moy;

    }
    public int getId(){   return id;}
    public void setId(int id){   this.id=id;}

    public String getNom(){  return nom;}
    public void setNom(String nom){ this.nom=nom;	}

    public float get_moy(){return this.moy;}
    public void set_moy(float b){this.moy = this.moy+b;}

    String tostring(){
        return   String.valueOf(this.id) +"\t" + this.nom + "\t" +String.valueOf(this.moy) ;
    }
}
