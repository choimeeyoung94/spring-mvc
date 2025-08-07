package org.shark.pagination.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.shark.pagination.model.dto.PageDTO;
import org.shark.pagination.model.dto.UserDTO;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UserDAO {
  
  private final SqlSessionTemplate sqlSession;
  
  public List<UserDTO> getUsers(PageDTO dto) {
    return sqlSession.selectList("mybatis.mapper.userMapper.getUsers", dto);
  }
  
  public Integer getUserCount() {
    return sqlSession.selectOne("mybatis.mapper.userMapper.getUserCount");
  }
  
  
  
}
