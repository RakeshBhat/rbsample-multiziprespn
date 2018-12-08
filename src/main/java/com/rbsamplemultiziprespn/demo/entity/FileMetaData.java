package com.rbsamplemultiziprespn.demo.entity;

public class FileMetaData {

	String name;
	String topic;
	String type;
	String creationDate;
	String author;
	String lastUpdateDate;
	String lastUpdateBy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	@Override
	public String toString() {
		return String.format(
				"FileMetaData [name=%s, topic=%s, type=%s, creationDate=%s, author=%s, lastUpdateDate=%s, lastUpdateBy=%s]",
				name, topic, type, creationDate, author, lastUpdateDate, lastUpdateBy);
	}
	
	
}
