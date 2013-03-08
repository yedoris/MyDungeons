package sirodey.mydungeons;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/*
 * La clase Lib esta destinada a métodos estáticos que se usaran desde otras clases.
 * 
 * */

public class Lib {

	//DEPRECATED: usar getRoundedCornerBitmapWithBorderPaint
	public static Bitmap getRoundedCornerBitmap( Drawable drawable, boolean square) {
		/*
		 *  Recibe una imagen y la devuelve con las esquinas redondeadas
		 *  Este recibirá como parámetros un objeto Drawable que es la imagen que vamos a tratar.
		 *  El 2º parametro es un boolean que lo que va a hacer es hacer cuadrada la imagen o no.
		 *  El método comienza convirtiendo a Bitmap nuestra imagen, despues de eso, si la imagen va a ser cuadrada cogemos el menor de los tamaños para el ancho y alto.
		 * */ 

		 int width = 0;
	     int height = 0;
	     Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap() ;
	     
	     if(square){
	      if(bitmap.getWidth() < bitmap.getHeight()){
	       width = bitmap.getWidth();
	       height = bitmap.getWidth();
	      } else {
	       width = bitmap.getHeight();
	          height = bitmap.getHeight();
	      }
	     } else {
	      height = bitmap.getHeight();
	      width = bitmap.getWidth();
	     }
	     
	     
	        Bitmap output = Bitmap.createBitmap(width, height, Config.ARGB_8888);
	        Canvas canvas = new Canvas(output);


	        final int color = 0xff424242;
	        final Paint paint = new Paint();
	        paint.setStyle(Style.FILL_AND_STROKE );
            paint.setStrokeWidth(2);
	        final Rect rect = new Rect(0, 0, width, height);
	        final RectF rectF = new RectF(rect);
	        //angulo de las esquinas
	        final float roundPx = 60; 

	        paint.setAntiAlias(true);
	        canvas.drawARGB(0, 0, 0, 0);
	        paint.setColor(color);
	        
            
	        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);

	        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
	        canvas.drawBitmap(bitmap, rect, rect, paint);

	        return output;
	}

	public static Bitmap getRoundedCornerBitmapWithBorderPaint(Drawable drawable) {
		Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap() ;
		
		Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
	    Canvas canvas = new Canvas(output);
	    Paint   borderPaint ;
	    
	    borderPaint = new Paint();
	    borderPaint.setARGB(255, 65, 42, 34);
	    borderPaint.setAntiAlias(true);
	    borderPaint.setStyle(Style.STROKE);
	    borderPaint.setStrokeWidth(8);
	    
	    final int color = 0xff424242;
	    final Paint paint = new Paint();
	    final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
	    final RectF rectF = new RectF(rect);
	    final float roundPx = 30;
	
	    paint.setAntiAlias(true);
	    canvas.drawARGB(0, 0, 0, 0);
	    paint.setColor(color);
	    canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
	
	    paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
	    canvas.drawBitmap(bitmap, rect, rect, paint);
	    
	    RectF drawRect = new RectF();
	    drawRect.set(0,0, bitmap.getWidth(), bitmap.getHeight());
	    
	    canvas.drawRoundRect(drawRect, roundPx, roundPx, borderPaint);
	
	    return output;
	  }

}