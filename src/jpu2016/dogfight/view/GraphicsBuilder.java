/**
 * 
 */
package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Graphics;

/**
 * @author ampy0
 *
 */
public class GraphicsBuilder implements IGraphicsBuilder {

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		
	}
	
	@Override
	public void applyModelToGraphic(Graphics graphics,ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	/* (non-Javadoc)
	 * @see jpu2016.gameframe.IGraphicsBuilder#getGlobalWidth()
	 */
	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 1;
	}

	/* (non-Javadoc)
	 * @see jpu2016.gameframe.IGraphicsBuilder#getGlobalHeight()
	 */
	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 1;
	}

}
