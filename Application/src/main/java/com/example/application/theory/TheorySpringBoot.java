package com.example.application.theory;

public class TheorySpringBoot {

	//Configuration
	
	//So we have meta Inf folder and there we have spring.factories in which all the configurations
	//are being already implemented , so whatever dependency we use , this spring.factory will scan
	//the class path and once it is found the dependency , suppose for data jpa , then it will
	//accordingly enable or disable the configuration written in it , so if we want to explore we 
	//can see in the meta inf folder spring.factories where the configurations are already done  
	//have to just add the dependency and enjoy the auto configuration thing , also if we will see
	//in the maven dependency , we will see that all the dependencies are already added there and
	//there all jars will be present , inside that jar there will be meta inf folder and from
	//that folder it will check whether to enable the jar or not as per we have added 
	//the dependency or not
	
	//Ways to initialise springboot app
	
	//@springboot annotation compromises of three annotaion , @Componentscan , @EnableAutoconfigure
	//and @Configuration
	
	
	
}
