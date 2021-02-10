/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

package org.odpi.openmetadata.accessservices.analyticsmodeling.synchronization.model;

import java.util.ArrayList;
import java.util.List;

/**
 *	MetadataItem is an abstraction of something that references source of
 *	simple data that have same type like integer, string, etc.
 *
 */
public class MetadataItem extends AnalyticsMetadata {

	private String expression;
	private String dataType;

	/**
	 * Nested items.
	 * OLAP hierarchy/levels/members.
	 * DATE, TIMESTAMP consist of smaller items.
	 */
	private List<MetadataItem> items;

	/**
	 * Get the nested data.
	 * @return the items.
	 */
	public List<MetadataItem> getItem() {
		return items;
	}
	/**
	 * Set all nested items.
	 * @param items the items to set.
	 */
	public void setItem(List<MetadataItem> items) {
		this.items = items;
	}
	
	/**
	 * Add single nested item.
	 * @param item to add.
	 */
	public void addItem(MetadataItem item) {
		if (items == null) {
			items = new ArrayList<>();
		}
		items.add(item);
	}

	public MetadataItem removeItem(int index) {
		if (items != null && items.size() > index) {
			return items.remove(index);
		}
		return null;
	}

	public MetadataItem getItem(int index) {
		if (items != null && items.size() > index) {
			return items.get(index);
		}
		return null;
	}
	
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	@Override
	public void convertProperties() {
	}
}
