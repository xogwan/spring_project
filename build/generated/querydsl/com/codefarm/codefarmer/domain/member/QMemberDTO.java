package com.codefarm.codefarmer.domain.member;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.member.QMemberDTO is a Querydsl Projection type for MemberDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMemberDTO extends ConstructorExpression<MemberDTO> {

    private static final long serialVersionUID = 1716358971L;

    public QMemberDTO(com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<String> memberName, com.querydsl.core.types.Expression<String> memberNickname, com.querydsl.core.types.Expression<String> memberPhone, com.querydsl.core.types.Expression<String> memberLocation, com.querydsl.core.types.Expression<String> memberBirth, com.querydsl.core.types.Expression<String> memberEmail, com.querydsl.core.types.Expression<String> memberOauthId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.MemberType> memberType) {
        super(MemberDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, com.codefarm.codefarmer.type.MemberType.class}, memberId, memberName, memberNickname, memberPhone, memberLocation, memberBirth, memberEmail, memberOauthId, memberType);
    }

}

