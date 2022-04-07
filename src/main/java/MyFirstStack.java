import org.jetbrains.annotations.Nullable;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
import software.constructs.Construct;

public class MyFirstStack extends Stack {
  public MyFirstStack(@Nullable Construct scope, @Nullable String id) {
    super(scope, id);
  }

  public MyFirstStack(@Nullable Construct scope, @Nullable String id, @Nullable StackProps props) {
    super(scope, id, props);

    final Bucket myFirstBucket = new Bucket(this, "MyFirstBucket");

  }
}
