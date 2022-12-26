package com.codefarm.codefarmer.domain.board;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.board.QReplyDTO is a Querydsl Projection type for ReplyDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QReplyDTO extends ConstructorExpression<ReplyDTO> {

    private static final long serialVersionUID = -41954297L;

    public QReplyDTO(com.querydsl.core.types.Expression<Long> replyId, com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<String> memberNickName, com.querydsl.core.types.Expression<String> replyContent, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate) {
        super(ReplyDTO.class, new Class<?>[]{long.class, long.class, long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, replyId, boardId, memberId, memberNickName, replyContent, createdDate, updateDate);
    }

}

