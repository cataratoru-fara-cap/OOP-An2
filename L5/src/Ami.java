import java.util.ArrayList;

public abstract class Ami {
    protected String surnom;
    protected ArrayList<Post> listPost;
    
    public abstract double calculerLeScoreDuProfil();

    public Ami(String surnom) {
        this.surnom = surnom;
    }
    
    public boolean ajouterPost(Post p){
        return listPost.add(p);
    }

    public int calculerLeNombreDePartager(){
        int c = 0;
        for (Post p : listPost) 
            if (p.isPartage()) 
                c += 1;
        return c;
    }

    public int calculerLeNombreDePost(){
        return listPost.size();
    }

    public int calculerLeNombreDePostTexte(){
        int c = 0;
        for (Post p : listPost) 
            if (p.postType.equals("TEXT")) 
                c += 1;
        return c;
    }

    public int calculerLeNombreDePostImage(){
        int c = 0;
        for (Post p : listPost) 
            if (p.postType.equals("IMAGE")) 
                c += 1;
        return c;
    }

    public String typeDeUtilisateur(){
        if (calculerLeScoreDuProfil() > 100) 
            return "iNfLuEnCer";
        else if (calculerLeScoreDuProfil() > 50) 
            return "Meh";
        else 
            return "Slab";
    }

    public int compterAime(){
        int c = 0;
        for (Post p : listPost) 
            if (p.isAime()) 
                c += 1;
        return c;
    }
}
