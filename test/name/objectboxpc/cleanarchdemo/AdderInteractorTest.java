package name.objectboxpc.cleanarchdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AdderInteractorTest {
	private TestAdderOutput _output;
	private AdderInteractor _interactor;

	@Before
	public void setUp() {
		_output = new TestAdderOutput();
		_interactor = new AdderInteractor(_output);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testHandleRequest() {
		_interactor.handleRequest(new AdderRequest(1, 2));
		Assert.assertTrue(_output.responseHandled());
		Assert.assertEquals(3, _output.getHandledResponse().getResult());
	}
}
