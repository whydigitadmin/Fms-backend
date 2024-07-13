package com.base.basesetup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.basesetup.entity.ContainerDetailsSIVO;
import com.base.basesetup.entity.PreAlertSIVO;

@Repository
public interface ContainerDetailsSIRepo extends JpaRepository<ContainerDetailsSIVO, Long>{

	List<ContainerDetailsSIVO> findByPreAlertSIVO(PreAlertSIVO preAlertSIVO);

}