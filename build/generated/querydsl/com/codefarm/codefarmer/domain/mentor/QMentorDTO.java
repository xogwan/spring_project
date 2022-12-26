package com.codefarm.codefarmer.domain.mentor;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.mentor.QMentorDTO is a Querydsl Projection type for MentorDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMentorDTO extends ConstructorExpression<MentorDTO> {

    private static final long serialVersionUID = -1367562981L;

    public QMentorDTO(com.querydsl.core.types.Expression<Long> mentorId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<String> memberName, com.querydsl.core.types.Expression<String> memberNickname, com.querydsl.core.types.Expression<String> mentorYear, com.querydsl.core.types.Expression<String> memberLocation, com.querydsl.core.types.Expression<Integer> programCount, com.querydsl.core.types.Expression<Integer> menteeCount) {
        super(MentorDTO.class, new Class<?>[]{long.class, long.class, String.class, String.class, String.class, String.class, int.class, int.class}, mentorId, memberId, memberName, memberNickname, mentorYear, memberLocation, programCount, menteeCount);
    }

    public QMentorDTO(com.querydsl.core.types.Expression<Long> mentorId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.member.Member> farmerType, com.querydsl.core.types.Expression<String> mentorCrop, com.querydsl.core.types.Expression<String> mentorYear) {
        super(MentorDTO.class, new Class<?>[]{long.class, long.class, com.codefarm.codefarmer.entity.member.Member.class, String.class, String.class}, mentorId, memberId, farmerType, mentorCrop, mentorYear);
    }

    public QMentorDTO(com.querydsl.core.types.Expression<String> mentorCrop, com.querydsl.core.types.Expression<String> mentorYear, com.querydsl.core.types.Expression<String> memberLocation, com.querydsl.core.types.Expression<String> memberNickname) {
        super(MentorDTO.class, new Class<?>[]{String.class, String.class, String.class, String.class}, mentorCrop, mentorYear, memberLocation, memberNickname);
    }

}

