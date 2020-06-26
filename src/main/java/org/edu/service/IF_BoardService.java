package org.edu.service;

import java.util.List;

import org.edu.vo.BoardVO;

public interface IF_BoardService {
   public void insertBoard(BoardVO boardVO) throws Exception;
   public List<BoardVO> selectBoard() throws Exception;
   public void updateBoardVO(BoardVO boardVO) throws Exception;
   public void deleteBoardVO(Integer bno) throws Exception;
}