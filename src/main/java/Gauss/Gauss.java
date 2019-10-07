
public class Gauss{
	private int varNum;
	private double[][] matrix;
	
	public Gauss(int num){
		varNum = num;
	}
	
	public void setMatrix(double[][] mat){
		matrix = mat;
	}
	
	public double[][] getMatrix(){
		return matrix;
	}
	
	public void calculate(){
		for (int i = 0;i<varNum;i++)
			for (int j=j+1; j<varNum;j++){
				double num = array[j][i]/(matrix[i][i]);
				
				//for (int k= 0; k<varNum;k++)
					//array[j][k] = array[j][k]/(array[i][k]*num);
				
				
			}
		
	}
		
}