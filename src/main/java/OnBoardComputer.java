public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.getAltitude() > 1) {

            //a = (speed * speed)/(altitude * 2)
            burn = status.getVelocity() * status.getVelocity() / (2 * status.getAltitude()) + 99;
            //100 burn does not change velocity of rocket
        }
        else {burn = 100;}
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
