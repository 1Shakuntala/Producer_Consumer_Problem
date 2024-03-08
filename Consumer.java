class Consumer extends Thread{
	Company c;
	Consumer(Company c){
		this.c=c;
	}
	public void run(){
		// int i=1;
		while(true){
			this.c.consume_item(i);
			try{Thread.sleep(1000);}catch(Exception e){}
			
		}
	}
}