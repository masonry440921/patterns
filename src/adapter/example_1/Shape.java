package adapter.example_1;

public class Shape {
	private TextShape textShape;
	
	public Shape(){
		
	}
	
	public Shape(TextShape textShape){
		this.textShape = textShape;
	}
	
	public void setTextShape(TextShape textShape) {
		this.textShape = textShape;
	}

	
	public void getView() {
		// TODO Auto-generated method stub
		
	}

	public void BoundingBox(){
		textShape.BoudingBox();
	}
	
	public void CreateManipulator(){
		textShape.CreateManipulator();
	}
}
