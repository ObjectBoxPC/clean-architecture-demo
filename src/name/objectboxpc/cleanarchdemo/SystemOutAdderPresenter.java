package name.objectboxpc.cleanarchdemo;

public class SystemOutAdderPresenter implements AdderOutput {
	@Override
	public void handleResponse(AdderResponse response) {
		System.out.println("The sum is: " + response.getResult());
	}

}
