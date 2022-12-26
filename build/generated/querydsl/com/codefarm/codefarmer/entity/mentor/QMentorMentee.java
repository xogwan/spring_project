package com.codefarm.codefarmer.entity.mentor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMentorMentee is a Querydsl query type for MentorMentee
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMentorMentee extends EntityPathBase<MentorMentee> {

    private static final long serialVersionUID = 1358876513L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMentorMentee mentorMentee = new QMentorMentee("mentorMentee");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember mentee;

    public final StringPath menteeComment = createString("menteeComment");

    public final EnumPath<com.codefarm.codefarmer.type.Status> menteeStatus = createEnum("menteeStatus", com.codefarm.codefarmer.type.Status.class);

    public final com.codefarm.codefarmer.entity.member.QMember mentor;

    public final NumberPath<Long> mentorMenteeId = createNumber("mentorMenteeId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMentorMentee(String variable) {
        this(MentorMentee.class, forVariable(variable), INITS);
    }

    public QMentorMentee(Path<? extends MentorMentee> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMentorMentee(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMentorMentee(PathMetadata metadata, PathInits inits) {
        this(MentorMentee.class, metadata, inits);
    }

    public QMentorMentee(Class<? extends MentorMentee> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mentee = inits.isInitialized("mentee") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("mentee")) : null;
        this.mentor = inits.isInitialized("mentor") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("mentor")) : null;
    }

}

