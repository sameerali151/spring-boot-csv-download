package com.learning.service;

import java.util.stream.Stream;

import com.learning.model.UserDetail;
import com.learning.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	private SampleRepository sampleRepository;

	@Override
	@Transactional(readOnly = true)
	public Stream<UserDetail> getAll() {
		return sampleRepository.getAll();
	}
}
