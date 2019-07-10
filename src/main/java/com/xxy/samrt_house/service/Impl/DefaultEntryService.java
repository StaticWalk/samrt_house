package com.xxy.samrt_house.service.Impl;

import com.xxy.samrt_house.VO.ResponseVO;
import com.xxy.samrt_house.entity.Entry;
import com.xxy.samrt_house.repository.EntryRepository;
import com.xxy.samrt_house.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by xiongxiaoyu
 * Data:2019/7/10
 * Des:
 */
@Service
public class DefaultEntryService implements EntryService {

	@Autowired
	EntryRepository entryRepository;

	@Override
	public ResponseVO infoBack() {

		ResponseVO responseVO = new ResponseVO();

		List<Entry> entries = entryRepository.findAll();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


		String[] time = new String[10];
		float[] temperature = new float[10];
		float[] humidity = new float[10];

		//遍历给ResponseVO
		for (int i = 0; i < entries.size(); i++) {
			time[i] = format.format(entries.get(i).getTime());
			temperature[i] = entries.get(i).getTemperature();
			humidity[i] = entries.get(i).getHumidity();
		}
		responseVO.setTime(time);
		responseVO.setTemperature(temperature);
		responseVO.setHumidity(humidity);

		return responseVO;
	}
}
