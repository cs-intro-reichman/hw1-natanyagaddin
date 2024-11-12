// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		String period = (hours < 12) ? "AM" : "PM"; // test
		
		if (hours == 0) {
			hours = 0; 
		} else if (hours > 12) {
			hours -= 12; }
		
		String formattedMinutes = String.format("%02d", minutes);
		System.out.println(hours + ":" + formattedMinutes + " " + period);
	}
}
