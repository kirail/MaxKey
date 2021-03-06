package org.maxkey.dao.service;

import org.apache.mybatis.jpa.persistence.JpaBaseService;
import org.maxkey.dao.persistence.RoleMemberMapper;
import org.maxkey.domain.RoleMember;
import org.springframework.stereotype.Service;

@Service
public class RoleMemberService  extends JpaBaseService<RoleMember>{
	
	public RoleMemberService() {
		super(RoleMemberMapper.class);
	}
	
	/* (non-Javadoc)
	 * @see com.connsec.db.service.BaseService#getMapper()
	 */
	@Override
	public RoleMemberMapper getMapper() {
		// TODO Auto-generated method stub
		return (RoleMemberMapper)super.getMapper();
	}
}
