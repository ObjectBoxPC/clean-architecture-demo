package name.objectboxpc.cleanarchdemo;

public class AdderInteractor implements AdderInput {
	private final AdderOutput _output;

	public AdderInteractor(AdderOutput output) {
		_output = output;
	}

	@Override
	public void handleRequest(AdderRequest request) {
		int result = request.getNum1() + request.getNum2();
		AdderResponse response = new AdderResponse(result);
		_output.handleResponse(response);
	}
}
