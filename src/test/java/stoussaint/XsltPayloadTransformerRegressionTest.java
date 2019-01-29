package stoussaint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.integration.xml.transformer.XsltPayloadTransformer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class XsltPayloadTransformerRegressionTest {

    @Autowired
    private XsltPayloadTransformer xsltPayloadTransformer;

    @Test
    public void assertXsltPayloadTransformerSuccessfullyCreated() {
        assertThat(xsltPayloadTransformer, notNullValue());
    }

    @Configuration
    static class TestConfiguration {

        @Bean
        public XsltPayloadTransformer xsltPayloadTransformer() {
            return new XsltPayloadTransformer(new ClassPathResource("stoussaint/empty.xsl"));
        }
    }
}