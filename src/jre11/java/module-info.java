module com.jwebmp.plugins.security.ipgeography {

	exports com.jwebmp.plugins.security.ipgeography;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.google.guice;
	requires com.fasterxml.jackson.databind;
	requires com.google.guice.extensions.servlet;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.interception;
	requires com.guicedee.guicedservlets.websockets;


	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.security.ipgeography.IPGeographyPageConfigurator;
	provides com.guicedee.guicedservlets.websockets.services.IWebSocketAuthDataProvider with com.jwebmp.plugins.security.ipgeography.implementations.GeoBytesDataWSAuth;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.security.ipgeography.implementations.GeoBytesModuleExclusions;

	opens com.jwebmp.plugins.security.ipgeography to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind;
	//opens com.jwebmp.plugins.security.ipgeography.services to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind;
	opens com.jwebmp.plugins.security.ipgeography.implementations to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind;
}
