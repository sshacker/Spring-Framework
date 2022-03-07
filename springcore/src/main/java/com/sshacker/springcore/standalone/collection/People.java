package com.sshacker.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class People {
	private List<String> friends;
	private Map<String, String> feeStructures;
	private Properties dbConfigs;
	private Set<String> colors;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getFeeStructures() {
		return feeStructures;
	}

	public void setFeeStructures(Map<String, String> feeStructures) {
		this.feeStructures = feeStructures;
	}

	public Properties getDbConfigs() {
		return dbConfigs;
	}

	public void setDbConfigs(Properties dbConfigs) {
		this.dbConfigs = dbConfigs;
	}

	public Set<String> getColors() {
		return colors;
	}

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "People [friends=" + friends + ", feeStructures=" + feeStructures + ", dbConfigs=" + dbConfigs
				+ ", colors=" + colors + "]";
	}

}
