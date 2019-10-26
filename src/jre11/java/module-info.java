module com.jwebmp.plugins.security.ipgeography {

	requires com.jwebmp.core;
	requires java.validation;
	requires com.google.guice;
	requires com.fasterxml.jackson.databind;
	requires com.google.guice.extensions.servlet;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.interception;
	requires com.jwebmp.websockets;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.security.ipgeography.IPGeographyPageConfigurator;
	provides com.jwebmp.websockets.services.IWebSocketAuthDataProvider with com.jwebmp.plugins.security.ipgeography.implementations.GeoBytesDataWSAuth;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.security.ipgeography.implementations.GeoBytesModuleExclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.security.ipgeography.implementations.GeoBytesModuleExclusions;

	opens com.jwebmp.plugins.security.ipgeography to com.google.guice,com.jwebmp.core;
	opens com.jwebmp.plugins.security.ipgeography.implementations  to com.google.guice,com.jwebmp.core;
}
