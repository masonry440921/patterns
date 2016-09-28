package iterator.example_1;

public class NameRepository implements Container{
	private String[] name={"aa","bb","cc","dd"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index < name.length){
				return true;
			}
			
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()){
				return name[index++];
			}
			
			return null;
		}
		
	}
}
