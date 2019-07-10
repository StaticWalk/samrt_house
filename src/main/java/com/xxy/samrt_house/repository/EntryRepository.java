package com.xxy.samrt_house.repository;

import com.xxy.samrt_house.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiongxiaoyu
 * Data:2019/7/10
 * Des:
 * @author xiongxiaoyu
 */

@Repository
public interface EntryRepository extends JpaRepository<Entry,String> {

	@Override
	@Query(value = " select *  from entry order by id desc LIMIT 10",nativeQuery = true)
	List<Entry> findAll();
}
