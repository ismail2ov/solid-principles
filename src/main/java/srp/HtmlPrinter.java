package srp;

public class HtmlPrinter implements Printer {

	public String printPage(String page) {
		return "<div class='page'>" + page + "</div>";
	}

}
