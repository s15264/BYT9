import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(value = { Main.class })
public class TestClassTest {

    private Main mod = new Main();

    @Test
    public void shouldReturnUrl()
            throws Exception {

        URL url = PowerMockito.mock(URL.class);
        PowerMockito.whenNew(URL.class).withParameterTypes(String.class)
                .withArguments(Mockito.anyString()).thenReturn(url);
        URL url1 = mod.getUrl();
        Assert.assertNotNull(url1);
    }
}