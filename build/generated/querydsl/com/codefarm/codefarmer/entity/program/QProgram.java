package com.codefarm.codefarmer.entity.program;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProgram is a Querydsl query type for Program
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProgram extends EntityPathBase<Program> {

    private static final long serialVersionUID = -1395816433L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProgram program = new QProgram("program");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final ListPath<MemberProgram, QMemberProgram> memberPrograms = this.<MemberProgram, QMemberProgram>createList("memberPrograms", MemberProgram.class, QMemberProgram.class, PathInits.DIRECT2);

    public final NumberPath<Integer> programApplyCount = createNumber("programApplyCount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> programApplyEndDate = createDateTime("programApplyEndDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> programApplyStartDate = createDateTime("programApplyStartDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> programApplyTotalCount = createNumber("programApplyTotalCount", Integer.class);

    public final StringPath programCrop = createString("programCrop");

    public final StringPath programFarmerInfo = createString("programFarmerInfo");

    public final ListPath<ProgramFile, QProgramFile> programFiles = this.<ProgramFile, QProgramFile>createList("programFiles", ProgramFile.class, QProgramFile.class, PathInits.DIRECT2);

    public final NumberPath<Long> programId = createNumber("programId", Long.class);

    public final StringPath programInfoContent1 = createString("programInfoContent1");

    public final StringPath programInfoContent2 = createString("programInfoContent2");

    public final StringPath programInfoContent3 = createString("programInfoContent3");

    public final StringPath programInfoContent4 = createString("programInfoContent4");

    public final StringPath programInfoTitle1 = createString("programInfoTitle1");

    public final StringPath programInfoTitle2 = createString("programInfoTitle2");

    public final StringPath programInfoTitle3 = createString("programInfoTitle3");

    public final StringPath programInfoTitle4 = createString("programInfoTitle4");

    public final StringPath programInquire = createString("programInquire");

    public final EnumPath<com.codefarm.codefarmer.type.ProgramLevel> programLevel = createEnum("programLevel", com.codefarm.codefarmer.type.ProgramLevel.class);

    public final StringPath programLocation = createString("programLocation");

    public final NumberPath<Integer> programPrice = createNumber("programPrice", Integer.class);

    public final StringPath programResult1 = createString("programResult1");

    public final StringPath programResult2 = createString("programResult2");

    public final StringPath programResult3 = createString("programResult3");

    public final StringPath programResult4 = createString("programResult4");

    public final StringPath programTarget1 = createString("programTarget1");

    public final StringPath programTarget2 = createString("programTarget2");

    public final StringPath programTarget3 = createString("programTarget3");

    public final StringPath programTarget4 = createString("programTarget4");

    public final StringPath programTitle = createString("programTitle");

    public final StringPath programTitleSub = createString("programTitleSub");

    public final EnumPath<com.codefarm.codefarmer.type.ProgramType> programType = createEnum("programType", com.codefarm.codefarmer.type.ProgramType.class);

    public final DateTimePath<java.time.LocalDateTime> programWorkDate = createDateTime("programWorkDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> programWorkEndTime = createDateTime("programWorkEndTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> programWorkStartTime = createDateTime("programWorkStartTime", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QProgram(String variable) {
        this(Program.class, forVariable(variable), INITS);
    }

    public QProgram(Path<? extends Program> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProgram(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProgram(PathMetadata metadata, PathInits inits) {
        this(Program.class, metadata, inits);
    }

    public QProgram(Class<? extends Program> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

