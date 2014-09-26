package org.sample.controller.pojos;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class CreateTeamForm {


    private Long id;
    @NotNull
    private String teamName;
    private Date createDate;
    
    public String getTeamName() {
    	return teamName;
    }
    
    public void setTeamName(String teamName) {
    	this.teamName = teamName;
    }
    
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
