package com.codefarm.codefarmer.entity.mentor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMentor is a Querydsl query type for Mentor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMentor extends EntityPathBase<Mentor> {

    private static final long serialVersionUID = 310587139L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMentor mentor = new QMentor("mentor");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final StringPath mentorCrop = createString("mentorCrop");

    public final NumberPath<Long> mentorId = createNumber("mentorId", Long.class);

    public final ListPath<MentorMentee, QMentorMentee> mentorMentees = this.<MentorMentee, QMentorMentee>createList("mentorMentees", MentorMentee.class, QMentorMentee.class, PathInits.DIRECT2);

    public final StringPath mentorYear = createString("mentorYear");

    public final ListPath<com.codefarm.codefarmer.entity.program.Program, com.codefarm.codefarmer.entity.program.QProgram> programs = this.<com.codefarm.codefarmer.entity.program.Program, com.codefarm.codefarmer.entity.program.QProgram>createList("programs", com.codefarm.codefarmer.entity.program.Program.class, com.codefarm.codefarmer.entity.program.QProgram.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMentor(String variable) {
        this(Mentor.class, forVariable(variable), INITS);
    }

    public QMentor(Path<? extends Mentor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMentor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMentor(PathMetadata metadata, PathInits inits) {
        this(Mentor.class, metadata, inits);
    }

    public QMentor(Class<? extends Mentor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

