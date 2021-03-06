package com.ynyes.lyz.interfaces.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ynyes.lyz.interfaces.entity.TdTbwBackRecD;

public interface TdTbwBackRecDRepo extends PagingAndSortingRepository<TdTbwBackRecD, Long> ,JpaSpecificationExecutor<TdTbwBackRecD>
{
	List<TdTbwBackRecD> findByCRecNo(String recNo);
}
