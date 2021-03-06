/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.test.hooks;

/**
 * @author  Neil Griffin
 */
public class PortalPage {

	private String name;
	private String[] portletIds;
	private String layoutTemplateId = "2_columns_i";

	public PortalPage(String name, String portletId) {
		this.name = name;
		this.portletIds = new String[] { portletId };
	}

	public PortalPage(String name, String[] portletNames) {
		this.name = name;
		this.portletIds = portletNames;
	}

	public PortalPage(String name, String portletId, String layoutTemplateId) {
		this.name = name;
		this.portletIds = new String[] { portletId };
		this.layoutTemplateId = layoutTemplateId;
	}

	public String getLayoutTemplateId() {
		return layoutTemplateId;
	}

	public String getName() {
		return name;
	}

	public String[] getPortletIds() {
		return portletIds;
	}
}
