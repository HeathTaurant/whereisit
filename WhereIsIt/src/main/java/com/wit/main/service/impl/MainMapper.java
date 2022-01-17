package com.wit.main.service.impl;

import java.util.List;

import com.wit.main.service.MainVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;


@Mapper("mainMapper")
public interface MainMapper {
	
	List<MainVO> getDBCheckList();
	int updateDBCheckList(MainVO vo);
}
