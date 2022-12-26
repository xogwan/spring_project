package com.codefarm.codefarmer.domain.inquire;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.inquire.QInquireAnswerDTO is a Querydsl Projection type for InquireAnswerDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QInquireAnswerDTO extends ConstructorExpression<InquireAnswerDTO> {

    private static final long serialVersionUID = -1684057453L;

    public QInquireAnswerDTO(com.querydsl.core.types.Expression<Long> inquireAnswerId, com.querydsl.core.types.Expression<String> inquireAnswer, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.inquire.Inquire> inquire) {
        super(InquireAnswerDTO.class, new Class<?>[]{long.class, String.class, com.codefarm.codefarmer.entity.inquire.Inquire.class}, inquireAnswerId, inquireAnswer, inquire);
    }

}

