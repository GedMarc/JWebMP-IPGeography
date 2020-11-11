package com.jwebmp.plugins.security.ipgeography;

import com.google.inject.Singleton;
import com.jwebmp.core.Page;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@Singleton
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
