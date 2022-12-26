package com.codefarm.codefarmer.domain.program;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.program.QMemberProgramDTO is a Querydsl Projection type for MemberProgramDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMemberProgramDTO extends ConstructorExpression<MemberProgramDTO> {

    private static final long serialVersionUID = -889791479L;

    public QMemberProgramDTO(com.querydsl.core.types.Expression<Long> programApplyId, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.program.Program> program, com.querydsl.core.types.Expression<? extends com.codefarm.codefarmer.entity.member.Member> member, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ProgramStatus> programStatus, com.querydsl.core.types.Expression<Integer> programApplyCount, com.querydsl.core.types.Expression<Integer> programPayment, com.querydsl.core.types.Expression<String> programApplyName, com.querydsl.core.types.Expression<String> programApplyPhoneNum, com.querydsl.core.types.Expression<String> programApplyEmail, com.querydsl.core.types.Expression<String> programApplyLocation, com.querydsl.core.types.Expression<java.time.LocalDateTime> programApplyBirth) {
        super(MemberProgramDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.entity.program.Program.class, com.codefarm.codefarmer.entity.member.Member.class, com.codefarm.codefarmer.type.ProgramStatus.class, int.class, int.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class}, programApplyId, program, member, programStatus, programApplyCount, programPayment, programApplyName, programApplyPhoneNum, programApplyEmail, programApplyLocation, programApplyBirth);
    }

    public QMemberProgramDTO(com.querydsl.core.types.Expression<Long> programApplyId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ProgramStatus> programStatus, com.querydsl.core.types.Expression<Integer> programApplyCount, com.querydsl.core.types.Expression<Integer> programPayment, com.querydsl.core.types.Expression<String> programApplyName, com.querydsl.core.types.Expression<String> programApplyPhoneNum, com.querydsl.core.types.Expression<String> programApplyEmail, com.querydsl.core.types.Expression<String> programApplyLocation, com.querydsl.core.types.Expression<java.time.LocalDateTime> programApplyBirth) {
        super(MemberProgramDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.type.ProgramStatus.class, int.class, int.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class}, programApplyId, programStatus, programApplyCount, programPayment, programApplyName, programApplyPhoneNum, programApplyEmail, programApplyLocation, programApplyBirth);
    }

    public QMemberProgramDTO(com.querydsl.core.types.Expression<Long> programApplyId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ProgramStatus> programStatus, com.querydsl.core.types.Expression<Integer> programPayment, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate, com.querydsl.core.types.Expression<String> programTitle) {
        super(MemberProgramDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.type.ProgramStatus.class, int.class, java.time.LocalDateTime.class, String.class}, programApplyId, programStatus, programPayment, updateDate, programTitle);
    }

    public QMemberProgramDTO(com.querydsl.core.types.Expression<Long> programApplyId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ProgramStatus> programStatus, com.querydsl.core.types.Expression<Integer> programApplyCount, com.querydsl.core.types.Expression<Integer> programPayment, com.querydsl.core.types.Expression<String> programApplyName, com.querydsl.core.types.Expression<String> programApplyPhoneNum, com.querydsl.core.types.Expression<String> programApplyEmail, com.querydsl.core.types.Expression<String> programApplyLocation, com.querydsl.core.types.Expression<java.time.LocalDateTime> programApplyBirth, com.querydsl.core.types.Expression<String> programTitle, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.ProgramType> programType, com.querydsl.core.types.Expression<Long> programId, com.querydsl.core.types.Expression<Integer> programPrice) {
        super(MemberProgramDTO.class, new Class<?>[]{long.class, com.codefarm.codefarmer.type.ProgramStatus.class, int.class, int.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class, String.class, com.codefarm.codefarmer.type.ProgramType.class, long.class, int.class}, programApplyId, programStatus, programApplyCount, programPayment, programApplyName, programApplyPhoneNum, programApplyEmail, programApplyLocation, programApplyBirth, programTitle, programType, programId, programPrice);
    }

}

