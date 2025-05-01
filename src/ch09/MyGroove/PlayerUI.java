package ch09.MyGroove;

public class PlayerUI {
    public interface ClickListener {
        void onClick();
    }
    private ClickListener clickListener;

    void setClickListener(ClickListener listener) {
        clickListener = listener;
    }
    void clickPlayButton() {
        if (clickListener != null) {
            clickListener.onClick();
        }else {
            System.out.println("❌ 리스너가 등록되지 않았습니다.");
        }
    }
}
