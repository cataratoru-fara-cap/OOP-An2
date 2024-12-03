public class AutreAmi extends Ami{
    public AutreAmi(String surnom){
        super(surnom);
    }

    public double calculerLeScoreDuProfil() {
        double score = 0;
        score += 1.5*this.calculerLeNombreDePartager() + 2*this.calculerLeNombreDePost();
        return score;
    }
}
