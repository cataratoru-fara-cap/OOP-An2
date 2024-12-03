public class AmiProche extends Ami {
    public AmiProche(String surnom) {
        super(surnom);
    }

    public double calculerLeScoreDuProfil() {
        double score = 0;
        score += 1.5*calculerLeNombreDePartager() + 2*calculerLeNombreDePost();
        return score;
    }
}
