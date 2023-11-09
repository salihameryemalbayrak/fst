package sezerinodevii;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _221010310064_main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<_21010310064_fst> states = new LinkedList<_21010310064_fst>();
		int[] girdi = new int[3];
		girdi[0] = 0;
		girdi[1] = 1;
		girdi[2] = 2;
		System.out.println("-----");
		_21010310064_fst fst = new _21010310064_fst(input.next());
		_21010310064_fst fst2 = new _21010310064_fst(input.next());
		states.add(fst);
		states.add(fst2);
		baglantiOlustur(input, states, girdi);
		write(input.next(), girdi, states);

	}

	public static void baglantiOlustur(Scanner input, LinkedList<_21010310064_fst> states, int[] girdi) {
		for (int i = 0; i < states.size(); i++) {
			_21010310064_fst fst = states.get(i);
			for(int j=0;j<girdi.length;j++) {
				fst.baglantiEkle(getFst(input.next(),states), girdi[j], input.nextInt());
			}
		}
	}

	public static void write(String s, int[] girdi, LinkedList<_21010310064_fst> states) {
		_21010310064_fst fst= states.get(0);
		for (int i = 0; i < s.length(); i++) {
			for(int j=0;j<girdi.length;j++) {
				if (Character.getNumericValue(s.charAt(i)) == girdi[j]) {
					System.out.println(fst.state);
					System.out.println(fst.baglantiBul(girdi[j]).cikisval);
					fst=fst.baglantiBul(girdi[j]).diger;
				}
			}

		}

	}
	public static _21010310064_fst getFst(String state,LinkedList<_21010310064_fst> states) {
		for (int i = 0;i<states.size();i++) {
			if(states.get(i).state.equals(state)) {
				return states.get(i);
			}
		}
		return null;
	}
	

}






















