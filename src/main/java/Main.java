import software.amazon.awscdk.App;

public class Main {
  public static void main(String[] args) {
    App app = new App();
    new MyFirstStack(app, "hello-cdk");
    app.synth();
  }
}
