package org.shark.pagination.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.shark.pagination.model.dto.PageDTO;
import org.shark.pagination.model.dto.UserDTO;
import org.shark.pagination.repository.UserDAO;
import org.shark.pagination.util.PageUtil;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
  private final UserDAO userDAO;
  private final PageUtil pageUtil;
  
  
  @Override
  public Map<String, Object> getUsers(PageDTO dto, HttpServletRequest request) {
    // 파라미터 sort 받기 (디폴트 DESC)
    Optional<String> optSort = Optional.ofNullable(request.getParameter("sort"));
    String sort = optSort.orElse("DESC");
    
    
    
    
    // 전체 항목의 개수를 PageDTO 객체에 저장
    int itemCount = userDAO.getUserCount();
    dto.setItemCount(itemCount);
    // 페이징 정보 계산해서 PageDTO 객체에 저장하기 (PageDTO 객체에 페이징 위한 모든 정보가 저장된다)
    pageUtil.calculatePaging(dto);
    List<UserDTO> users = userDAO.getUsers(dto);
    String pagingHTML = pageUtil.getPaginHtml(dto, request.getContextPath() +  "/user/list", null);
    // 결과 반환
    return Map.of("users", users, "pagingHTML", pagingHTML);
  }
}
