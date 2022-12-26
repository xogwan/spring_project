package com.codefarm.codefarmer.domain.inquire;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.inquire.QInquireDTO is a Querydsl Projection type for InquireDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QInquireDTO extends ConstructorExpression<InquireDTO> {

    private static final long serialVersionUID = 1499328689L;

    public QInquireDTO(com.querydsl.core.types.Expression<Long> inquireId, com.querydsl.core.types.Expression<String> inquireQTitle, com.querydsl.core.types.Expression<String> inquireQContent, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> inquireStatus, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(InquireDTO.class, new Class<?>[]{long.class, String.class, String.class, com.codefarm.codefarmer.type.Status.class, long.class, java.time.LocalDateTime.class}, inquireId, inquireQTitle, inquireQContent, inquireStatus, memberId, createdDate);
    }

}

