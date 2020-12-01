
public class Primo {
	public boolean verificaPrimo(int n1) {
		for(int i = 2; i<=n1/2;i++) {
			if (n1 % 1 == 0) {
				return false;
			}
		}
		return true;
	}
}
