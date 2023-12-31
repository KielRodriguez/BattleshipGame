class SimpleStartup {

    private int[] locationCells;
    private int numOfHits;

    public String checkYourserlf(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell ){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}