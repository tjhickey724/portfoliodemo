public class IntPart{

    public static void main(String[] args){
	String a1 = getIntPart("2.71828");
	String a2 = getIntPart("1234.56");
	String a3 = getIntPart("747");
        System.out.printf("%s %s %s%ndoes it work???", a1,a2,a3);
    }

    public static String getIntPart(String number){
	int decimalPos = number.indexOf(".");
	if (decimalPos == -1) {
	    return number;
	} else {
	    return number.substring(0,decimalPos); 
	}
    }
}