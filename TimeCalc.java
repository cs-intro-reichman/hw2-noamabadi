public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); 

        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        int minutesToAdd = Integer.parseInt(args[1]); 

        int totalMinutes = (hours * 60) + minutes + minutesToAdd; 
        int totalHours = totalMinutes / 60; 
        int newHours = totalHours % 24; 
        if (newHours < 10) { System.out.print("0" + newHours + ":");  }
        else System.out.print(newHours + ":");

        int newMinutes = totalMinutes - (totalHours * 60);
        if (newMinutes < 10) { System.out.println("0" + newMinutes); }
        else System.out.println(newMinutes);
    }
}
