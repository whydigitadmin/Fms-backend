package com.base.basesetup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.base.basesetup.entity.ShipmentAOVO;

@Repository
public interface ShipmentAORepo extends JpaRepository<ShipmentAOVO, Long> {

	@Query(nativeQuery = true, value = "select * from t_aesohdr where shipmentaoid=?1")
	List<ShipmentAOVO> findShipmentAOById(Long id);

	@Query(nativeQuery = true, value = "select * from t_aesohdr where orgid=?1")
	List<ShipmentAOVO> getShipmentAOByOrgId(Long orgid);

	@Query(nativeQuery = true, value = "CALL next_sequence_shipmentao_value()")
	void getbydocsid();

	@Query(nativeQuery = true, value = "select sequence_value from docsidseq")
	int finddocid();

	@Query(nativeQuery = true, value = "select * from t_aesohdr where shipmentaoid=?1")
	List<ShipmentAOVO> findShipmentFollowUpById(Long id);

	@Query(nativeQuery = true, value = "select * from t_aesohdr where orgid=?1")
	List<ShipmentAOVO> getShipmentFollowUpByOrgId(Long orgid);

	@Query(nativeQuery = true, value = "select * from t_aesohdr where docid=?1")
	ShipmentAOVO getShipmentFollowUpByDocId(String docId);

}