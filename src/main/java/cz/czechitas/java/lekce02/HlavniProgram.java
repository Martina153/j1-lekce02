package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
      //TODO tady bude kód
    nakreslitCtverecek();
    zofka.move(200);
    zofka.turnRight(45);
    nakreslitStrechu();

  }
  /*public void  presunVlevoNaDalsiPozici() {
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(400);
    zofka.turnRight(90);
    zofka.penDown();
  }*/

    public void  nakreslitCtverecek() {
      for (int i = 0; i < 4; i++) {
        zofka.move(200);
        zofka.turnRight(90);
      }

    }
    public void nakreslitStrechu() {
      zofka.move(Math.sqrt(2) * 100);
      zofka.turnRight(90);
      zofka.move(Math.sqrt(2) * 100);
      zofka.turnRight(45);
    }
}
