package tk.philipchungtech.cleanarchdemo;

public class TestAdderOutput implements AdderOutput {
	private AdderResponse _response = null;

	@Override
	public void handleResponse(AdderResponse response) {
		_response = response;
	}

	public boolean responseHandled() {
		return _response != null;
	}

	public AdderResponse getHandledResponse() {
		if(_response == null) {
			throw new IllegalStateException("No response was handled");
		}
		return _response;
	}
}
