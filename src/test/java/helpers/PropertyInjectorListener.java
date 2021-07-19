package helpers;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertyInjectorListener implements IConfigurationListener2, IExecutionListener, IAlterSuiteListener, IAnnotationTransformer, IInvokedMethodListener, ITestListener, IReporter {
    @Override
    public void alter(List<XmlSuite> suites) {
        // Why am I don't get first suites? because there are more than one apartment
        for (XmlSuite s : suites) {
//            XmlSuite suite = suites.get(0);
            Properties properties = new Properties();
            try {
                properties.load(new FileReader("src/test/resources/application.properties"));
            } catch (IOException e) {
                Print.d("!!! Load property file error \n" + e.getMessage());
            }
            Map<String, String> params = new HashMap<>();
            for (Map.Entry<Object, Object> each : properties.entrySet()) {
                params.put(each.getKey().toString(), each.getValue().toString());

            }
            s.setParameters(params);
        }
    }
}