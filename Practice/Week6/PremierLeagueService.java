package Week6;

public class PremierLeagueService {
    PremierLeague[] leagues;
    int size;

    public PremierLeagueService(int capacity) {
        leagues = new PremierLeague[capacity];
        size = 0;
    }

    public void add(PremierLeague p) {
        if (size < leagues.length) {
            leagues[size++] = p;
        } else {
            System.out.println("Premier League service is full.");
        }
    }

    public void displayAll() {
        for (PremierLeague pl : leagues) {
            if (pl != null) {
                System.out.println("Team: " + pl.team + ", Played: " + pl.play +
                        ", Goals: " + pl.goal + ", Points: " + pl.points);
            }
        }
    }    

    public void insertionSort(boolean asc) {
        for (int i = 1; i < size; i++) {
            PremierLeague key = leagues[i];
            int j = i - 1;

            if (asc) {
                while (j >= 0 && leagues[j].points < key.points) {
                    leagues[j + 1] = leagues[j];
                    j = j - 1;
                }
            } else {
                while (j >= 0 && leagues[j].points > key.points) {
                    leagues[j + 1] = leagues[j];
                    j = j - 1;
                }
            }
            leagues[j + 1] = key;
        }
    }
}