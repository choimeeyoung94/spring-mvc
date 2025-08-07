package org.shark.pagination.util;

import org.shark.pagination.model.dto.PageDTO;
import org.springframework.stereotype.Component;

/**
 * 페이징 계산, 페이징 UI(HTML) 생성 유틸리티 클래스
 * */
@Component
public class PageUtil {
  // 한 블록 당 표시할 페이지의 개수
   private static final int PAGE_PER_BLOCK = 10;

   /**
    * 페이징 정보를 계산해서 PageDTO에 저장하는 메소드
    * */
   public void calculatePaging(PageDTO dto) {
      int page = dto.getPage();
      int size = dto.getSize();
      int itemCount = dto.getItemCount();
      
      int offset = (page - 1) * size;
      int pageCount = (int) Math.ceil((double) itemCount / size);
      int beginPage = ((page - 1) / PAGE_PER_BLOCK) * PAGE_PER_BLOCK + 1;
      int endPage = Math.min(beginPage + PAGE_PER_BLOCK - 1, pageCount);
      
      dto.setOffset(offset);
      dto.setPageCount(pageCount);
      dto.setBeginPage(beginPage);
      dto.setEndPage(endPage);      
   }
   
   /*
    * 페이지 이동 링크(HTML) 생성
    * 
    * 
    * */
   public String getPaginHtml() {
     return null;
   }
   
   
   
}
