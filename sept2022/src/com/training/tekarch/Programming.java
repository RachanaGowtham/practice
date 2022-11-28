package com.training.tekarch;

//Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, 
	//then the message "I love programming languages" should be printed. If some String is passed to it, 
	//then in place of "programming languages" the name of that String variable should be printed.

	public class Programming {
		
		String prg="I love programming languages and cook languages";
		
		public void printMessage() {
			System.out.println(prg);
		}
		
		public void printMessage(String prg) {
			
			if(prg==null) {
				prg=this.prg;
				System.out.println(prg);
			}
			else {
			String s="";
			Boolean flag=false;
			String[] str=this.prg.split(" ");
			
			for(int i=0;i<str.length;i++) {
				//System.out.println(str[i]);
				String p="programming";
				String q="languages";
				if(str[i].equals(p)) {
					flag=true;
					continue;
					}
				if(flag && str[i].equals(q)) {
					s=s+prg;
					s=s+" ";
					flag=false;
					//System.out.println(s);
					
				} 
				else
				{
					s=s+str[i];
					s=s+" ";
					flag=false;
					//System.out.println(s);
				} 
			}System.out.println(s);
			}
			
		}

		public static void main(String[] args) {
			
			Programming obj=new Programming();
			obj.printMessage();
			obj.printMessage("Gowtham");
			obj.printMessage(null);
			obj.printMessage("IceCream");
			

		}

}
