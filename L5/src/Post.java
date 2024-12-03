import java.util.GregorianCalendar;

public class Post {
    protected boolean aime;
    protected boolean partage;
    protected GregorianCalendar anneDePublication;
    protected String postType;

    public Post(boolean aime, boolean partage, 
                GregorianCalendar anneDePublication, PostType postType) {
        this.aime = false;
        this.partage = false;
        this.anneDePublication = anneDePublication;
        this.postType = postType.toString();
    }

    public boolean isAime() {
        return aime;
    }

    public boolean isPartage() {
        return partage;
    }

    public void like() {
        aime = true;
    }

    public void unlike() {
        aime = false;
    }

    public void partager() {
        partage = true;
    }

    public GregorianCalendar getAnneDePublication() {
        return anneDePublication;
    }

    public String toString() {
        return "Post [aime=" + aime + ", partage=" + partage + ", anneDePublication=" + anneDePublication + ", postType=" + postType + "]";
    }
}
