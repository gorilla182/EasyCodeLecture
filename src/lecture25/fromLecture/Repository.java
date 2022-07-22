package lecture25.fromLecture;
import org.jetbrains.annotations.Nullable;

public class Repository<T> implements DataSource<T>{
    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource, MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }
    @Override
    @Nullable
    public T getData(){
        T result = cachedDataSource.getData();
        if(result == null){
            System.out.println("нет данных в кеше");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else
            System.out.println("получено из кеша");
        return result;
    }
}
