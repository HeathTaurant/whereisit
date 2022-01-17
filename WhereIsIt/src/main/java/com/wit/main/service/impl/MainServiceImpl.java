package com.wit.main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wit.main.service.MainService;
import com.wit.main.service.MainVO;

@Service("mainService")
public class MainServiceImpl implements MainService {


	@Resource(name="mainMapper")
	private MainMapper dao;

	@Override
	public List<MainVO> getDBCheckList() {
		return dao.getDBCheckList();
	}
	
	@Override
	public int updateDBCheckList(MainVO vo) {
		return dao.updateDBCheckList(vo);
	}
}
