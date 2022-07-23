package lecture25.realTyme;


public abstract class Fragment<V extends View, T extends Presenter<V>> {
    T presenter;
    protected Fragment (T presenter){
        this.presenter = presenter;
    }

    public void onResume(V view){
        presenter.updateUi(view);

    }
    public void onPause(){
        presenter.stop();
    }



}
