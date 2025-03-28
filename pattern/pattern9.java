class pattern8{
	public static void main(String[] args){
		int x=1;
		char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i){
					if(i%2==0){
						System.out.print(ch+"\t");
						ch++;
					}else{
					System.out.print(x+"\t");
					x++;
					}
				}
				else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}