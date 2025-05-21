package src;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		pagesPrinted = 0;
		setTonerLevel(tonerLevel);
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		return setTonerLevel(tonerLevel + tonerAmount);
	}
	
	public int printPages(int pages) {
		int printAmount;
		if(duplex) printAmount = (int) Math.round(pages/2+0.4);
		else printAmount = pages;
		
		System.out.println(duplex ? "It is duplex" : "Non duplex print");
		pagesPrinted += printAmount;
		return printAmount;
	}
	
	private int setTonerLevel(int tonerLevel) {
		if(tonerLevel < 0 || tonerLevel > 100) return -1;
		this.tonerLevel = tonerLevel;
		return tonerLevel;
	}
}

