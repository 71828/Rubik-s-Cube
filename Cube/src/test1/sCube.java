package test1;

public class sCube {
	char x ;
	char y ;
	char z ;
	sCube[][][] bb =new sCube[3][3][3];
	public void cCube(){
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				bb[i][j][k] = new sCube();
				
			
			}
		}
	}
	
	
	}
	public void fCube(){
		for(int i =0;i<3;i++){
			for(int j =0;j<3;j++){
				bb[0][i][j].x='B';
				bb[2][i][j].x='G';
				bb[i][0][j].y='W';
				bb[i][2][j].y='Y';
				bb[i][j][0].z='O';
				bb[i][j][2].z='R';
						
			}
		}
		
	}
	public void prin(){
		for(int i=0;i<3;i++){
			System.out.print("        ");
			for(int j=0;j<3;j++){
			System.out.print(" "+bb[j][i][0].z);	
			}
			System.out.println();
		}
		for(int k=0;k<3;k++){
			 for(int i1=0;i1<3;i1++ ){
				 System.out.print(" "+bb[0][i1][k].x);
			 }
			 System.out.print("  ");
			 for(int i2=0;i2<3;i2++){
				 System.out.print(" "+bb[i2][2][k].y);
			 }
			 System.out.print("  ");
			 for(int i3=2;i3>=0;i3--){
				 System.out.print(" "+bb[2][i3][k].x);
			 }
			 System.out.print("  ");
			 for(int i4=2;i4>=0;i4--){
				 System.out.print(" "+bb[i4][0][k].y);
			 }
			 
			 System.out.print("  ");
			 System.out.println();
		}
		for(int i=0;i<3;i++){
			System.out.print("        ");
			for(int j=0;j<3;j++){
			System.out.print(" "+bb[j][2-i][2].z);	
			}
			System.out.println();
		}
		
	}
	public void m3Cube(int k){
		sCube []temp = new sCube[3];
		for(int i=0;i<3;i++){
			temp[i]=new sCube();
			temp[i].x=bb[0][i][k].x;
	        temp[i].y=bb[0][i][k].y;
	        temp[i].z=bb[0][i][k].z;
		}
					
				
		for(int i1=0;i1<3;i1++ ){
			bb[0][i1][k].x=bb[i1][2][k].y;
			bb[0][i1][k].y=bb[i1][2][k].x;
			bb[0][i1][k].z=bb[i1][2][k].z;
			 		 }
		
		 for(int i2=0;i2<3;i2++){
			bb[i2][2][k].x=bb[2][2-i2][k].y;
		    bb[i2][2][k].y=bb[2][2-i2][k].x;
			bb[i2][2][k].z=bb[2][2-i2][k].z;
		 }
		
		 for(int i3=2;i3>=0;i3--){
		    bb[2][i3][k].x=bb[i3][0][k].y;
	   	    bb[2][i3][k].y=bb[i3][0][k].x;
		    bb[2][i3][k].z=bb[i3][0][k].z;
			 
		 }
		 
		 for(int i4=2;i4>=0;i4--){
			bb[i4][0][k].x=temp[2-i4].y;
		   	bb[i4][0][k].y=temp[2-i4].x;
			bb[i4][0][k].z=temp[2-i4].z;
			 
		 }
		
		
	}
	public void m2Cube(int k){
		sCube []temp2 = new sCube[3];
		for(int i=0;i<3;i++){
			temp2[i]=new sCube();
			temp2[i].x=bb[i][k][0].x;
	        temp2[i].y=bb[i][k][0].y;
	        temp2[i].z=bb[i][k][0].z;
		}
					
				
		for(int i1=0;i1<3;i1++ ){   
			bb[i1][k][0].x=bb[2][k][i1].z;
			bb[i1][k][0].y=bb[2][k][i1].y;
			bb[i1][k][0].z=bb[2][k][i1].x;
			 		 }              
		
		 for(int i2=0;i2<3;i2++)   {
			bb[2][k][i2].x=bb[2-i2][k][2].z;
		    bb[2][k][i2].y=bb[2-i2][k][2].y;
			bb[2][k][i2].z=bb[2-i2][k][2].x;
		 }                         
		
		 for(int i3=2;i3>=0;i3--){
		    bb[i3][k][2].x=bb[0][k][i3].z;
	   	    bb[i3][k][2].y=bb[0][k][i3].y;
		    bb[i3][k][2].z=bb[0][k][i3].x;
			 
		 }
		 
		 for(int i4=2;i4>=0;i4--){
			bb[0][k][i4].x=temp2[2-i4].z;
		   	bb[0][k][i4].y=temp2[2-i4].y;
			bb[0][k][i4].z=temp2[2-i4].x;
			 
		 }
		
		
	}
	public void m1Cube(int k){
		sCube []temp3 = new sCube[3];
		for(int i=0;i<3;i++){
			temp3[i]=new sCube();
			temp3[i].x=bb[k][0][i].x;
	        temp3[i].y=bb[k][0][i].y;
	        temp3[i].z=bb[k][0][i].z;
		}
					
				
		for(int i1=0;i1<3;i1++ ){   
			bb[k][0][i1].x=bb[k][i1][2].x;
			bb[k][0][i1].y=bb[k][i1][2].z;
			bb[k][0][i1].z=bb[k][i1][2].y;
			 		 }              
		
		 for(int i2=0;i2<3;i2++)   {
			bb[k][i2][2].x=bb[k][2][2-i2].x;
		    bb[k][i2][2].y=bb[k][2][2-i2].z;
			bb[k][i2][2].z=bb[k][2][2-i2].y;
		 }                         
		
		 for(int i3=2;i3>=0;i3--){
		    bb[k][2][i3].x=bb[k][i3][0].x;
	   	    bb[k][2][i3].y=bb[k][i3][0].z;
		    bb[k][2][i3].z=bb[k][i3][0].y;
			 
		 }
		 
		 for(int i4=2;i4>=0;i4--){
			bb[k][i4][0].x=temp3[2-i4].x;
		   	bb[k][i4][0].y=temp3[2-i4].z;
			bb[k][i4][0].z=temp3[2-i4].y;
			 
		 }
		
		
	}
	
	

}
