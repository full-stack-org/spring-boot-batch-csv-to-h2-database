package com.spring.batch.service.batch.process;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.batch.service.entity.UserEntity;
import com.spring.batch.service.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DBWriter implements ItemWriter<UserEntity> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends UserEntity> items) throws Exception {
		log.info("Saving the Users to Database is {} ", items);
		userRepository.saveAll(items);
	}

}
