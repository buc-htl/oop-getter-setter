public class Bottle {

    /*Das Innere, das "wie" unsere Klasse funktioniert, wollen wir nach außen verbergen. Dadurch können wir das "wie" wir etwas programmieren jederzeit ändern, ohne das wir Änderungen dort wo unsere Klasse verwendet wird, vornehmen müssen (Kapselung). Daher sind unsere Attribute im Normalfall private!
     */
    private double volume;
    private double currentLevel;
    private boolean madeOfPlastic;

  /* Die Attribute (Eigenschaften) eines Objekts werden über Methoden geändert und nicht direkt. Dadurch haben wir volle Kontrolle und können beliebigen Code ausführen wenn Attribute ausgelesen oder geändert werden (z.B. Überprüfungen). Auch kann ich leicht bestimmen, dass z.B. Werte nur gelesen, aber von außerhalb nicht geändert werden dürfen!

  Diese Methoden nennen wir Zugriffsmethoden bzw. Getter- und Setter-Methoden.
  */

    /*
      Eine Setter-Methode für Volume. Setter-Methoden haben überlichweise den Funtionsnamen "set"+Attributsname und als Parameter den neuen Wert.
    */
    public void setVolume(double v){
        volume = v;
    }

    /*
      Eine Getter-Methode für Volume. Getter-Methoden haben überlichweise den Funtionsnamen "get"+Attributsname und liefern den Wert zurück.
    */
    public double getVolume() {
        return volume;
    }

    /* Kannst du dir vorstellen wie die setter/getter für den level aussehen?
     */

    public void setCurrentLevel(double level) {
        this.currentLevel = level;
    }

    public double getCurrentLevel(){
        return currentLevel;
    }

    /*
      Bei Boolean nennt man die getter-Methoden meist leicht anders. Statt get+Variablennamen schreibt man is+Variablennamen (Einzahl) bzw. has+Variablennamen (Mehrzahl)
    */
    public boolean isMadeOfPlastic(){
        return madeOfPlastic;
    }

    /* Die Namenskonvention für die setter-Methode bleibt gleich. */
    public void setMadeOfPlastic(boolean isPlastic) {
        this.madeOfPlastic = isPlastic;
    }

    public Bottle(double volume) {
        this.volume = volume;
    }

    public Bottle(double volume, double currentLevel) {
        this.volume = volume;
        this.currentLevel = currentLevel;
    }

    public Bottle(){
        volume = 0;
        currentLevel = 0;
    }


    public String toString() {
        return "Die Flasche ist mit "+currentLevel+" ml von "+volume+" ml gefüllt.";
    }

    public void fillBottle(double v) {
        currentLevel += v;

        if (currentLevel > volume) {
            currentLevel = volume;
        }
    }

    public void emptyBottle(double v) {
        currentLevel -= v;

        if (currentLevel < 0) {
            currentLevel = 0;
        }
    }


}