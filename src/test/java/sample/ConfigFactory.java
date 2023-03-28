package sample;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

@LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({ "system:properties", "system:env", "file:${user.dir}/src/test/resources/config.properties" })

public interface ConfigFactory extends Config{

	@Key("username")
	String username();
	
	@Key("password")
	String password();
	
}
