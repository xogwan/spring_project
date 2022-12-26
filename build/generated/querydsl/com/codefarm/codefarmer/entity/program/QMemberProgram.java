package com.codefarm.codefarmer.entity.program;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberProgram is a Querydsl query type for MemberProgram
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberProgram extends EntityPathBase<MemberProgram> {

    private static final long serialVersionUID = -1837580331L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberProgram memberProgram = new QMemberProgram("memberProgram");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final QProgram program;

    public final DateTimePath<java.time.LocalDateTime> programApplyBirth = createDateTime("programApplyBirth", java.time.LocalDateTime.class);

    public final NumberPath<Integer> programApplyCount = createNumber("programApplyCount", Integer.class);

    public final StringPath programApplyEmail = createString("programApplyEmail");

    public final NumberPath<Long> programApplyId = createNumber("programApplyId", Long.class);

    public final StringPath programApplyLocation = createString("programApplyLocation");

    public final StringPath programApplyName = createString("programApplyName");

    public final StringPath programApplyPhoneNum = createString("programApplyPhoneNum");

    public final NumberPath<Integer> programPayment = createNumber("programPayment", Integer.class);

    public final EnumPath<com.codefarm.codefarmer.type.ProgramStatus> programStatus = createEnum("programStatus", com.codefarm.codefarmer.type.ProgramStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMemberProgram(String variable) {
        this(MemberProgram.class, forVariable(variable), INITS);
    }

    public QMemberProgram(Path<? extends MemberProgram> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberProgram(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberProgram(PathMetadata metadata, PathInits inits) {
        this(MemberProgram.class, metadata, inits);
    }

    public QMemberProgram(Class<? extends MemberProgram> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
        this.program = inits.isInitialized("program") ? new QProgram(forProperty("program"), inits.get("program")) : null;
    }

}

