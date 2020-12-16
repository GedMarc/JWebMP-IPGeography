package com.jwebmp.plugins.security.ipgeography.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class GeoBytesModuleExclusions
		implements IGuiceScanModuleExclusions<GeoBytesModuleExclusions>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.security.ipgeography");
		return strings;
	}
}
