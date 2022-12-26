package com.codefarm.codefarmer.domain.alba;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.alba.QMemberAlbaDTO is a Querydsl Projection type for MemberAlbaDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMemberAlbaDTO extends ConstructorExpression<MemberAlbaDTO> {

    private static final long serialVersionUID = -970853183L;

    public QMemberAlbaDTO(com.querydsl.core.types.Expression<Long> albaId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> memberStatus) {
        super(MemberAlbaDTO.class, new Class<?>[]{long.class, long.class, com.codefarm.codefarmer.type.Status.class}, albaId, memberId, memberStatus);
    }

    public QMemberAlbaDTO(com.querydsl.core.types.Expression<Long> albaApplyId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> memberStatus, com.querydsl.core.types.Expression<String> memberName, com.querydsl.core.types.Expression<String> memberEmail, com.querydsl.core.types.Expression<Long> albaId) {
        super(MemberAlbaDTO.class, new Class<?>[]{long.class, long.class, com.codefarm.codefarmer.type.Status.class, String.class, String.class, long.class}, albaApplyId, memberId, memberStatus, memberName, memberEmail, albaId);
    }

    public QMemberAlbaDTO(com.querydsl.core.types.Expression<Long> albaApplyId, com.querydsl.core.types.Expression<Long> albaId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> memberStatus, com.querydsl.core.types.Expression<java.time.LocalDateTime> albaWorkDate, com.querydsl.core.types.Expression<String> albaMainTitle, com.querydsl.core.types.Expression<Integer> albaPrice, com.querydsl.core.types.Expression<String> albaAddress) {
        super(MemberAlbaDTO.class, new Class<?>[]{long.class, long.class, com.codefarm.codefarmer.type.Status.class, java.time.LocalDateTime.class, String.class, int.class, String.class}, albaApplyId, albaId, memberStatus, albaWorkDate, albaMainTitle, albaPrice, albaAddress);
    }

}

