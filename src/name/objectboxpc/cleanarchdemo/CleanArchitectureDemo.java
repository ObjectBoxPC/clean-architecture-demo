package name.objectboxpc.cleanarchdemo;

public class CleanArchitectureDemo {
	public static void main(String[] args) {
		AdderOutput output = new SystemOutAdderPresenter();
		AdderInput input = new AdderInteractor(output);
		new SystemInAdderController(input).run();
	}
}
