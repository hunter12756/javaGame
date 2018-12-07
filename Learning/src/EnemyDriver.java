public class EnemyDriver extends Enemy {
    private final int BOARD_WIDTH = 1000;


    public EnemyDriver(int x, int y) {
        super(x, y);
        initEnemyDriver();
    }

    private void initEnemyDriver() {
        loadImage("src/enemyship.png");
        getImageDimensions();
    }

    public void move() {

        x += 1;
        y -= 1;


        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}
