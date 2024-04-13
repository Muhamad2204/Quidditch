public class Team {

    int goals = 0;


    private void setGoals() {
        this.goals++;
    }

    private boolean goldenSnitch = false;

    public boolean getGoldenSnitch() {
        return goldenSnitch;
    }

    public void play() {
        if (new Seeker().isSuccessful()) {
            goals += 150;
            goldenSnitch = true;
        } else {
            if (new Chaser().isSuccessful()) {
                if (new Chaser().isSuccessful()) {
                    if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    } else if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    }
                } else if (new Chaser().isSuccessful()) {
                    if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    } else if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    }
                }
            } else if (new Chaser().isSuccessful()) {
                if (new Chaser().isSuccessful()) {
                    if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    } else if (new Beater().isSuccessful()) {
                        if (new Keeper().isSuccessful()) {
                            setGoals();
                        }
                    }
                }
            }
        }
    }
}
