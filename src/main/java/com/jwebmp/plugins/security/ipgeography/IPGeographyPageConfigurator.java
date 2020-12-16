package com.jwebmp.plugins.security.ipgeography;

import com.google.inject.Singleton;
import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@Singleton
@PluginInformation(pluginName = "GeoJson ",
		pluginUniqueName = "geo-ip",
		pluginDescription = "Uses the https://json.geoiplookup.io/ ip locator service and provides the details over the websocket",
		pluginVersion = "1.0",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "geography,ip,location,security",
		pluginSubtitle = "the https://json.geoiplookup.io/ ip locator service ",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-IPGeography",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-IPGeography",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-IPGeography/wiki",
		pluginOriginalHomepage = "https://json.geoiplookup.io/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.security/jwebmp-plugins-ip-geography-security",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginGroupId = "com.jwebmp.plugins.security",
		pluginArtifactId = "jwebmp-plugins-ip-geography-security",
		pluginModuleName = "com.jwebmp.plugins.security.ipgeography",
		pluginStatus = PluginStatus.Released
)
public class IPGeographyPageConfigurator
		implements IPageConfigurator<IPGeographyPageConfigurator>
{
	/**
	 * The local storage
	 */
	private boolean enabled = true;

	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{

		return page;
	}

	@Override
	public boolean enabled()
	{
		return enabled;
	}


	/**
	 * If this page should be rendered with dynamic local storage support
	 *
	 * @return
	 */
	public boolean isEnabled()
	{
		return enabled;
	}

	/**
	 * If the page should be rendered with dynamic local storage support. This renders a default page that is then fetched from the server to support cordova applications
	 *
	 * @param enabled
	 */
	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}
}
