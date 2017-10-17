
public class cocafreak {

	private String[][] m_string;
	
	public cocafreak(String[][] a){
		m_string = new String[a.length][a[0].length];
		m_string = a;
	}
	
	public boolean isWellSorted(String[] sequence){
		String temp1;
		String temp2;
		
			
		for(int i = 0 ; i < m_string.length ; i++ ){
			temp1 = m_string[i][0];
			temp2 = m_string[i][1];
			
			for(int k = 0 ; k<sequence.length ; k++){
				if(sequence[k]==temp2){
					for(int j = 0; j<=k;){
						if(j==k){
							return false;
						}
						else if(sequence[j]!=temp1){
							j++;
						}else if(sequence[j]==temp1){
							break;
						}
					}
				}
			}
		}
		
		
		
		return true;
}
	
}
