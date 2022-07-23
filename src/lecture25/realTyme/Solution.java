package lecture25.realTyme;

public class Solution {
    public static void main(String[] args) {

        ScreenOneFragment screenOneFragment = new ScreenOneFragment(new ScreenOnePresenter());
        ScreenOneView screenOneView = new ScreenOneView();
        screenOneView.goToScreenTwo();

    }
}
