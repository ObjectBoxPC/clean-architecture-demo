package tk.philipchungtech.cleanarchdemo;

public class TestAdderOutput implements AdderOutput {
	private AdderResponse _response = null;

	@Override
	public void handleResponse(AdderResponse response) {
		_response = response;
	}

	public AdderResponse getResponse() {
		return _response;
	}
}
