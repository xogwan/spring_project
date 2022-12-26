package com.codefarm.codefarmer.domain.board;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.board.QBoardDTO is a Querydsl Projection type for BoardDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBoardDTO extends ConstructorExpression<BoardDTO> {

    private static final long serialVersionUID = 1998431883L;

    public QBoardDTO(com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> boardTitle, com.querydsl.core.types.Expression<String> boardContent, com.querydsl.core.types.Expression<Integer> boardViewCount, com.querydsl.core.types.Expression<String> memberNickName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updatedDate) {
        super(BoardDTO.class, new Class<?>[]{long.class, String.class, String.class, int.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, boardId, boardTitle, boardContent, boardViewCount, memberNickName, createdDate, updatedDate);
    }

    public QBoardDTO(com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> boardTitle, com.querydsl.core.types.Expression<String> boardContent, com.querydsl.core.types.Expression<Integer> boardViewCount, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(BoardDTO.class, new Class<?>[]{long.class, String.class, String.class, int.class, java.time.LocalDateTime.class}, boardId, boardTitle, boardContent, boardViewCount, createdDate);
    }

    public QBoardDTO(com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> boardTitle, com.querydsl.core.types.Expression<String> boardContent, com.querydsl.core.types.Expression<Integer> boardViewCount, com.querydsl.core.types.Expression<String> memberNickName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updatedDate, com.querydsl.core.types.Expression<Integer> replyCount) {
        super(BoardDTO.class, new Class<?>[]{long.class, String.class, String.class, int.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, int.class}, boardId, boardTitle, boardContent, boardViewCount, memberNickName, createdDate, updatedDate, replyCount);
    }

}

