package com.codefarm.codefarmer.domain.chat;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.chat.QChatDTO is a Querydsl Projection type for ChatDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QChatDTO extends ConstructorExpression<ChatDTO> {

    private static final long serialVersionUID = 711800955L;

    public QChatDTO(com.querydsl.core.types.Expression<Long> chatId, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.chat.ChatRoom> chatRoom, com.querydsl.core.types.Expression<String> chatMessage, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ChatStatus> chatStatus, com.querydsl.core.types.Expression<java.time.LocalDateTime> chatDate, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.member.Member> member, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<String> nickName, com.querydsl.core.types.Expression<Long> roomId) {
        super(ChatDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.entity.chat.ChatRoom.class, String.class, com.codefarm.codefarmer.type.ChatStatus.class, java.time.LocalDateTime.class, com.codefarm.codefarmer.entity.member.Member.class, long.class, String.class, long.class}, chatId, chatRoom, chatMessage, chatStatus, chatDate, member, memberId, nickName, roomId);
    }

}

