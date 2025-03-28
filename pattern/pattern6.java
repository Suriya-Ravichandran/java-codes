class pattern6{
	public static void main(String[] args){
		char x='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i){
				System.out.print(x+"\t");
				x++;
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}