package com.prodemy.boot.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Banner {
	@Id
	@Column("ID")
	private Integer id;
	
	@Column("BANNERNAME")
	private String bannerName;
	
	@Column("BANNERIMAGE")
	private String bannerImage;
	
	@Column("DESCRIPTION")
	private String description;
	


}
