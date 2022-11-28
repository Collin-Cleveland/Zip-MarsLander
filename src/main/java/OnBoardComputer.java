public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {

        //a = (speed * speed)/(altitude * 2)
        int burn = status.getVelocity() * status.getVelocity() / (2 * status.getAltitude()) + 100;
        //100 burn does not change velocity of rocket

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
