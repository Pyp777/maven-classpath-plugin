package classpath;

import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Install: mvn install
 * Execute: mvn maven.classpath.plugin:maven-classpath-plugin:0.0.1:export
 * 
 * @author pavel
 *
 */
@Mojo(name = "export", defaultPhase = LifecyclePhase.COMPILE)
public class ClassPathPlugin extends AbstractMojo {
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("ClassPathPlugin.execute()");

		Map map = getPluginContext();
		for (Object entry : map.keySet()) {
			Object value = map.get(entry);
			System.out.println(entry.toString() + "=" + value.toString());
		}
	}

}
