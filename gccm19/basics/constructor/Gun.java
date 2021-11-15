class Gun{
	String gname;
	int bullets;
	public Gun(String gname,int bullets){
		this.gname=gname;
		this.bullets=bullets;
      for(int i=1;i<=bullets;i++){
		  System.out.println("Bang...!");
	  }
    }
}
