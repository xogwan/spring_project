package com.codefarm.codefarmer.domain.notice;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.notice.QNoticeDTO is a Querydsl Projection type for NoticeDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QNoticeDTO extends ConstructorExpression<NoticeDTO> {

    private static final long serialVersionUID = -12416773L;

    public QNoticeDTO(com.querydsl.core.types.Expression<Long> noticeId, com.querydsl.core.types.Expression<String> noticeTitle, com.querydsl.core.types.Expression<String> noticeContent, com.querydsl.core.types.Expression<Integer> noticeViewCount, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate) {
        super(NoticeDTO.class, new Class<?>[]{long.class, String.class, String.class, int.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, noticeId, noticeTitle, noticeContent, noticeViewCount, createdDate, updateDate);
    }

}

