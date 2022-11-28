public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        //if (status.getAltitude() < 1000 || status.getVelocity() > 1500) {

            //a = (speed * speed)/(altitude * 2)
            burn = status.getVelocity() * status.getVelocity() / (2 * status.getAltitude()) + 100;
            //100 burn does not change velocity of rocket

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
