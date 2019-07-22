package mypake1;

class Sports{
	String getName(){
		return "Generic Sports";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has n players in "+getName());
	}
}

class Cricket extends Sports{
	String getName(){
		return "Cricket Sports";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has 11 players in "+getName());
	}
}

class Soccer extends Sports{
	String getName(){
		return "Soccer Sports";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has 11 players in "+getName());
	}
}

class SportsClass{
	public static void main(String[] args) {
		Soccer s = new Soccer();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
	}
}