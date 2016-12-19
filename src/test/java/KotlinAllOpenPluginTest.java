import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import pl.petrof.KotlinComponent;

@Ignore
public class KotlinAllOpenPluginTest {
    @Test
    public void canCreateMock() throws Exception {
        KotlinComponent mock = Mockito.mock(KotlinComponent.class);
    }

    @Test
    public void canMockExecuteMethod() throws Exception {
        KotlinComponent mock = Mockito.mock(KotlinComponent.class);
        Mockito.when(mock.execute()).thenReturn("Mocked response");
        Assert.assertEquals("Mocked response", mock.execute());
    }
}
