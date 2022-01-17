package com.wit.main.service;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface MainService {

	List<MainVO> getDBCheckList();
	int updateDBCheckList(MainVO vo);

}
