import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlMap {
	
	public void generator() throws Exception{
		
		 List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		  // File configFile = new File("lib/generatorConfig.xml");
		   File configFile = new File("lib/generatorConfig2.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try{
		GeneratorSqlMap generatorSqlMap=new GeneratorSqlMap();
		generatorSqlMap.generator();
		System.out.println("代码生成成功");
		}catch(Exception e){
			e.printStackTrace();
			
		}
		

	}

}
