package com.spring.batch.service.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private LocalDateTime localDateTime;

}
