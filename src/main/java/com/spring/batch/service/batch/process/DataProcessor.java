package com.spring.batch.service.batch.process;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.spring.batch.service.entity.UserEntity;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataProcessor implements ItemProcessor<UserEntity, UserEntity> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public DataProcessor() {
		DEPT_NAMES.put("101", "Technology");
		DEPT_NAMES.put("102", "Operations");
		DEPT_NAMES.put("103", "Accounts");
		DEPT_NAMES.put("104", "Finance");
		DEPT_NAMES.put("105", "Helpdesk");
	}

	@Override
	public UserEntity process(UserEntity userEntity) throws Exception {
		String deptCode = userEntity.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		userEntity.setDept(dept);
		userEntity.setLocalDateTime(LocalDateTime.now());
		log.info(String.format("Converted from [%s] to [%s]", deptCode, dept));
		return userEntity;
	}

}
