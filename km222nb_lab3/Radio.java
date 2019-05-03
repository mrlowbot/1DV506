package km222nb_lab3;

public class Radio {

	private boolean Switch = false; // Meaning On or Off!
	private int channel = 0;
	private int volume = 0;

	public String getSettings() {

		if (Switch != true) {
			channel = 1;
			volume = 1;
			String display = "On " + Switch + ", Channel " + channel + ", Volume " + volume;
			return display;

		}

		else {
			String display = "On " + Switch + ", Channel " + channel + ", Volume " + volume;
			return display;
		}

	}

	public void turnOn() {
		channel = 1;
		volume = 1;
		Switch = true;

	}

	public void setVolume(int i) {
		if (Switch != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		if ((i < 0) || (i > 5)) {
			System.out.println("New volume not within range!");
		} else {
			volume = i;
		}

	}

	public void channelUp() {
		if (Switch != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			channel = channel + 1;
			if (channel > 10) { // större än 10
				System.out.println("New channel not within range!");
				channel = 10;
			}
		}

	}

	public void turnOff() {
		Switch = false;

	}

	public void volumeUp() {
		if (Switch != true) {
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			volume = volume + 1;
			if (volume > 5) {
				System.out.println("New volume not within range!");
				volume = 5;
			}
		}

	}

	public void setChannel(int i) {

		if (Switch != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		if ((i > 10) || (i < 1)) {
			// måste vara mindre än 10 och större än 1
			System.out.println("New channel not within range!");
		}

		else {
			channel = i;
		}
	}

	public void volumeDown() {
		if (Switch != true) { // radio är off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else { // on
			volume = volume - 1;

			if (volume < 0) { // om volume är mindre än 0
				System.out.println("New volume not within range!");
				volume = 0;
			}
		}

	}

	public void channelDown() {
		if (Switch != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			channel = channel - 1;
			if (channel < 1) {
				System.out.println("New channel not within range!");
				channel = 1;
			}
		}
	}

}
