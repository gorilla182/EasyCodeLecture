package lecture25.fromLecture;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DataSource <T> {
    @Nullable
    T getData ();
}
