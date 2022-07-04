package switchcases;

enum NAME {
	RAVI,
	DHANU,
	SRAVAN,
	CHITTI,
	CHINNI
}

public class Switchenum {

	public static void main(String[] args) {
NAME x = NAME.CHITTI;
switch(x) {
case RAVI : System.out.println("the given name is ravi");
break;
case DHANU : System.out.println("the given name is dhanu");
break;
case SRAVAN : System.out.println("the given name is sravan");
break;
case CHITTI : System.out.println("the given name is chitti");
break;
case CHINNI : System.out.println("the given name is chinni");
break;
default: System.out.println("the given name is guessing");
}
	}

}
