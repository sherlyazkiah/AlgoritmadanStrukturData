package Week6;

public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService premierLeagueService = new PremierLeagueService(20);
        premierLeagueService.add(new PremierLeague("Liverpool", 29, 45, 82));
        premierLeagueService.add(new PremierLeague("Manchester City", 27, 30, 57));
        premierLeagueService.add(new PremierLeague("Leicester City", 28, 25, 50));
        premierLeagueService.add(new PremierLeague("Chelsea", 29, 48, 50));
        premierLeagueService.add(new PremierLeague("Sheffield United", 29, 0, 43));
        premierLeagueService.add(new PremierLeague("Manchester United", 29, 7, 43));
        premierLeagueService.add(new PremierLeague("Tottenham Hotspur", 29, 7, 41));
        premierLeagueService.add(new PremierLeague("Arsenal", 28, 0, 40));
        premierLeagueService.add(new PremierLeague("Burnley", 29, -8, 30));
        premierLeagueService.add(new PremierLeague("Crystal Palace", 29, -8, 39));
        premierLeagueService.add(new PremierLeague("Everton", 29, -37, 37));
        premierLeagueService.add(new PremierLeague("Newcastle United", 29, -6, 35));
        premierLeagueService.add(new PremierLeague("Southampton", 29, -17, 34));
        premierLeagueService.add(new PremierLeague("Brighton & Hove Albion", 29, -8, 29));
        premierLeagueService.add(new PremierLeague("West Ham United", 29, -15, 27));
        premierLeagueService.add(new PremierLeague("Watford", 29, -17, 27));
        premierLeagueService.add(new PremierLeague("AFC Bournemouth", 29, -18, 27));
        premierLeagueService.add(new PremierLeague("Aston Villa", 27, -18, 25));
        premierLeagueService.add(new PremierLeague("Norwich City", 29, -27, 21));

        System.out.println("Unsorted Premier League Standings:");
        premierLeagueService.displayAll();

        System.out.println("\nPremier League Standings sorted by Points in Ascending Order:");
        premierLeagueService.insertionSort(false);
        premierLeagueService.displayAll();
    }
}