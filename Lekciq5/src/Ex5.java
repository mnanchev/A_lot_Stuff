
public class Ex5 {
	private boolean TrueOrFalse;
	public void isMultiple(int x , int y){
		if(x >0 && y>1&&x!=1){
			while(y%x==0){
				
				y=y/x;
			}
			if(y==1){
				setTrueOrFalse(true);
				System.out.println("y is multiple of x: "+isTrueOrFalse());
				
			}
			else{
				setTrueOrFalse(false);
				System.out.println("y is multiple of x: "+isTrueOrFalse());
			}
		}
		else if(x==1&&y>=1){
			setTrueOrFalse(true);
			System.out.println("y is multiple of x: "+isTrueOrFalse());
		}
		else{
			System.out.println("Please enter a correct data!");
		}
	}
	public boolean isTrueOrFalse() {
		return TrueOrFalse;
	}
	public void setTrueOrFalse(boolean trueOrFalse) {
		TrueOrFalse = trueOrFalse;
	}
}
