public class HelloWorld implements BundleActivator {
    public void start(BundleContext ctx) {
        System.out.println("Hello world.");
    }
    public void stop(BundleContext bundleContext) {
        System.out.println("Goodbye world.");
    }
}