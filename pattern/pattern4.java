class pattern4{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print("$ \t");
				}
				else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}