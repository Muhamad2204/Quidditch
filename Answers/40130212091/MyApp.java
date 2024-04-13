public class MyApp {
    public static void main(String[] args){
        Team teamOne = new Team();
        Team teamTwo = new Team();
        for(int i = 0; i < 100; i++){
            teamOne.play();
            if(teamOne.getGoldenSnitch()){
                break;
            }
            teamTwo.play();
            if(teamTwo.getGoldenSnitch()){
                break;
            }
        }


        Match score = new Match(teamOne.goals, teamTwo.goals);

        if(score.teamOne > score.teamTwo){
            System.out.println("Team One : " + teamOne.goals + "\n Team Two : " + teamTwo.goals);
            System.out.println("The Winner Is Team One!");
        } else if (score.teamTwo > score.teamOne) {
            System.out.println("Team One : " + teamOne.goals + "\n Team Two : " + teamTwo.goals);
            System.out.println("The Winner Is Team Two!");
        }
        else{
            System.out.println("Draw!!!");
        }
    }
}
