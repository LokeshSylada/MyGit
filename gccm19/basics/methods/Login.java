class Login {
	public static void main(String[] args) {
		System.out.println("from login main(s[]..)");
		String output=login("jspiders","qspiders");
		System.out.println(output);
	}
	public static String login(String userName,String password){
		return("login of" +userName+ "is successful...!");
    }

}
