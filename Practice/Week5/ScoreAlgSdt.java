package Week5;

public class ScoreAlgSdt {
    String nameSdt;
    int scoreAssignment;
    int scoreQuiz;
    int scoreMid;
    int scoreFinal;

    ScoreAlgSdt(String nameSdt, int scoreAssignment, int scoreQuiz, int scoreMid, int scoreFinal) {
        this.nameSdt = nameSdt;
        this.scoreAssignment = scoreAssignment;
        this.scoreQuiz = scoreQuiz;
        this.scoreMid = scoreMid;
        this.scoreFinal = scoreFinal;
    }

    double calculateTotalScore() {
        double totalScore = (scoreAssignment * 0.3) + (scoreQuiz * 0.2) + (scoreMid * 0.2) + (scoreFinal * 0.3);
        return totalScore;
    }

    String getNameSdt() {
        return nameSdt;
    }
}