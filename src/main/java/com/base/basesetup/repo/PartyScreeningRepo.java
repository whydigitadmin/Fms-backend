package com.base.basesetup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.base.basesetup.entity.PartyScreeningVO;

@Repository
public interface PartyScreeningRepo extends JpaRepository<PartyScreeningVO, Long>{

	@Query(nativeQuery = true,value = "select * from partyscreening where partyscreeningid=?1")
	List<PartyScreeningVO> getPartyScreeningById(Long id);

	@Query(nativeQuery = true,value = "select * from partyscreening where orgid=?1")
	List<PartyScreeningVO> getPartyScreeningByOrgId(Long orgid);

	boolean existsByEntityNameAndOrgId(String entityName, long orgId);


	boolean existsByUniqueIdAndOrgId(long uniqueId, long orgId);

	boolean existsByIncludeAliasAndOrgId(String includeAlias, long orgId);


	boolean existsByAlternativeEntityNamesAndOrgId(String alternativeEntityNames, long orgId);

	boolean existsByScreeningStatusAndOrgId(String screeningStatus, long orgId);

}
