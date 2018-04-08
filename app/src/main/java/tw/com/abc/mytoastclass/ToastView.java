package tw.com.abc.mytoastclass;

        import android.content.Context;
        import android.graphics.Color;
        import android.graphics.drawable.GradientDrawable;
        import android.util.AttributeSet;
        import android.widget.FrameLayout;
        import android.widget.TextView;

/**
 * Toast專用的View
 *
 * @author magiclen
 *
 */
public class ToastView extends FrameLayout {

    private static int DEFAULT_TEXT_SIZE = 18;
    private static int DEFAULT_TEXT_COLOR = Color.argb(0xAA, 0xFF, 0xFF, 0xFF);
    private static int DEFAULT_PADDING = 30;
    private static int DEFAULT_BACKGROUND_COLOR = Color.argb(0xAA, 0xFF, 0x00, 0x00);
    private static int DEFAULT_RADIUS = 20;

    private TextView text;
    private GradientDrawable background = new GradientDrawable();

    public ToastView(final Context context) {
        super(context);
        init(context);
    }
    public ToastView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ToastView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private final void init(final Context context) {
        text = new TextView(context);
        final FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        text.setLayoutParams(flp);
        text.setSingleLine(false);
        text.setId(android.R.id.message);

        text.setTextSize(DEFAULT_TEXT_SIZE);
        text.setTextColor(DEFAULT_TEXT_COLOR);

        addView(text);

        setPadding(DEFAULT_PADDING, DEFAULT_PADDING, DEFAULT_PADDING, DEFAULT_PADDING);

        background.setColor(DEFAULT_BACKGROUND_COLOR);
        background.setCornerRadius(DEFAULT_RADIUS);
        setBackgroundDrawable(background);
    }

    public void setTextSize(final float size) {
        text.setTextSize(size);
    }

    public void setTextSize(final int unit, final float size) {
        text.setTextSize(unit, size);
    }

    public void setTextColor(final int color) {
        text.setTextColor(color);
    }

    public void setBackgroundColor(final int color) {
        background.setColor(color);
    }

    public void setRadius(final float radius) {
        background.setCornerRadius(radius);
    }

    public void setPadding(final int padding) {
        setPadding(padding, padding, padding, padding);
    }

    void setText(final String textString) {
        if (textString != null) {
            text.setText(textString);
        } else {
            text.setText("");
        }
    }
}