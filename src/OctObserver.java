public class OctObserver extends Observer{
    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
