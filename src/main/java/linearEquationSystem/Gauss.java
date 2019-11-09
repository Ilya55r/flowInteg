package linearEquationSystem;


public class Gauss{
	private int varNum;
	private double[][] matrix;
	private double[] result;
	
	public Gauss(int num){
		varNum = num;
		result = new double[num];
	}
	
	public void setMatrix(double[][] mat){
		matrix = mat;
	}
	
	public double[][] getMatrix(){
		return matrix;
	}
	
	public double[] getResult(){
			return result;
	}
	
	public void calculate(){
		for (int i = 0;i<varNum;i++)
			for (int j = i+1; j < varNum; j++){
				double num = matrix[j][i]/(matrix[i][i]);
				for (int k = 0; k < varNum+1; k++)
					matrix[j][k] = matrix[j][k]-(matrix[i][k]*num);
			}
			
		for (int i = varNum - 1; i >= 0; i--){
		
			result[i] = matrix[i][varNum] / matrix[i][i];
		
			for (int j = i - 1; j >=0; j--){
				matrix[j][varNum]-= matrix[j][i] * result[i];
				matrix[j][i] = 0;
			}
			
	
		}
	
			
			
		
	}
	
		
}