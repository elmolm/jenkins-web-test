package blog.elmland;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EchoServiceTest {

	private EchoService echoService = new EchoService();

	@Test
	public void echoElmland() {
		String echo = echoService.echo("Elmland");

		assertThat(echo, equalTo("echo: Elmland"));
	}

	@Test(expected = NullPointerException.class)
	public void echoNull() {
		echoService.echo(null);
	}

}
