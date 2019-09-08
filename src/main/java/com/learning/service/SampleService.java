package com.learning.service;

import java.util.stream.Stream;

import com.learning.model.UserDetail;

public interface SampleService {
	public Stream<UserDetail> getAll();
}