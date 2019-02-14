package com.jaehong.repository;

import com.jaehong.domain.Board;
import com.jaehong.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
    List<Board> findAllByOrderByIdxDesc();
}
