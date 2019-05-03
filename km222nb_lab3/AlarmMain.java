package km222nb_lab3;

//Uppgift 4

public class AlarmMain {

	public static void main(String[] args) {

		AlarmClock A = new AlarmClock(23, 48);
		A.setAlarm(6, 15);
		A.displayTime();
		A.displayAlarmTime();

		for (int i = 0; i < 500; i++) {
			A.timeTick();
			if (i >= 500) {
				break;
			}
		}
		A.displayTime();
	}
} 