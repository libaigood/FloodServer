package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.StcdDao;
import com.bzh.floodserver.model.Stcd;
import com.bzh.floodserver.service.StcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StcdServiceImpl implements StcdService {

	private final StcdDao stcdDao;

	@Autowired
	public StcdServiceImpl(StcdDao stcdDao) {
		this.stcdDao = stcdDao;
	}

	@Override
	public List<Stcd> getStcd() {
		return stcdDao.getStcd();
	}
}
