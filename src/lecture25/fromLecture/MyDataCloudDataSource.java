package lecture25.fromLecture;

import org.jetbrains.annotations.Nullable;

public class MyDataCloudDataSource implements DataSource<MyData>{
    @Override
    @Nullable
    public MyData getData() {
        return new MyData(1,"description_1");
    }
}
