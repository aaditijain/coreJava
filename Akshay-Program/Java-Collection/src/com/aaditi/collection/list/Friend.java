package com.aaditi.collection.list;

public class Friend  implements Comparable<Friend> 
{
private int id;

private String name;

public Friend(int id,String name)
{
	
	this.id=id;
	this.name=name;
}
	@Override
	public int compareTo(Friend friend) 
	{
		if(this.id==friend.id)
		{
		return(this.getName().compareTo(friend.name));	
	}else if(this.id>friend.id)
	{
		return 1;
	}else if(this.id<friend.id)
	{
		return -1;
	}
		return 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
