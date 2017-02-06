im

public class Cube {
			char [] a1={'R','R','R',
						'R','R','R',
						'R','R','R',
						};
		sCube [][][] bb;
			public void newcube(){
				
				for(int i = 0;i<2;i++){
					for(int j = 0;j<2;j++){
						for(int k= 0;k<2;k++){
						 bb = new sCube[i][j][k];
							
						}
					}
				}
				
				bb[0][0][0].x='R';
			}
		
			
		
		public void main(String [] args){
			newcube();
			System.out.println(bb[0][0][0].x);
			
		}
			
}
