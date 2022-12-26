package com.codefarm.codefarmer.domain.chat;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.chat.QChatRoomDTO is a Querydsl Projection type for ChatRoomDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QChatRoomDTO extends ConstructorExpression<ChatRoomDTO> {

    private static final long serialVersionUID = 1551245216L;

    public QChatRoomDTO(com.querydsl.core.types.Expression<Long> chatRoomId, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.member.Member> mentor, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.member.Member> mentee, com.querydsl.core.types.Expression<java.time.LocalDateTime> chatDate) {
        super(ChatRoomDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.entity.member.Member.class, com.codefarm.codefarmer.entity.member.Member.class, java.time.LocalDateTime.class}, chatRoomId, mentor, mentee, chatDate);
    }

}

