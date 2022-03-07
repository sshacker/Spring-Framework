package com.sshacker.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class People {
	private List<String> friends;
	private Map<String, String> feeStructures;
	private Properties dbConfigs;

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

	@Override
	public String toString() {
		return "People [friends=" + friends + ", feeStructures=" + feeStructures + ", dbConfigs=" + dbConfigs + "]";
	}

}
