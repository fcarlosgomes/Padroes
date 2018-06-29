
package target;

public class AdaptadorParaNavegador  extends INavegador{
    Navigator navigator;

    public Adapter(Navigator navigator) {
        this.navigator = navigator;
    }

	public void primeiro() {
		navigator.first;
	}

	public void proximo() {
		navigator.next;
	}	

	public void anterior() {
		navigator.prior;
	}	
	
	public void ultimo() {
		navigator.last;
	}
}
