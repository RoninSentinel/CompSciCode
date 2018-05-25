package PictureLab;
import java.io.*;
import java.awt.*;

public class PictureLab {

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Int w = pixels[0].length;
		for(int r = 0; r < pixels.length; r++){
			for(int c = 0; c<w/2; c++){
				leftPixel = pixels[r][c];
				rightPixel = pixels[r][w -c -1];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	public static void testMirrorVerticalRightToLeft() {
		Picture caterpillar = new Picture(“caterpillar.jpg”);
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
		}
      2.   Public void mirrorHorizontal() {
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	Int h = pixels.length;
	for(int r = 0; r < h/2; r++){
		for(int c = 0; c < pixels[0].length; c++){
			topPixel = pixels[r][c];
			bottomPixel = pixels[h -r -1][c];
			bottomPixel.setColor(topPixel.getColor());
		}
	}

	public static void testMirrorHorizontal() {
	Picture caterpillar = new Picture(“car.jpg”);
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
	}
      3. Public void mirrorHorizontalBotToTop() {
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	Int h = pixels.length;
	for(int r = 0; r < h/2; r++){
		for(int c = 0; c < pixel[0].length; c++){
			topPixel = pixels[r][c];
			bottomPixel = pixels[r][c];
			topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	public static void testMirrorHorizontalBotToTop() {
	Picture caterpillar = new Picture(“caterpillar.jpg”);
	caterpillar.explore();
	caterpillar.mirrorHorizontalBotToTop();
	caterpillar.explore();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
