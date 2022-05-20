class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(500,0);

        //Beispiel setter-Methode
        bottle.setCurrentLevel(300);

        //Beispiel getter-Methode
        System.out.println("In der Flasche sind "+bottle.getCurrentLevel()+" ml.");

    }
}