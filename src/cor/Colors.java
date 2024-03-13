package cor;

public class Colors {
	//Reset Color
	public static final String TEXT_RESET = "\u001B[0m";
	
	//Cores de Texto 
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_WHITE = "\u001B[37m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_GREEN = "\u001B[32m";
	
	//Bold
	public static final String TEXT_RED_UNDERLINED = "\033[4;31m"; 
	public static final String TEXT_BLUE_UNDERLINED = "\033[4;34m"; 
	public static final String TEXT_WHITE_UNDERLINED = "\033[4;37m"; 
	public static final String TEXT_GREEN_BOLD = "\033[1;32m";
	
	
	//Background 
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	
}
