package com.jwebmp.plugins.security.ipgeography.implementations;

import com.jwebmp.core.htmlbuilder.ContentSecurityPolicy;
import com.guicedee.guicedinjection.GuiceContext;
import com.guicedee.logger.LogFactory;
import com.guicedee.guicedservlets.websockets.WebSocketsConfiguration;
import com.guicedee.guicedservlets.websockets.services.IWebSocketAuthDataProvider;

import java.util.logging.Level;
import java.util.logging.Logger;


public class GeoBytesDataWSAuth
		implements IWebSocketAuthDataProvider<GeoBytesDataWSAuth>
{
	private static final Logger log = LogFactory.getLog("GeoBytesDataWSAuth");
	@SuppressWarnings("unchecked")
	@Override
	public StringBuilder getJavascriptToPopulate()
	{
		try
		{
			GuiceContext.get(ContentSecurityPolicy.class)
			            .getConnectSrc()
			            .add("json.geoiplookup.io");
		}
		catch (Exception e)
		{
			log.log(Level.WARNING, "Not in request scope for content security geodata policy update", e);
		}
		return new StringBuilder(" $.getJSON('https://json.geoiplookup.io', function(data) {" +
		                         "data.localstorage = jw.localstorage['jwamsmk'];" +
		                         "jw.websocket.newMessage('GeoData',data);" +
		                         "});");
	}

	@Override
	public String name()
	{
		return "GeoNameData";
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
