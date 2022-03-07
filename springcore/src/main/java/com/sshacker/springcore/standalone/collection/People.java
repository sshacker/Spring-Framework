package com.sshacker.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class People {
	private List<String> friends;
	private Map<String, String> feeStructures;

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

	@Override
	public String toString() {
		return "People [friends=" + friends + ", feeStructures=" + feeStructures + "]";
	}
	
	
}
