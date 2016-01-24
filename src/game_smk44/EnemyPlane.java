package game_smk44;

import javafx.scene.image.ImageView;

public class EnemyPlane extends FighterPlane {
	
	private static final int PLANE_HEIGHT = 150;
	private static final int PLANE_WIDTH = 200;

	public EnemyPlane() {
		initializeImage();
		steps = -6;
		
	}
	
	@Override
	protected void initializeImage() {
		imageView = new ImageView();
		imageView.setImage(ImageSetUp.getImageList().get(ImageSetUp.getEnemyPlane()));
		imageView.setFitHeight(PLANE_HEIGHT);
		imageView.setFitWidth(PLANE_WIDTH );
		getChildren().add(imageView);
	}
	
}
