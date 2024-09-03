package com.lhtech.table.container;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TableRow;


public class Signature extends View {
    private Paint paint;
    private Path path;
    private Bitmap bitmap;
    private Canvas canvas;

    public Signature(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(8f);

        path = new Path();
        bitmap = Bitmap.createBitmap(20000, 800, Bitmap.Config.ARGB_8888); // Kích thước ban đầu của bitmap
        canvas = new Canvas(bitmap);
        canvas.drawColor(Color.WHITE); // Đặt nền trắng cho canvas
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, 0, 0, paint); // Vẽ bitmap trước
        canvas.drawPath(path, paint); // Vẽ path hiện tại lên canvas
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                break;
            case MotionEvent.ACTION_UP:
                this.canvas.drawPath(path, paint); // Lưu path vào canvas chính
                path.reset(); // Đặt lại path cho lần vẽ tiếp theo
                break;
        }
        invalidate(); // Gọi onDraw để cập nhật màn hình
        return true;
    }

    public Bitmap getSignatureBitmap() {
        return bitmap;
    }

    public void clearSignature() {
        path.reset();
        canvas.drawColor(Color.WHITE); // Xóa nội dung canvas
        invalidate();
    }
}